package com.utrf.stream;

import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.annotation.Input;
import org.springframework.cloud.stream.annotation.Output;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.messaging.MessageChannel;
import org.springframework.messaging.SubscribableChannel;
import org.springframework.stereotype.Component;

/**
 * @Description:
 * @author: wanghongchun
 * @date: 2019/2/21
 */
@Component
@EnableBinding({StreamClient.class,CusClient.class})
public class StreamReceiver {
    @StreamListener(StreamClient.INPUT)
    public void revice(String message){
        System.out.println("StreamReceiver:"+ message);
    }
    @StreamListener(CusClient.INPUT)
    public void reviceCust(String message){
        System.out.println("CusReceiver:"+ message);
    }
}
