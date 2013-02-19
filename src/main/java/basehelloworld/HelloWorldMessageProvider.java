package basehelloworld;

import java.util.Random;

/**
 * Autor: Денис
 * Date: 06.02.13
 * update 18/02/2013
 */
public class HelloWorldMessageProvider implements MessageProviderI {
    private String message;

    Random random = new Random();
    private int r = random.nextInt(2);

    @Override
    public String getMessage() {
        if (r == 1) {
            message = "Hello world!";
        } else {
            message = "Привет мир!";
        }

        return message;
    }
}
