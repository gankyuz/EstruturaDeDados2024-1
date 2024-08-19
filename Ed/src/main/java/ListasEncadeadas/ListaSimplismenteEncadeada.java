package ListasEncadeadas;

public class ListaSimplismenteEncadeada<Dado> {
    private Node cabeca = null;
    private Node cauda = null;
    private Node dadoAtual;
    private int n = 0;

    private class Node{
        private Dado dado; // dado que o nó recebe
        private Node prox = null; //vai indicar qual o próximo desse nó
        private Node(Dado dado){
            this.dado = dado;
        }
    }
    public void adicionar(Dado dado){ //adicionar no fim da lista
        Node novoNo = new Node(dado);

        this.dadoAtual = this.cauda;
        this.cauda = novoNo;
        if (dadoAtual == null) this.cabeca = this.cauda;
        else{
            dadoAtual.prox = cauda;
        }
        n++;
    }

    //13. Faça um código ou pseudocódigo para inserir no início de uma lista simplesmente encadeada
    public void adicionarIncio(Dado dado){
        Node novoNo = new Node(dado);

        this.dadoAtual = cabeca;
        cabeca = novoNo;
        if (dadoAtual == null) cauda = cabeca;
        else cabeca.prox = dadoAtual;
        n++;
    }
    //14. Faça um código ou pseudocódigo para procurar
    // um dado dentro de uma lista simplesmente encadeada
    public Dado pesquisaDado(Dado dadoPesquisa){
        dadoAtual = cabeca;
        while(dadoAtual !=null && dadoAtual.dado != dadoPesquisa) cabeca = cabeca.prox;
        if (dadoAtual==null) return null;
        return dadoAtual.dado;
    }
    //15. Faça um código ou pseudocódigo para procurar um dado dentro
    // de uma lista simplesmente encadeada e removê-lo da lista.

    public Dado pesquisaERemove(Dado dadoRemover){
        if (cabeca == null) return null;

        cabeca = cauda;
        Node antigo = dadoAtual;

        if (dadoAtual.dado == dadoRemover){
            cabeca = cabeca.prox;
            n--;
            return dadoAtual.dado;
        }else {
            while (dadoAtual != null && dadoAtual.dado != dadoRemover) {
                antigo = dadoAtual;
                dadoAtual = dadoAtual.prox;
            }
            if (dadoAtual == null) return null;
            else {
                antigo.prox = dadoAtual.prox;
                n--;
                return dadoAtual.dado;
            }
        }

    }


}
