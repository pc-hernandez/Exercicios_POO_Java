import entities.ImportedProduct;
import entities.Product;
import entities.UsedProduct;

void main() {
    Scanner sc = new Scanner(System.in);

    List< Product> list = new ArrayList<>();

    System.out.print("NUMBER OF ITEMS: ");
    int qtd = sc.nextInt();

    for (int i = 0; i < qtd; i++){
        System.out.print("TIPE (C/I/U): ");
        String tipo = sc.next();
        System.out.print("NAME: ");
        String name = sc.next();
        System.out.print("PRICE: ");
        double price = sc.nextDouble();

        if (tipo.equals("c")){
            list.add(new Product(name, price));
        }
        else if (tipo.equals("i")) {
            System.out.print("TAX: ");
            double customsFee = sc.nextDouble();
            list.add(new ImportedProduct(name, price, customsFee));
        }
        else {
            System.out.print("DATE: ");
            LocalDate date = LocalDate.parse(sc.next(), DateTimeFormatter.ofPattern("dd/MM/yyyy"));
            list.add(new UsedProduct(name, price, date));
        }
    }

    System.out.print("---- PRICE ----");
    for (Product product : list){
        System.out.print("\n" + product.priceTag());
    }
}
