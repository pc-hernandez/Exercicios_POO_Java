import entities.Banco;

void main() {
    Scanner sc = new Scanner(System.in);
    Banco banco;

    System.out.print("NOME: ");
    String nome = sc.next();
    System.out.print("NUMERO DA CONTA: ");
    int numeroConta = sc.nextInt();
    System.out.print("DEPOSITO INICIAL (y/n)? ");
    String opcao = sc.next();
    if (Objects.equals(opcao, "y")){
        System.out.print("DEPOSITO: ");
        double deposito = sc.nextDouble();
        banco = new Banco(nome, numeroConta, deposito);
    }
    else {
        banco = new Banco(nome, numeroConta);
    }

    System.out.print(banco.toString());

    System.out.print("\nDEPOSITO: ");
    double valor = sc.nextDouble();
    banco.AdicionarSaldo(valor);

    System.out.print(banco.toString());

    System.out.print("\nSAQUE: ");
    double valor2 = sc.nextDouble();
    banco.RemoverSaldo(valor2);

    System.out.print(banco.toString());
}
