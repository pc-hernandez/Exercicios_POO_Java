import model.Enums.OrderStatus;
import model.entities.Client;
import model.entities.Order;
import model.entities.OrderItem;
import model.entities.Product;

void main() {

    Scanner sc = new Scanner(System.in);

    System.out.print("Enter cliente data:\n");
    System.out.print("Name: ");
    String name = sc.next();
    System.out.print("Email: ");
    String email = sc.next();
    Client client = new Client(name, email);

    System.out.print("Order data:\n");
    System.out.print("Status: ");
    OrderStatus status = OrderStatus.valueOf(sc.next());

    Order order = new Order(new Date(), status);

    System.out.print("How many items to this order? ");
    int n = sc.nextInt();
    for (int i=1; i<=n; i++) {
        System.out.println("Enter #" + i + " item data:");
        System.out.print("Product name: ");
        sc.nextLine();
        String productName = sc.nextLine();
        System.out.print("Product price: ");
        double productPrice = sc.nextDouble();

        Product product = new Product(productName, productPrice);

        System.out.print("Quantity: ");
        int quantity = sc.nextInt();

        OrderItem orderItem = new OrderItem(quantity, productPrice);

        order.addItens(orderItem);
    }

    System.out.println();
    System.out.println("ORDER SUMMARY:");
    System.out.println(order);
}
