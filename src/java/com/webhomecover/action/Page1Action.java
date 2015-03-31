
package com.webhomecover.action;
import dao.*;
import beans.*;
import java.util.Collection;
import org.apache.struts.action.*;
import javax.servlet.http.*;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
/**
 *
 * @author juan
 */
public class Page1Action extends Action {
    
    private static Log log = LogFactory.getLog(Page1Action.class);
    
    public ActionForward execute(ActionMapping mapping, 
            ActionForm form, HttpServletRequest request, HttpServletResponse response)
    {
        if (log.isInfoEnabled())
        { 
          log.info("In Page1Action");
        } /*
        System.out.println("Page1 action a ver");
        //ActionContext.getSession().setAttribute("nombreBean", objeto)
        CdDAO cds = new CdDAO();
        //ListaCds listaCds = new ListaCds();
        Collection<CdBean> listacds = cds.getCds();
        request.setAttribute("listacds", listacds);
        for(CdBean cd: listacds)
            System.out.println(cd.getInterpret());*/
        return mapping.findForward("success");
    }
}
