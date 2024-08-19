package AtividadeRevisao;

public class PilhasFilasVetoresPonteiros {
    public class Pilha{
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

        public int pop(){
            if (isEmpty()){
                System.out.println("Pilha Vazia");
                return -1; // retorna um valor inválido para indicar erro
            }
            int item = elementos[topo];
            topo--;
            return item;
        }

        public boolean isEmpty(){
            return (topo == -1);
        }
        public boolean isFull(){
            return (topo == elementos.length -1);
        }
    }
    public class PilhaRedimensionavel{

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

    public class PilhaComPonteiros {
        public class Node {
            int data;
            Node next;

            public Node(int data) {
                this.data = data;
                this.next = null;
            }
        }

        public class Stack {
            Node top;

            public Stack() {
                this.top = null;
            }
            //5. Descreva o algoritmo(ou código) que insira um elemento
            // em uma pilha com ponteiros(lista encadeada).
            public void push(int data){
                Stack newStack = new Stack();
                Node newNode = new Node(data);
                newNode.next = this.top;
                this.top = newNode;
                System.out.println(data+"empurrando a pilha");
            }
            //6. Descreva o algoritmo(ou código) que remova um elemento
            // em uma pilha com ponteiros(lista encadeada).

            public int pop(){
                if (this.top == null){
                    System.out.println("Stack Overflow");
                    return  -1;
                }else{
                    int popped = top.data;
                    top = top.next;
                    return popped;
                }
            }
        }
    }


}
