import java.util.Scanner;

public class DesafioFinalCurso1 {
    public static void main(String[] args) {
        String nome = "Jéssica Namorada";
        String tipoConta = "Corrente";
        double saldo = 200000;

        System.out.println("********************");
        System.out.println("\nNome do cliente: " + nome);
        System.out.println("Tipo conta " + tipoConta);
        System.out.println("Saldo atual: " + saldo);
        System.out.println("\n********************");

        String menu = """
                ** Digite sua opção **
                1 - Consultar saldo -
                2 - Transferir valor -
                3 - Receber valor -
                4 - Sair -
                
                """;
        Scanner leitura = new Scanner(System.in);

        int opcao = 0;
        while (opcao != 4) {
            System.out.println(menu);
            opcao = leitura.nextInt();

            if (opcao == 1){
                System.out.println("O saldo atualizado é R$" + saldo);
            } else if (opcao == 2){
                System.out.println("Qual o valor que deseja transferir? ");
                double valor = leitura.nextDouble();
                if (valor > saldo) {
                    System.out.println("Não há saldo para a transferencia");
                } else {
                    saldo = saldo - valor;
                    System.out.println("Novo saldo R$" + saldo);
                }
            }else if (opcao == 3) {
                System.out.println("Valor recebido: ");
                double valor = leitura.nextDouble();
                saldo += valor;
                System.out.println("Novo saldo R$" + saldo);
            } else if (opcao != 4) {
                System.out.println("Opção inválida!!");
            }
        }
    }
}
