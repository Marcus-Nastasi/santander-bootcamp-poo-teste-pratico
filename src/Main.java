import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class RegistroTransacoesBancarias {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double saldo = scanner.nextDouble();
        int quantidadeTransacoes = scanner.nextInt();

        // TODO: Crie a lista para armazenar as transações:

        // TODO: Implemente um loop 'for' para iterar sobre as transações:


        // Aqui é verificar o tipo de transação e atualiza o saldo da conta de acordo:
        if (tipoTransacao == 'D' || tipoTransacao == 'd') {
            saldo += valorTransacao;
            // TODO: Adicione a transação à lista:


        } else if (tipoTransacao == 'S' || tipoTransacao == 's') {
            saldo -= valorTransacao;
            // TODO: Adiciona a transação à lista


        } else {
            // Se o tipo de transação não for reconhecido, exibe uma mensagem de erro
            System.out.println("Opção inválida. Utilize D para depósito ou S para saque.");
            i--;
        }
    }

    // Aqui é exibido o saldo final e a lista de transações ao final do processo:
        System.out.println("\nSaldo: " + saldo);
        System.out.println("\nTransacoes:");

    // TODO: Crie um loop 'for' para exibir cada transação na lista:

    // TODO: Agora exibA o número da transação seguido da descrição da transação:

}

// Fechamos o scanner para liberar recursos:
        scanner.close();
    }
            }