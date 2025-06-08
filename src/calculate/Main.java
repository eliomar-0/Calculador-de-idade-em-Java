package calculate;
import calculate.calc.Calc;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Calc calc = new Calc();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Qual a sua data de nascimento? ex:00/00/0000");
        String nascimento = scanner.nextLine();
        calc.setIdadeAtual(nascimento);
    }
}
