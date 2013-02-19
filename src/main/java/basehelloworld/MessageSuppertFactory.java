package basehelloworld;

import java.io.FileInputStream;
import java.util.Properties;

/**
 * Autor: Денис
 * Date: 06.02.13
 */
@Deprecated
public class MessageSuppertFactory {

    final String PROPERTIES_PATH = "E:/JavaProgects/Spring/src/main/java/properties/msf.properties";

    private static MessageSuppertFactory instance = null;
    private Properties properties = null;
    private MessageRenderI render = null;
    private MessageProviderI provider = null;

    private MessageSuppertFactory() {
        properties = new Properties();
        try {
            properties.load(new FileInputStream(PROPERTIES_PATH));

            //Получить классы реализации
            String renderClass = properties.getProperty("render.class");
            String providerClass = properties.getProperty("provider.class");
            render = (MessageRenderI) Class.forName(renderClass).newInstance();
            provider = (MessageProviderI) Class.forName(providerClass).newInstance();

        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    static {
        instance = new MessageSuppertFactory();
    }

    public static MessageSuppertFactory getInstance() {
        return instance;
    }

    public MessageRenderI getMessageRender() {
        return render;
    }

    public MessageProviderI getMessageProvider() {
        return provider;
    }
}
