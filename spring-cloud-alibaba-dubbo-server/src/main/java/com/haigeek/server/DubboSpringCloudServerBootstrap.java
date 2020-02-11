package com.haigeek.server;

import com.haigeek.api.service.EchoService;
import org.apache.dubbo.config.annotation.Service;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author zhaohj
 * @date 2020-02-11 20:56
 */
@EnableDiscoveryClient
@EnableAutoConfiguration
public class DubboSpringCloudServerBootstrap {
    public static void main(String[] args) {
        SpringApplication.run(DubboSpringCloudServerBootstrap.class);
    }
}
@Service
class EchoServiceImpl implements EchoService {

    @Override
    public String echo(String message) {
        return "[echo] Hello, " + message;
    }

}
