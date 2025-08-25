import java.util.Scanner;

public class Main1 {
    public static void main(String[] args) {
  Scanner entrada = new Scanner(System.in);

        System.out.println("Informe o nome do paciente:");
        String nome  = entrada.nextLine();
        System.out.println("Informe o peso(kg) do paciente:");
        float peso = entrada.nextFloat();
        System.out.println("Informe o altura do paciente:");
        float  altura = entrada.nextFloat();

        float imc = peso/(altura*altura);
        String clasificação;
        if(imc<18.5){

       clasificação = "Abaixo do peso";

        }
        else  if(imc>=18.5 && imc<25.0){

            clasificação = "Peso normal";
        }
        else if(imc>=25.0 && imc<30.0){

        clasificação = "Sobrepeso";
        }
        else if(imc>= 30.0){

            clasificação = "Obesidade ";
        }
        else{
            clasificação = "Erro: valores invalidos";
        }

        System.out.println(" O paciente " + nome + " tem IMC= " + imc +
                " e esta classificado como " + clasificação);
    }

    }
