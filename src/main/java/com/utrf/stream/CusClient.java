package com.utrf.stream;

import org.springframework.cloud.stream.annotation.Input;
import org.springframework.cloud.stream.annotation.Output;
import org.springframework.messaging.MessageChannel;
import org.springframework.messaging.SubscribableChannel;

/**
 * @Description:
 * @author: wanghongchun
 * @date: 2019/2/22
 */
public interface CusClient {
    String INPUT = "cusInput";
    String OUTPUT = "cusOutput";
    @Input(CusClient.INPUT)
    SubscribableChannel input();
    @Output(CusClient.OUTPUT)
    MessageChannel output();
}
