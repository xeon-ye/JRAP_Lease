package com.jingrui.jrap.message.impl.rabbitmq;

import com.jingrui.jrap.message.IMessagePublisher;
import org.springframework.amqp.core.DirectExchange;
import org.springframework.amqp.core.TopicExchange;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

/**
 * @author njq.niu@jingrui.com
 */
public class MessagePublisherImpl implements IMessagePublisher{


    @Autowired
    @Qualifier("defaultDirectExchange")
    private DirectExchange directExchange;

    @Autowired
    @Qualifier("defaultTopicExchange")
    private TopicExchange topicExchange;

    @Autowired
    @Qualifier("defaultRabbitTemplate")
    private RabbitTemplate rabbitTemplate;


    public void publish(String channel, Object message) {
        rabbitTemplate.convertAndSend(topicExchange.getName(), channel, message);
    }

    @Override
    public void rPush(String list, Object message) {
        message(list, message);
    }

    @Override
    public void message(String name, Object message) {
        rabbitTemplate.convertAndSend(directExchange.getName(), name, message);
    }

}
