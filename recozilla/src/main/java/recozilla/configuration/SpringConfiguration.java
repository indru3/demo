package recozilla.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.orm.jpa.vendor.HibernateJpaVendorAdapter;

import javax.sql.DataSource;
import java.util.Properties;

@Configuration
@ComponentScan("com.mysticarts.bankapp")
public class SpringConfiguration {

    public SpringConfiguration() {

    }

@Bean
public LocalContainerEntityManagerFactoryBean localContainerEntityManagerFactoryBean(){
        LocalContainerEntityManagerFactoryBean  bean = new LocalContainerEntityManagerFactoryBean();
        bean.setPackagesToScan("com.mysticarts.bankapp.dto");
        bean.setDataSource(getDataSource());
        bean.setJpaVendorAdapter(new HibernateJpaVendorAdapter());
        bean.setJpaProperties(getProperties());
return bean;
}

@Bean
public DataSource getDataSource(){

    DriverManagerDataSource dataSource = new DriverManagerDataSource();
    dataSource.setDriverClassName("com.mysql.cj.jdbc.Driver");
    dataSource.setUsername("root");
    dataSource.setUrl("jdbc:mysql://localhost:3306/bank");
    dataSource.setPassword("Indru@1903");
return dataSource;
}

@Bean
public Properties getProperties(){
    Properties properties = new Properties();
    properties.setProperty("hibernate.dialect","org.hibernate.dialect.MySQL8Dialect");
return properties;
}
}
