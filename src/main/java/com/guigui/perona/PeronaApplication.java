package com.guigui.perona;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication(exclude = { DataSourceAutoConfiguration.class })
// 启用事务管理
@EnableTransactionManagement
public class PeronaApplication {

    public static void main(String[] args) {
        SpringApplication.run(PeronaApplication.class, args);
    }

}
