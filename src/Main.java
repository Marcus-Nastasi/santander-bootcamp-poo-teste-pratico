import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double saldo = scanner.nextDouble();
        int quantidadeTransacoes = scanner.nextInt();

        ArrayList<String> listaDeTransacoes = new ArrayList<>();

        for (int i = 0; i < quantidadeTransacoes; i++) {
            String tipoTransacao = scanner.next();
            double valorTransacao = scanner.nextDouble();

            if (tipoTransacao.equals("D") || tipoTransacao.equals("d")) {
                saldo += valorTransacao;
                listaDeTransacoes.add("Deposito " + valorTransacao);
            } else if (tipoTransacao.equals("S") || tipoTransacao.equals("s")) {
                saldo -= valorTransacao;
                listaDeTransacoes.add("Saque " + valorTransacao);
            } else {
                System.out.println("Opção inválida. Utilize D para depósito ou S para saque.");
                i--;
            }
        }

        System.out.println("\nSaldo: " + saldo);
        System.out.println("\nTransacoes:");

        for (int i = 0; i < listaDeTransacoes.size(); i++) {
            String tp = listaDeTransacoes.get(i).split(" ")[0];
            String vl = listaDeTransacoes.get(i).split(" ")[1];
            System.out.println(i + 1 + ". " + tp + " de " + vl);
        }

        scanner.close();
    }
}


