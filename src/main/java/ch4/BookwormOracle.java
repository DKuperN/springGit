package ch4;

/**
 * Autor: Денис
 * Date: 19.02.13
 * проверка комитов
 * 321312
 */
public class BookwormOracle implements Oracle {

    private Enciclopedia enciclopedia;

    public void setEnciclopedia(Enciclopedia enciclopedia) {
        this.enciclopedia = enciclopedia;
    }

    @Override
    public String defineMeaningOfLife() {
        return "better use Internet";
    }
}
