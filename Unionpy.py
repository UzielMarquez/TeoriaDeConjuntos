def capturar_datos(mensaje):
    input_str = input(mensaje)
    return set(input_str.split(','))

def calcular_union(setA, setB):
    return setA.union(setB)

def imprimir_union(union):
    print("Unión de los conjuntos:", ', '.join(union))

def clear():
    import os
    os.system('cls' if os.name == 'nt' else 'clear')

repetir = True

while repetir:
    clear()

    opc = input("MENU PRINCIPAL\n1. EJEMPLO 1\n2. EJEMPLO 2\n3. CAPTURAR DATOS\n4. SALIR\n\nEleccion: ")

    if opc == "1":
        clear()

        print("Conjunto A = 1, 2, 3, 4, 5, 6, 7")
        print("Conjunto B = 2, 4, 6, 8, 9")
        setA = {1, 2, 3, 4, 5, 6, 7}
        setB = {2, 4, 6, 8, 9}
        union = calcular_union(setA, setB)
        imprimir_union(union)

        again1 = input("\n1. VOLVER AL MENU PRINCIPAL\n2. SALIR\n\nEleccion: ")
        if again1 == "1":
            repetir = True
        else:
            print("Fin del programa")
            repetir = False

    elif opc == "2":
        clear()

        print("Conjunto A = A, B, C, D")
        print("Conjunto B = E, F, G, H")
        setA = {'A', 'B', 'C', 'D'}
        setB = {'E', 'F', 'G', 'H'}
        union = calcular_union(setA, setB)
        imprimir_union(union)

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

        union = calcular_union(setA, setB)
        imprimir_union(union)

        again = input("¿Desea volver a realizar? (S|N): ")
        if again.upper() == "S":
            repetir = True
        else:
            print("Fin del programa")
            repetir = False

    elif opc == "4":
        print("Fin del programa")
        repetir = False
