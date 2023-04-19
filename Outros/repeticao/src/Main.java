import org.w3c.dom.ls.LSOutput;

import java.sql.SQLOutput;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
//        int senha = sc.nextInt();
//
//        while (senha != 2002) {
//            System.out.println("Senha inválida");
//            System.out.print("Digite a senha: ");
//            senha = sc.nextInt();
//        }
//
//        System.out.println("Acesso permitido");


//        int alcool = 0;
//        int gasolina = 0;
//        int diesel = 0;
//
//
//        int voto = 0;
//
//        while (voto != 4) {
//            voto = sc.nextInt();
//
//            switch (voto) {
//                case 1:
//                    alcool++;
//                    break;
//                case 2:
//                    gasolina++;
//                    break;
//                case 3:
//                    diesel++;
//                    break;
//
//            }
//        }
//        System.out.println("MUITO OBRIGADO");
//        System.out.println("Alcool: " + alcool);
//        System.out.println("Gasolina: " + gasolina);
//        System.out.println("Diesel: " + diesel);

//        int n = sc.nextInt();
//
//        int soma = 0;
//        for (int i = 0; i < n; i++) {
//
//            int numeros = sc.nextInt();
//            soma += numeros;
//        }
//        System.out.println(soma);

        //EX 1

//        int x = sc.nextInt();
//
//        for (int i = 0; i <= x; i++) {
//
//            if (i % 2 != 0) {
//
//                System.out.println(i);
//            }
//
//        }

//        int n = sc.nextInt();
//        int in = 0;
//        int out = 0;
//
//        for (int i = 0; i < n; i++) {
//            int x = sc.nextInt();
//
//            if (x >= 10 && x <= 20) {
//                in++;
//            } else {
//                out++;
//            }
//
//        }
//
//        System.out.println(in + " in");
//        System.out.println(out + " out");

        // EX 3

//        int n = sc.nextInt();
//        double media = 0;
//
//        for (int i = 0; i < n; i++) {
//
//            double n1 = sc.nextDouble();
//            double n2 = sc.nextDouble();
//            double n3 = sc.nextDouble();
//            double soma = (n1 * 2) + (n2 * 3) + (n3 * 5);
//            media = soma / 10
//            ;
//
//            System.out.printf("%.1f%n", media);
//        }
//
//        sc.close();

        // EX 4

//        int n = sc.nextInt();
//
//        for (int i = 0; i < n; i++) {
//            int n1 = sc.nextInt();
//            int n2 = sc.nextInt();
//            if (n2 == 0) {
//                System.out.println("Divisão impossível!");
//            } else {
//
//                double divisao = (double) n1 / n2;
//                System.out.println(divisao);
//            }
//
//        }

        // EX 5


//        int n = sc.nextInt();
//        int fat = 1;
//        for (int i = 1; i <= n; i++) {
//
//            fat = fat * i;
//
//        }
//        System.out.println(fat);

        // EX 6

//        int n = sc.nextInt();
//
//        for (int i = 1; i <= n; i++) {
//            if (n % i == 0) {
//                System.out.println(i);
//            }
//        }

        // EX 7

//        int n = sc.nextInt();
//
//        for (int i = 1; i <= n; i++) {
//            int nLinha = i;
//            double quad = Math.pow(i, 2);
//            double cub = Math.pow(i, 3);
//
//            System.out.printf("linha: %d Quadrado: %.0f Cubo: %.0f%n", nLinha, quad, cub);
//        }

//        Scanner leitor = new Scanner(System.in);
//        int cont = 0;
//        double media = 0;
//        double x = 0;
//
//        for (int i = 0; i < 6; i++) {
//            double n = leitor.nextDouble();
//            if (n > 0) {
//                cont++;
//                x += n;
//            }
//
//            media = x / cont;
//
//        }
//
//        System.out.println(cont + " valores positivos");
//        System.out.println(String.format("%.1f", media));

//        Scanner leitor = new Scanner(System.in);
//        int N = leitor.nextInt();
//        int proximo, anterior = 0, atual = 1;
//
//        for (int i = 1; i <= N; i++) {
//            if (i == N) System.out.println(anterior);
//
//                //TODO: Implemente a condição ideal para que possamos obter os valores solicitados:
//            else System.out.print(anterior + " ");
//            proximo = anterior + atual;
//            anterior = atual - anterior;
//            atual = anterior + atual;
//        }
//        double h = 0;
//
//
//        double n = sc.nextDouble();
//
//        for (double i = 1; i <= n; i++) {
//
//            h += 1 / i;
//
//            System.out.println(h);
//
//
//        }
//
//
//        //TODO: Imprima a soma dos termos, considerando um resultado com duas casas decimais:
//        System.out.println(String.format("%.2f", h));


        String AN1, AN2, AN3;

        AN1 = sc.nextLine();
        AN2 = sc.nextLine();
        AN3 = sc.nextLine();

        if (AN1 == "vertebrado") {

        }
    }
}


