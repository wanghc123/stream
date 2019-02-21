package com.utrf.stream;

import org.springframework.cloud.stream.annotation.Input;
import org.springframework.cloud.stream.annotation.Output;
import org.springframework.messaging.MessageChannel;
import org.springframework.messaging.SubscribableChannel;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

/**
 * @Description:
 * @author: wanghongchun
 * @date: 2019/2/21
 */
@Service
public interface StreamClient {
    String INPUT = "myInput";
    String OUTPUT = "myOutput";
    @Input(StreamClient.INPUT)
    SubscribableChannel input();
    @Output(StreamClient.OUTPUT)
    MessageChannel output();
}
