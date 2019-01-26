package com.smu.dubbo.provider.service;

import com.alibaba.dubbo.config.annotation.Service;
import com.smu.dubbo.api.IServiceAPI;
import org.springframework.stereotype.Component;

/**
 * @author wangshaokui
 * @version 1.0
 * @className ServiceAPI
 * @time 2019/1/25 15:20
 **/
@Component
@Service(interfaceClass = IServiceAPI.class)
public class ServiceAPI implements IServiceAPI {

    @Override
    public String sendMessage(String message) {
        return "dubbo-spring-boot-starter-provider" + message;
    }
}
