import java.util.Scanner;

public class LD_Nao_Ordenada {

    //Definindo a classe que representará cada elemento da lista
    private static class LISTA{
        public int num;
        public LISTA prox;
        public LISTA ant;
    }

    public static void main(String args[]) {
        Scanner entrada = new Scanner(System.in);
        // a lista está vazia, logo, o objeto de início tem valor null
        // o objeto inicio conterá o endereço do primeiro elemento da lista

        LISTA inicio = null;
        // o objeto fim conterá o endereço do último elemento da lista
        LISTA fim = null;
        // o objeto aux é um objeto auxiliar
        LISTA aux;
        //apresentando o menu de opções

        int op, numero, achou;
        boolean continuar = true;
        while(continuar == true) {
            System.out.println("\nMENU DE OPÇÕES\n");
            System.out.println("1 - Inserir no início da lista");
            System.out.println("2 - Inserir no fim da lista");
            System.out.println("3 - Consultar a lista do inicio ao fim");
            System.out.println("4 - Sair");
            System.out.print("Digite sua opção: ");
            op = entrada.nextInt();

            if (op < 1 || op > 4) {
                System.out.println("Opção inválida!");
            } //INICIO DA LISTA
            if (op == 1) {
                System.out.println("Digite o número para ser inserido no início da lista: ");
                LISTA novo = new LISTA();
                novo.num = entrada.nextInt();
                if (inicio == null) {
                    // a lista estava vazia e o elemento será o primeiro e o último
                    inicio = novo;
                    fim = novo;
                    novo.prox = null;
                    novo.ant = null;
                } else {
                    // a lista já contém elementos e o novo elemento será inserido no início
                    novo.prox = inicio;
                    inicio.ant = novo;
                    novo.ant = null;
                    inicio = novo;
                }

                System.out.println("Número inserido no início da lista!!");
            }

            if (op == 2) { //FIM DA LISTA
                System.out.println("Digite o número a ser inserido no fim da lista: ");
                LISTA novo = new LISTA();
                novo.num = entrada.nextInt();
                if (inicio == null) {
                    // a lista estava vazia e o elemento será o primeiro e o último
                    inicio = novo;
                    fim = novo;
                    novo.prox = null;
                    novo.ant = null;
                } else {
                    // a lista já contém elementos e o novo elemento será inserido no fim
                    fim.prox = novo;
                    novo.ant = fim;
                    novo.prox = null;
                    fim = novo;
                }
                System.out.println("Número inserido no fim da lista!!");
            }
            if (op == 3) {
                if (inicio == null) {
                    // A lista está vazia
                    System.out.println("Lista Vazia!!");
                } else {
                    // A lista contém elementos e estes serão mostrados do início ao fim

                    System.out.println("\nConsultando a lista do início ao fim\n");
                    aux = inicio;
                    while (aux != null) {
                        System.out.print(aux.num + " ");
                        aux = aux.prox;
                    }
                }
            }
            if (op == 4){
                continuar = false;
            }
        }
    }
}
