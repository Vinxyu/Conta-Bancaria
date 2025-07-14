import java.util.Scanner;

public class SystemAccount {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        double saldo = 200;
        System.out.println("Digite seu nome para criar a conta:");
        String nome = scanner.nextLine();
        System.out.println("Digite sua senha para criar a conta:");
        String senha = scanner.nextLine();
        String tipoConta = "Corrente";

        String option = "\n Opções \n\n 1- Receber Valor \n 2- Transferir Valor \n 3- Conferir Saldo \n 4- Conferir Conta \n 5- Sair";

        String system = "\n\n******************************* \n\n Nome: "+nome+"\n Senha: "+senha+"\n Tipo de conta: "+tipoConta+"\n Saldo: R$"+saldo+"\n\n******************************* \n\n";
        System.out.println(system);

        int timer = 1;
        while (timer == 1) {
        System.out.println(option+"\n\nDigite o número da opção que deseja: ");
        int numeroOpcao = scanner.nextInt();
        switch (numeroOpcao) {
            case 1:
                System.out.println("\n\nDigite o valor que deseja receber:");
                saldo += scanner.nextDouble();
                break;
            case 2:
                System.out.println("\n\nDigite o valor que deseja transferir:");
                saldo -= scanner.nextDouble();
                break;
            case 3:
                System.out.println("\n\n********************************************\nSeu saldo: R$" + saldo +"\n********************************************");
                break;
            case 4:
                System.out.println(system);
                break;
            case 5:
                System.out.println("\n\n********************************************\nSaindo.....\n********************************************");
                timer++;
                break;
            default:
                System.out.println("\n\n********************************************\nOpção Inválida!!!\n********************************************");
                break;
        }
        }
        scanner.close();
    }
}

