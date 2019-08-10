
package mapamaycon;


public class Conta {
    
    protected int agencia;
    protected int numero;
    protected int digito;
    protected double saldo;

    
    public Conta() {
    }

    public Conta(int agencia, int numero, int digito, double saldo) {
        this.agencia = agencia;
        this.numero = numero;
        this.digito = digito;
        this.saldo = saldo;
    }

    public int getAgencia() {
        return agencia;
    }

    public void setAgencia(int agencia) {
        this.agencia = agencia;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public int getDigito() {
        return digito;
    }

    public void setDigito(int digito) {
        this.digito = digito;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    
    public void saque(double val){
        
        if (this.saldo < val) {
            System.out.println("Não há limite para esta operação");
        } else {
            this.saldo -= val;
        }
        
                
    }
   
    public void deposito(double val){
        
        this.saldo += val;
    }
    
    public void transferencia(double val, Conta ct){
        
        if (this.saldo < val) {
            System.out.println("Não há limite para esta operação");
        } else {
        this.saldo -= val;
        ct.deposito(val);
        }
        
        
    }
    
    public void saldo(){
        System.out.println("Agência: " + this.agencia +
                " Número: " + this.numero +
                " Digito: " + this.digito +
                " Saldo atual disponível: " + this.saldo);
    }
}