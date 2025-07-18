# Programa en Java para calcular el precio total con IVA

Este es un programa en Java que hice para calcular el precio total a pagar de un producto, incluyendo el IVA del 12%. Hice lo siguiente:

---

## Paso 1: Importar Scanner

Primero importé `Scanner` para poder leer lo que el usuario escriba por teclado.

---

## Paso 2: Declarar el IVA

Después declaré una constante que representa el IVA (que es el 12%).

---

## Paso 3: Pedir datos al usuario

En el `main`, que es donde empieza todo, le pido al usuario tres cosas:

- El nombre del producto
- El precio unitario
- Y la cantidad que quiere comprar

---

## Paso 4: Guardar en variables

Todo eso lo guardo en variables (`name`, `price`, `quantity`), y para que se mire bonito en el mensaje, pongo el nombre del producto en mayúsculas.

---

## Paso 5: Realizar los cálculos

Luego hago las cuentas:

1. Multiplico el precio por la cantidad para saber el total sin IVA.
2. Calculo el IVA con:
   ```java
   total * (IVA / 100)
   ```
