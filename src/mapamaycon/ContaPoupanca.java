package mapamaycon;

public class ContaPoupanca extends Conta {
    
    public ContaPoupanca(int agencia, int numero, int digito, double saldo){
        
        super(agencia,numero,digito,saldo);

    }
    
    public void rendimento(double perc){
       
       this.setSaldo(this.getSaldo() + this.getSaldo() * perc);

        
    }
    
}
