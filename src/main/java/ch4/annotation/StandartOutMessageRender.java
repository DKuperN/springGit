package ch4.annotation;

import basehelloworld.MessageProviderI;
import basehelloworld.MessageRenderI;
import org.springframework.stereotype.Service;

/**
 * Объявление бинов, стиль Аннотаций
 *
 * Created with IntelliJ IDEA.
 * User: Denis
 * Date: 11.03.13
 * Time: 22:55
 */

@Service("messageRender")

public class StandartOutMessageRender implements MessageRenderI {

    private MessageProviderI messageProviderI = null;

    @Override
    public void render() {
        if (messageProviderI == null) {
            throw new RuntimeException("You must set the property for messageProvider class: " + this.getClass().getName());
        }
        System.out.print(messageProviderI.getMessage());
    }

    @Override
    public void setMessageProvider(MessageProviderI provider) {
        this.messageProviderI = provider;
    }

    @Override
    public MessageProviderI getMessageProvider() {
        return this.messageProviderI;
    }
}
