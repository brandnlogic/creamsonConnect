package com.bnl.application;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.orm.jpa.EntityManagerFactoryBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.core.env.Environment;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;

import javax.sql.DataSource;

//@Configuration
//@EnableJpaRepositories(basePackages = { "com.bnl.dto", "com.bnl.dao"}, entityManagerFactoryRef = "commonEntityManagerFactory")
public class CreamsonConnectDBDSCommonConfig
{

//    @Autowired
//    private Environment env;
//
//    @Primary
//    @Bean(name = "commonDataSource")
//    public DataSource commonDataSource()
//    {
//        PoolProperties props = new PoolProperties();
//        // The url to connect to database
//        props.setUrl(env.getProperty("spring.datasource.url"));
//        // Specify the type of driver
//        props.setDriverClassName(env.getProperty("spring.datasource.driverClassName"));
//        // login username
//        props.setUsername(env.getProperty("spring.datasource.username"));
//        // login password
//        props.setPassword(env.getProperty("spring.datasource.password"));
//        // The default auto-commit state of connections created by this pool.
//        props.setDefaultAutoCommit(true);
//        // query that will be used to validate connections from this pool before returning them to the caller.
//        props.setValidationQuery("SELECT 1");
//        // maximum number of physical connections that you can create in pool.
//        props.setMaxActive(Integer.parseInt(env.getProperty("spring.datasource.tomcat.max-active")));
//        // The minimum number of established connections that should be kept in the pool at all times.
//        props.setMinIdle(Integer.parseInt(env.getProperty("spring.datasource.tomcat.min-idle")));
//        // The initial number of connections that are created when the pool is started.
//        props.setInitialSize(Integer.parseInt(env.getProperty("spring.datasource.tomcat.initial-size")));
//        // Reap time (milliseconds) - how often we validate idle connections.
//        props.setTimeBetweenEvictionRunsMillis(Integer.parseInt(env.getProperty("spring.datasource.tomcat.time-between-eviction-runs-millis")));
//        // Unused timeout (milliseconds) - The minimum amount of time an object may sit idle in the pool before it is eligible for eviction.
//        props.setMinEvictableIdleTimeMillis(Integer.parseInt(env.getProperty("spring.datasource.tomcat.min-evictable-idle-time-millis")));
//        // Connection Timeout (milliseconds) - The maximum number of that the pool will wait (when there are no available connections) for a connection.
//        props.setMaxWait(Integer.parseInt(env.getProperty("spring.datasource.tomcat.max-wait")));
//        // Aged timeout - Specifies the interval in milliseconds before a connection is discarded.
//        props.setMaxAge(Integer.parseInt(env.getProperty("spring.datasource.tomcat.max-age")));
//        // Flag to log stack traces for application code which abandoned a Connection
//        props.setLogAbandoned(false);
//        // Flag to remove abandoned connections
//        props.setRemoveAbandoned(true);
//        /*
//         * ConnectionState - keeps track of auto commit, read only, catalog and transaction isolation level
//         * StatementFinalizer - keeps track of opened statements, and closes them when the connection is returned to the pool.
//         * ResetAbandonedTimer - reset the checkout timer every time you perform an operation on the connection or execute a query successfully.
//         */
//        props.setJdbcInterceptors("org.apache.tomcat.jdbc.pool.interceptor.ConnectionState;" + "org.apache.tomcat.jdbc.pool.interceptor.StatementFinalizer;" + "org.apache.tomcat.jdbc.pool.interceptor.ResetAbandonedTimer;");
//        /*
//         * Tomcat DataSource is required to supply the pooling properties.
//         * Tomcat DataSource internally implements javax.sql.DataSource.
//         */
//        org.apache.tomcat.jdbc.pool.DataSource datasource = new org.apache.tomcat.jdbc.pool.DataSource();
//        datasource.setPoolProperties(props);
//        /* return the required javax.sql.DataSource interface */
//        return datasource;
//    }
//
//    @Primary
//    @Bean(name = "commonEntityManagerFactory")
//    public LocalContainerEntityManagerFactoryBean commonEntityManagerFactory(EntityManagerFactoryBuilder builder)
//    {
//        return builder.dataSource(commonDataSource()).packages("com.bnl.dto", "com.bnl.dao").build();
//    }
}
