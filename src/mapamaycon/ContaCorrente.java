package mapamaycon;

public class ContaCorrente extends Conta {

    public ContaCorrente(int agencia, int numero, int digito, double saldo, double limite){
        
        super(agencia,numero,digito,saldo);
        this.limite = limite;
    }
    
    private double limite;

    public double getLimite() {
        return limite;
    }

    public void setLimite(double limite) {
        this.limite = limite;
    }
    
    
    
    @Override
    public void saldo(){
        System.out.println("Agência: " + this.getAgencia() +
                " Número: " + this.getNumero() +
                " Digito: " + this.getDigito() +
                " Saldo atual disponível: " + this.getSaldo() +
                " Limite: " + this.getLimite());
    }
    
    @Override
    public void saque(double val){
        
        double total = this.getSaldo() + this.getLimite();
        if ((this.getSaldo() + this.getLimite()) < val) {
            System.out.println("Não há limite para esta operação. O saldo da conta "
                    + this.getNumero() + "-" + getDigito()
                    + " com limite é: " 
                    + total 
                    + " e o valor de saque foi: "
                    + val);
        } else {
            this.setSaldo(this.getSaldo()-val);
            System.out.println("Operação realizada com Sucesso! Novo saldo da conta "
                + this.getNumero() + "-" + getDigito()
                + " é: " + this.getSaldo());
        }
    }
    
    
    @Override
    public void transferencia(double val, Conta ct){
        
        double total = this.getSaldo() + this.getLimite();
        if ((this.getSaldo() + this.getLimite()) < val) {
            System.out.println("Não há limite para esta operação. O saldo da conta "
                    + this.getNumero() + "-" + getDigito()
                    + " com limite é: " 
                    + total 
                    + " e o valor de saque foi: "
                    + val);
        } else {
        this.saldo -= val;
        this.setSaldo(this.getSaldo()-val);
        ct.setSaldo(val);
        }    
    }

}
