import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Interseccion {
    public static void main(String[] args) {

        boolean repetir = true;

        String opc = "";

        while(repetir){

            clear();

        opc = System.console().readLine("MENU PRINCIPAL \n1.EJEMPLO 1\n2. EJEMPLO 2\n3. CAPTURAR DATOS\n4. SALIR\n\nEleccion:");
        
        

        if(opc.equals("1")){

            clear();

            System.out.println("A= 1, 2, 3, 4, 5");
            System.out.println("B = 4, 5, 6, 7, 8");
            System.out.println("\nInterseccion: \n4, 5");
            System.out.println("_________________________________________");

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

            System.out.println("A, B, C, D, E ");
            System.out.println("C, E, F, G, H");
            System.out.println("\nInterseccion: \nC, E");
            System.out.println("_________________________________________");

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
        
        Scanner sc = new Scanner(System.in);
        
        Set<Object> setA = capturarDatos(sc, "Ingrese los elementos del conjunto A separados por comas:");
        Set<Object> setB = capturarDatos(sc, "Ingrese los elementos del conjunto B separados por comas:");
        
        Set<Object> intersection = calcularInterseccion(setA, setB);
        
        imprimirInterseccion(intersection);
        System.out.println("_________________________________________");

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

    private static Set<Object> calcularInterseccion(Set<Object> setA, Set<Object> setB) {
        Set<Object> intersection = new HashSet<>(setA);
        intersection.retainAll(setB);
        return intersection;
    }

    private static Set<Object> parseInput(String input) {
        Set<Object> set = new HashSet<>();
        String[] elements = input.split(",");
        for (String element : elements) {
            set.add(element.trim());
        }
        return set;
    }

    private static void imprimirInterseccion(Set<Object> intersection) {
        System.out.print("Intersección: ");
        boolean first = true;
        for (Object element : intersection) {
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


