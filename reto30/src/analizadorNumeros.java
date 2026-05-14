import java.util.Scanner;

public class analizadorNumeros {
    static Scanner sc = new Scanner(System.in);
    static int num1;
    static int num2;


    public static void main(String[] args) {
        System.out.print("Introduzca un número entero: ");
        num1 = comprobador(num1);


        System.out.print("Introduzca otro número entero: ");
        num2 = comprobador(num2);
        Informe();



    }

    public static int comprobador(int num1){
        while (!sc.hasNextInt()){
            System.out.println("Este número no pertenece a los enteros, introduce otro: ");
            sc.nextLine();
        }
        return sc.nextInt();

    }

    public static void analizador() {

        if (num1 > num2) {
            System.out.println("El número " + num1 + " es mayor que el número " + num2);
        } else if (num2 > num1) {
            System.out.println("El número " + num2 + " es mayor que el número " + num1);

        } else {
            System.out.println("Los números son iguales");
        }

        System.out.println("Suma: " + (num1 + num2));
        System.out.println("Diferencia: " + (num1 - num2));

    }

    public static void signoParImpar(int n) {

        if (n % 2 == 0) {
            System.out.println("- Par");
        } else {
            System.out.println("- Impar");
        }

        if (n > 0) {
            System.out.println("- Positivo");

        } else if (n < 0) {
            System.out.println("- Negativo");

        } else {
            System.out.println("- Cero");
        }
    }
    public static void Informe(){
        System.out.println("----RESULTADOS----");
        analizador();
        System.out.println("Número 1: ");
        signoParImpar(num1);
        System.out.println("Número 2: ");
        signoParImpar(num2);
        System.out.println("------------------");


    }

}
