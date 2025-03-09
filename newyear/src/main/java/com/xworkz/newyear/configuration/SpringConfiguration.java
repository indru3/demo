package com.xworkz.newyear.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.orm.jpa.vendor.HibernateJpaVendorAdapter;
import org.springframework.web.multipart.MultipartResolver;
import org.springframework.web.multipart.support.StandardServletMultipartResolver;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

import javax.sql.DataSource;
@EnableWebMvc
@Configuration
@ComponentScan(basePackages ="com.xworkz.newyear" )
public class SpringConfiguration {
    public SpringConfiguration(){
        System.out.println("In spring configuration");
    }
    @Bean
    public LocalContainerEntityManagerFactoryBean bean1(){
   LocalContainerEntityManagerFactoryBean bean=new LocalContainerEntityManagerFactoryBean();
   bean.setPackagesToScan("com.xworkz.newyear.entity");
   bean.setDataSource(getDataSource());
   bean.setJpaVendorAdapter(new HibernateJpaVendorAdapter());
   return bean;
    }
    @Bean
    public DataSource getDataSource() {
        DriverManagerDataSource data = new DriverManagerDataSource();
        data.setDriverClassName("com.mysql.cj.jdbc.Driver");
        data.setPassword("3171512");
        data.setUrl("jdbc:mysql://localhost:3306/newyear");
        data.setUsername("root");
        return data;
    }

    @Bean
    public ViewResolver viewResolver(){
        return new InternalResourceViewResolver("/",".jsp");
    }

    @Bean
    public MultipartResolver multipartResolver() {
        return new StandardServletMultipartResolver();
    }

}
