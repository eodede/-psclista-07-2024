import java.util.ArrayList;
import java.util.Scanner;

public class Comissões {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Double> vendas = new ArrayList<>();

        System.out.println("Digite as vendas brutas dos vendedores (digite -1 para encerrar):");

        double venda = scanner.nextDouble();
        while (venda != -1) {
        vendas.add(venda);
        venda = scanner.nextDouble();
        }

        int[] faixaSalario = new int[9]; 

        for (double v : vendas) {
            double salario = 200 + 0.09 * v; 

            if (salario >= 200 && salario <= 299) {
                faixaSalario[0]++;
            } else if (salario >= 300 && salario <= 399) {
                faixaSalario[1]++;
            } else if (salario >= 400 && salario <= 499) {
                faixaSalario[2]++;
            } else if (salario >= 500 && salario <= 599) {
                faixaSalario[3]++;
            } else if (salario >= 600 && salario <= 699) {
                faixaSalario[4]++;
            } else if (salario >= 700 && salario <= 799) {
                faixaSalario[5]++;
            } else if (salario >= 800 && salario <= 899) {
                faixaSalario[6]++;
            } else if (salario >= 900 && salario <= 999) {
                faixaSalario[7]++;
            } else {
                faixaSalario[8]++;
            }
        }

        System.out.println("$200 - $299: " + faixaSalario[0]);
        System.out.println("$300 - $399: " + faixaSalario[1]);
        System.out.println("$400 - $499: " + faixaSalario[2]);
        System.out.println("$500 - $599: " + faixaSalario[3]);
        System.out.println("$600 - $699: " + faixaSalario[4]);
        System.out.println("$700 - $799: " + faixaSalario[5]);
        System.out.println("$800 - $899: " + faixaSalario[6]);
        System.out.println("$900 - $999: " + faixaSalario[7]);
        System.out.println("$1000 em diante: " + faixaSalario[8]);

        scanner.close();
    }
}
