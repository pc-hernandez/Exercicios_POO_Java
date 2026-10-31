import entities.Employee;

void main() {
    Scanner sc = new Scanner(System.in);

    int qtd = sc.nextInt();

    List<Employee> list = new ArrayList<>();

    for (int i = 0; i < qtd; i++){
        System.out.print("NOME = ");
        String name = sc.next();
        System.out.print("ID = ");
        int id = sc.nextInt();
        System.out.print("SALARY = ");
        double salary = sc.nextDouble();

        list.add(new Employee(name, id, salary));
    }

    System.out.print("QUEM RECEBE O AUMENTO = ");
    int idAumento = sc.nextInt();
    Employee emp = list.stream().filter(x -> x.getId() == idAumento).findFirst().orElse(null);

    System.out.print("PORCENTAGEM = ");
    int percent = sc.nextInt();
    emp.increaseSalary(percent);

    System.out.println("List of employees:");

    for (Employee obj : list) {
        System.out.println(obj);
    }

}
