package entities;

public class Banco {
    private String nome;
    private int numeroConta;
    private double saldo;

    public Banco(String nome, int numeroConta, double deposito){
        this.nome = nome;
        this.numeroConta = numeroConta;
        AdicionarSaldo(deposito);
    }

    public Banco(String nome, int numeroConta){
        this.nome = nome;
        this.numeroConta = numeroConta;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getNumeroConta() {
        return numeroConta;
    }

    public double getDepositoInicial() {
        return saldo;
    }

    public void AdicionarSaldo(double valor){
        saldo =+ valor;
    }

    public void RemoverSaldo(double valor){
        saldo = saldo - valor - 5.0;
    }

    @Override
    public String toString() {
        return "\nBanco{" +
                "nome= '" + nome + '\'' +
                ", Numero da Conta= " + numeroConta +
                ", deposito Inicial= " + saldo +
                '}';
    }
}
