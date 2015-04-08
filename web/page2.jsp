<%@taglib uri="http://struts.apache.org/tags-html" prefix="html"%>
<%@taglib uri="http://struts.apache.org/tags-bean" prefix="bean"%>
<%@taglib uri="http://struts.apache.org/tags-logic" prefix="logic"%>

<div class="row">
    <div class="col-lg-12">
        <div class="well">
            <h2>Page 2</h2>
                <p >Si se usa el <b>PageAction extends DispatchAction</b> act�a como un contralador 
                en php, es decir el controlador es una clase y sus m�todos son los action.
                <br>Por eso para pasar par�metros deber� hacerse desde este action.

            </p>
            <p >
                Considero que esta es la forma correcta de hacerlo, ya que si no habria que
                hacer como hicieron en la practica del taller mec�nico en la que  
                cada p�gina tiene el tiles y page-body, por ejemplo home y home-body
            </p>
        </div>
        
        <h2>Datos pasados desde el PageAction, el controller</h2>
        <logic:iterate name="listaUsuarios" id="listUserId">
        <p>
                <bean:write name="listUserId" property="nombre"/>  
                
        </p>
        </logic:iterate>

        <h2>From database</h2>
        <ul>
            <logic:iterate name="listacds" id="listcd">
                <li>
                    <html:link action="/form?method=form" paramName="listcd" paramProperty="id" paramId="id">
                    Interprete: <bean:write name="listcd" property="interpret"/>
                     </html:link>
                </li>

            </logic:iterate> 
        </ul>
    </div>
</div>


