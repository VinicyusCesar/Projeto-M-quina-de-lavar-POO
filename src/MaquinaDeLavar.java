public class MaquinaDeLavar {
     private String estado;
     private boolean tampa;


     public void ligar(){
         tampa=false;
         estado = "desligado";
         if ("desligado".equals(estado) && tampa == false) {
             System.out.println("Máquina não iniciar lavagem com tampa aberta");
             estado = "desligado";
         }
             else if ("desligado".equals(estado) && tampa == true){
                 estado = "ligado";
             System.out.println("Máquina ligada");
         }
         else{
             System.out.println("Máquina já esta ligada");
         }
     }

     public void desligar(){
         if("ligado".equals(estado)){
             estado = "Desligado";
             System.out.println("Máquina desligada");
         }
         else{
             System.out.println("Máquina já esta desligada");
         }
     }


}
