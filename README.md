# Distancia de Levenshtein

**Tarea 1**

El código busca determinar cuales es el numero de movimientos mínimos para que una palabra se parezca a otra. Los movimientos permitidos son eliminar, insertar, intercambiar o el de no cambiar una letra. Cabe recalcar que las palabras pueden tener distinta longitud.

Para buscar los menores movimientos posibles, el código utiliza la lógica de hacer todos los casos posibles y luego decidir cuál es el caso la óptimo.  Es decir, crea un árbol con las permutaciones entre eliminar, insertar e intercambiar de cada pedazo de texto. En las permutaciones no se toma en cuenta el caso de "no hacer nada", pues es un caso donde no se incrementa el numero de movimientos extras. Por último, al final de hacer cada permutación se toma el óptimo de menos movimientos.

**Explicacion linea código**

El primer if sirve como caso base. Este indica cuando ya no hay texto por analizar. Entonces va a regresar lo que tiene en el contador mas la longitud de los textos. Si los textos tienen longitud se cuenta como eliminar cada letra que tiene restante.

El segundo if es para hacer la comparación de la letra inicial de cada texto. Si es verdad, no se va a incrementar un movimiento y va tomar las siguientes partes de las palabras sin tomar la primera letra.

Las siguientes tres lineas de código sirven para hacer las permutaciones:
> intercambiar (Se incrementa contador y se toma en las dos palabras el resto sin la primera letra)

> insertar (Se incrementa contador y de la primera palabra se toma lo que queda menos la letra inicial y de la segunda palabra se mantiene el texto, pues fue al que se le inserto)

>borrar (Se incrementa contador y de la segunda palabra se toma lo que queda menos la letra inicial, pues fue de la que se borro una letra. Y de la primera se mantiene igual)

Por último, se busca el caso menor de movimentos dadas las permutaciones y se regresa ese número.

**Ejemplos**

Los ejemplos que realice fueron para probar distintos casos posibles entre palabras. 

- El 1 y el 3 fueron con palabras de la misma longuitud y que solo cambiaban las posiciones de la misma palabra. 
- El ejemplo 2 fue con palabras de la misma longuitud pero que no tenían algunas letras en común
- El ejemplo 4 fue haciendo la comparación con dos palabras iguales
- El ejemplo 5 y 6 fue probando palabras con distinta longuitud y letras que no tenían en común.
- El ejemplo 7 fue probando con null´s
- El ejemplo 8 fue probando con palabras con espacios.
