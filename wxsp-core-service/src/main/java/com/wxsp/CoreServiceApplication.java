package com.wxsp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * 客户端服务
 * EnableDiscoveryClient 该注解能激活Eureka中的DiscoveryClient实现，才能实现Controller中对服务信息的输出。
 * SpringBootApplication 相当于 @Configuration、@EnableAutoConfiguration 、 @ComponentScan 三个的作用
 *
 * @author HuXinsheng
 */
@EnableDiscoveryClient
@SpringBootApplication
@EnableSwagger2
public class CoreServiceApplication {
    public static void main(String[] args) {
        SpringApplication.run(CoreServiceApplication.class, args);
    }
}
