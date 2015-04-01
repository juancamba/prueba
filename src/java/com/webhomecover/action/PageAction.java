/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.webhomecover.action;

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
                System.out.println("PageAction");
                return mapping.findForward("page2");
            }        
}
