package com.yangying.por;

import org.springframework.boot.Banner;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication
@EnableTransactionManagement
@EnableJpaRepositories(basePackages = "com.yangying.por.repos")
@EntityScan("com.yangying.por.pojo")
public class ApplicationStarter {

    public static void main(String[] args) {
        new SpringApplicationBuilder(ApplicationStarter.class)
                .bannerMode(Banner.Mode.OFF)
                .run(args);
    }
}