<%-- 
    Document   : home.jsp
    Created on : 22-mar-2015, 16:16:47
    Author     : juan
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Hello World!</h1>
        <p>Esto llama al actionmapping de struts-config al elemento action al atributo path fromhome para
            redirigir a page 1 con su atributo forward
            action path="fromhome" forward="/page1.jsp"/>
        </p>
        <a href="fromhome.do">Click to go to the next page</a>
    </body>
</html>
