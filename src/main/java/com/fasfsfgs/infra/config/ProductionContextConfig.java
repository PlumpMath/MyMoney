package com.fasfsfgs.infra.config;

import javax.persistence.EntityManagerFactory;
import javax.sql.DataSource;

import org.apache.commons.dbcp2.BasicDataSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.orm.jpa.vendor.HibernateJpaVendorAdapter;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import com.fasfsfgs.mymoney.cmd._CmdPackage;
import com.fasfsfgs.mymoney.dao._DAOPackage;
import com.fasfsfgs.mymoney.rest._RestPackage;

@Configuration
@ComponentScan(basePackageClasses = {_CmdPackage.class, _RestPackage.class, _DAOPackage.class})
@EnableTransactionManagement
public class ProductionContextConfig {

  @Bean
  public DataSource getDataSource() {
    BasicDataSource bds = new BasicDataSource();
    bds.setDriverClassName(org.postgresql.Driver.class.getName());
    bds.setUrl("jdbc:postgresql://localhost/testdb");
    bds.setUsername("testdbuser");
    bds.setPassword("123456");

    return bds;
  }

  @Bean
  public LocalContainerEntityManagerFactoryBean getLocalContainerEntityManagerFactoryBean(
      final DataSource ds) {
    LocalContainerEntityManagerFactoryBean lcemfb = new LocalContainerEntityManagerFactoryBean();
    lcemfb.setDataSource(ds);
    lcemfb.setPackagesToScan("com.fasfsfgs.mymoney.domain");

    HibernateJpaVendorAdapter hjva = new HibernateJpaVendorAdapter();
    lcemfb.setJpaVendorAdapter(hjva);

    return lcemfb;
  }

  @Bean
  public PlatformTransactionManager getPlatformTransactionManager(final EntityManagerFactory emf) {
    return new JpaTransactionManager(emf);
  }

}
