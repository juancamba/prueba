/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.webhomecover.action;

import beans.CdBean;
import beans.ListaCds;
import dao.CdDAO;
import java.util.List;
import org.apache.struts.action.*;
import javax.servlet.http.*;

/**
 *
 * @author juan
 */
public class FichaCdAction extends org.apache.struts.action.Action {
     
    public ActionForward execute(ActionMapping mapping, ActionForm form,
            HttpServletRequest request, HttpServletResponse response)
            throws Exception {        
        
        /*
        MaterialForm materialForm = (CdBean) form;
        MaterialDAO materialDAO = new MaterialDAO();
*/
        if("load".equals(mapping.getParameter())){
            return doLoad(mapping, request);
        }
      /*  else if ("submit".equals(mapping.getParameter())){
            return doSubmit(mapping, materialDAO, materialForm, request);
        }*/
        else
        {
            throw new IllegalStateException();
        }
    }
    
    private ActionForward doLoad(ActionMapping mapping,  HttpServletRequest request ){
        
       CdDAO cd = new CdDAO();
                String id = request.getParameter("id");
                cd.setWhereClause(" where id = "+id);
                ListaCds listaCds = new ListaCds();
                List<CdBean> listacds = (List<CdBean>) cd.getCds();
                request.setAttribute("cdBean",listacds.get(0));
        return mapping.findForward("success");
    }
    
    /*
    private ActionForward doLoad(
        ActionMapping mapping, MaterialDAO materialDAO, MaterialForm materialForm) { 
 
            MaterialDTO material = materialDAO.leerMaterial(materialForm.getIdMaterial());
                       
            materialForm.setIdMaterial(material.getIdMaterial());
            materialForm.setDescripcion(material.getDescripcion());              
            materialForm.setStock(Double.toString(material.getStock())); 
            materialForm.setCoste(Double.toString(material.getCoste()));
            
            return mapping.findForward(SUCCESS);
     }
    */
}
