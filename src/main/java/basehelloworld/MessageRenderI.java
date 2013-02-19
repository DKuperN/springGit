package basehelloworld;

/**
 * Created with IntelliJ IDEA.
 * User: Денис
 * Date: 06.02.13
 * Time: 23:10
 * To change this template use File | Settings | File Templates.
 */
public interface MessageRenderI {
    public void render();
    public void setMessageProvider(MessageProviderI provider);
    //public basehelloworld.MessageProviderI getMessageProvider();
}
