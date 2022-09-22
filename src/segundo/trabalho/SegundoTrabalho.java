package segundo.trabalho;
import java.util.Scanner;


public class SegundoTrabalho {
    public static void menu() {
        Scanner scan = new Scanner(System.in);
        int menu = 0;

        while (menu != 9) {

            System.out.println("===================MENU===================");
            System.out.println("Escolha a opção desejada entre os polígonos abaixo: ");
            System.out.println("1. triângulo");
            System.out.println("2.Quadrado");
            System.out.println("3.Pentágono regular");
            System.out.println("4.Trapézio");
            System.out.println("9.Sair");
            System.out.print("Opção selecionada: ");
            menu = scan.nextInt();


            if (menu == 1) {
                System.out.println("Informe a base do triângulo:");
                double base = scan.nextInt();
                System.out.println("Informa a altura do triângulo: ");
                double altura = scan.nextInt();
                double area = (base * altura) / 2;
                System.out.println("A área do triângulo é igual a: " + area);
            } else if (menu == 2) {

                System.out.println("Informe a base do quadrado: ");
                double baseQ = scan.nextInt();
                System.out.println("Informe a altura do quadrado: ");
                double alturaQ = scan.nextInt();
                double areaQ = baseQ * alturaQ;
                System.out.println("A área do quadrado é igual a: " + areaQ);
            } else if (menu == 3) {

                System.out.println("Informe o lado do pentágono: ");
                double ladP = scan.nextInt();
                double perimetro = (ladP * 5);
                System.out.println("Informe a apótema do pentágono: ");
                double apotemaP = scan.nextInt();
                double areaP = (perimetro * apotemaP) / 2;
                System.out.println("A área do pentágono regular de lado " + ladP + " é: " + areaP);


            } else if (menu == 4) {

                System.out.println("Informe a base maior do trapézio: ");
                double baseMaior = scan.nextInt();
                System.out.println("Informe a base menor do trapézio: ");
                double baseMenor = scan.nextInt();
                System.out.println("Informe a altura do trapézio: ");
                double alturat = scan.nextInt();
                double areat = ((baseMaior + baseMenor) * alturat) / 2;
                System.out.println("A área do trapézio é: " + areat);
            }

             else if(menu!=9) {
                System.out.println("opção inválida");
            }

        }

    }


    public static void main(String[] args){

        menu();


    }
}
