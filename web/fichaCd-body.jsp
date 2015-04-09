<%@taglib uri="http://struts.apache.org/tags-html" prefix="html"%>
<%@taglib uri="http://struts.apache.org/tags-bean" prefix="bean"%>
<%@taglib uri="http://struts.apache.org/tags-logic" prefix="logic"%>

<bean:write name="cdBean" property="titel"/>
<html:form action="FichaCdForm" > 
    <html:text name="cdBean" property="titel"  size="10" />
     <html:submit styleClass="btn btn-success" value="Guardar" property="guardar" onclick="return confirm('¿Seguro que quieres guardar los cambios?');"/>
</html:form>    

      