import java.nio.file.attribute.UserPrincipal;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //1.Faça um Programa que peça as 4 notas bimestrais e mostre a média.
        Scanner scanner = new Scanner(System.in);
        /*System.out.print("Digite sua primeira nota");
        double Nota1 = scanner.nextDouble();
        System.out.print("Digite sua segunda nota: ");
        double Nota2 = scanner.nextDouble();
        System.out.print("Digite sua terceira nota: ");
        double Nota3 = scanner.nextDouble();
        System.out.print("Digite sua quarta nota: ");
        double Nota4 = scanner.nextDouble();
        double Media = (Nota1 + Nota2 + Nota3 + Nota4) / 4;
        System.out.printf("A media final foi %.2f",Media);*/

        //2. Faça um Programa que pergunte quanto você ganha por hora e o número de horas trabalhadas no mês. Calcule e mostre o total do seu salário no referido mês.
        /*System.out.print("Quanto você recebe por hora trabalhada: ");
        double horaTrabalho = scanner.nextDouble();
        System.out.print("Quantas horas você trabalhou por mês: ");
        int horaTrabalhada = scanner.nextInt();
        double salarioMensal = horaTrabalho * horaTrabalhada;
        System.out.printf("Salario Mensal: %.2fR$",salarioMensal);*/

        //3. Faça um Programa que peça a temperatura em graus Fahrenheit, transforme e mostre a temperatura em graus Celsius.
        //C = 5 * ((F-32) / 9).
        /*System.out.print("Qual a temperatura em Fahrenheit? ");
        double F = scanner.nextDouble();
        double C = 0;
        double grausCelsius = C = 5 * ((F-32) / 9);
        System.out.printf("A temperatura convertida a celsius é de: %.2f",grausCelsius);*/

        /*4. Faça um Programa que pergunte quanto você ganha por hora e o número de horas trabalhadas no mês. Calcule e mostre o total do seu salário no referido mês, sabendo-se que são descontados 11% para o Imposto de Renda, 8% para o INSS e 5% para o sindicato, faça um programa que nos dê:
        - salário bruto.    - quanto pagou ao INSS.
                - quanto pagou ao sindicato.
                - o salário líquido.
        - calcule os descontos e o salário líquido, conforme a tabela abaixo:
        + Salário Bruto : R$
                - IR (11%) : R$
                - INSS (8%) : R$
                - Sindicato ( 5%) : R$
                = Salário Liquido : R$ */
        /*System.out.print("Quanto você recebe por hora trabalhada: ");
        double horaTrabalho = scanner.nextDouble();
        System.out.print("Quantas horas você trabalhou por mês: ");
        int horaTrabalhada = scanner.nextInt();
        double salarioMensal = horaTrabalho * horaTrabalhada;
        System.out.printf("Salario Bruto: %.2fR$",salarioMensal);
        double IR = 0.11;
        double INSS = 0.08;
        double sindicato = 0.05;
        double salarioIR = (salarioMensal * IR);
        System.out.printf("\nDesconto de IR: %.2fR$", salarioIR);
        double totalPagoINSS = (salarioMensal - salarioIR) * INSS;
        System.out.printf("\nDesconto do INSS: %.2fR$",totalPagoINSS);
        double totalPagoSindicato = (salarioMensal - salarioIR - totalPagoINSS) * sindicato;
        System.out.printf("\nDesconto do sindicato: %.2fR$",totalPagoSindicato);
        double salarioLiquido = salarioMensal - salarioIR - totalPagoINSS - totalPagoSindicato;
        System.out.printf("\nSalario Liquido: %.2fR$",salarioLiquido);*/

        /*5. Faça um programa para a leitura de duas notas parciais de um aluno. O programa deve calcular a média alcançada por aluno e apresentar:      - A mensagem "Aprovado", se a média alcançada for maior ou igual a sete;
        - A mensagem "Reprovado", se a média for menor do que sete;
        - A mensagem "Aprovado com Distinção", se a média for igual a dez.
        System.out.print("Digite sua primeira nota");
        double Nota1 = scanner.nextDouble();
        System.out.print("Digite sua segunda nota: ");
        double Nota2 = scanner.nextDouble();
        double Media = (Nota1 + Nota2) / 2;


        if ((Media >= 7) && (Media <10)){
            System.out.println("Aprovado!");
        }
        else if (Media <= 7){
            System.out.println("Reprovada!");
        }
        else if (Media == 10){
            System.out.println("Aprovado com Distinção");
        }*/

        /*6. Faça um Programa que leia três números e mostre o maior e o menor deles.

        System.out.println("Digite tres numeros:");
        int primeiroNumero = scanner.nextInt();
        int segundoNumero = scanner.nextInt();
        int terceiroNumero = scanner.nextInt();

        int menor = primeiroNumero;
        int maior = primeiroNumero;

        if (segundoNumero > maior) maior = segundoNumero;

        if (terceiroNumero > maior) maior = terceiroNumero;

        if (segundoNumero < menor) menor = segundoNumero;

        if (terceiroNumero < menor) menor = terceiroNumero;

        System.out.println("Maior: " + maior + " Menor: " + menor);*/
        //7. Desenvolva um gerador de tabuada, capaz de gerar a tabuada de qualquer número inteiro entre 1 a 10. O usuário deve informar de qual numero ele deseja ver a tabuada. A saída deve ser conforme o exemplo abaixo:       Tabuada de 5:
        // obs: tem que digitar o 5 pq não consegui fazer de outra maneira
        int tabuadaDoCinco = 5;
        for (int i = 0; i < 11; i++){
            System.out.println(tabuadaDoCinco + " x " +i+ " = " + (tabuadaDoCinco * i));

        }}}
