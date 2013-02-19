package ch4;

/**
 * Внедрение зависимости через конструктор
 * Autor: Денис
 * Date: 19.02.13
 */
public class ConstructorInjection {
    private Dependency dependency;

    public  ConstructorInjection (Dependency dependency) {
        this.dependency = dependency;
    }


}
