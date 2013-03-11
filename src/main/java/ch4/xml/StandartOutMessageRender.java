package ch4.xml;

import basehelloworld.MessageProviderI;
import basehelloworld.MessageRenderI;

/**
 * @author Denis Kupriyanchik
 *         Date: 07.03.13
 */
public class StandartOutMessageRender implements MessageRenderI {

    private MessageProviderI messageProviderI = null;

    @Override
    public void render() {
        if (messageProviderI == null) {
            throw new RuntimeException("You must set the property for messageProvider class: " + StandartOutMessageRender.class.getName());
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
