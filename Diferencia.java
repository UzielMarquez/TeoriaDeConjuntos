import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Diferencia {

    public static void main(String[] args) {

        boolean repetir = true;
        String opc = "";

        while(repetir){
            
            clear();

            opc = System.console().readLine("MENU PRINCIPAL \n1.EJEMPLO 1\n2. EJEMPLO 2\n3. CAPTURAR DATOS\n4. SALIR\n\nEleccion:");

            if(opc.equals("1")){
                clear();

                System.out.println("Conjunto A= 1, 2, 3, 4, 5, 6");
                System.out.println("Conjunto B= 2, 4, 6, 8, 10");
                System.out.println("Diferencia AB = 1, 3, 5");
                System.out.println("Diferencia BA = 8, 10");

                String again1 = System.console().readLine("\n1. VOLVER AL MENU PRINCIPAL\n2. SALIR\n\nEleccion:");
                if(again1.equals("1")){
                    repetir = true;
                }else{
                    System.out.println("Fin del programa");
                    repetir = false;
                }

            }
            if(opc.equals("2")){
                clear();

                System.out.println("Conjunto A= A, B, C, D, E, F");
                System.out.println("Conjunto B= C, E, F, G, H");
                System.out.println("Diferencia AB = A, B, C");
                System.out.println("Diferencia BA = F, G, H");

                String again2 = System.console().readLine("\n1. VOLVER AL MENU PRINCIPAL\n2. SALIR\n\nEleccion:");
                if(again2.equals("1")){
                    repetir = true;
                }else{
                    System.out.println("Fin del programa");
                    repetir = false;
                }

            }
            if(opc.equals("3")){

                clear();

                Scanner scanner = new Scanner(System.in);

                Set<Object> setA = capturarDatos(scanner, "Ingrese los elementos del conjunto A separados por comas:");
                Set<Object> setB = capturarDatos(scanner, "Ingrese los elementos del conjunto B separados por comas:");

                Set<Object> diferenciaAB = calcularDiferencia(setA, setB);
                Set<Object> diferenciaBA = calcularDiferencia(setB, setA);

                imprimirDiferencia("A - B", diferenciaAB);
                imprimirDiferencia("B - A", diferenciaBA);

                 String again3 = System.console().readLine("\n1. VOLVER AL MENU PRINCIPAL\n2. SALIR\n\nEleccion:");
                if(again3.equals("1")){
                    repetir = true;
                }else{
                    System.out.println("Fin del programa");
                    repetir = false;
                }
            }

            if(opc.equals("4")){
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

    private static Set<Object> calcularDiferencia(Set<Object> conjuntoA, Set<Object> conjuntoB) {
        Set<Object> diferencia = new HashSet<>(conjuntoA);
        diferencia.removeAll(conjuntoB);
        return diferencia;
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
        System.out.print("\033[H\033[2J\033[3J");
        System.out.flush();
    }

    private static void imprimirDiferencia(String titulo, Set<Object> diferencia) {
        System.out.print("Diferencia " + titulo + ": ");
        boolean first = true;
        for (Object element : diferencia) {
            if (!first) {
                System.out.print(", ");
            }
            System.out.print(element);
            first = false;
        }
        System.out.println();
    }
}
