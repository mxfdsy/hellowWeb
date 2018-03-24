/**
 * Created by 平凡的世界 on 2018/3/24.
 */

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.ServletRequestEvent;
import javax.servlet.ServletRequestListener;
import javax.servlet.http.HttpSessionAttributeListener;
import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;
import javax.servlet.http.HttpSessionBindingEvent;

public class MyListener implements ServletContextListener{
    @Override
    public void contextInitialized(ServletContextEvent servletContextEvent) {
        String x = servletContextEvent.getServletContext().getInitParameter("namespace");
        servletContextEvent.getServletContext().setAttribute("val","vvvv");
        System.out.println("容器初始了"+x);
    }

    @Override
    public void contextDestroyed(ServletContextEvent servletContextEvent) {

        System.out.println("容器摧毁了");
    }
//    @Override
//    public void sessionCreated(HttpSessionEvent httpSessionEvent) {
//        httpSessionEvent.getSession().setAttribute("xxx","ooo");
//        System.out.println("创建session");
//    }
//
//    @Override
//    public void sessionDestroyed(HttpSessionEvent httpSessionEvent) {
//        System.out.println("session摧毁");
//    }


//    @Override
//    public void requestDestroyed(ServletRequestEvent servletRequestEvent) {
//        System.out.println("摧毁");
//    }
//
//    @Override
//    public void requestInitialized(ServletRequestEvent servletRequestEvent) {
//        System.out.println("监听到请求");
//        System.out.println("请求来了－姓名为");
////        +servletRequestEvent.getServletRequest().getParameter("nameP"));
//        System.out.println("请求来了-密码为");
////        +servletRequestEvent.getServletRequest().getParameter("pwdP"));
//    }

}
