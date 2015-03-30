/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beans;

import javax.servlet.http.HttpServletRequest;
import org.apache.struts.action.ActionErrors;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionMapping;
import java.io.Serializable;
import org.apache.struts.action.ActionMessage;


/**
 *
 * @author juan
 */
public class CdBean extends ActionForm implements Serializable{
    private String titel;
    private String interpret;
    private String jahr;
    private int id;

    public CdBean(String titel, String interpret, String jahr, int id) {
        this.titel = titel;
        this.interpret = interpret;
        this.jahr = jahr;
        this.id = id;
    }

    public String getTitel() {
        return titel;
    }

    public void setTitel(String titel) {
        this.titel = titel;
    }

    public String getInterpret() {
        return interpret;
    }

    public void setInterpret(String interpret) {
        this.interpret = interpret;
    }

    public String getJahr() {
        return jahr;
    }

    public void setJahr(String jahr) {
        this.jahr = jahr;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    
    public ActionErrors validate(ActionMapping mapping, HttpServletRequest request) {
        ActionErrors actionErrors = new ActionErrors();
        
        if(interpret.equals("")){
            actionErrors.add("interpret", new ActionMessage("error.interpret"));
        }
        return actionErrors;
    }
    
}
