package com.smu.dubbo.consumer;

import com.alibaba.dubbo.spring.boot.annotation.EnableDubboConfiguration;
import com.smu.dubbo.consumer.quickstart.QuickStartConsumer;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
@EnableDubboConfiguration
public class DubboConsumerApplication {

    public static void main(String[] args) {

        ConfigurableApplicationContext context = SpringApplication.run(DubboConsumerApplication.class, args);

        QuickStartConsumer quickStartConsumer = context.getBean(QuickStartConsumer.class);
        quickStartConsumer.sendMessage("发起请求");
    }

}

