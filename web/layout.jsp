<%-- 
    Document   : layout
    Created on : 01-abr-2015, 9:20:53
    Author     : juan
--%>
<%@taglib uri="http://struts.apache.org/tags-tiles" prefix="tiles" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <!-- Latest compiled and minified CSS -->
        <link rel="stylesheet" href="/Struts1/bootstrap/css/bootstrap.min.css">

        <!-- Optional theme -->
        <link rel="stylesheet" href="/Struts1/bootstrap/css/bootstrap-theme.min.css">

        <!-- Latest compiled and minified JavaScript -->
        <script src="/Struts1/bootstrap/js/jquery.min.js"></script>
        <script src="/Struts1/bootstrap/js/bootstrap.min.js"></script>
        <title>JSP Page</title>
    </head>
    <body>
        <div class="container">
            <div class="row">
                <div class="col-lg-12">
                    
                    <div class="page-header ">
                        <h1> Struts Project Testing <small>by Juancho</small></h1>
                      </div>
                </div>
            </div>
            <div class="row">
                <div class="col-lg-3">
                    <ul>
                        <li><a href="home.do"> Home</a> </li>
                        <li><a href="page1.do"> page 1</a> </li>
                        <li><a href="lista.do">lista</a> </li>
                        <li><a href="page3.do?method=page3"> page 3</a> </li>
                        <li><a href="form.do?method=form"> Formulario</a> </li>
                    </ul>
                </div>
                <div class="col-lg-9">
                    <tiles:insert attribute="body" />
                </div>
            </div>
            
        </div>
    </body>
</html>
