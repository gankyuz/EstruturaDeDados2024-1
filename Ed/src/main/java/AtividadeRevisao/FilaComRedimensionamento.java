package AtividadeRevisao;

public class FilaComRedimensionamento {
    private int[] elementos;
    private int inicio, fim;
    private int capacidade;
    public FilaComRedimensionamento(int capacidadeInicial){
        this.elementos = new int[capacidadeInicial];
        this.inicio = 0;
        this.fim = -1;
        this.capacidade = capacidadeInicial;

    }
    //7. Descreva o algoritmo(ou código) que insira um elemento em uma fila com vetores que
    //permita redimensionamento.
    public void enfileirar(int valor){
        if (capacidade == -1){
            redimensionar();
        }
        fim++;
        elementos[fim] = valor;
    }
    public void redimensionar(){
        int[] novoVetor = new int[capacidade*2];
        int index = 0;
        for (int i = inicio; i<=fim;i++){
            novoVetor[index++] = elementos[i];
        }
        elementos = novoVetor;
        inicio = 0;
        fim = index-1;
        capacidade *= 2;
    }
    //8. Descreva o algoritmo(ou código) que remova um elemento em uma fila com vetores que
    //permita redimensionamento.

    public int desinfileirar(){
        if (isEmpty()){
            System.out.println("Fila Vazia");
        }
        int valor = elementos[inicio];
        inicio++;
        //verificar se a fila está quase vazia e se vale a pena redimensionar
        if (inicio == capacidade/4){
            redimensionar();
        }
        return valor;
    }
    public boolean isEmpty(){
        return (inicio > fim);
    }
}
