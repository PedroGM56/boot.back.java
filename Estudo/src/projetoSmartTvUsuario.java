public class projetoSmartTvUsuario {
    public static void main(String[] args) {
        
   SmartTv smartTv = new SmartTv();

        System.out.println("Tv ligada ? " + smartTv.ligada );
        System.out.println("Canal atual? " + smartTv.canal);
        System.out.println("Volume atual? " + smartTv.volume);   
   
          smartTv.mudarCanal(17);
            System.out.println("Canal atual? " + smartTv.canal);
        
        
        smartTv.ligar();
        System.out.println("Novo status: Tv ligada? " + smartTv.ligada);
        
        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        smartTv.aumentarVolume();
            System.out.println("Novo status -> Volume atual? " + smartTv.volume);
   
      
   
   
   
    }

}





