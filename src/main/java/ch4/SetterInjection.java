package ch4;

/**
 * Внедрение зависимости через сеттер
 * Autor: Денис
 * Date: 19.02.13
 */
public class SetterInjection {
    private Dependency dependency;

    public void setDependency(Dependency dependency) {
        this.dependency = dependency;
    }

}
