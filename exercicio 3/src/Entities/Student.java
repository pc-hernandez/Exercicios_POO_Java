package Entities;

public class Student {
    public double notaA;
    public double notaB;
    public double notaC;

    public double Media(){
        return notaA + notaB + notaC;
    }

    public boolean IsApproved(){
        return Media() >= 60;
    }

    public double pointsMissing(){
        if (Media() < 60){
            double resultado = 60 - Media();
            return resultado;
        }
        return 0.0;
    }

    public String toString(){
        if (IsApproved()){
            return "MEDIA: " + Media() + "\nAprovado: " + IsApproved();
        }
        else {
            return "MEDIA: " + Media() + "\nAprovado: " + IsApproved() + "\nPontos faltando: " + pointsMissing();
        }
    }
}
