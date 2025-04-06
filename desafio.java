import java.util.Scanner;

public class desafio {
    public static void main(String[] args) {
        String nombre = "Tony Stark";
        String tipoDeCuenta = "Corriente";
        double saldo = 1599.99;
        int opcion = 0;
        double importe = 0;


        System.out.println("******************************");
        System.out.println("\nNombre del cliente: " + nombre);
        System.out.println("El tipo de cuenta es: " + tipoDeCuenta);
        System.out.println("Su saldo disponible es: " + saldo + "$");
        System.out.println("\n******************************");

        String menu = """
                *** Escriba el numero de la opcion deseada
                1 - Consultar saldo
                2 - Retirar
                3 - Depositar
                9 - Salir
                """;

        Scanner teclado = new Scanner(System.in);
        while (opcion != 9) {
            System.out.println(menu);
            opcion = teclado.nextInt();


            switch (opcion){
                case 1:
                    System.out.println("El saldo actualizado es: " + saldo + "$");
                    break;

                case 2:
                    System.out.println("ingrese el importe a retirar: ");
                    importe = teclado.nextDouble();
                    if(importe > saldo){
                        System.out.println("Saldo Insuficiente");
                    } else {
                        saldo = saldo - importe;
                        System.out.println("El saldo actualizado es: " + saldo + "$");
                    }
                    break;
                case 3:
                    System.out.println("ingrese el importe a depositar: ");
                    importe = teclado.nextDouble();
                    if(importe >= 0){
                        saldo = saldo + importe;
                        System.out.println("El saldo actualizado es: " + saldo + "$");
                    }
                    break;
                case 9:
                    break;
            }

        }
    }
}
