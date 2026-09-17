# Práctica de programación básica con Scala

## Autor

Nombre y apellidos: César Camacho Castillo

## Entorno

-Sistema operativo: Windows 10
-Scala: 2.12.21
-Java: JDK 17

## Parte 1 — Entornos de trabajo

### Entorno 1

#### JupyterLab + Almond Kernel

Para comprobar el funcionamiento del primer entorno de trabajo, se inició JupyterLab correctamente desde Windows. Desde su interfaz se puede acceder a los notebooks y a los distintos kernels instalados.

![JupyterLab ejecutándose](images/jupyter_inicio.png)

#### Kernel de Scala con Almond

Se instaló Almond como kernel de Scala para Jupyter. Al crear un nuevo Notebook aparece Scala entre los kernels disponibles, confirmando que Almond se ha instalado correctamente.

![Kernel Almond disponible](images/jupyter_almond.png)

#### Notebook utilizando Scala

Se creó un nuevo Notebook utilizando el kernel de Scala. De esta forma, las celdas del Notebook pueden ejecutar directamente código escrito en Scala.

![Notebook utilizando Scala](images/jupyter_scalaVersion.png)

#### Versión de Scala

Desde el Notebook se comprobó la versión instalada de Scala. El resultado confirma que el entorno utiliza la versión requerida para la práctica:

![Versión de Scala](images/jupyter_scalaVersion.png)

#### Pruebas de ejecución

Para verificar el correcto funcionamiento del entorno se realizaron tres pruebas sencillas.

  -En la primera prueba se declararon dos variables con el nombre y la versión de Scala y se mostró el resultado mediante `println`.

  -En la segunda prueba se realizó una operación numérica, sumando dos valores y mostrando el resultado obtenido.

  -Finalmente, se creó una colección de tipo `List` con varios lenguajes de programación y se mostró su contenido.

![Primera prueba](images/jupyter_pruebas.png)

[Ver documentación](parte1/README.md)

### Entorno 2
Visual Studio Code + Metals + sbt

### Entorno 3
IntelliJ IDEA Community + sbt

## Parte 2 — Programación con Scala

[Ver Parte 2](parte2/README.md)
