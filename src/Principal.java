
/**
 * Implementação Base de Lista Simplesmente Encadeada.
 *
 */

//Declaração de bibliotecas
import javax.swing.JOptionPane;

public class Principal {

    /**
     * Realiza a leitura dos dados dos nós.
     *
     * @return O valor lido.
     */
    public static int leitura() {
        return Integer.parseInt(JOptionPane.showInputDialog("Digite um valor:"));
    }

    public static void main(String[] args) {
        /**
         * Declara e instancia a lista.
         */
        Lista lista = new Lista();
        
        // Controla o menu da lista
        int opcao = -1;
        while (opcao != 99) {
            opcao = Integer.parseInt(JOptionPane.showInputDialog("\t### Lista Simplesmente Encadeada ###\n"
                    + "Selecione a opção desejada:\n"
                    + " 1- Inserir Nó no início\n"
                    + " 2- Inserir Nó em uma posição especifica\n"
                    + " 3- Inserir Nó no fim\n"
                    + " 4- Remover Nó do início\n"
                    + " 5- Remover Nó de uma posição específica\n"
                    + " 6- Remover Nó do fim\n"
                    + " 7- Alterar o valor de um Nó\n"
                    + " 8- Procurar o dado de uma posição específica\n"
                    + " 9- Procurar a posição de um dado\n"
                    + "10- Listar Nós\n"
                    + "11- Listar Nós e Endereços\n"
                    + "12- Mostrar a quantidade de Nós\n"
                    + "13- Está vazia?\n"
                    + "99- Sair\n"));

            switch (opcao) {
                case 1: {                    
                    //Preenche o valor do dado
                    int dado = leitura();
                    if (lista.inserirInicio(dado) == true) {
                        JOptionPane.showMessageDialog(null, "Nó inserido no início com Sucesso!");
                    } else {
                        JOptionPane.showMessageDialog(null, "Nó não inserido no início!");
                    }
                    break;
                }
                case 2: {
                    //Le a posição a ser inserido o nó
                    int k = Integer.parseInt(JOptionPane.showInputDialog("Digite a posição:"));
                   //Preenche o valor do dado
                    int dado = leitura();                  
                    if (lista.inserirPosicao(dado, k) == true) {
                        JOptionPane.showMessageDialog(null, "Nó inserido na posição " + k + " com Sucesso!");
                    } else {
                        JOptionPane.showMessageDialog(null, "Nó não inserido na posição " + k + "!");
                    }
                    break;
                }
                case 3: {
                    //Preenche o valor do dado
                    int dado = leitura();
                    if (lista.inserirFim(dado) == true) {
                        JOptionPane.showMessageDialog(null, "Nó inserido no fim com Sucesso!");
                    } else {
                        JOptionPane.showMessageDialog(null, "Nó não inserido no fim!");
                    }
                    break;
                }
                case 4: {
                    if (lista.excluirInicio()) {
                        JOptionPane.showMessageDialog(null, "Nó do início foi excluído com Sucesso!");
                    } else {
                        JOptionPane.showMessageDialog(null, "Nó do início não foi excluído!");
                    }
                    break;
                }
                case 5: {
                    int k = Integer.parseInt(JOptionPane.showInputDialog("Digite a posição do dado a ser excluída:"));
                    if (lista.excluirPosicao(k)) {
                        JOptionPane.showMessageDialog(null, "O valor da posição " + k + " foi excluído com Sucesso!");
                    } else {
                        JOptionPane.showMessageDialog(null, "Valor não foi excluído!");
                    }
                    break;
                }
                case 6: {
                    if (lista.excluirFim()) {
                        JOptionPane.showMessageDialog(null, "O Nó do fim foi excluído com Sucesso!");
                    } else {
                        JOptionPane.showMessageDialog(null, "Nó do fim não foi excluído!");
                    }
                    break;
                }
                case 7: {
                    int k = Integer.parseInt(JOptionPane.showInputDialog("Digite a posição do dado a ser alterada e o novo dado:"));
                    //Preenche o valor do dado
                    int dado = leitura();
                    if (lista.alterarPosicao(dado, k)) {
                        JOptionPane.showMessageDialog(null, "O valor da posição " + k + " foi alterado com Sucesso!");
                    } else {
                        JOptionPane.showMessageDialog(null, "Valor não foi alterado!");
                    }
                    break;
                }
                case 8: {
                    int k = Integer.parseInt(JOptionPane.showInputDialog("Digite a posição do dado a ser procurada:"));
                    int dado = lista.procurarPosicao(k);
                    if (dado != -1) {
                        JOptionPane.showMessageDialog(null, "O valor da posição " + k + "  possui o dado = " + dado);
                    } else {
                        JOptionPane.showMessageDialog(null, "A posição " + k + " não está preenchida");
                    }
                    break;
                }
                 case 9: {
                    int dado = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor dado a ser procurado:"));
                    int k = lista.procurarValor(dado);
                    if (k != -1) {
                        JOptionPane.showMessageDialog(null, "O valor " + dado + " foi encontrado na posição = " + k);
                    } else {                        
                        JOptionPane.showMessageDialog(null, "O valor " + dado + " não existe");
                    }
                    break;
                }                
                case 10: {
                    if (lista.estaVazia()) {
                        JOptionPane.showMessageDialog(null, "Lista vazia!");
                    } else {
                        JOptionPane.showMessageDialog(null, "Listagem \n" + lista.listar());
                    }
                    break;
                }
                case 11: {
                    if (lista.estaVazia()) {
                        JOptionPane.showMessageDialog(null, "Lista vazia!");
                    } else {
                        JOptionPane.showMessageDialog(null, "Listagem Endereços \n" + lista.listarEndereco());
                    }
                    break;
                }
                case 12: {
                    JOptionPane.showMessageDialog(null, "Quantidade de Nós na lista : " + lista.getQuantidade());
                    break;
                }
                case 13: {
                    JOptionPane.showMessageDialog(null, "Lista está vazia : " + lista.estaVazia());
                    break;
                }
            }//Fim switch   
        }//Fim while
    }
}
