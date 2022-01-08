package cn.itcast.stream.producer;

import cn.itcast.stream.channel.MyProcessor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.messaging.Source;
import org.springframework.messaging.MessageChannel;
import org.springframework.messaging.support.MessageBuilder;
import org.springframework.stereotype.Component;

@Component
@EnableBinding(MyProcessor.class)
public class MessageSender {

    @Autowired
    private MessageChannel myoutput;

    public void send(Object object){
        myoutput.send(MessageBuilder.withPayload(object).build());
    }
}
