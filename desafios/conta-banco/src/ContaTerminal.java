import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        
        //TODO: Conhecer e importar a classe scanner
        Scanner scanner = new Scanner(System.in);
        
       //Exibir as mensagens para o nosso usuário 
       System.out.print("Por favor, digite o número da Conta: ");
       int numero = scanner.nextInt();

       scanner.nextLine(); 

       System.out.print("Por favor, digite o número da Agência: ");
       String agencia = scanner.nextLine();

       System.out.print("Por favor, digite o nome do Cliente: ");
       String nomeCliente = scanner.nextLine();

       System.out.print("Por favor, digite o saldo inicial: ");
       double saldo = scanner.nextDouble();

       System.out.println("\nOlá " + nomeCliente);
       System.out.println("Sua agência é " + agencia + ", conta " + numero + " e seu saldo R$ " + saldo);

       //Exibir a mensagem conta criada
       System.out.println("\nConta criada com sucesso!\n");
        
        scanner.close();
       
    }
}
