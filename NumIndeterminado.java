import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;

public class NumIndeterminado {
    public static void main(String[] args) throws Exception {
    Scanner scanner = new Scanner(System.in);
    ArrayList <Double> ListaNum = new ArrayList <Double>();
    ArrayList <Double> Listaneg = new ArrayList <Double>();

    Double soma = 0.0;

    while(true){
    System.out.println("Digite o valor da nota, caso ela seja igual ou menor que -1, o programa será encerrado!: ");
    Double num = scanner.nextDouble();
    soma += num;
    Double media = soma / num;

    ListaNum.add(num);

    if (num <= -1) {
    System.out.println("encerrando a entrada de dados!");
    System.out.println();
    break;
    }
    else {
    System.out.println();}
    }

    System.out.println("A quantidade de valores lidos foram: " + ListaNum.size());
    System.out.println();
    System.out.println("Os valores lidos foram: " + ListaNum);
    System.out.println();
    Collections.reverse(ListaNum);

    for (Double numeros : ListaNum){
    System.out.println("Os valores lidos na forma inversa foram:  " + numeros);
    }
    System.out.println();

    System.out.println("A soma de todos os valores é: " + soma);
    System.out.println();
    
    double media = soma / ListaNum.size();

    System.out.println("A média é: " + media);

    int acimaDaMedia = 0;
    for (double n : ListaNum) {
    if (n > media) {
    acimaDaMedia++;
    }
    }

    System.out.println();
    System.out.println("Quantidade de valores acima da média: " + acimaDaMedia);

    int abaixoDeSete = 0;
    for (double n : ListaNum) {
    if (n < 7) {
    abaixoDeSete++;
    }
    }
    
    System.err.println();
    System.out.println("Quantidade de valores abaixo de sete: " + abaixoDeSete);

    System.out.println("Programa encerrado.");
    scanner.close();
    }
}
