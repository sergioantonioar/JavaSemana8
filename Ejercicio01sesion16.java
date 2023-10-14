package semana8;

import java.util.Scanner;

/**
 *
 * @author sergio
 */
public class Ejercicio01sesion16 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean validaUsuario = false, validaSueldo = false;
        int opcion;
        int nmes = 0;
        int tipo;
        String nboletas;
        float salario = 0;
        String ntipo = "";
        String mes = "", nombre = "";
        do {
            System.out.println("""
                       #################################
                       #        MENU DE OPCIONES       #
                       #################################
                       # 1. Ingresar Empleado          #
                       # 2. Ingresar Salario Mensual   #
                       # 3. Emitir Boleta              #
                       # 4. Salir                      #
                       #################################
                """);
            opcion = sc.nextInt();

            switch (opcion) {

                case 1 -> {
                    System.out.println("Ingrese su nombre y apellido: ");
                    nombre = sc.nextLine();

                    sc.nextLine();

                    do {
                        System.out.println("Ingrese el tipo de empleado:\n(1) Contratado\n(2) Nombrado");
                        tipo = sc.nextInt();
                        switch (tipo) {
                            case 1 ->
                                ntipo = """
                                        Tipo [X] Contradado [] Nombrado
                                        """;
                            case 2 ->
                                ntipo = """
                                        Tipo [] Contradado [X] Nombrado
                                        """;
                            default ->
                                System.out.println("ERROR: Valor fuera de rango");
                        }
                    } while (tipo < 1 || tipo > 4);

                    validaUsuario = true;
                }
                case 2 -> {

                    if (validaUsuario) {
                        System.out.println("Ingrese el salario mensual: ");
                        salario = sc.nextFloat();
                        sc.nextLine();
//                        System.out.println("Ingrese el numero de boletas emitidas");
//                        boletas = sc.nextInt();

                        do {
                            System.out.println("Ingrese el mes en curso (1-12): ");
                            nmes = sc.nextInt();

                        } while (nmes < 1 || nmes > 12);

                        validaSueldo = true;

                    } else {
                        System.out.println("ERROR: Antes debe ingresar los nombres");
                    }
                }
                case 3 -> {
                    if (validaUsuario == true && validaUsuario == true) {
                        System.out.println(" RESUMEN DE BOLETAS DE PAGO ");
                        System.out.println(" Empleado: " + nombre);
                        System.out.println(" " + ntipo);
                        System.out.println("Datos del Salario       Boletas");
                        int j = 1;
                        for (int i = 1; i <= nmes; i++) {
                            switch (i) {
                                case 1 ->
                                    mes = "ENE";
                                case 2 ->
                                    mes = "FEB";
                                case 3 ->
                                    mes = "MAR";
                                case 4 ->
                                    mes = "ABR";
                                case 5 ->
                                    mes = "MAY";
                                case 6 ->
                                    mes = "JUN";
                                case 7 ->
                                    mes = "JUL";
                                case 8 ->
                                    mes = "AGO";
                                case 9 ->
                                    mes = "SET";
                                case 10 ->
                                    mes = "OCT";
                                case 11 ->
                                    mes = "NOV";
                                case 12 ->
                                    mes = "DIC";
                            }
                            if (j == nmes) {
                                nboletas = "NO";
                            } else {
                                nboletas = "SI";
                            }
                            System.out.println("Salario " + mes + ": s/. " + salario + "        " + nboletas);
                            j++;
                        }
                        System.out.println("Boletas Emitidas: " + (nmes-1) + " Boletas Restantes: " + 1);
                        System.out.println("Monto total pagado: s/. " + (nmes-1)  * salario);
                    } else {
                        System.out.println("ERROR: Ingrese usuario y/o sueldo");
                    }
                }
                case 4 ->{
                    System.out.println("Programa finalizado");
                }
            }
        } while (opcion != 4);
    }
}
