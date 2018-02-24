package com.loan.customer.search;

import java.util.Properties;

import javax.persistence.EntityManager;
import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.dao.annotation.PersistenceExceptionTranslationPostProcessor;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.orm.jpa.vendor.Database;
import org.springframework.orm.jpa.vendor.HibernateJpaVendorAdapter;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@Configuration
@EnableJpaRepositories(basePackages = {"com.loan.customer.search"})
@EnableTransactionManagement
public class ApplicationConfig {

	    @Value("${datasource.jdbcUrl}")
	    private String URL;

	    @Value("${datasource.user}")
	    private String USER;

	    @Value("${datasource.password}")
	    private String PASSWORD;
	    
	    @Value("${datasource.driver-class-name}")
	    private String DriverClASSNAME;
	
	@Bean
    public DataSource dataSource() {

        DriverManagerDataSource dataSource = new DriverManagerDataSource();
        dataSource.setUrl(URL);
        dataSource.setUsername(USER);
        dataSource.setPassword(PASSWORD);
        dataSource.setDriverClassName(DriverClASSNAME);
        return dataSource;
    }

    @Bean
    public LocalContainerEntityManagerFactoryBean entityManagerFactory() {

        LocalContainerEntityManagerFactoryBean lef = new LocalContainerEntityManagerFactoryBean();
        lef.setDataSource(dataSource());
        lef.setPackagesToScan("com.loan.customer.search");

        HibernateJpaVendorAdapter hibernateJpaVendorAdapter = new HibernateJpaVendorAdapter();
        hibernateJpaVendorAdapter.setDatabase(Database.ORACLE);
        lef.setJpaVendorAdapter(hibernateJpaVendorAdapter);
        lef.setJpaProperties(additionalProperties());
        return lef;
    }

    Properties additionalProperties() {
        Properties properties = new Properties();
        properties.setProperty("hibernate.dialect", "org.hibernate.dialect.Oracle10gDialect");
        properties.setProperty("hibernate.id.new_generator_mappings", "true");
        return properties;
    }

    @Bean
    public PersistenceExceptionTranslationPostProcessor exceptionTranslation() {
        return new PersistenceExceptionTranslationPostProcessor();
    }

    @Bean
    public EntityManager manager() {
        return entityManagerFactory().getObject().createEntityManager();
    }
}

