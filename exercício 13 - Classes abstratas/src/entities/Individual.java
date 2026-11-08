package entities;

public class Individual extends TaxPayer{

    private double healfExpenditures;

    public Individual(String name, double anualIncome, double healfExpenditures) {
        super(name, anualIncome);
        this.healfExpenditures = healfExpenditures;
    }

    public double getHealfExpenditures() {
        return healfExpenditures;
    }

    public void setHealfExpenditures(double healfExpenditures) {
        this.healfExpenditures = healfExpenditures;
    }

    @Override
    public Double tax() {
        if (getAnualIncome() < 20000.00){
            return getAnualIncome() * 0.15;
        }else {
            double resultado = getAnualIncome() * 0.25;
            healfExpenditures /= 2;
            return resultado - healfExpenditures;
        }
    }

    @Override
    public String toString() {
        return super.toString() + " - $" + tax();
    }
}
