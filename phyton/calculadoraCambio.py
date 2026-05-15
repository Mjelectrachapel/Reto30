precio_compra = float(input("Precio de la compra: "))
dinero_entregado = float(input("Dinero entregado: "))
precio_compra_cent = precio_compra*100
dinero_entregado_cent = dinero_entregado*100
contador_billetes=0
contador_monedas=0
#Bucle para que el dinero entregado sea suficiente para pagar.
while dinero_entregado_cent < precio_compra_cent:
    print("El dinero entregado no es suficiente")
    dinero_entregado = float(input("Dinero entregado: "))
    dinero_entregado_cent = dinero_entregado*100

cambio = precio_compra_cent-dinero_entregado_cent
print(f"Cambio total: {-cambio/100}€")
#Bucle para calcular el cambio mínimo en monedas y billetes.
if cambio < 0:
    cambio = -cambio
    billetes = [50000, 20000, 10000, 5000, 2000, 1000, 500]
    monedas = [200, 100, 50, 20, 10, 5, 2, 1]
    for valor in billetes:
        cantidad = cambio // valor
        if cantidad > 0:
            print(f"{int(cantidad)} billetes de {valor/100}€")
            cambio -= cantidad * valor
            contador_billetes +=(int(cantidad))     
    for valor in monedas:
        cantidad = cambio // valor
        if cantidad > 0:
            print(f"{int(cantidad)} monedas de {valor/100}€")
            cambio -= cantidad * valor
            contador_monedas += int(cantidad)

print(f"Se han utilizado {contador_billetes} billetes y {contador_monedas} monedas para el cambio.")

