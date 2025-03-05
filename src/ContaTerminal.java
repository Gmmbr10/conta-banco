import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {

    public static void main(String[] args) {

        Scanner entradaDados = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Bem-vindo ao Banco Nacional Giovanne Monteiro");
        System.out.println("---------------------------");

        System.out.println("Por favor, digite seu nome: ");
        String nomeCliente = entradaDados.next();

        System.out.println("Por favor, digite o número da Agência: ");
        String agencia = entradaDados.next();

        System.out.println("Por favor, digite o número de sua conta: ");
        int numeroConta = entradaDados.nextInt();

        System.out.println("Por favor, insira o seu saldo(apenas números): ");
        double saldo = entradaDados.nextDouble();

        System.out.println("--------------");
        System.out.println("Processando...");
        System.out.println("--------------");

        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + numeroConta + " e seu saldo R$ " + saldo + " já está disponível para saque");

    }

}
