import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Complemento {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String opc = "";

        boolean repetir = true;

        while (repetir) {
            clear();

            opc = System.console().readLine("MENU PRINCIPAL \n1. EJEMPLO 1\n2. EJEMPLO 2\n3. CAPTURAR DATOS\n4. SALIR\n\nEleccion:");

            if (opc.equals("1")) {
                clear();

                System.out.println("Conjunto A= 1, 2, 3");
                System.out.println("Conjunto B= 2, 4, 6");
                System.out.println("El complemento de A es 4, 6");

                String again1 = System.console().readLine("\n1. VOLVER AL MENU PRINCIPAL\n2. SALIR\n\nEleccion:");
                if (again1.equals("1")) {
                    repetir = true;
                } else {
                    System.out.println("Fin del programa");
                    repetir = false;
                }

            }
            if (opc.equals("2")) {
                clear();

                System.out.println("Conjunto A= A, B, C, D, E, F");
                System.out.println("Conjunto B= C, E, F, G, H");
                System.out.println("El complemento de A es G, H");

                String again2 = System.console().readLine("\n1. VOLVER AL MENU PRINCIPAL\n2. SALIR\n\nEleccion:");
                if (again2.equals("1")) {
                    repetir = true;
                } else {
                    System.out.println("Fin del programa");
                    repetir = false;
                }

            }

            if (opc.equals("3")) {
                clear();

                Set<Object> conjuntoA = capturarDatos(scanner, "Ingrese los elementos del conjunto A separados por comas:");
                Set<Object> universoU = capturarDatos(scanner, "Ingrese los elementos del universo U separados por comas:");

                Set<Object> complementoA = calcularComplemento(conjuntoA, universoU);

                imprimirComplemento(complementoA);

                String again3 = System.console().readLine("\n1. VOLVER AL MENU PRINCIPAL\n2. SALIR\n\nEleccion:");
                if (again3.equals("1")) {
                    repetir = true;
                } else {
                    System.out.println("Fin del programa");
                    repetir = false;
                }
            }
            if (opc.equals("4")) {
                System.out.println("Fin del programa");
                repetir = false;
            }
        }
    }

    private static Set<Object> capturarDatos(Scanner scanner, String mensaje) {
        System.out.print(mensaje);
        String input = scanner.nextLine();
        return parseInput(input);
    }

    private static Set<Object> calcularComplemento(Set<Object> conjuntoA, Set<Object> universoU) {
        Set<Object> complemento = new HashSet<>(universoU);
        complemento.removeAll(conjuntoA);
        return complemento;
    }

    private static Set<Object> parseInput(String input) {
        Set<Object> set = new HashSet<>();
        String[] elements = input.split(",");
        for (String element : elements) {
            set.add(element.trim());
        }
        return set;
    }

    private static void clear() {
        System.out.print("\033[H\033[2J");
    }

    private static void imprimirComplemento(Set<Object> complemento) {
        System.out.print("Complemento de A: ");
        boolean first = true;
        for (Object element : complemento) {
            if (!first) {
                System.out.print(", ");
            }
            System.out.print(element);
            first = false;
        }
        System.out.println(); 
    }
}
