package PilhasEFilasOuComPonteiros;

public class Stack {
    private PilhaComPonteiros.Node top;

    public Stack() {
        this.top = null;
    }

    //5. Descreva o algoritmo(ou código) que insira um elemento
    // em uma pilha com ponteiros(lista encadeada).
    public void push(int data) {
        PilhaComPonteiros.Node newNode = new PilhaComPonteiros.Node(data);
        newNode.next = this.top;
        this.top = newNode;
        System.out.println(data);
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
}
