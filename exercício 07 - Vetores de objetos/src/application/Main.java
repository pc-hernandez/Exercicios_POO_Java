import entities.Number;

void main() {
    Scanner sc = new Scanner(System.in);

    System.out.print("Quantidade: ");
    int qtd = sc.nextInt();

    Number[] vect = new Number[qtd];

    for(int i = 0; i < vect.length; i++){
        System.out.print("Valores: ");
        int valores = sc.nextInt();
        vect[i] = new Number(valores);
    }

    for (int i = 0; i < vect.length; i++) {
        if (vect[i].getValores() < 0) {
            System.out.println(vect[i].getValores());
        }
    }
}
