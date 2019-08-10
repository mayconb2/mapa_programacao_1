package mapamaycon;

public class ContaCorrente extends Conta {

    public ContaCorrente(int agencia, int numero, int digito, double saldo, double limite){
        
        super(agencia,numero,digito,saldo);
        this.limite = limite;
    }
    
    private double limite;
        
    @Override
    public void saldo(){
        System.out.println("Agência: " + this.agencia +
                " Número: " + this.numero +
                " Digito: " + this.digito +
                " Saldo atual disponível: " + this.saldo +
                " Limite: " + this.limite);
    }
    
    @Override
    public void saque(double val){

        if ((this.saldo + this.limite) < val) {
            System.out.println("Não há limite para esta operação");
        } else {
            this.saldo -= val;
        }
    }
    
    
    @Override
    public void transferencia(double val, Conta ct){

        if ((this.saldo + this.limite) < val) {
            System.out.println("Não há limite para esta operação");
        } else {
        this.saldo -= val;
        ct.deposito(val);
        }    
    }

}
