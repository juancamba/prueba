<%@taglib uri="http://struts.apache.org/tags-html" prefix="html"%>
<%@taglib uri="http://struts.apache.org/tags-bean" prefix="bean"%>
<%@taglib uri="http://struts.apache.org/tags-logic" prefix="logic"%>
<div class="row">
    <div class="col-lg-12">
        <div class="well">
            <h2>Page 3</h2>
                <p >Si se usa el <b>PageAction extends DispatchAction</b> actúa como un contralador 
                en php, es decir el controlador es una clase y sus métodos son los action.
                <br>Por eso para pasar parámetros deberá hacerse desde este action.

            </p>
            <p >
                Considero que esta es la forma correcta de hacerlo, ya que si no habria que
                hacer como hicieron en la practica del taller mecánico en la que  
                cada página tiene el tiles y page-body, por ejemplo home y home-body
            </p>
        </div>
        
        
    </div>
</div>


