package PilhasEFilasOuComPonteiros;

public class FilaComPonteiros {
    public static class Node {
        private int data;
        private Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public class Fila {
        private Node front, rear;

        public Fila() {
            this.front = this.rear = null;
        }

        //9. Descreva o algoritmo(ou código) que insira um elemento em uma fila com ponteiros (lista
        //simplesmente encadeada).
        public void enqueue(int x) {
            Node temp = new Node(x);
            // se a fila estiver vazia, o novo nó se forma tanto front quanto rear
            if (this.rear == null) {
                this.front = this.rear = temp;
                return;
            }
            //adiciona o novo nó ao final da fila
            this.rear.next = temp;
            this.rear = temp;
        }
        //10. Descreva o algoritmo(ou código) que remova um elemento em uma fila com ponteiros
        //(lista simplesmente encadeada).

        public int dequeue() {
            if (isEmpty()) {
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

        public boolean isEmpty() {
            return front == null;
        }
    }
}
/*public class FilaComPonteiros{
    public static void main(String[] args) {

    }*/
