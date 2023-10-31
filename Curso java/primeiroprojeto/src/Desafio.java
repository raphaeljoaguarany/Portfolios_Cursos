import java.util.Random;
import java.util.Scanner;

public class Desafio {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        int numeroGerado = new Random().nextInt(100);
        int tentativas = 0;

        while (tentativas < 5) {
            System.out.println("Digite um número de 0 a 100: ");
            int numeroDigitado = leitura.nextInt();
            tentativas++;

            if (numeroDigitado == numeroGerado) {
                System.out.println("Parabéns voce acertou em " + tentativas + " tentativas!!");
                break;
            } else if (numeroDigitado < numeroGerado) {
                System.out.println("O numero digitado é menor que o número gerado!");
            } else {
                System.out.println("O numero digitado é maior que o numero gerado!");
            }
        }
        if (tentativas == 5) {
            System.out.println("Voce nao conseguiu acertar o número em 5 tentativas. o número era " + numeroGerado + " !!");
        }
    }
}
