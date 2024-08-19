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
    public class FilaComRedimensionamento{
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
    public class FilaComPonteiros{
        public class Node{
            private int data;
            private Node next;
            public Node(int data){
                this.data = data;
                this.next = null;
            }
        }
        public class Fila{
            private Node front, rear;
            public Fila(){
                this.front = this.rear = null;
            }
            //9. Descreva o algoritmo(ou código) que insira um elemento em uma fila com ponteiros (lista
            //simplesmente encadeada).
            public void enqueue(int x){
                Node temp = new Node(x);
                // se a fila estiver vazia, o novo nó se forma tanto front quanto rear
                if (this.rear == null){
                    this.front = this.rear = temp;
                    return;
                }
                //adiciona o novo nó ao final da fila
                this.rear.next = temp;
                this.rear = temp;
            }
            //10. Descreva o algoritmo(ou código) que remova um elemento em uma fila com ponteiros
            //(lista simplesmente encadeada).

            public int dequeue(){
                if(isEmpty()){
                    System.out.println("Fila Vazia");
                    return -1;
                }
                int data = front.data;
                front = front.next;
                //se a fila ficar vazia, o rear também aponta para null
                if (front == null) {
                    rear = null;
                }
                return data;
            }
            public boolean isEmpty(){
                return front == null;
            }
        }
    }


}
