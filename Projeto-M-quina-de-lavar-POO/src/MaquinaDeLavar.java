public class MaquinaDeLavar {

    String estado = "desligado";
    boolean tampaAberta = false;

    public void ligar() {

        if ("desligado".equals(estado)) {
            estado = "ligado";
            System.out.println("Máquina ligada");
        } else {
            System.out.println("Máquina já está ligada");
        }
    }

    public void desligar() {
        if("lavando".equals(estado)){
            System.out.println("Máquina não pode ser desligada enquanto estiver lavando");
        }
        if ("ligado".equals(estado)) {
            estado = "desligado";
            System.out.println("Máquina desligada");
        } else {
            System.out.println("Máquina já está desligada");
        }
    }
    public void iniciarLavagem(){
        if("desligado".equals(estado)){
            System.out.println("Não é possivel iniciar lavagem com a máquina desligada");
        }
        else if (tampaAberta ) {
            System.out.println("não é possivel iniciar lavagem com a tampa da máquina aberta");
        }
        else if("ligado".equals(estado)){
            System.out.println("Lavagem iniciada");
            estado = "lavando";
        }
        else{
            System.out.println("Máquina ja em modo lavagem ");
        }
    }
    public void abrirTampa(){
        if("lavando".equals(estado) || "centrifungando".equals(estado)){
            System.out.println("Máquina não pode ser aberta enquanto estiver em funcionamento");
        }
        if(tampaAberta){
            System.out.println("Máquina já está aberta");
            return;
        }
        tampaAberta = true;
        System.out.println("Máquina aberta");
    }
    public  void fecharTampa(){
        if(!tampaAberta){
            System.out.println("Máquina já está fechada");
            return;
        }
        tampaAberta = false;
        System.out.println("Máquina fechada");
    }
}