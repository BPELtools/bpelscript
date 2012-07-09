---
layout: default
title: BPELscript - BPEL for Developers
description: Home of BPELscript
keywords: BPELscript, BPEL, WS-*, Web Services, Orchestration
---
  
# <a name="desc">Description</a>
The Web Services Business Process Execution Language (WS-BPEL, BPEL for 
short) is a programming language to describe the control flow of 
business processes. BPEL has native support for concurrency, backward 
and forward recovery. A BPEL process is executed via a workflow engine. 
Using these engines, a BPEL process can execute for years. IBM, Oracle 
and Microsoft are some the big players in this field and provide 
workflow engines which can execute BPEL processes. 

The syntax of BPEL is based on XML infoset. Since it is uncommon to 
write programs using XML, the group around Apache ODE made the [proposals 
BPEL4coders, simBPEL](http://ode.apache.org/bpel-simplified-syntax-simbpel.html) 
and [SimPEL](http://ode.apache.org/simpel.html). BPELscript is based on 
these proposals and provides 

 * a compact syntax inspired by scripting languages such as JavaScript and Ruby
 * the full coverage of all features provided by BPEL
 * a translation from WS-BPEL 2.0
 * a translation to WS-BPEL 2.0.

The translation to WS-BPEL 2.0 ensures that BPELscript can be executed 
on *all* workflow engines supporting WS-BPEL 2.0. To 
enable programmers to maintain WS-BPEL 2.0 code, the translation of 
WS-BPEL 2.0 to BPELscript allows them to modify the code in a syntax 
more common to programmers. 

# <a name="ex">Example</a>
{% highlight javascript %}
namespace pns = "http://example.com/loan-approval/";
namespace lns = "http://example.com/loan-approval/wsdl/";

@type "http://schemas.xmlsoap.org/wsdl/"
import lServicePT = lns::"loanServicePT.wsdl";

@suppressJoinFailure
process pns::loanApprovalProcess {
    partnerLink customer = (lns::loanPartnerLT, loanService, null),
    approver = (lns::loanApprovalLT, null, approver),
    assessor = (lns::riskAssessmentLT, null, assessor);
    try {
        parallel {
            @portType "lns::loanServicePT" @createInstance
            request = receive(customer, request);
            signal(receive-to-assess, [$request.amount &lt; 10000]);
            signal(receive-to-approval, [$request.amount >= 10000]);
        } and {
            join(receive-to-assess);
            @portType "lns::riskAssessmentPT"
            risk = invoke(assessor, check, request);
            signal(assess-to-setMessage, [$risk.level = 'low']);
            signal(assess-to-approval, [$risk.level != 'low']);
        } and {
            join(assess-to-setMessage);
            approval.accept = "yes";
            signal(setMessage-to-reply);
        } and {
            join(receive-to-approval, assess-to-approval);
            @portType "lns::loanApprovalPT"
            approval = invoke(approver, approve, request);
            signal(approval-to-reply);
        } and {
            join(approval-to-reply, setMessage-to-reply);
            @portType "lns::loanServicePT"
            reply(customer, request, approval);
        }
    } 
    @faultMessageType "lns::errorMessage"
    catch(lns::loanProcessFault) { |error|
        @portType "lns::loanServicePT" @fault "unableToHandleRequest"
        reply(customer, request, error);
    }
}
{% endhighlight %}

# <a name="down">Downloads</a>
The grammar of the language expressed in ANTLR and can be downloaded 
[here](./BPELscript_1.0.g) [(pretty printed)](BPELscript_1.0.g.html). 
Further details of the language are explained in &#8220;Translating 
WS-BPEL 2.0 to BPELscript and Vice Versa&#8221;. The source code is 
available [here @ Github](https://github.com/IAAS/BPELscript).

# <a name="relwork">Related Work</a>
 * SimPEL, being developed by a joint Apache ODE / Intalio team ([@intalio](http://dev.intalio.org/), [@ode 1](http://ode.apache.org/bpel-simplified-syntax-simbpel.html), [@ode 2](http://ode.apache.org/simpel.html))

# <a name="future">Future Work</a>
 * Eclipse DLTK Plugin featuring syntax highlighting and auto completion.
 * Identify and merge common concepts with SimPEL.
 * Add support for E4X variable assignments.
  
# <a name="pub">Publications</a>
<ul id="pubul">
  <li>Bischof, Marc; Kopp, Oliver; van Lessen, Tammo; Leymann, Frank: <a href="http://www.informatik.uni-stuttgart.de/cgi-bin/NCSTRL/NCSTRL_view.pl?id=INPROC-2009-49&amp;mod=0&amp;engl=0&amp;inst=IAAS">BPELscript: A Simplified Script Syntax for WS-BPEL 2.0.</a> In: 2009 35th Euromicro Conference on Software Engineering and Advanced Applications (SEAA 2009).</li>
  <li>Bischof, Marc: <b><a href="http://www.informatik.uni-stuttgart.de/cgi-bin/NCSTRL/NCSTRL_view.pl?id=STUD-2175&amp;engl=1">Translating WS-BPEL 2.0 to BPELscript and Vice Versa</a></b>, Student Thesis, University of Stuttgart, 2008. <a href="ftp://ftp.informatik.uni-stuttgart.de/pub/library/medoc.ustuttgart_fi/STUD-2175/STUD-2175.pdf">PDF</a></li>
</ul>

# <a name="contact">Contact</a>
 * Marc Bischof &lt;mc dot bischof at googlemail dot com&gt;
 * [Oliver Kopp](http://www.iaas.uni-stuttgart.de/institut/mitarbeiter/kopp/) &lt;oliver dot kopp at iaas dot uni-stuttgart dot de&gt;
 * [Tammo van Lessen](http://www.taval.de) &lt;tammo dot van dot lessen at iaas dot uni-stuttgart dot de&gt;

Please report bugs to our [issue tracker](https://github.com/IAAS/BPELscript/issues).
{% comment %} 
# <a name="trans">Online Translator</a>
For BPELscript-to-BPEL translation, paste your BPELscript code (e.g. the snippet above) into the first text box and hit the <em>translate to BPEL</em> button.
As you might have guessed, for a translation from BPEL to BPELscript, paste BPEL code into the second text box and hit the <em>translate to BPELscript</em> button.

<form method="POST" action="#trans">
<h3>BPELscript code</h3>
<textarea class="codebox" name="bpelscript" cols="80" rows="12">&nbsp;</textarea>
<input type="submit" name="toBPELscript" value="Translate to BPEL"/>
</form>

<form method="POST" action="#trans">
<h3>BPEL code</h3>
<textarea class="codebox" name="bpel" cols="80" rows="12">&nbsp;</textarea>
<input type="submit" name="toBPEL" value="Translate to BPELscript"/>&nbsp;
</form>
{% endcomment %} 