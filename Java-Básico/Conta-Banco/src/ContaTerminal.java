import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {

        //criando o objeto scanner
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        
        //coletando as informações do usuário
        System.out.println("Olá, por favor digite o seu nome e sobrenome: ");
        String nomeCliente = scanner.nextLine();
        
        System.out.println("Digite o número da sua agência: ");
        String numeroAgencia = scanner.next();

        System.out.println("Agora digite o número da sua conta bancária: ");
        int numeroConta = scanner.nextInt();

        System.out.println("Qual O valor que você deseja sacar? ");
        double saldoCliente = scanner.nextDouble();

        
       //imprimindo os dados obtidos pelo usuario
       System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + numeroAgencia + ", conta " + numeroConta + " e seu saldo de " + saldoCliente + " já está disponível para saque."); 
        
       scanner.close(); //encerrar o scanner
    }
}
