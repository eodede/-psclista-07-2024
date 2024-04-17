import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Crime {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> perguntas = new ArrayList<>();
        List<Boolean> respostas = new ArrayList<>();
        
        perguntas.add("Telefonou para a vítima?");
        perguntas.add("Esteve no local do crime?");
        perguntas.add("Mora perto da vítima?");
        perguntas.add("Devia para a vítima?");
        perguntas.add("Já trabalhou com a vítima?");

        for (String pergunta : perguntas) {
            System.out.print(pergunta + " Responda com 'sim' ou 'nao': ");
            String resposta = scanner.nextLine();
            respostas.add(resposta.equalsIgnoreCase("sim"));
        }

        int count = 0;
        for (boolean resposta : respostas) {
            if (resposta) {
                count++;
            }
        }

        System.out.print("Classificação: ");
        if (count == 5) {
            System.out.println("Assassino");
        } else if (count >= 3) {
            System.out.println("Cúmplice");
        } else if (count == 2) {
            System.out.println("Suspeita");
        } else {
            System.out.println("Inocente");
        }
        
        scanner.close();
    }
}




