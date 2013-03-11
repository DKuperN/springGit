package ch4;

/**
 * Autor: Денис
 * Date: 19.02.13
 * проверка комитов
 */
public class BookwormOracle implements Oracle {

    private Enciclopedia enciclopedia;

    public void setEnciclopedia(Enciclopedia enciclopedia) {
        this.enciclopedia = enciclopedia;
    }

    private String text = "better use Internet";
    @Override
    public String defineMeaningOfLife() {
        return text +" - from "+ BookwormOracle.this.getClass().getName()+".java";
    }
}
