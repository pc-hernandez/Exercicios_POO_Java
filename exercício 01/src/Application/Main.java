import Entities.Triangulo;

void main() {
    Scanner sc = new Scanner(System.in);

    Triangulo triangulo = new Triangulo();
    System.out.printf("Altura: ");
    triangulo.altura = sc.nextDouble();
    System.out.printf("Largura: ");
    triangulo.largura = sc.nextDouble();


    System.out.print(triangulo);
}
