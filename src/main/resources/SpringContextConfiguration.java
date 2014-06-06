package rugal.spring.config;

import com.jolbox.bonecp.BoneCPDataSource;
import java.util.Properties;
import javax.sql.DataSource;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.orm.hibernate4.HibernateTransactionManager;
import org.springframework.orm.hibernate4.LocalSessionFactoryBean;
import org.springframework.test.context.transaction.TransactionConfiguration;
import org.springframework.transaction.annotation.EnableTransactionManagement;

/**
 *
 * @author e563642
 */
@Configuration
@ComponentScan(basePackages = "rugal")
@EnableTransactionManagement
@TransactionConfiguration
@PropertySource("classpath:jdbc.properties")
public class SpringContextConfiguration {

    @Autowired
    private Environment env;

    @Bean
    public DataSource dataSource() {
        BoneCPDataSource bean = new BoneCPDataSource();

        bean.setDriverClass(env.getProperty("jdbc.driverClassName"));
        bean.setJdbcUrl(env.getProperty("jdbc.url"));
        bean.setUsername(env.getProperty("jdbc.username"));
        bean.setPassword(env.getProperty("jdbc.password"));
        bean.setIdleConnectionTestPeriodInMinutes(60);
        bean.setIdleMaxAgeInMinutes(240);
        bean.setPartitionCount(1);
        bean.setMaxConnectionsPerPartition(5);
        bean.setMinConnectionsPerPartition(1);
        bean.setStatementsCacheSize(100);
        bean.setAcquireIncrement(1);

        return bean;
    }

    @Bean
    @Autowired
    public LocalSessionFactoryBean sessionFactory(DataSource dataSource) {

        LocalSessionFactoryBean bean = new LocalSessionFactoryBean();
        bean.setDataSource(dataSource);
        bean.setPackagesToScan("rugal.spring.javabased.entity");
        bean.setHibernateProperties(hibernateProperties());

        return bean;
    }

    private Properties hibernateProperties() {
        Properties p = new Properties();
        p.setProperty("hibernate.dialect", "org.hibernate.dialect.PostgreSQLDialect");
        p.setProperty("hibernate.connection.autocommit", "false");
        p.setProperty("hibernate.format_sql", "false");
        p.setProperty("hibernate.hbm2ddl.auto", "validate");
        p.setProperty("hibernate.show_sql", "true");
        return p;
    }

    @Bean
    @Autowired
    public HibernateTransactionManager transactionManager(SessionFactory sessionFactory) {
        HibernateTransactionManager bean = new HibernateTransactionManager();
        bean.setSessionFactory(sessionFactory);
        return bean;
    }
}
