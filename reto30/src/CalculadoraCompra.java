import java.util.Scanner;

public class CalculadoraCompra {
    static Scanner sc= new Scanner(System.in);
    static String producto;
    static double precioUnitario;
    static int cantidad;


     public static void main(String[] args) {
         ticket();

    }
    public static void ticket(){
        System.out.print("Introduzca el nombre del producto: ");
        producto = sc.nextLine();
        System.out.print("Introduzca el precio unitario de ese producto: ");
        precioUnitario = sc.nextDouble();
        System.out.print("Introduzca la cantidad: ");
        cantidad = sc.nextInt();


        System.out.println("-----TICKET-----");
        System.out.println("Producto: " + producto);
        System.out.println("Precio unitario: " + precioUnitario + "€");
        double subtotal = precioUnitario*cantidad;
        System.out.printf("Subtotal: %.2f€ %n",subtotal);
        double IVA = subtotal*0.21;
        System.out.printf("IVA (21): %.2f€ %n ",IVA );
        double TOTAL = subtotal+IVA;
        System.out.printf("TOTAL: %.2f€ %n",TOTAL );

        if (TOTAL >= 20){
            System.out.println("Compra grande");

        } else {
            System.out.println("Compra pequeña ");
        }

        System.out.println("----------------");









    }



}
