import javax.inject.Inject
import javax.servlet.annotation.WebServlet
import javax.servlet.http.{HttpServletResponse, HttpServletRequest, HttpServlet}

/**
 * Created with IntelliJ IDEA.
 * User: faissalboutaounte
 * Date: 13-07-07
 * Time: 19:02
 * To change this template use File | Settings | File Templates.
 */

@WebServlet(name = "ScalaServlet",urlPatterns = Array("/scala"))
class ScalaServlet extends HttpServlet{
  @Inject
  var aService: ScalaService= new ScalaService();

  override def doGet(req: HttpServletRequest, resp: HttpServletResponse) {
    resp.getWriter.println("Salam + "+aService.saySalam("Faissal"))
    resp.getWriter.close()
  }

  override def doPost(req: HttpServletRequest, resp: HttpServletResponse) {
    resp.getWriter.println("Salam Post")
    resp.getWriter.close()
  }
}

