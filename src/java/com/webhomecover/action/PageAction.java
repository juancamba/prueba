/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.webhomecover.action;

import beans.CdBean;
import beans.ListaCds;
import beans.UsuarioBean;
import dao.CdDAO;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.actions.DispatchAction;

/**
 *
 * @author juan
 */
public class PageAction extends DispatchAction{
    
    public ActionForward page2(ActionMapping mapping, 
            ActionForm form, HttpServletRequest request, HttpServletResponse response)throws Exception
            {
                CdDAO cds = new CdDAO();
                ListaCds listaCds = new ListaCds();
                List<CdBean> listacds = (List<CdBean>) cds.getCds();
                request.setAttribute("listacds", listacds);

                List<UsuarioBean> listUsers = new ArrayList<UsuarioBean>();
                listUsers.add(new UsuarioBean("juan","camba"));
                listUsers.add(new UsuarioBean("particia","camba"));
                request.setAttribute("listaUsuarios",listUsers);
                return mapping.findForward("page2");
            }
    
     public ActionForward page3(ActionMapping mapping, 
            ActionForm form, HttpServletRequest request, HttpServletResponse response)throws Exception
            {
                
                return mapping.findForward("page3");
            }
     public ActionForward form(ActionMapping mapping, 
            ActionForm form, HttpServletRequest request, HttpServletResponse response)throws Exception
            {
                CdDAO cd = new CdDAO();
                String id = request.getParameter("id");
                cd.setWhereClause(" where id = "+id);
                ListaCds listaCds = new ListaCds();
                List<CdBean> listacds = (List<CdBean>) cd.getCds();
                request.setAttribute("CdBean",listacds.get(0));
                return mapping.findForward("form");
            }
     public ActionForward processform(ActionMapping mapping, 
            ActionForm form, HttpServletRequest request, HttpServletResponse response)throws Exception
     {
         return mapping.findForward("success");
     } 
}
