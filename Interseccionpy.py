def capturar_datos(mensaje):
    input_str = input(mensaje)
    return set(input_str.split(','))

def calcular_interseccion(setA, setB):
    return setA.intersection(setB)

def imprimir_interseccion(intersection):
    print("Intersección:", ', '.join(intersection))

def clear():
    import os
    os.system('cls' if os.name == 'nt' else 'clear')

repetir = True

while repetir:
    clear()

    opc = input("MENU PRINCIPAL\n1. EJEMPLO 1\n2. EJEMPLO 2\n3. CAPTURAR DATOS\n4. SALIR\n\nEleccion: ")

    if opc == "1":
        clear()

        print("A = 1, 2, 3, 4, 5")
        print("B = 4, 5, 6, 7, 8")
        print("\nIntersección:")
        setA = {1, 2, 3, 4, 5}
        setB = {4, 5, 6, 7, 8}
        intersection = calcular_interseccion(setA, setB)
        imprimir_interseccion(intersection)

        again1 = input("\n1. VOLVER AL MENU PRINCIPAL\n2. SALIR\n\nEleccion: ")
        if again1 == "1":
            repetir = True
        else:
            print("Fin del programa")
            repetir = False

    elif opc == "2":
        clear()

        print("A, B, C, D, E")
        print("C, E, F, G, H")
        print("\nIntersección:")
        setA = {'A', 'B', 'C', 'D', 'E'}
        setB = {'C', 'E', 'F', 'G', 'H'}
        intersection = calcular_interseccion(setA, setB)
        imprimir_interseccion(intersection)

        again2 = input("\n1. VOLVER AL MENU PRINCIPAL\n2. SALIR\n\nEleccion: ")
        if again2 == "1":
            repetir = True
        else:
            print("Fin del programa")
            repetir = False

    elif opc == "3":
        clear()

        setA = capturar_datos("Ingrese los elementos del conjunto A separados por comas: ")
        setB = capturar_datos("Ingrese los elementos del conjunto B separados por comas: ")

        intersection = calcular_interseccion(setA, setB)
        imprimir_interseccion(intersection)

        again3 = input("\n1. VOLVER AL MENU PRINCIPAL\n2. SALIR\n\nEleccion: ")
        if again3 == "1":
            repetir = True
        else:
            print("Fin del programa")
            repetir = False

    elif opc == "4":
        print("Fin del programa")
        repetir = False
