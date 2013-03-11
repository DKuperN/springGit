package ch4.annotation;

import basehelloworld.MessageProviderI;
import org.springframework.stereotype.Service;

/**
 * @author Denis Kupriyanchik
 *         Date: 11.03.13
 */

@Service ("messageProvider")

public class HelloWorldMessageProvider implements MessageProviderI {
    @Override
    public String getMessage() {
        return "\n"+"Hello world from "+ HelloWorldMessageProvider.class.getName()+"\n";
    }
}
