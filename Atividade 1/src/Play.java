import java.util.Random;
import java.util.Scanner;

public class RandomNumber {

    public static void main(String[] args) {
        int valor, aleatorio, escolha, i;
        Scanner sc = new Scanner(System.in);
        Random random = new Random();

        System.out.println("Escolha entre os níveis: 1(Fácil), 2(Médio) e 3(Difícil)");
        escolha = sc.nextInt();

        switch (escolha) {

            case 1:
                aleatorio = random.nextInt(1001);
                for (i = 1; i <= 15; i++){
                System.out.println("Digite um número de 0 a 1000");
                valor = sc.nextInt();

                    if (valor == aleatorio) {

                        System.out.println("Parabéns, você acertou!!!");

                    } else {

                        System.out.println("Você errou!");
                    }
                    if (valor < aleatorio) {

                        System.out.println("Seu chute foi baixo, tente novamente.");

                    } else {
                        System.out.println("Seu chute foi alto, tente novamente.");
                    }
                }
                System.out.println("Suas tentativas esgotaram :(");
                System.out.println("O número sorteado era: " + aleatorio);
                break;

            case 2:
                aleatorio = random.nextInt(5001);
                for (i = 1; i <= 12; i++){
                    System.out.println("Digite um número de 0 a 5000");
                    valor = sc.nextInt();

                    if (valor == aleatorio) {

                        System.out.println("Parabéns, você acertou!!!");

                    } else {

                        System.out.println("Você errou!");
                    }
                    if (valor < aleatorio) {

                        System.out.println("Seu chute foi baixo, tente novamente.");

                    } else {
                        System.out.println("Seu chute foi alto, tente novamente.");
                    }
                }
                System.out.println("Suas tentativas esgotaram :(");
                System.out.println("O número sorteado era: " + aleatorio);
                break;

            case 3:
                aleatorio = random.nextInt(10001);
                for (i = 1; i <= 10; i++){
                    System.out.println("Digite um número de 0 a 10000");
                    valor = sc.nextInt();

                    if (valor == aleatorio) {

                        System.out.println("Parabéns, você acertou!!!");

                    } else {

                        System.out.println("Você errou!");

                        if (valor < aleatorio) {

                            System.out.println("Seu chute foi baixo, tente novamente.");

                        } else {
                            System.out.println("Seu chute foi alto, tente novamente.");
                        }
                    }
                }
                System.out.println("Suas tentativas esgotaram :(");
                System.out.println("O número sorteado era: " + aleatorio);
                break;
            default:
                System.out.println("Escolha um nível válido");
        }

        sc.close();

    }
}
