import java.util.Scanner;
public class Exemplo {
    //psvm
    public static void main(String[] args) {
        /*
        void - nao retorna valor
        main - nome do metodo
        args - nome do parametro
        string - classe String (Caracteres)

         */

        String nome; //comentario de linha

        /* comentario */ int numero;
        double salario; //tipo de dado double
        String nomeDaMae;
        String nomePai;
        String EnderecoCorrespondencia;

        double nota1, nota2, media;

        //classe Scarnner para entrada de dados
        Scanner teclado = new Scanner(System.in);

        //sout
        System.out.println("Informe a nota 1: ");
        nota1 = teclado.nextDouble();
        System.out.println("Informe a nota 2: ");
        nota2 = teclado.nextDouble();
        media = (nota1 + nota2) / 2;
        System.out.println("Sua media:" + media);


//        comentario de linha

    }
}
