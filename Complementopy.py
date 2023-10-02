def capturar_datos(mensaje):
    input_str = input(mensaje)
    return set(input_str.split(','))

def calcular_complemento(conjunto_a, universo_u):
    return universo_u.difference(conjunto_a)

def imprimir_complemento(complemento):
    print(f"Complemento de A: {', '.join(complemento)}")

def clear():
    import os
    os.system('cls' if os.name == 'nt' else 'clear')

repetir = True

while repetir:
    clear()

    opc = input("MENU PRINCIPAL\n1. EJEMPLO 1\n2. EJEMPLO 2\n3. CAPTURAR DATOS\n4. SALIR\n\nEleccion: ")

    if opc == "1":
        clear()

        print("Conjunto A = 1, 2, 3")
        print("Conjunto B = 2, 4, 6")
        conjunto_a = {1, 2, 3}
        conjunto_b = {2, 4, 6}
        complemento_a = calcular_complemento(conjunto_a, conjunto_b)
        imprimir_complemento(complemento_a)

        again1 = input("\n1. VOLVER AL MENU PRINCIPAL\n2. SALIR\n\nEleccion: ")
        if again1 == "1":
            repetir = True
        else:
            print("Fin del programa")
            repetir = False

    elif opc == "2":
        clear()

        print("Conjunto A = A, B, C, D, E, F")
        print("Conjunto B = C, E, F, G, H")
        conjunto_a = {'A', 'B', 'C', 'D', 'E', 'F'}
        conjunto_b = {'C', 'E', 'F', 'G', 'H'}
        complemento_a = calcular_complemento(conjunto_a, conjunto_b)
        imprimir_complemento(complemento_a)

        again2 = input("\n1. VOLVER AL MENU PRINCIPAL\n2. SALIR\n\nEleccion: ")
        if again2 == "1":
            repetir = True
        else:
            print("Fin del programa")
            repetir = False

    elif opc == "3":
        clear()

        conjunto_a = capturar_datos("Ingrese los elementos del conjunto A separados por comas: ")
        universo_u = capturar_datos("Ingrese los elementos del universo U separados por comas: ")

        complemento_a = calcular_complemento(conjunto_a, universo_u)
        imprimir_complemento(complemento_a)

        again3 = input("¿Desea volver a realizar? (S|N): ")
        if again3.upper() == "S":
            repetir = True
        else:
            print("Fin del programa")
            repetir = False

    elif opc == "4":
        print("Fin del programa")
        repetir = False
