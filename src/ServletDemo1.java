import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;
import java.util.Map;
import java.util.Set;

/**
 * Created by 没想法的岁月 on 2018/3/20.
 */
public class ServletDemo1 extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //解码
        String name = new String(request.getParameter("nameP").getBytes("ISO_8859_1"),"UTF-8");

        String pwd = new String(request.getParameter("pwdP").getBytes("ISO_8859_1"),"UTF-8");
        System.out.println(name + "————————— "+ pwd);
        System.out.println("执行post");

        //其他方法
        String p = request.getContextPath();
        String x = request.getRequestURL().toString();
        String a = request.getRequestURI();
        String y = request.getRemoteAddr();
        String z = request.getRemoteHost();

        Map<String, String[]> pMap = request.getParameterMap();

        Set<Map.Entry<String, String[]>> set =pMap.entrySet();
        for (Map.Entry<String, String[]> s:set
             ) {
            String key = s.getKey();
            Object value = s.getValue();
            System.out.println(key + value);
        }
//        System.out.println(p);
//        System.out.println(x);
//        System.out.println(a);
//        System.out.println(y);
//        System.out.println(z);

        //response 简单请求的处理
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        try {
            out.println("<html>");
            out.println("<head>");
            out.println("<title>给你的回应</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h2> Hello   " + name + "，欢迎您</h2>");
            out.println("<h2> “现在是” </h2>" + new Date().toLocaleString());
            out.println("</body>");
            out.println("</html>");
        }finally {
            out.close();
        }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        System.out.println("hello servlet 我是Demo1");
        String name = request.getParameter("name");
        String pwd = request.getParameter("pwd");
        System.out.println(name + "————————— "+ pwd);

    }
}
