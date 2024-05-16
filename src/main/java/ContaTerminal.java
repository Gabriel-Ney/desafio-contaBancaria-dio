import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main (String[] args){
        Locale localeBrasileiro = new Locale("pt", "BR");

        Scanner scanner = new Scanner(System.in).useLocale(localeBrasileiro);

        System.out.println("Por favor, digite o número da conta: ");
            int numeroConta = scanner.nextInt();
        System.out.println("Por favor, digite o código da agencia: ");
            String codigoDaAgencia = scanner.next();;
        System.out.println("Por favor, digite o seu nome:");
            String nomeDoCliente = scanner.next();;;
        System.out.println("O seu saldo atual é de: ");
            Double saldoDaConta = scanner.nextDouble();;;

        System.out.println("Olá " + nomeDoCliente + " obrigado por criar uma conta em nosso banco, " +
                "sua agência é " + codigoDaAgencia + ", conta " + numeroConta + " e seu saldo " + saldoDaConta + " já está disponível para saque");



    }
}
