<%@taglib uri="http://struts.apache.org/tags-html" prefix="html"%>
<%@taglib uri="http://struts.apache.org/tags-bean" prefix="bean"%>
<%@taglib uri="http://struts.apache.org/tags-logic" prefix="logic"%>
<html>
<head>
</head>
<body>
<h1>Struts  example</h1>
<a href="page1.do">Click to go to the  page 1</a> 

<h2>To pinrel</h2>
 
<logic:iterate name="listaUsuarios" id="listUserId">
<p>
	List Users <bean:write name="listUserId" property="nombre"/> , 
	
</p>
</logic:iterate>

<h2>From database</h2>
<ul>
    <logic:iterate name="listacds" id="listcd">
        <li>
            Interprete: <bean:write name="listcd" property="interpret"/>
        </li>

    </logic:iterate> 
</ul>



</body>
</html>