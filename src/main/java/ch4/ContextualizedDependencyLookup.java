package ch4;

/**
 * Autor: Денис
 * Date: 19.02.13
 */
public class ContextualizedDependencyLookup implements ManagedComponent {
    private Dependency dependency;
    @Override
    public void performLookup(Conteiner conteiner) {
        this.dependency = (Dependency)conteiner.getDependency("myDependency");
    }
}
