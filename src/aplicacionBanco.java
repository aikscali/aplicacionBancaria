import java.util.Scanner;

public class aplicacionBanco {
    public static void main(String[] args) {
        String nombreCliente = "Alejandro Fernandez Herrera";
        String tipoCuenta = "Corriente";
        float saldo = 100000;
        int opcion = 0;

        Scanner teclado = new Scanner(System.in);

        while (opcion != 4) {

            String mensajeMenu = String.format("""
                    \n=== BIENVENIDO ===
                    %s
                    su tipo de cuenta es %s
                    su saldo disponible es $%.2f
                    \n=== MENU DE OPCIONES ===
                    1. Ingresar dinero
                    2. Retirar dinero
                    3. Consultar saldo
                    4. Salir
                    \nIngrese una opcion:
                    """, nombreCliente, tipoCuenta, saldo);
            System.out.println(mensajeMenu);
            opcion = teclado.nextInt();
            switch (opcion) {
                case 1:
                    System.out.println("Ingrese el monto a ingresar: ");
                    float montoIngreso = teclado.nextFloat();
                    saldo += montoIngreso;
                    System.out.printf("su nuevo saldo es $%.2f: ", saldo);
                    break;
                case 2:
                    System.out.println("Ingrese el monto a retirar: ");
                    float montoRetiro = teclado.nextFloat();
                    saldo -= montoRetiro;
                    System.out.printf("su nuevo saldo es $%.2f: ", saldo);
                    break;
                case 3:
                    System.out.printf("su saldo es $%.2f: ", saldo);
                    break;
                    case 4:
                    System.out.println("Gracias por utilizar nuestro servicio");
                    break;
            }
        }
        teclado.close();
    }
}
