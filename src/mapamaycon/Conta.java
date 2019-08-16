
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
        
        if (this.getSaldo() < val) {
            System.out.println("Não há limite para esta operação. O saldo da conta "
                    + this.getNumero() + "-" + getDigito()
                    + " é: " 
                    + this.getSaldo() 
                    + " e o valor de saque foi: "
                    + val);
        } else {
            this.setSaldo(this.getSaldo() - val);
            System.out.println("Operação realizada com Sucesso! Novo saldo da conta "
                + this.getNumero() + "-" + getDigito()
                + " é: " + this.getSaldo());
        }
        
                
    }
   
    public void deposito(double val){
        
        this.setSaldo(this.getSaldo() + val);
        System.out.println("Operação realizada com Sucesso! Novo saldo da conta "
                + this.getNumero() + "-" + getDigito()
                + " é: " + this.getSaldo());
    }
    
    public void transferencia(double val, Conta ct){
        
        if (this.saldo < val) {
            System.out.println("Não há limite para esta operação. O saldo da conta "
                    + this.getNumero() + "-" + getDigito()
                    + " é: " 
                    + this.getSaldo() 
                    + " e o valor de transferência foi: "
                    + val);
        } else {
        this.setSaldo(this.getSaldo() - val);
        ct.deposito(val);
        }
        
        
    }
    
    public void saldo(){
        System.out.println("Agência: " + this.getAgencia() +
                " Número: " + this.getNumero() +
                " Digito: " + this.getDigito() +
                " Saldo atual disponível: " + this.getSaldo());
    }
}