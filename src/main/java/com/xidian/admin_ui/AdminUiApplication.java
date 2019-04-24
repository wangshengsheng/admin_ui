package com.xidian.admin_ui;

import de.codecentric.boot.admin.server.config.EnableAdminServer;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.Configuration;

/**
 *
 * 访问admin ui 的地址:http://localhost:8080/#/applications
 *
 * 服务端
 *
 */

@Configuration
@EnableAutoConfiguration
@EnableAdminServer
public class AdminUiApplication {

    public static void main(String[] args) {
        SpringApplication.run(AdminUiApplication.class, args);
    }

}
