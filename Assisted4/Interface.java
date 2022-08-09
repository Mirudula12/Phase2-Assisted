
import javax.servlet.*;
import java.io.*;
 
// now creating a servlet by implementing Servlet interface
public class ServletInterfaces implements Servlet {
 
    ServletConfig config = null;
 
    // init method
    public void init(ServletConfig sc)
    {
        config = sc;
        System.out.println("in init");
    }
 
    // service method
    public void service(ServletRequest req, ServletResponse res)
        throws ServletException, IOException
    {
        res.setContentType("text/html");
        PrintWriter pw = res.getWriter();
        pw.println("<h2>Hello</h2>");
    }
 
    // destroy method
    public void destroy()
    {
        System.out.println("in destroy");
    }
    public String getServletInfo()
    {
        return "LifeCycleServlet";
    }
    public ServletConfig getServletConfig()
    {
        return config; // getServletConfig
    }
}