package com.smu.dubbo.consumer.quickstart;

import com.alibaba.dubbo.config.annotation.Reference;
import com.smu.dubbo.api.IServiceAPI;
import org.springframework.stereotype.Component;

/**
 * @author wangshaokui
 * @version 1.0
 * @className QuickStartConsumer
 * @time 2019/1/25 15:38
 **/
@Component
public class QuickStartConsumer {

    @Reference
    IServiceAPI serviceAPI;

    public void sendMessage(String message){
        System.out.println(serviceAPI.sendMessage(message));
    }


}
