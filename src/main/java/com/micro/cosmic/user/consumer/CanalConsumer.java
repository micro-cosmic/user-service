package com.micro.cosmic.user.consumer;

import lombok.extern.slf4j.Slf4j;
import org.apache.rocketmq.common.message.MessageExt;
import org.apache.rocketmq.spring.annotation.RocketMQMessageListener;
import org.apache.rocketmq.spring.core.RocketMQListener;
import org.springframework.stereotype.Component;

/**
 * @author caojiancheng
 * @date 2021/8/22
 * @description
 */
@Slf4j
@Component
@RocketMQMessageListener(topic = "canal-mq-topic", consumerGroup = "canal-consumer-group")
public class CanalConsumer implements RocketMQListener<MessageExt> {
    @Override
    public void onMessage(MessageExt message) {
        //想让延时重发的话，抛错即可
        log.info("接受到数据库变动 tag: {},body:{}, message:{}", message.getTags(), new String(message.getBody()), message.toString());
    }
}
