import java.util.Scanner;

public class evaluadorNotas {
    static Scanner sc = new Scanner(System.in);
    static String nombre;
    static double nota;


    public static void main(String[] args) {
        evaluador();

    }


    public static void evaluador() {
        System.out.print("Introduce tu nombre: ");
        nombre = sc.nextLine();
        System.out.print("Introduce tu nota: ");
        nota = sc.nextDouble();
        System.out.println("Alumno: " + nombre);
        System.out.printf("Nota: %.2f %n", nota);


        if (nota >= 9 && nota <= 10) {
            System.out.println("Resultado: Sobresaliente");
            System.out.println("Buen trabajo");

        } else if (nota >= 7 && nota < 9) {
            System.out.println("Resultado: Notable");
            System.out.println("Buen trabajo");

        } else if (nota >= 5 && nota < 7) {
            System.out.println("Resultado: Aprobado");
            System.out.println("Buen trabajo");

        } else if (nota >= 0 && nota < 5) {
            System.out.println("Resultado: Suspenso");
            System.out.println("Hay que seguir trabajando");

        } else {
            System.out.println("Nota no válida");
        }

    }


}
