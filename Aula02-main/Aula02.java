import java.util.Scanner;
//Altere a lógica da classe para determinar
//o menor salario informado
public class Aula02 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int matricula;
        double valorSalario, total=0, maior=0;
        for(int i=0; i<3; i++){
            System.out.println("Matricula");
            matricula = entrada.nextInt();
            System.out.println("Salario");
            valorSalario = entrada.nextDouble();
            total = total + valorSalario;
            if (i == 0){
                maior = valorSalario;
            }else{
                if (valorSalario > maior){
                    maior = valorSalario;
                }
            }

        }
        double media = total / 3;
        System.out.println("A média é " + media);
        System.out.println("O maior é " + maior);

    }
}
