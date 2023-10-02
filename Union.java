import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Union {

    public static void main(String[] args) {

        boolean repetir = true;
        String opc = "";
        

        while(repetir){
            clear();

            opc = System.console().readLine("MENU PRINCIPAL \n1.EJEMPLO 1\n2. EJEMPLO 2\n3. CAPTURAR DATOS\n4. SALIR\n\nEleccion:");

            if(opc.equals("1")){
                clear();

                System.out.println("Conjunto A= 1, 2, 3, 4, 5, 6, 7");
                System.out.println("Conjunto B= 2, 4, 6, 8, 9");
                System.out.println("La union de los conjuntos es  1, 2, 3, 4, 5, 6, 7, 8, 9");

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
                 System.out.println("Conjunto A= A, B, C, D");
                System.out.println("Conjunto B= E, F, G, H");
                System.out.println("La union de los conjuntos es A, B, C, D, E, F, G, H");

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

                Set<Object> union = calcularUnion(setA, setB);

                imprimirUnion(union);

                String again = System.console().readLine("Volver a realizar? (S|N): ");
                if(again.equalsIgnoreCase("S")){
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

    private static Set<Object> calcularUnion(Set<Object> setA, Set<Object> setB) {
        Set<Object> union = new HashSet<>(setA);
        union.addAll(setB);
        return union;
    }

    private static Set<Object> parseInput(String input) {
        Set<Object> set = new HashSet<>();
        String[] elements = input.split(",");
        for (String element : elements) {
            set.add(element.trim());
        }
        return set;
    }

    private static void imprimirUnion(Set<Object> union) {
        clear();
        System.out.print("Unión de los conjuntos: ");
        boolean first = true;
        for (Object element : union) {
            if (!first) {
                System.out.print(", ");
            }
            System.out.print(element);
            first = false;
        }
        System.out.println();
    }
    private static void clear(){
        System.out.print("\033[H\033[2J");  
    }
}
