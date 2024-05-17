import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double saldo = scanner.nextDouble();
        int quantidadeTransacoes = scanner.nextInt();

        // TODO: Crie a lista para armazenar as transações:
        ArrayList<String> listaDeTransacoes = new ArrayList<>();

        // TODO: Implemente um loop 'for' para iterar sobre as transações:
        for (int i = 0; i < quantidadeTransacoes; i++) {
            String tipoTransacao = scanner.next();
            double valorTransacao = scanner.nextDouble();

        // Aqui é verificar o tipo de transação e atualiza o saldo da conta de acordo:
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

    // Aqui é exibido o saldo final e a lista de transações ao final do processo:
        System.out.println("\nSaldo: " + saldo);
        System.out.println("\nTransacoes:");

    // TODO: Crie um loop 'for' para exibir cada transação na lista:
        for (int i = 0; i < listaDeTransacoes.size(); i++) {
            String tp = listaDeTransacoes.get(i).split(" ")[0];
            String vl = listaDeTransacoes.get(i).split(" ")[1];
            System.out.println(i+1 + ". " + tp + " de " + vl);
        }
    // TODO: Agora exibA o número da transação seguido da descrição da transação:

        scanner.close();
    }
}


