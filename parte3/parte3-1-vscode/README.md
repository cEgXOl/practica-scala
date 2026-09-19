## Capturas del proyecto

### Visual Studio Code y proyecto

![Visual Studio Code](images/01-vscode-proyecto.png)

En esta captura se muestra el proyecto abierto en Visual Studio Code. 
Puede observarse además la estructura principal del proyecto.

### Metals instalado

![Metals instalado](images/02-metals.png)

En esta captura se comprueba que la extensión Scala (Metals) está instalada y activa. 

### Estructura del proyecto sbt

![Estructura sbt](images/03-estructura-sbt.png)

En esta captura puede observarse la estructura del proyecto sbt.

### build.sbt

![build.sbt](images/04-build-sbt.png)

En esta captura se muestra que en el archivo build.sbt se configura Scala 2.12.21 y se nombra al proyecto torneo-twenty-one.

### Main.scala

![Main.scala](images/05-main-scala.png)

En esta captura se muestra el archivo Main.scala. En él se definen los jugadores, puntuaciones, funciones utilizadas y la lógica del proyecto para analizar las diferentes rondas del torneo.

### Resultado de sbt compile

![sbt compile](images/06-sbt-compile.png)

En esta captura se ejecuta el comando sbt compile desde la terminal de Visual Studio Code. 
El resultado confirma que el código Scala se compila correctamente y que no existen errores de compilación.

### Resultado de sbt run

![Comparación final](images/07-sbt-tun.png)

En esta captura se ejecuta el comando sbt run desde la terminal de Visual Studio Code.
El resultado muestra el proyecto en funcionamiento.

### Primera ronda

![Primera ronda](images/08-primera-ronda.png)

En esta captura se muestra el análisis de la primera ronda. 
El programa indica para cada jugador su puntuación y si la mano es válida o no, además de calcular las estadísticas generales de la ronda.

### Segunda ronda

![Segunda ronda](images/09-segunda-ronda.png)

Aquí se muestra el procesamiento de la segunda ronda utilizando los mismos jugadores y las mismas funciones del programa, pero con un nuevo conjunto de puntuaciones y utilizando el bucle foreach.
