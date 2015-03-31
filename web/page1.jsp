<%@taglib uri="http://struts.apache.org/tags-html" prefix="html"%>
<%@taglib uri="http://struts.apache.org/tags-bean" prefix="bean"%>
<%@taglib uri="http://struts.apache.org/tags-logic" prefix="logic"%>
<html>
<head>
</head>
<body>
<h1>Struts  example</h1>
 
<logic:iterate name="listaUsuarios" id="listUserId">
<p>
	List Users <bean:write name="listUserId" property="nombre"/> , 
	
</p>
</logic:iterate>
 
</body>
</html>