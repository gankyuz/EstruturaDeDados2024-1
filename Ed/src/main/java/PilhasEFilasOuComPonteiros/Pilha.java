package PilhasEFilasOuComPonteiros;

public class Pilha {
    private int[] elementos;
    private int topo;
    public Pilha(int capacidade){
        this.elementos = new int[capacidade];
        this.topo = -1; //inicialmente a pilha está vazia
    }
    //1. Descreva o código que insira um elemento em uma pilha com vetores.
    public void push(int item){
        if(isFull()){
            System.out.println("Pilha Cheia");
            return;
        }
        topo++;
        elementos[topo] = item;
    }
    //2. Descreva o algoritmo(ou código) que remova um elemento em uma pilha com vetores.

    public int pop(){ //remove elemento do topo
        if (isEmpty()){
            System.out.println("Pilha Vazia");
            return -1; // retorna um valor inválido para indicar erro
        }
        int item = elementos[topo];
        topo--;
        return item;
    }
    public int peek(){
        if (isEmpty()){
            System.out.println("Pilha Vazia");
            return -1;
        }
        return elementos[topo];
    }

    public boolean isEmpty(){
        return (topo == -1);
    }
    public boolean isFull(){
        return (topo == elementos.length -1);
    }
}
