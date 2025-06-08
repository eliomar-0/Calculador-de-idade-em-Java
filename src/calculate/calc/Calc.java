package calculate.calc;

import java.time.LocalDate;

public class Calc {
    private String idadeAtual;
    private int anoIdadeAtual;
    private int mesIdadeAtual;
    private int diaIdadeAtual;

    private LocalDate data = LocalDate.now();
    private String dataAtual = String.valueOf(data);

    private int anoAtual;
    private int mesAtual;
    private int diaAtual;


    public void setIdadeAtual(String idade){
        this.idadeAtual = idade;
        dividirIdade();
    }

    public void dividirIdade(){
        this.anoIdadeAtual = Integer.parseInt(idadeAtual.substring(6,10));
        this.mesIdadeAtual = Integer.parseInt(idadeAtual.substring(3,5));
        this.diaIdadeAtual = Integer.parseInt(idadeAtual.substring(0,2));

        this.anoAtual = Integer.parseInt(dataAtual.substring(0,4));
        this.mesAtual = Integer.parseInt(dataAtual.substring(5,7));
        this.diaAtual = Integer.parseInt(dataAtual.substring(8,10));
        calcularIdade();
    }

    public void calcularIdade(){
        int idade;
        if(mesAtual < mesIdadeAtual){
            idade = anoAtual - anoIdadeAtual - 1;
        } else if (mesAtual == mesIdadeAtual) {
            if(diaAtual >= diaIdadeAtual){
                idade = anoAtual - anoIdadeAtual;
            } else {
                idade = anoAtual - anoIdadeAtual - 1;
            }
        } else {
            idade = anoAtual - anoIdadeAtual;
        }
        System.out.println("Você tem " + idade + " anos de idade!!");
    }



}
