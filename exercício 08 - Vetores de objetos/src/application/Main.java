import entities.Valor;

void main() {
    Scanner sc = new Scanner(System.in);

    int qtd = sc.nextInt();

    Valor[] vect = new Valor[qtd];

    for(int i = 0; i < vect.length; i++){
        System.out.print("Valores: ");
        int numero = sc.nextInt();
        vect[i] = new Valor(numero);
    }

    //soma
    int soma = 0;
    int num = 0;

    for(int i = 0; i < vect.length; i++){
        soma += vect[i].getValores();
    }
    System.out.print("\nSoma: " + soma);

    //media
    int somaMedia = 0;
    for(int i = 0; i < vect.length; i++){
        somaMedia += vect[i].getValores();
    }
    somaMedia /= vect.length;
    System.out.print("\nMedia: " + somaMedia);

    //valores
    System.out.print("\nValores: ");
    for(int i = 0; i < vect.length; i++){
        System.out.print(vect[i].getValores() + " ");
    }

}
