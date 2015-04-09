/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.webhomecover.action;

import beans.CdBean;
import dao.CdDAO;
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
        String id = request.getParameter("id");
       // CdBean cdBean = (CdBean) form;
        CdDAO cdDao = new CdDAO();
        //cdDao.setWhereClause("where id = "+id);
        CdBean cdBean = cdDao.getCd(id);
        request.setAttribute("cdBean",cdBean);
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
