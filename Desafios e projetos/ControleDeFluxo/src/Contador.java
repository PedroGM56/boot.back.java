import java.util.Scanner;

public class Contador
{
    public static void main(String[] args) throws ParametrosInvalidosException {
        Scanner terminal = new Scanner(System.in);
     
        System.out.println("Digite o primeiro parâmetro: ");
        int parametroUm = terminal.nextInt();
       
           
        System.out.println("Digite o segundo parâmetro: ");
        int parametroDois = terminal.nextInt();

        terminal.close();

            if(parametroDois < parametroUm){
                throw new ParametrosInvalidosException();
             } else{

        int contagem = parametroDois - parametroUm;
            System.out.println("O parâmetro entre os números é: " + contagem);
           

            for(int numeroContagem = 1; numeroContagem<=contagem; numeroContagem++){
                System.out.println("O numero impresso é: " + numeroContagem);
            }
      
            
            
        }
        
        
      
            
    
}
}