package AtividadeRevisao.Pct.PilhaComPonteiros;

public class PilhaComPonteiros {
    public static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    /*public class Stack {
        Node top;

        public Stack() {
            this.top = null;
        }

        //5. Descreva o algoritmo(ou código) que insira um elemento
        // em uma pilha com ponteiros(lista encadeada).
        public void push(int data) {
            Node newNode = new Node(data);
            newNode.next = this.top;
            this.top = newNode;
            System.out.println(data + "empurrando a pilha");
        }
        //6. Descreva o algoritmo(ou código) que remova um elemento
        // em uma pilha com ponteiros(lista encadeada).

        public int pop() {
            if (this.top == null) {
                System.out.println("Stack Overflow");
                return -1;
            } else {
                int popped = top.data;
                top = top.next;
                return popped;
            }
        }
    }*/
}
