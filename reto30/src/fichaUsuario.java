import java.util.Scanner;

public class fichaUsuario {
   static Scanner sc = new Scanner(System.in);
    static String nombre;
    static int nacimiento;
    static String ciudad;


    public static void main(String[] args) {
        ficha();


    }

    public static void comprobacion(){
        if (nacimiento <= 1997){
            System.out.println("Eres adulto");

        }
        else{
            System.out.println("Eres joven");
        }


    }

    public static void ficha(){
        System.out.print("Introduzca su nombre: ");
        nombre = sc.nextLine();
        System.out.print("Introduzca su año de nacimiento: ");
        nacimiento = sc.nextInt();
        sc.nextLine();
        System.out.print("Introduzca su ciudad de procedencia: ");
        ciudad = sc.nextLine();

        System.out.println("----FICHA DE USUARIO---");
        System.out.println("Nombre: " + nombre);
        System.out.println("Ciudad: " + ciudad);
        System.out.println("Edad aproximada: " + (2026-nacimiento) + " años");
        comprobacion();
        System.out.println("-----------------------");



    }



}
