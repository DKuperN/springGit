package ch4.xml;

import basehelloworld.MessageProviderI;

/**
 * @author Denis Kupriyanchik
 *         Date: 07.03.13
 */
public class HelloWorldMessageProvider implements MessageProviderI {
    @Override
    public String getMessage() {
        return "\n"+"Hello world from "+ HelloWorldMessageProvider.class.getName()+"\n";
    }
}
