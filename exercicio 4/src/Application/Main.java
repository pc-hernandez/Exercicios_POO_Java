import Entities.Dollar;

void main() {

    Scanner sc = new Scanner(System.in);

    System.out.println("Valor do dolar");
    Dollar.priceDollar = sc.nextDouble();
    System.out.println("Quantos reais para converter: ");
    Dollar.howManyDollar = sc.nextDouble();

    System.out.print(Dollar.CurrencyConverter());

}
