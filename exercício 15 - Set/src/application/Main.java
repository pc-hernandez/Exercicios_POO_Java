import entities.Student;

void main() {

    Scanner sc = new Scanner(System.in);

    Set<Student> set = new HashSet<>();

    System.out.print("Quantos estudantes: ");
    int qtd = sc.nextInt();
    for (int i = 0; i < qtd; i++){
        int numero = sc.nextInt();
        set.add(new Student(numero));
    }

    System.out.print("Quantos estudantes: ");
    qtd = sc.nextInt();
    for (int i = 0; i < qtd; i++){
        int numero = sc.nextInt();
        set.add(new Student(numero));
    }

    System.out.print("Quantos estudantes: ");
    qtd = sc.nextInt();
    for (int i = 0; i < qtd; i++){
        int numero = sc.nextInt();
        set.add(new Student(numero));
    }

    System.out.print("Total: " + set.size());
}
