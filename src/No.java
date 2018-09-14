
/**
 *
 * Nó a ser armazenado na lista.
 *
 */
public class No {

    private int dado;
    private No proximo;

    /**
     * Construtor sem parâmetros.
     */
    public No() {
        this(0, null);
    }

    /**
     * Construtor com parâmetros.
     *
     * @param dado um valor do tipo inteiro.
     * @param proximo um próximo no da lista
     */
    public No(int dado, No proximo) {
        this.dado = dado;
        this.proximo = proximo;
    }

    /**
     * Recuperador de dado.
     *
     * @return Um inteiro com o dado do nó.
     */
    public int getDado() {
        return dado;
    }

    /**
     * Recuperador de próximo.
     *
     * @return Um próximo nó da lista.
     */
    public No getProximo() {
        return proximo;
    }

    /**
     * Modificador de dado.
     *
     * @param dado Um valor inteiro a ser atribuído para o dado.
     */
    public void setDado(int dado) {
        this.dado = dado;
    }

    /**
     * Modificador de próximo.
     *
     * @param proximo Um próximo nó da lista.
     */
    public void setProximo(No proximo) {
        this.proximo = proximo;
    }

    /**
     * Retorna o valor em String do dado.
     *
     * @return Uma string com o valor do dado do nó.
     */
    public String paraString() {
        return "OID: " + this + " / dado: " + getDado();
    }
}
