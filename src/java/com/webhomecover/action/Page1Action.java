
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
        } 
        /*System.out.println("Page1 action a ver");
        
        CdDAO cds = new CdDAO();
        //CdsBean cdsBean = new CdsBean();
        Collection<CdBean> cdsBean = cds.getCds();*/
       // request.setAttribute("cdsBean", cdsBean);
        return mapping.findForward("success");
    }
}
