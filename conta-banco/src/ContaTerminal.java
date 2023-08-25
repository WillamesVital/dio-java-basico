import java.util.Scanner;

public class ContaTerminal {
    /**
     * @param args
     */
    public static void main(String args[]){
    Scanner analise = new Scanner(System.in);

            int numero;
            String agencia;
            String cliente;
            float saldo;

            System.out.println("Por favor, digite o número da Conta !");
            numero = analise.nextInt();
            System.out.println("Por favor, digite o número da Agência !");
            agencia = analise.next();            
            System.out.println("Por favor, digite o nome do cliente !");
            cliente = analise.next();
            System.out.println("Por favor, digite o saldo !");
            saldo = analise.nextFloat();


            System.out.println("Olá " + cliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + numero + " e seu saldo " + saldo + " já está disponível para saque");
    }
}