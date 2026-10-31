package Entities;

public class Triangulo {
    public double altura;
    public double largura;

    public double perimetro(){
        return  (altura * 2) + (largura * 2);
    }

    public double area(){
        return altura * largura;
    }

    public double diagonal(){
        return Math.sqrt((altura*altura) + (largura*largura));
    }

    public String toString(){
        return "Area: " + area() + "\nperimetro: " + perimetro() + "\ndiagonal: " + diagonal();
    }
}
