package ListasEncadeadas;

public class ListaDuplamenteEncadeada<Dado> {
    private Node cabeca = null;
    private Node cauda = null;
    private Node dadoAtual;
    private int n = 0;

    private class Node{
        private Dado dado;
        private Node prox = null;
        private Node ant = null;
        private Node(Dado dado){
            this.dado = dado;
        }
    }

    public void adicionar(Dado dado){
        Node novoNo = new Node(dado);
        if (cabeca == null) cabeca = novoNo;
        else {
            dadoAtual = cabeca;
            while(dadoAtual.prox!=null) dadoAtual= dadoAtual.prox;
            novoNo.ant = dadoAtual;
            dadoAtual.prox = novoNo;
        }
        n++;
    }

    public Dado pesquisar(Dado dadoPesquisa){
        if (cabeca == null) return null;
        else {
            dadoAtual = cauda;

            while (dadoAtual!=null && dadoAtual.dado != dadoPesquisa) dadoAtual = dadoAtual.prox;
            if (dadoAtual!=null)return null;
            else return dadoAtual.dado;
        }
    }

}
