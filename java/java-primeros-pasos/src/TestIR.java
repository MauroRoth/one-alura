
public class TestIR {
	public static void main(String[] args) {
        double salario = 3300.0;
        boolean condicion1 = salario>=1900.0 && salario <=2800.0;
        boolean condicion2 = salario>=2800.01 && salario <=3751.0;
        boolean condicion3 = salario>=3751.01 && salario <=4664.0;
        if(condicion1) {System.out.println("IR=7.5% -- Deducción=142");}
        if(condicion2) {System.out.println("IR=15% -- Deducción=350");}
        if(condicion3) {System.out.println("IR=22.5% -- Deducción=636");}
	}    
}


  