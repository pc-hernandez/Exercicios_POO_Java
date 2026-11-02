import entities.Company;
import entities.Individual;
import entities.TaxPayer;

void main() {

    Scanner sc = new Scanner(System.in);

    int qtd = sc.nextInt();

    List<TaxPayer> list = new ArrayList<>();

    for (int i = 0; i < qtd; i++){
        System.out.print("INDIVIDUAL COMPANY (i/c)? ");
        String resposta = sc.next();
        if (Objects.equals(resposta, "i")){
            System.out.print("Name: ");
            String name = sc.next();
            System.out.print("Anual Income: ");
            double anualIncome = sc.nextInt();
            System.out.print("Healf Expenditures: ");
            double healfExpenditures = sc.nextDouble();

            list.add(new Individual(name, anualIncome, healfExpenditures));
        }
        else {
            System.out.print("Name: ");
            String name = sc.next();
            System.out.print("Anual Income: ");
            double anualIncome = sc.nextInt();
            System.out.print("Number Of Emplyees: ");
            int numberOfEmplyees = sc.nextInt();

            list.add(new Company(name, anualIncome, numberOfEmplyees));
        }
    }

    double sum = 0.0;
    System.out.print("TAXES");
    for (TaxPayer taxPayer : list){
        System.out.print("\n" + list);
        double tax = taxPayer.tax();
        sum += tax;
    }

    System.out.print("\nTOTAL TAXES: $" + sum);


}
