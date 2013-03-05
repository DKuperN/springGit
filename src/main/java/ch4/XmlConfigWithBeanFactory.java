package ch4;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.core.io.FileSystemResource;

/**
 * @author Denis Kupriyanchik
 *         Date: 25.02.13
 */
public class XmlConfigWithBeanFactory {
    public static void main (String[] arg) {
        DefaultListableBeanFactory factory = new DefaultListableBeanFactory();

        XmlBeanDefinitionReader bdr = new XmlBeanDefinitionReader(factory);

        bdr.loadBeanDefinitions(new FileSystemResource("src/main/resources/spring/xmlBeanFactory.xml"));
        Oracle oracle = factory.getBean("oracle", Oracle.class);
        System.out.println(oracle.defineMeaningOfLife());

    }
}
