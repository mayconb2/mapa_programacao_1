package mapamaycon;

public class Program {

    public static void main(String[] args) {
       
        Conta c1 = new Conta ();
        c1.setSaldo(150.0);
        c1.saque(200);
        c1.saldo();
        
        Conta c2 = new Conta (6243,21585,9,150.0);
        c2.saldo();
        
    }
    
}
