package basehelloworld;

/**
 * Autor: Денис
 * Date: 06.02.13
 */
public class StandartOutMessageRender implements MessageRenderI {

    private MessageProviderI messageProvider = null;

    @Override
    public void render() {
        if (messageProvider == null) {
            throw new RuntimeException("Должно быть установлено свойство messageProvider класса: " +
                    StandartOutMessageRender.class.getName());
        }
        System.out.println(messageProvider.getMessage());
    }

    public void setMessageProvider(MessageProviderI provider) {
        this.messageProvider = provider;
    }

//    public basehelloworld.MessageProviderI getMessageProvider() {
//        return this.messageProvider;
//    }

}
