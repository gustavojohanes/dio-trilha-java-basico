import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);



        System.out.print("Por favor, digite o número da conta: ");
        int conta = input.nextInt();

        System.out.print("Por favor, digite o número da agência: ");
        String agencia = input.next();

        System.out.print("Digite seu nome: ");
        String nome = input.next();

        System.out.print("Digite seu saldo: ");
        double saldo = input.nextDouble();
        input.close();

        System.out.printf("Olá %s, obrigado por criar sua conta em nosso banco. Sua agência é %s, conta %d e seu saldo %.2f já disponível para saque.", nome, agencia, conta, saldo);

    }
}
