Proyecto 1 FADA
=============

# Punto 1 #

Hay ***n*** estudiantes encargados de diversas monitorias(monitoria de sala, desarrollo de una aplicación, monitoria académica, etc.) Cada uno de los estudiantes realiza un  único turno en la semana el cual corresponde a un intervalo continuo de tiempo. Pueden realizarse muchos turnos al mismo tiempo.

Su amiga quiere elegir un subconjunto de los monitores para formar un comité de supervisión, con los cuales se pueda reunir una vez por semana. Ella considera que el comité esta completo, si para cada estudiante que no este
presente en el comité, su turno se cruza, aunque sea de forma parcial con el turno de uno de los estudiantes en el comité. De esta forma, el desempeño de cada monitor puede ser observado por al menos una persona del comité.

El problema que usted debe resolver es encontrar un comité de supervisión que cuente con
la menor cantidad posible de monitores.

## Ejemplo ##

Suponga que **n** = 3 y los turnos son:

Laura Lunes 16:00 - 20:00

Andres Lunes 18:00 - 22:00

Camilo Lunes 21:00 - 23:00

El comité de supervisión mas pequeño posible consiste del monitor Andres, ya que el turno de Laura y el de Camilo se cruza con el turno de Andres.

## Manera de resolver ##

1.  Resuelva el problema de seleccionar un comité de supervisión entre los monitores por medio de un algoritmo ingenuo o exhaustivo.
1. Resuelva el problema de seleccionar un comité de supervisión entre los monitores por medio de un algoritmo m´as inteligente, en el sentido en que no tiene en cuenta todas los posibles comités.
1. Teniendo en cuenta que los datos de entrada de los dos problemas pueden seguir las siguientes distribuciones:

   * **distribución uniforme:** En cada momento del tiempo existe la misma probabilidad de tener monitores realizando turnos.

   * **distribución normal:** Existe un momento en el tiempo en el cual la probabilidad de tener monitores en turno es mas alta que en otros momentos.

1. ¿En todos los casos funciona claramente mejor el algoritmo más inteligente? Sino, ¿En cuáles y por qué?

## Entrada ##

Su algoritmo va a recibir como entrada un archivo de texto que esta organizado de la siguiente forma:

***n***

*nombre**1*** dia**1** hInicio**1** hFin**1**

...

*nombre**n*** dia**n** hInicio**n** hFin**n**

Donde la primera linea contiene un numero ***n*** que representa la cantidad de monitores y las siguientes *n* lineas corresponden a la información de cada monitor, donde se incluye el nombre, el día en el cual realiza el turno, la hora de inicio y hora de finalización del turno.

## Salida ##

Se espera que la salida sea un archivo de texto en cual la primera linea corresponde al número ***c*** de monitores que conforman el comité y las siguientes *c* lineas corresponden a los nombres de los estudiantes que conforman el comité.


# Punto 2 #

Se cuenta con un procesador que puede trabajar 24 horas al día, todos los días. Muchas personas mandan peticiones para correr tareas diarias en el procesador, sin embargo estas peticiones serán atendidas en el día siguiente y deben terminar antes de media noche. Cada tarea llega con un tiempo de inicio y de finalización estrictos. Si la tarea es aceptada para correr en el procesador, esta debe realizarse diariamente de forma continua, en el periodo comprendido entre el principio y el final de la tarea.

Dada una cantidad de tareas diarias ***n***, se deben aceptar la mayor cantidad de tareas de forma que se maximice la cantidad de tareas realizadas en el día. Tenga en cuenta que no se puede realizar más de una tarea al tiempo.

## Ejemplo ##

Considere las siguientes tareas:

tarea1 (18:00 - 21:00)

tarea2 (21:00 - 24:00)

tarea3 (3:00 - 14:00)

tarea4 (13:00 - 19:00)

La solución óptima seria escoger las tareas 1, 2 y 3 para el día siguiente.

## Manera de Resolver ##

1. Resuelva el problema de seleccionar las tareas a realizar en el procesador por medio de un algoritmo ingenuo o exhaustivo.

1. Resuelva el problema de seleccionar las tareas a realizar en el procesador por medio
de un algoritmo más inteligente, en el sentido que no analice exhaustivamente todas las posibles formas en que se podrían organizar las tareas.

1. Teniendo en cuenta que los datos de entrada de los dos problemas pueden seguir las siguientes distribuciones:

* **distribución uniforme:** En cada momento del tiempo existe la misma probabilidad de tener monitores realizando turnos.

* **distribución normal:** Existe un momento en el tiempo en el cual la probabilidad de tener monitores en turno es mas alta que en otros momentos.

1. ¿En todos los casos funciona claramente mejor el algoritmo más inteligente? Sino, ¿En cuáles y por qué?

## Entrada ##

***n***

*nombre**1*** hInicio**1** hFin**1**

...

*nombre**n*** hInicio**n** hFin**n**

Donde la primera linea contiene un numero ***n*** que representa la cantidad de tareas y las siguientes *n* lineas corresponden a la información de cada una de las tareas, donde se incluye el nombre, la hora de inicio y hora de finalización de la tarea.

## Salida ##

Se espera que la salida sea un archivo de texto en cual la primera linea corresponde al número ***c*** de tareas que se van a realizar en el procesador y las siguientes *c* lineas corresponden a los nombres de las tareas a realizar.