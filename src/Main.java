import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        MaquinaDeLavar minhaMaquina = new MaquinaDeLavar();
        int opcao = -1;

        while (opcao != 0) {
            System.out.println("Menu Mmáquina de lavar");
            System.out.println("1) Ligar máquina");
            System.out.println("2) Desligar máquina");
            System.out.println("3) Abrir tampa");
            System.out.println("4) Fechar tampa");
            System.out.println("5) Iniciar lavagem");
            System.out.println("6) Pausar lavagem");
            System.out.println("7) Retomar lavagem");
            System.out.println("8) Concluir lavagem");
            System.out.println("9) Iniciar centrifugação");
            System.out.println("10) Concluir centrifugação");
            System.out.println("0) Sair");
            System.out.print("Escolha uma opção: ");

            opcao = sc.nextInt();

            switch (opcao) {
                case 1:
                    minhaMaquina.ligar();
                    break;
                case 2:
                    minhaMaquina.desligar();
                    break;
                case 3:
                    minhaMaquina.abrirTampa();
                    break;
                case 4:
                    minhaMaquina.fecharTampa();
                    break;
                case 5:
                    minhaMaquina.iniciarLavagem();
                    break;
                case 6:
                    minhaMaquina.pausarLavagem();
                    break;
                case 7:
                    minhaMaquina.retomarLavagem();
                    break;
                case 8:
                    minhaMaquina.concluirLavagem();
                    break;
                case 9:
                    minhaMaquina.iniciarCentrifugacao();
                    break;
                case 10:
                    minhaMaquina.concluirCentrifugacao();
                    break;
                case 0:
                    System.out.println("Saindo do sistema");
                    break;
                default:
                    System.out.println("Opção inválida!");
                    break;
            }
        }
        sc.close();
    }
}