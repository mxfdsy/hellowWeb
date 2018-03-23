package FilterDemo;

import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.security.PrivateKey;

/**
 * Created by 平凡的世界 on 2018/3/23.
 */
public class Filter implements javax.servlet.Filter {
    private String Ecoding ="UTF-8";
    public void destroy() {
        System.out.println("在销毁");
    }

    public void doFilter(ServletRequest req, ServletResponse resp, FilterChain chain) throws ServletException, IOException {

        HttpServletRequest request = (HttpServletRequest)req;
        HttpServletResponse response =(HttpServletResponse)resp;
        request.setCharacterEncoding(Ecoding);
        response.setContentType("text/html;charset="+ Ecoding);
        chain.doFilter(req, resp);
    }

    public void init(FilterConfig config) throws ServletException {
        System.out.println("初始化");
    }

}
