import entities.Person;

void main() {
    Scanner sc = new Scanner(System.in);

    int qtd = sc.nextInt();

    Person[] vect = new Person[qtd];

    for(int i = 0; i < vect.length; i++){
        System.out.print("Nome da " + i + "a pessoa: ");
        String nome = sc.next();
        System.out.print("Idade: ");
        int idade = sc.nextInt();
        System.out.print("Altura: ");
        double altura = sc.nextDouble();
        vect[i] = new Person(nome, idade, altura);
    }

    double alturaMedia = 0.0;
    for (int i = 0; i < vect.length; i++){
        alturaMedia += vect[i].getAltura();
    }
    alturaMedia /= vect.length;
    System.out.print("\n\nAltura media = " + alturaMedia);

    String nomeMenor;
    int mIdade = 0;

    System.out.print("\nNomes com menos de 16 anos = ");
    for (int i = 0; i < vect.length; i++){
        nomeMenor = vect[i].getNome();
        if (vect[i].getIdade() < 16){
            System.out.print(nomeMenor + " ");
            mIdade++;
        }
    }

    double percentMenor = ((double)mIdade / vect.length) * 100;
    System.out.print("\nPorcentagem menor que 16 anos = " + percentMenor + "%");
}
