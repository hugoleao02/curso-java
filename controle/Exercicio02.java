package controle;

import java.util.Calendar;

public class Exercicio02 {
    public static void main(String[] args) {
        
        int anoAtual = Calendar.getInstance().get(Calendar.YEAR);
        
        if ((anoAtual % 4 == 0) && (anoAtual % 100 != 0 || anoAtual % 400 == 0)) {
            System.out.println("O ano " + anoAtual + " é bissexto.");
        } else {
            System.out.println("O ano " + anoAtual + " não é bissexto.");
        }
    }
}
