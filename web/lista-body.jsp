<%@taglib uri="http://struts.apache.org/tags-html" prefix="html"%>
<%@taglib uri="http://struts.apache.org/tags-bean" prefix="bean"%>
<%@taglib uri="http://struts.apache.org/tags-logic" prefix="logic"%>

<div class="row">
    <div class="col-lg-12">
        <div class="well">
            <h2>Listado</h2>
            <p>ME tiene hasta las pelotas esta asignatura</p>
        </div>
        
        <h2>Datos pasados desde  el controller</h2>
        <ul>
            <logic:iterate name="listaUsuarios" id="listUserId">
        
                <li><bean:write name="listUserId" property="nombre"/></li>  
                
       
            </logic:iterate>
        </ul>
        

        <h2>Datos pasados desde database</h2>
        <ul>
            <logic:iterate name="listacds" id="listcd">
                <li>
                    <html:link action="verFichaCd" paramName="listcd" paramProperty="id" paramId="id">
                    Interprete: <bean:write name="listcd" property="interpret"/>
                     </html:link>
                </li>

            </logic:iterate> 
        </ul>
    </div>
</div>