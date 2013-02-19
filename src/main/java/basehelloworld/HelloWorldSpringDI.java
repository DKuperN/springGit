package basehelloworld;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Autor: Денис
 * Date: 07.02.13
 */
public class HelloWorldSpringDI {
    public static void main(String[] arg) {
        //инициализация Аппл контекста
        ApplicationContext ctx = new ClassPathXmlApplicationContext("/spring/app-context.xml");
        MessageRenderI mr = ctx.getBean("render", MessageRenderI.class);
        mr.render();
    }
}
