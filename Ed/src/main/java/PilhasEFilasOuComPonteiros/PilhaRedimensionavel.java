package PilhasEFilasOuComPonteiros;

public class PilhaRedimensionavel {
    private int[] elementos;
    private int topo;

    public PilhaRedimensionavel(){
        this.elementos = new int[1];//inicia com capacidade 1
        this.topo = -1;
    }
    //3. Descreva o algoritmo(ou código) que insira um elemento
    // em uma pilha com vetores que permita redimensionamento.
    public void push(int item){
        if (isFull()){
            // redimensionar
            int[] novoElemento = new int[elementos.length * 2];//criou uma nova pilha com o dobro de tamanho
            for (int i = 0; i<=topo; i++){
                novoElemento[i] = elementos[i];
            }
            elementos = novoElemento;
        }
        topo++;
        elementos[topo] = item;
    }

    // 4. Descreva o algoritmo(ou código) que remova um elemento
    // em uma pilha com vetores que permita redimensionamento.

    public int pop(){
        if (isEmpty()){
            System.out.println("Pilha Vazia");
            return -1;
        }
        int item = elementos[topo];
        topo --;
        //verificar se a pilha está muito pequena e redimensionar se necesssário
        if (topo == elementos.length / 4){
            int[] novoElemento = new int[elementos.length /2];
            for (int i=0; i<= topo; i++){
                novoElemento[i] = elementos[i];
            }
            elementos = novoElemento;
        }
        return item;
    }
    public boolean isEmpty(){
        return (topo == -1);
    }
    public boolean isFull(){
        return (topo == elementos.length -1);
    }
}
