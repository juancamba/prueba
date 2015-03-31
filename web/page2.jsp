<?xml version="1.0"?>

<jsp:root xmlns:jsp="http://java.sun.com/JSP/Page"	
   xmlns:c="http://java.sun.com/jsp/jstl/core" 		
   version="2.0">
<jsp:directive.page isELIgnored="false" />
<jsp:directive.page contentType="text/html"/>   
<jsp:output omit-xml-declaration="false"
 doctype-root-element="html"
 doctype-public="-//W3C//DTD XHTML 1.1//EN" 
 doctype-system="http://www.w3.org/TR/xhtml11/DTD/xhtml11.dtd" />
<html xmlns="http://www.w3.org/1999/xhtml" xml:lang="en">
    <head>
       
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Hello World! Hello World! you are in page 2</h1>
        <p>Listado de cds</p>
        <a href="frompage2.do">Click to go to the next page</a>
     
        <table border="1">
        
        <jsp:useBean id="listaCds" class="beans.ListaCds" />    
        <c:forEach var="cd" items="${listaCds.listaCds}">
        
         <tr>
          
          
          <td><c:out value="${id}"/></td>
          <td><c:out value="${cd.titel}"/></td>
          <td><c:out value="${cd.interpret}"/></td>
         </tr>
         
        </c:forEach>
         </table>
    </body>
</html>
</jsp:root>