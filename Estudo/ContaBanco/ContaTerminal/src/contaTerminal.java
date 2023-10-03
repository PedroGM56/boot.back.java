import java.util.Scanner;

public class contaTerminal{
    public static void main(String[] args){
        
        Scanner dados = new Scanner (System.in);
        String agencia;
        int numero;
        String nome;
        Double saldo = 5656.8;
        
        System.out.println("Insira a agencia: ");
         agencia = dados.nextLine();
         
         System.out.println("Insira seu nome completo: ");
         nome = dados.nextLine();
         
         System.out.println("Insira o numero da conta: " );
            numero = dados.nextInt();
           
             System.out.println("Olá " + nome + ", obrigado por criar uma conta em nosso banco. \n  Sua agencia é: " + agencia + ".Seu número é: " + numero +  ".Seu saldo disponivel para saque é: " + saldo);


dados.close();
}
}
