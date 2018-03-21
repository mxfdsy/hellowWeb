package FilterDemo;

import javax.servlet.*;
import java.io.IOException;

/**
 * Created by 没想法的岁月 on 2018/3/21.
 */
public class Filter implements javax.servlet.Filter {

    private String Filter = "UTF-8";
    public void destroy() {
        System.out.println("被摧毁");
    }

    public void doFilter(ServletRequest req, ServletResponse resp, FilterChain chain) throws ServletException, IOException {
        //设计模式：责任链模式
        chain.doFilter(req, resp);
    }
    //初始化
    public void init(FilterConfig config) throws ServletException {
        config.getInitParameter("Filter");
        System.out.println("初始化");
    }

}
