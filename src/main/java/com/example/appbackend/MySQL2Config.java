/*
 * package com.example.appbackend;
 * 
 * 
 * import java.util.HashMap; import java.util.Map;
 * 
 * import javax.sql.DataSource;
 * 
 * 
 * import org.springframework.beans.factory.annotation.Autowired; import
 * org.springframework.context.annotation.Bean; import
 * org.springframework.context.annotation.Configuration; import
 * org.springframework.core.env.Environment; import
 * org.springframework.data.jpa.repository.config.EnableJpaRepositories; import
 * org.springframework.jdbc.datasource.DriverManagerDataSource; import
 * org.springframework.orm.jpa.JpaTransactionManager; import
 * org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean; import
 * org.springframework.orm.jpa.vendor.HibernateJpaVendorAdapter; import
 * org.springframework.transaction.PlatformTransactionManager; import
 * org.springframework.transaction.annotation.EnableTransactionManagement;
 * 
 * @Configuration
 * 
 * @EnableTransactionManagement
 * 
 * @EnableJpaRepositories(entityManagerFactoryRef = "lconEntityManagerFactory",
 * transactionManagerRef = "lconTransactionManager", basePackages = {
 * "com.example.appbackend.repository.lcon1"}) public class MySQL2Config {
 * 
 * @Autowired private Environment env;
 * 
 * @Bean(name = "lconDataSource") public DataSource userDatasource() {
 * DriverManagerDataSource dataSource = new DriverManagerDataSource();
 * dataSource.setUrl(env.getProperty("mysql.datasource.url"));
 * dataSource.setUsername(env.getProperty("mysql.datasource.username"));
 * dataSource.setPassword(env.getProperty("mysql.datasource.password"));
 * dataSource.setDriverClassName(env.getProperty(
 * "mysql.datasource.driver-class-name"));
 * 
 * return dataSource; }
 * 
 * @Bean(name = "lconEntityManagerFactory") public
 * LocalContainerEntityManagerFactoryBean entityManagerFactory() {
 * LocalContainerEntityManagerFactoryBean em = new
 * LocalContainerEntityManagerFactoryBean(); em.setDataSource(userDatasource());
 * em.setPackagesToScan("com.example.appbackend.model.lcon1");
 * 
 * HibernateJpaVendorAdapter vendorAdapter = new HibernateJpaVendorAdapter();
 * em.setJpaVendorAdapter(vendorAdapter);
 * 
 * Map<String, Object> properties = new HashMap<>();
 * properties.put("hibernate.hbm2ddl.auto",
 * env.getProperty("mysql.jpa.hibernate.ddl-auto"));
 * properties.put("hibernate.show-sql", env.getProperty("mysql.jpa.show-sql"));
 * properties.put("hibernate.dialect",
 * env.getProperty("mysql.jpa.database-platform"));
 * 
 * em.setJpaPropertyMap(properties);
 * 
 * return em;
 * 
 * }
 * 
 * @Bean(name = "lconTransactionManager") public PlatformTransactionManager
 * transactionManager() { JpaTransactionManager transactionManager = new
 * JpaTransactionManager();
 * transactionManager.setEntityManagerFactory(entityManagerFactory().getObject()
 * );
 * 
 * return transactionManager; }
 * 
 * }
 */