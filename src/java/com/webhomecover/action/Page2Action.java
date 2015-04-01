
package com.webhomecover.action;
import dao.*;
import beans.*;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import org.apache.struts.action.*;
import javax.servlet.http.*;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
/**
 *
 * @author juan
 */
public class Page2Action extends Action {
    
    private static Log log = LogFactory.getLog(Page2Action.class);
    
    public ActionForward execute(ActionMapping mapping, 
            ActionForm form, HttpServletRequest request, HttpServletResponse response)
    {
        if (log.isInfoEnabled())
        { 
          log.info("In Page1Action");
        } 
        //System.out.println("Page1 action a ver");
        //ActionContext.getSession().setAttribute("nombreBean", objeto)
        CdDAO cds = new CdDAO();
        ListaCds listaCds = new ListaCds();
        List<CdBean> listacds = (List<CdBean>) cds.getCds();
        request.setAttribute("listacds", listacds);
        
        List<UsuarioBean> listUsers = new ArrayList<UsuarioBean>();
        listUsers.add(new UsuarioBean("juan","camba"));
        listUsers.add(new UsuarioBean("particia","camba"));
        request.setAttribute("listaUsuarios",listUsers);
        
        return mapping.findForward("success");
    }
}
