import java.util.Locale;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class contaTerminal {

    public static void main(String[] args) {
        System.out.println("Bem-vindo ao banco Dio");
        System.out.println("---------------------------------------------------------------------------");

        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.US);
        ContaBancaria conta = new ContaBancaria();

        System.out.println("Digite o número da conta:");
        conta.setNumero(scanner.nextInt());
        scanner.nextLine();  // Consumir a quebra de linha pendente

        System.out.println("Agora digite a agência:");
        conta.setAgencia(scanner.nextLine());

        System.out.println("Digite agora o nome do cliente:");
        conta.setNomeCliente(scanner.nextLine());

        System.out.println("Por fim, digite o saldo da conta:");
        conta.setSaldo(scanner.nextDouble());

        System.out.println("____________________________________________________________________________");
        System.out.printf("Olá %s, obrigado por criar uma conta em nosso banco, sua agência é %s, conta %d e seu saldo R$ %.2f já está disponível para saque%n",
                conta.getNomeCliente(), conta.getAgencia(), conta.getNumero(), conta.getSaldo());

        scanner.close();
    }
}