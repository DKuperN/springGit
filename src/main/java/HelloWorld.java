/**
 * User: Денис
 * Date: 05.02.13
 */
public class HelloWorld {
    public static void main(String[] arg) {
        MessageRenderI mr = MessageSuppertFactory.getInstance().getMessageRender();
        MessageProviderI mp = MessageSuppertFactory.getInstance().getMessageProvider();
        mr.setMessageProvider(mp);
        mr.render();
    }
}
