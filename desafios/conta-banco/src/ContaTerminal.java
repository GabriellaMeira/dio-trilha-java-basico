import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

       //TODO: Conhecer e importar a classe scanner
        
       //Exibir as mensagens para o nosso usuário 
       System.out.print("Por favor, digite o número da Conta: ");
       int numero = scanner.nextInt();

       scanner.nextLine(); // Consumir a quebra de linha deixada pelo nextInt()

       System.out.print("Por favor, digite o número da Agência: ");
       String agencia = scanner.nextLine();

       System.out.print("Por favor, digite o nome do Cliente: ");
       String nomeCliente = scanner.nextLine();

       System.out.print("Por favor, digite o saldo inicial: ");
       double saldo = scanner.nextDouble();

       System.out.println("\nOlá " + nomeCliente + ", obrigado por criar uma conta em nosso banco.");
       System.out.println("Sua agência é " + agencia + ", conta " + numero + " e seu saldo R$ " + saldo + " já está disponível para saque.");

       System.out.println("\nConta criada com sucesso!\n");


        scanner.close();

       //Exibir a mensagem conta criada
    }
}
