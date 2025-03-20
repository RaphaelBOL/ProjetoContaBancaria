import java.util.Locale;
import java.util.Scanner;
import java.text.NumberFormat;

public class ProjetoContaCorrente {
    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);
        Locale localeBR = new Locale.Builder().setLanguage("pt").setRegion("BR").build();
        NumberFormat formatacaoMoeda = NumberFormat.getCurrencyInstance(localeBR);

        System.out.println("Digite o nome do cliente:");
        String nomeCliente = leitor.nextLine();
        System.out.println("Digite o saldo inicial se houver, caso contrato digite 0");
        double saldoInicial = leitor.nextDouble();
        double saldo = saldoInicial;
        double movimento;
        boolean loop = true;

        System.out.printf("""
                ******************************************
                Extrato Conta Corrente
                
                Nome:               %s
                Tipo conta:         Corrente
                Saldo inicial:      R$ %.2f
                ******************************************""", nomeCliente, saldoInicial);


        while (loop) {


            System.out.println("""
                    \nOperações da conta Corrente:
                    
                    1 - Consultar Saldo
                    2 - Receber Valor
                    3 - Transferir Valor
                    4 - Sair
                    """);

            System.out.println("Digite a opção desejada:");
            int opcao = leitor.nextInt();

            if (opcao == 1) {
                System.out.println("O saldo atual da Conta Corrente é " + formatacaoMoeda.format(saldo));
            } else if (opcao == 2) {
                System.out.println("Insira o valor recebido:");
                movimento = leitor.nextDouble();
                saldo += movimento;
                System.out.println("Você recebeu um crédito no valor de " + formatacaoMoeda.format(movimento) + "." + "\nSaldo atualizado: " + formatacaoMoeda.format(saldo));
            } else if (opcao == 3) {
                System.out.println("Insira o valor da transferência:");
                movimento = leitor.nextDouble();
                if (movimento > saldo) {
                    System.out.println("Saldo insuficiente para realizar a transferência. Selecione uma nova opção!");
                } else {
                    saldo -= movimento;
                    System.out.println("Você realizou uma transferência no valor de " + formatacaoMoeda.format(movimento) + "." + "\nSaldo atualizado: " + formatacaoMoeda.format(saldo));
                }
            } else if (opcao == 4) {
                loop = false;
                System.out.println("Acesso Encerrado!");

            } else {
                System.out.println("""
                        Opção Inválida!
                        Selecione uma nova opção.""");
            }
        }
    }
}
