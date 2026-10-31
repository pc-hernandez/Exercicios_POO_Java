import Entities.Student;

void main() {
    Scanner sc = new Scanner(System.in);

    Student student = new Student();

    System.out.println("Nota 1: ");
    student.notaA = sc.nextDouble();
    System.out.println("Nota 2: ");
    student.notaB = sc.nextDouble();
    System.out.println("Nota 3: ");
    student.notaC = sc.nextDouble();

    System.out.print(student.toString());
}