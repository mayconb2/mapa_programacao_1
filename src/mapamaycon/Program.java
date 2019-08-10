package mapamaycon;

public class Program {

    public static void main(String[] args) {
       
        ContaCorrente cc1 = new ContaCorrente(6243,21585,9,300.00,100.00);
        ContaCorrente cc2 = new ContaCorrente(3020,76210,0,300.00,100.00);
        ContaPoupanca cp1 = new ContaPoupanca(1020,45866,8,500.00);
        ContaPoupanca cp2 = new ContaPoupanca(6188,23241,5,500.00);
        
        cc1.saque(50.00);
        cp1.saque(100.00);
        cc1.saldo();
        cp1.saldo();
        
        cc1.transferencia(100.00, cp2);
        cc1.transferencia(100.00, cp2);
        cc1.saldo();
        cp2.saldo();
        
        cc1.transferencia(300.00, cp2);
        cc1.saque(300.00);
        
        cp1.transferencia(4000.00, cp2);
        cp1.saque(4000.00);
        
        
        
    }
    
}
