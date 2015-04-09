<%@taglib uri="http://struts.apache.org/tags-html" prefix="html"%>
<%@taglib uri="http://struts.apache.org/tags-bean" prefix="bean"%>
<%@taglib uri="http://struts.apache.org/tags-logic" prefix="logic"%>

<bean:write name="cdBean" property="titel"/>
<html:form action="/procesarform" > 
    <html:text property="titel"  size="10" />
</html:form>    

      