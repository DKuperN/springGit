package ch4;

import basehelloworld.MessageProviderI;
import org.springframework.context.support.GenericXmlApplicationContext;

/**
 * Объявление Бинов (тестирование)
 *
 * User: Denis
 * Date: 11.03.13
 */
public class DeclareSpringComponents {

    //путь к настройкам через аннотации
    //private static String CLASSPATH = "classpath:spring/app-context-annotation.xml";

    //путь к настройкам через бины (xml)
    private static String CLASSPATH = "classpath:spring/app-context-xml.xml";

    public static void main(String[] args) {
        GenericXmlApplicationContext ctx = new GenericXmlApplicationContext();
        ctx.load(CLASSPATH);
        ctx.refresh();
        MessageProviderI messageProviderI = ctx.getBean("messageProvider", MessageProviderI.class);

        System.out.print(messageProviderI.getMessage());

    }
}
