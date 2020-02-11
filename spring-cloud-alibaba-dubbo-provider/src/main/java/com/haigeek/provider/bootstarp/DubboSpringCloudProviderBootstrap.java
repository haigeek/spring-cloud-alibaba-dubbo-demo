package com.haigeek.provider.bootstarp;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author zhaohj
 * @date 2020-02-11 10:55
 */
@EnableDiscoveryClient
@EnableAutoConfiguration
public class DubboSpringCloudProviderBootstrap {
    public static void main(String[] args) {
        new SpringApplicationBuilder(DubboSpringCloudProviderBootstrap.class)
                .properties("spring.profiles.active=nacos").run(args);
    }
}
