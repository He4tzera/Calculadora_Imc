import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Scanners de Input
        Scanner sc = new Scanner(System.in);
        Scanner hl = new Scanner(System.in);
        //Declaração de Variaveis
        double peso;
        double altura;
        //Codito
        System.out.printf("Insira seu peso:");
        peso = sc.nextDouble();
        //System.out.println(peso);
        System.out.printf("Insira sua Altura:");
        altura= hl.nextDouble();
        //System.out.println(altura);
        double imc = peso/(altura * altura);
        System.out.println("Seu IMC é de: "+ String.format("%.2f",imc));
        System.out.println("-----------------------");
        sc.close();
        //Condições para informar a classificação
        if(imc < 18.5){
            System.out.println("Sua Classificação é: Abaixo do peso");}
            else
                if(imc >= 18.5 && imc <=24.9){
                    System.out.println("Sua Classificação é: Peso normal");}
                    else
                        if(imc >= 25.0 && imc <= 29.9)
                            System.out.println("Sua Classificação é: Sobrepeso (Obesidade Grau I)");
                            else
                                if(imc >= 30.0 && imc <= 39.9)
                                    System.out.println("Sua Classificação é Obesidade II");
                                        else
                                            if (imc >= 40.0 )
                                                System.out.println("Sua Classificação é Obesidade Grave III");
                                                
    }
}


