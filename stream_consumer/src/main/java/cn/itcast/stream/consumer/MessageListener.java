package cn.itcast.stream.consumer;

import cn.itcast.stream.channel.MyProcessor;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.cloud.stream.messaging.Sink;
import org.springframework.stereotype.Component;

@Component
@EnableBinding(MyProcessor.class)
public class MessageListener {

    @StreamListener(MyProcessor.MYINPUT)
    public void input(String message){
        System.out.println("获取消息"+message);
    }
}
