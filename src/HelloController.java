import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
/**
 * Created by libin23 on 2017/8/13.
 */
public class HelloController implements Controller {
    private static final Log logger = LogFactory.getLog(HelloController.class);
    public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) throws Exception{
        logger.info("handleRequest被调用");
        ModelAndView mv = new ModelAndView();
        mv.addObject("message", "Hello world!");
        mv.setViewName("/WEB-INF/content/welcome.jsp");
        return mv;
    }
}
