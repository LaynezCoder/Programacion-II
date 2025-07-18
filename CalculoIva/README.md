Este es un programa en Java que hice para calcular el precio total a pagar de un producto, incluyendo el IVA del 12% hice lo siguiente.

Primero importé Scanner para poder leer lo que el usuario escriba por teclado.

Después declaré una constante que representa el IVA (que es el 12%).

En el main, que es donde empieza todo, le pido al usuario tres cosas:

El nombre del producto

El precio unitario

Y la cantidad que quiere comprar

Todo eso lo guardo en variables (name, price, quantity), y para que se mire bonito en el mensaje, pongo el nombre del producto en mayúsculas.

Luego hago las cuentas:

Multiplico el precio por la cantidad para saber el total sin IVA.

Calculo el IVA con total \* (IVA/100)

Y luego sumo el total + IVA para obtener el precio final con impuestos.

Por último, imprimo ese precio total.

System.out.println("El precio es " + priceWithTax);
