import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        //EX 1

//        int n;
//        System.out.print("Digite um número: ");
//        n = sc.nextInt();
//
//        if (n >= 0){
//            System.out.println("Não Negativo");
//        }else {
//            System.out.println("Negativo");
//        }

        //EX 2

//        int n;
//        System.out.print("Digite um número: ");
//        n = sc.nextInt();
//
//        if (n % 2 == 0) {
//            System.out.println("PAR");
//        }else {
//            System.out.println("ÍMPAR");
//        }

        //EX 3
//        int n1;
//        int n2;
//        System.out.print("Digite o primeiro número: ");
//        n1 = sc.nextInt();;
//        System.out.print("Digite o segundo número: ");
//        n2 = sc.nextInt();
//
//        if (n1 % n2 == 0 || n2 % n1 == 0) {
//            System.out.println("São múltiplos");
//        }else {
//            System.out.println("Não são múltiplos");
//        }

        // EX4
//        int n1;
//        int n2;
//        System.out.print("Digite o horário de início: ");
//        n1 = sc.nextInt();;
//        System.out.print("Digite o horário de término: ");
//        n2 = sc.nextInt();
//
//        if (n1 > n2 || n1 == n2) {
//            int i = 24 - n1 + n2;
//            System.out.printf("O jogo durou %d", i);
//        } else {
//
//            int i = n2 - n1;
//            System.out.printf("O jogo durou %d", i);
//        }

        //EX5
//
//        System.out.println("Digite o código: ");
//        int cod = sc.nextInt();
//        System.out.println("Digite a quantidade: ");
//        int qntde = sc.nextInt();
//
//        if (cod == 1) {
//            double total = qntde * 4;
//            System.out.printf("Total: %.2f", total);
//        }else if (cod == 2) {
//            double total = qntde * 4.50;
//            System.out.printf("Total: %.2f", total);
//        }else if (cod == 3) {
//            double total = qntde * 5;
//            System.out.printf("Total: %.2f", total);
//        }else if (cod == 4) {
//            double total = qntde * 2;
//            System.out.printf("Total: %.2f", total);
//        }else if (cod == 5) {
//            double total = qntde * 1.50;
//            System.out.printf("Total: %.2f", total);
//        }else {
//            System.out.println("Produto não encontrado!!");
//        }

        //EX 6

//        double n;
//
//        System.out.println("Digite um número");
//        n = sc.nextDouble();
//
//        if (n >= 0 && n <= 25) {
//            System.out.println("Intervalo [0, 25]");
//
//        }else if(n > 25 && n <= 50){
//            System.out.println("Intervalo [25, 50]");
//        }else if(n > 50 && n <= 75){
//            System.out.println("Intervalo [50, 75]");
//        }else if(n > 75 && n <= 100){
//            System.out.println("Intervalo [75, 100]");
//        }else {
//            System.out.println("Fora de intervalo");
//        }

//        //EX 7
//
//        double x;
//        double y;
//
//        System.out.println("Número X");
//        x = sc.nextDouble();
//        System.out.println("Número Y");
//        y = sc.nextDouble();
//
//
//        if(x == 0 && y == 0){
//            System.out.println("ORIGEM");
//        }else if(x > 0 && y == 0) {
//            System.out.println("EIXO X");
//        }else if(y > 0 && x == 0) {
//            System.out.println("EIXO Y");
//        }else if(x > 0 && y < 0){
//            System.out.println("Q4");
//        }else if(x > 0 && y > 0){
//            System.out.println("Q1");
//        }else if(x < 0 && y > 0){
//            System.out.println("Q2");
//        }else if(x < 0 && y < 0){
//            System.out.println("Q3");
//        }

        //EX 8

        double renda;

        double imposto;

        System.out.println("Digite a renda: ");
        renda = sc.nextDouble();

        if (renda >= 0 && renda <= 2000) {
            System.out.println("ISENTO");
        }else if(renda > 2000 && renda <= 3000){
            double imposto8 = renda - 2000;
            double total = imposto8 * 0.008;
            System.out.printf("Imposto %.2d", total);

        }		else if (renda <= 4500.0) {
            imposto = (renda - 3000.0) * 0.18 + 1000.0 * 0.08;
            System.out.printf("R$ %.2f%n", imposto);
        }


    }
}