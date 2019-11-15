# laboratory_3
# Integrantes

Brayan Andrés Guevara Marquez
José Daniel Organista Calderón
María Alejandra Robayo

# Punto 1
El patrón de Estrategia encapsula algoritmos alternativos (o estrategias) para una tarea en particular. Permite que un método se intercambie en tiempo de ejecución por cualquier otro método (estrategia) sin que el cliente se dé cuenta. 
En este sentido, se utilizó el patrón de Strategy para calcular el tiempo y dinero gastados en llegar desde un punto de la ciudad hasta el aeropuerto. Se evalúan diferentes medios de transporte como bicicleta, taxi y bus. El viaje es el contexto y las 3 medios de transporte Bycicle, Cup, Bus son las estrategias. Los medios de transporte (estrategias) se cambian dependiendo de la distancia seleccionada por el usuario. Al final mostramos los diferentes costos y tiempo que se gastaria en llegar hasta el aeropuerto teniedo en cuenta el medio de transporte seleccionado.

La función de registro es un ayudante que recopila y muestra resultados.

# Punto 2

# Punto 3
Se utiliza el patrón Builder para crear carros de diferentes marcas (Mazda y Renault), se utiliza un Builder abstracto en el cual se indican los pasos a seguir para crear el carro y se utilizan 2 Builders concretos que son heredados del Builder abstracto, 1 para cada marca, donde cada uno crea un carro con las caracteristicas propias de la marca. Y la clase Fábricas es el director el cual construye un carro con las caracteristicas de la marca del Builder que tenga en el momento de llamar la funcion construirCarro y con la función getCarro se obtiene el carro de la fábrica y se puede guardar en una variable, asi como se ve en el main.
# Punto 4
4.1. The Blob: Se ve un código donde hay una unica clase compleja que tiene demasiadas responsabilidades o funciones. Esta clase se puede descomponer en varias clases para evitar este antipatrón.

4.2. Spaghetti Code: Se observa un uso frecuente de sentencias if y while con lo cual se complica el seguimiento y comprensión del algoritmo.
Se repite varias veces la verificación de que la puerta este cerrada lo cual hace el prgrama más largo y complejo de entender.
Se utiliza una mala práctica llamada Código de Bloqueo en la instrucción "while (not (NIVEL_AGUA_OK))" debido a que esta bloquea el procesador hasta que se cumpla la condición para poder seguir.
Si se implementaran más funciones de la lavadora este código tendría muchas más sentencias if y while y se repetiría mucho más código.
# Punto 5



