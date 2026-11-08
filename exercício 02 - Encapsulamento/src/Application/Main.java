import Entities.Employee;

void main() {
    Scanner sc = new Scanner(System.in);

    Employee employee = new Employee();

    System.out.printf("NOME: ");
    employee.name = sc.nextLine();
    System.out.printf("SALARIO BRUTO: ");
    employee.grossSalary = sc.nextDouble();
    System.out.printf("TAXA: ");
    employee.tax = sc.nextDouble();

    System.out.print(employee.toString());

    System.out.printf("\nPORCENTAGEM: ");
    double percent = sc.nextDouble();
    employee.IncreaseSalary(percent);

    System.out.print(employee.toString());
}
