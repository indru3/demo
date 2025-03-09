package recozilla.webinit;


import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;
import recozilla.configuration.SpringConfiguration;


public class SpringWebInit extends AbstractAnnotationConfigDispatcherServletInitializer {
    @Override
    protected Class<?>[] getRootConfigClasses() {
        return new Class[0];
    }

    @Override
    protected Class<?>[] getServletConfigClasses() {
        return new Class[]{SpringConfiguration.class};
    }

    @Override
    protected String[] getServletMappings() {
        return new String[]{"/"};
    }
}
