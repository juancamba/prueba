<?xml version="1.0"?>
<jsp:root xmlns:jsp="http://java.sun.com/JSP/Page"	
   xmlns:html="http://struts.apache.org/tags-html" 		
   xmlns:bean="http://struts.apache.org/tags-bean"
   xmlns:c ="http://java.sun.com/jsp/jstl/core"
   version="2.0">
<jsp:directive.page contentType="text/html"/>   
<jsp:output omit-xml-declaration="false"
 doctype-root-element="html"
 doctype-public="-//W3C//DTD XHTML 1.1//EN" 
 doctype-system="http://www.w3.org/TR/xhtml11/DTD/xhtml11.dtd" />

<html:html xhtml="true">
    <head>
       
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Hello World! Hello World! you are in page 2</h1>
        <p>Listado de cds</p>
        <a href="frompage2.do">Click to go to the next page</a>
        
        <jsp:useBean id="listaCds" class="beans.ListaCds" />
        
        <c:forEach var="cd" items="${listaCds.cds}">
        
         <tr>
          
          <td><c:out value="${cd.id}" /></td>
          <td><c:out value="${cd.titel}" /></td>
        
         </tr>
         
        </c:forEach>
    </body>
</html:html>
</jsp:root>