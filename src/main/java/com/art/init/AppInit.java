package com.art.init;

/*
 Начальный класс с которого запускэться наш проккт на сервере
 */

import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRegistration;

public class AppInit implements  WebApplicationInitializer {
    @Override
    public void onStartup(ServletContext servletContext) throws ServletException {
        AnnotationConfigWebApplicationContext configWebApplicationContext = new AnnotationConfigWebApplicationContext();
        configWebApplicationContext.register(SpringMVCConfig.class);
        configWebApplicationContext.register(EnemyConfig.class);
        configWebApplicationContext.setServletContext(servletContext);
        ServletRegistration.Dynamic servletRegistration = servletContext.addServlet(
                "dispather",new DispatcherServlet(configWebApplicationContext));

        servletRegistration.setLoadOnStartup(1);
        servletRegistration.addMapping("/");
    }
}
