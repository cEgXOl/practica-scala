# Parte 1 — Entornos de trabajo

En esta parte de la práctica se configuran tres entornos para desarrollar y ejecutar Scala 2.12.21.

## Entorno 1 — JupyterLab + Almond

### Entorno 1

#### JupyterLab + Almond Kernel

Para comprobar el funcionamiento del primer entorno de trabajo, se inició JupyterLab correctamente desde Windows. Desde su interfaz se puede acceder a los notebooks y a los distintos kernels instalados.

![JupyterLab ejecutándose](../images/jupyter_pruebas.png)

#### Kernel de Scala con Almond

Se instaló Almond como kernel de Scala para Jupyter. Al crear un nuevo Notebook aparece Scala entre los kernels disponibles, confirmando que Almond se ha instalado correctamente.

![Kernel Almond disponible](../images/jupyter_pruebas.png)

#### Notebook utilizando Scala

Se creó un nuevo Notebook utilizando el kernel de Scala. De esta forma, las celdas del Notebook pueden ejecutar directamente código escrito en Scala.

![Notebook utilizando Scala](../images/jupyter_pruebas.png)

#### Versión de Scala

Desde el Notebook se comprobó la versión instalada de Scala. El resultado confirma que el entorno utiliza la versión requerida para la práctica:

![Versión de Scala](../images/jupyter_pruebas.png)

#### Pruebas de ejecución

Para verificar el correcto funcionamiento del entorno se realizaron tres pruebas sencillas.

  -En la primera prueba se declararon dos variables con el nombre y la versión de Scala y se mostró el resultado mediante `println`.

  -En la segunda prueba se realizó una operación numérica, sumando dos valores y mostrando el resultado obtenido.

  -Finalmente, se creó una colección de tipo `List` con varios lenguajes de programación y se mostró su contenido.

![Primera prueba](../images/jupyter_pruebas.png)

### Entorno 2

#### Comprobación de Java JDK 17

Antes de crear el proyecto Scala se comprobó que Java 17 estaba correctamente instalado en el sistema.

![Comprobación de Java](../images/vscode-java-version.png)

### Visual Studio Code

Se instaló y ejecutó **Visual Studio Code**, que se utilizará como editor para desarrollar el proyecto Scala.

![Visual Studio Code](../images/vscode-inicio.png)

### Instalación de Metals

Desde el apartado de extensiones de Visual Studio Code se instaló **Scala (Metals)**.

Metals proporciona soporte para trabajar con proyectos Scala dentro de Visual Studio Code, incluyendo reconocimiento del proyecto, navegación por el código y herramientas de compilación y ejecución.

![Extensión Metals instalada](../images/vscode-metals.png)

### Comprobación de sbt

Para comprobar que **sbt** estaba correctamente instalado y disponible desde el sistema, se ejecutó:

```bash
sbt --version
```

El comando se ejecutó correctamente, confirmando que sbt está disponible para gestionar y compilar proyectos Scala.

![Comprobación de sbt](../images/vscode-sbt-version.png)

### Estructura del proyecto

Se creó un proyecto llamado `scala-vscode` con la estructura habitual de un proyecto Scala gestionado mediante sbt.

La estructura principal contiene el archivo `build.sbt` y el código fuente dentro de:

```text
src/main/scala/
```

![Estructura del proyecto](../images/vscode-estructura.png)

### Configuración de `build.sbt`

El archivo `build.sbt` contiene la configuración principal del proyecto.

En él se especificó explícitamente la versión de Scala requerida para la práctica:

```scala
scalaVersion := "2.12.21"
```

También se configuró el nombre del proyecto:

```scala
name := "scala-vscode"
```

![Configuración de build.sbt](../images/vscode-build-sbt.png)

Esta configuración garantiza que el proyecto utilice **Scala 2.12.21**.

### Archivo `Main.scala`

Dentro de `src/main/scala/` se creó el archivo `Main.scala`, que contiene el programa principal del proyecto.

El programa muestra varios mensajes por consola para comprobar que el código Scala puede ejecutarse correctamente desde este entorno.

![Archivo Main.scala](../images/vscode-main-scala.png)

### Reconocimiento del proyecto por Metals

Al abrir la carpeta del proyecto desde Visual Studio Code, **Metals detectó el proyecto sbt** y cargó correctamente su configuración.

Esto permite trabajar con el proyecto Scala directamente desde el editor utilizando las funcionalidades proporcionadas por Metals.

![Proyecto reconocido por Metals](../images/vscode-metals-proyecto.png)

### Compilación del proyecto

Para comprobar que el código era válido y que el proyecto estaba correctamente configurado, se ejecutó desde la terminal:

```bash
sbt compile
```

La compilación finalizó correctamente y sin errores.

![Compilación con sbt](../images/vscode-sbt-compile.png)

### Ejecución del proyecto

Finalmente, se ejecutó el programa mediante:

```bash
sbt run
```

La terminal mostró correctamente la salida definida en `Main.scala`, confirmando que el proyecto puede compilarse y ejecutarse utilizando **Scala 2.12.21 y sbt** desde Visual Studio Code.

![Ejecución con sbt](../images/vscode-sbt-run.png)

Con estas comprobaciones queda verificado el correcto funcionamiento del entorno formado por **Visual Studio Code, Metals, JDK 17, sbt y Scala 2.12.21**.


### Entorno 3
IntelliJ IDEA Community + sbt

## Entorno 2 — Visual Studio Code + Metals

Pendiente de documentación.

## Entorno 3 — IntelliJ IDEA Community

Pendiente de documentación.
