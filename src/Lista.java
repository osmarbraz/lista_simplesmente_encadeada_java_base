
/**
 * Implementação Base de Lista Simplesmente Encadeada.
 *
 */
public class Lista {

    /**
     * Nó de início da lista.
     */
    private No inicio;

    /**
     * Construtor sem parâmetro.
     *
     */
    public Lista() {
        this.inicio = null; //Inicializa o início da lista com null
    }

    /**
     * Recuperador de início.
     *
     * @return O nó do início da lista.
     */
    public No getInicio() {
        return inicio;
    }

    /**
     * Modificador de início.
     *
     * @param inicio Um nó a ser atribuído ao início da lista.
     */
    public void setInicio(No inicio) {
        this.inicio = inicio;
    }

    /**
     * Retorna o valor em String da lista.
     *
     * @return Uma string com o valor do início da lista.
     */
    public String paraString() {
        return "OID: " + this + " / início: " + getInicio();
    }

    /**
     * Insere um nó no início da lista.
     *
     * @param valor Um novo valor de um nó a ser inserido na lista.
     * @return Verdadeiro se conseguiu incluir o nó no início da lista.
     */
    public boolean inserirInicio(int valor) {
       
        return true;
    }

    /**
     * Insere um nó em uma posição especifica da lista.
     *
     * @param valor Um novo valor de um nó a ser inserido na lista.
     * @param k Posição a ser inserida o valor.
     * @return Verdadeiro ou falso se conseguiu incluir o novo valor.
     */
    public boolean inserirPosicao(int valor, int k) {
        
        return false;
    }

    /**
     * Insere um nó no final da lista.
     *
     * @param valor Um novo valor de um nó a ser inserido na lista.
     * @return Verdadeiro se conseguiu incluir o nó no final da lista.
     */
    public boolean inserirFim(int valor) {
        
       return false;
    }

    /**
     * Excluir um nó do início da lista.
     *
     * @return Verdadeiro ou falso se excluiu o valor do início.
     */
    public boolean excluirInicio() {
        
       return false;
    }

    /**
     * Excluir um Nó da lista pela posição.
     *
     * @param k Posição do nó a ser excluído da lista.
     * @return Verdadeiro ou falso se excluiu o valor da posição.
     */
    public boolean excluirPosicao(int k) {
        
        return false;
    }

    /**
     * Excluir um nó do final da lista.
     *
     * @return Verdadeiro ou falso se excluiu o valor do final.
     */
    public boolean excluirFim() {
        
       return false;
    }

    /**
     * Altera o valor de um Nó da lista pela posição.
     *
     * @param valor Um dado a ser atualizado na posição k da lista.
     * @param k Posição do nó a ser alterado da lista.
     * @return Verdadeiro ou falso se alterou o valor da posição.
     */
    public boolean alterarPosicao(int valor, int k) {
        
        return false;
    }

    /**
     * Procura lista pela posição.
     *
     * @param k Posição do nó a ser consultada na lista.
     * @return O dado de uma posição k ou -1.
     */
    public int procurarPosicao(int k) {
        
       return -1;
    }
    
    /**
     * Procura o nó da lista pela posição.
     *
     * @param chave Valor a a ser consultado na lista.
     * @return A posição do dado na lista ou -1.
     */
    public int procurarValor(int chave) {
        
        return -1;
    }
    
    /**
     * Lista os dados da lista.
     *
     * @return Uma String com os dados da lista.
     */
    public String listar() {
        //Recupera o início da lista
        No atual = getInicio();
        int cont = 0;
        //String de retorno
        String temp = "";
        while (atual != null) {
            cont = cont + 1;
            temp = temp + (cont) + "-" + atual.getDado() + "\n";
            atual = atual.getProximo();
        }
        return temp;
    }

    /**
     * Lista os dados da lista.
     *
     * @return Uma String com os dados da lista e seus endereços.
     */
    public String listarEndereco() {
        //Recupera o início da lista
        No atual = getInicio();
        int cont = 0;
        //String de retorno
        String temp = "";
        temp = temp + "Início = " + atual + "\n";
        while (atual != null) {
            cont = cont + 1;
            temp = temp + (cont) + "- Dado = " + atual.getDado() + " / Endereço = " + atual + " / Próximo = " + atual.getProximo() + "\n";
            atual = atual.getProximo();
        }        
        return temp;
    }

    /**
     * Retorna a quantidade de nós da lista.
     *
     * @return A quantidade de nós da lista.
     */
    public int getQuantidade() {
        int cont = 0;
        //Verifica se a lista não esta vazia
        if (getInicio() != null) {
            //Recupera o início da lista
            No atual = getInicio();
            while (atual != null) {
                cont = cont + 1;
                atual = atual.getProximo();
            }
        }
        return cont;
    }

    /**
     * Retorna se a lista esta vazia.
     *
     * @return Verdadeiro ou falso se a lista está vazia.
     */
    public boolean estaVazia() {
        return getInicio() == null;
    }
}
