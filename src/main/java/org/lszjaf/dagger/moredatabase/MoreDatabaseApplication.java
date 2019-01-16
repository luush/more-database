package org.lszjaf.dagger.moredatabase;

import com.zaxxer.hikari.HikariDataSource;
import org.apache.commons.dbcp2.BasicDataSource;
import org.lszjaf.dagger.moredatabase.config.DataSourceConfig;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceProperties;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Primary;

@SpringBootApplication
@MapperScan("org.lszjaf.dagger.moredatabase.mapper")
@EnableAutoConfiguration
public class MoreDatabaseApplication {

    public static void main(String[] args) {
        SpringApplication.run(MoreDatabaseApplication.class, args);
    }

//    @Bean
//    @Primary
//    @ConfigurationProperties("app.datasource.first")
//    public DataSourceProperties firstDataSourceProperties() {
//        return new DataSourceProperties();
//    }
//
//    @Bean
//    @Primary
//    @ConfigurationProperties("app.datasource.first.configuration")
//    public HikariDataSource firstDataSource() {
//        return firstDataSourceProperties().initializeDataSourceBuilder()
//                .type(HikariDataSource.class).build();
//    }
//
//    @Bean
//    @ConfigurationProperties("app.datasource.second")
//    public DataSourceProperties secondDataSourceProperties() {
//        return new DataSourceProperties();
//    }
//
//    @Bean
//    @ConfigurationProperties("app.datasource.second.configuration")
//    public BasicDataSource secondDataSource() {
//        return secondDataSourceProperties().initializeDataSourceBuilder()
//                .type(BasicDataSource.class).build();
//    }
}

