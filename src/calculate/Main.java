package calculate;
import calculate.calc.Calc;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Calc calc = new Calc();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Qual a sua data de nascimento? ");
        String nascimento = scanner.nextLine();
        calc.setIdadeAtual(nascimento);
    }
}
