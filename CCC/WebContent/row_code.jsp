<HTML>
    <HEAD>
        <TITLE>Reading Text Areas</TITLE>
    </HEAD>

    <BODY>
        <H1>Reading Code</H1>
        
        <div>
        You typed:
        <BR>
        <%
        StringBuffer text = new StringBuffer(request.getParameter("textarea1"));
  
        int loc = (new String(text)).indexOf('\n');
        while(loc > 0){
            text.replace(loc, loc+1, "<BR>");
            loc = (new String(text)).indexOf('\n');
       }
       out.println(text); 
       %>
       </div>
    </BODY>
</HTML>