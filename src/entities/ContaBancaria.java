package entities;

public class ContaBancaria {
    // atributos trancados
    private String nomeCliente;
    private double saldo;

    public ContaBancaria(String nomeCliente, double saldoInicial) {
        this.nomeCliente = nomeCliente;

        if(saldoInicial >= 0){
            this.saldo = saldoInicial;
        }else{
            this.saldo = 0;
            System.out.println("Aviso: O saldo inicial não pode ser negativo. Conta iniciada com R$ 0.0");
        }
    }

    public void depositar(double valor){
        if (valor > 0 ){
            this.saldo += valor; // O mesmo que this.saldo = this.saldo + valor
            System.out.println("Deposito de R$" + valor + " realizado com sucesso!");
        } else {
            System.out.println("Erro: Não é possível depositar um valor zerado ou negativo.");
        }
    }

    public void sacar(double valor){
        if (valor > 0 && valor <= this.saldo){
            this.saldo -= valor;
            System.out.println("Saque de valor R$" + valor + " realizado com sucesso!");
        } else if(valor > this.saldo){
            System.out.println("Erro: Saldo insuficiente para este saque.");
        } else {
            System.out.println("Erro: Valor de saque inválido");
        }
    }

    public String getNomeCliente(){
        return this.nomeCliente;
    }
    public double getSaldo(){
        return this.saldo;
    }

}
