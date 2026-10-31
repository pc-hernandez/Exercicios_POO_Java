package application;

import java.util.*;
import entities.Product;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantidade: ");
        int qtd = sc.nextInt();

        Product[] vect = new Product[qtd];

        for(int i = 0; i < qtd; i++){
            System.out.print("Nome: ");
            String nome = sc.next();
            System.out.print("preço: ");
            double preco = sc.nextDouble();
            vect[i] = new Product(nome, preco);
        }

        double soma = 0;
        for(int i = 0; i < qtd; i++){
            soma += vect[i].getPreco();
        }

        double media = soma / qtd;

        System.out.print("preço medio: " + media);
    }
}
