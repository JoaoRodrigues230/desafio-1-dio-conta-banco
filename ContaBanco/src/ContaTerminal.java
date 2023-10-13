import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {

        Scanner ler = new Scanner(System.in);

        int num;
        double saldo;
        String nome;
        String agencia;

        System.out.println("Bem-Vindo ao banco da DIO! ;)");
        System.out.println("-----------------------------");
        System.out.println("Por favor, digite seu nome: ");

        nome = ler.nextLine();

        System.out.print("\nCerto " + nome + ", agora precisamos do número de sua agência:\n ");
        System.out.println("----------------------------------------------------------");

        agencia = ler.nextLine();

        System.out.println("Digite o número da conta: ");
        System.out.println("---------------------------");

        num = ler.nextInt();

        System.out.println("Por fim, aqui na DIO Bank você pode escolher seu saldo! Digite ele: ");
        System.out.println("--------------------------------------------------------------------");

        saldo = ler.nextDouble();

        System.out.print("Olá " + nome + ",obrigado por criar uma conta em nosso banco, sua agência é " + agencia
                + ", conta " + num + " e seu saldo de R$ " + saldo + " já está disponível para saque");
    }
}
