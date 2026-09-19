object Main extends App {
  val estudiantes = List(
    "Ana",
    "Luis",
    "Marta",
    "Pedro",
    "Sofia"
  )

  val notas = Array(
    8,
    4,
    10,
    6,
    3
  )

  def aprobado(nota: Int): Boolean = {
    if(nota >= 5){
       true
    } else{
        false
    }
  }

  def estadoNota(estado: Boolean): String = {
    if(estado){
      "APROBADO"
    } else{
      "SUSPENSO"
    }
  }

  def maxNota(a: Int, b: Int): Int = {
    if(a > b){
      a
    } else {
      b
    }
  }

  var i = 0
  var nEstudiantes = 0
  var nAprobados = 0
  var nSuspensos = 0
  var notasAlta = 0

  while(i < estudiantes.length){
    println(s"${estudiantes(i)} -> ${notas(i)} -> ${estadoNota(aprobado(notas(i)))}")
    nEstudiantes = nEstudiantes + 1
    if(aprobado(notas(i))){
      nAprobados = nAprobados + 1
      if(notas(i) > notasAlta){
        notasAlta = notas(i)
      }
    } else{
      nSuspensos = nSuspensos + 1
    }
    i = i + 1
  }
  i = 0

  println("--- Resumen del grupo ---")
  println("Estudiantes: " + nEstudiantes)
  println("Aprobados: " + nAprobados)
  println("Suspensos: " + nSuspensos)
  println("Mejor nota: " + notasAlta)

  def clasificacion(nota: Int): String = {
    if(nota >= 9){
      "EXCELENTE"
    }else if(nota >= 7){
      "NOTABLE"
    }else if(nota >= 5){
      "APROBADO"
    }else{
      "SUSPENSO"
    }
  }


  while(i < estudiantes.length){

    println(s"${estudiantes(i)} -> ${notas(i)} -> ${clasificacion(notas(i))}")
    i = i + 1
  }
  i = 0
  val notasSegundaEvaluacion = Array(
    9,
    5,
    8,
    7,
    6
  )

  var notasAlta2 = 0
  var nAprobados2 = 0

  while(i < estudiantes.length){

    println(s"${estudiantes(i)} -> ${notasSegundaEvaluacion(i)} -> ${clasificacion(notasSegundaEvaluacion(i))}")

    if(aprobado(notasSegundaEvaluacion(i))) {
      nAprobados2 = nAprobados2 + 1
      if (notasSegundaEvaluacion(i) > notasAlta2) {
        notasAlta2 = notasSegundaEvaluacion(i)
      }
    }
    i = i + 1
  }

  println("--- Comparación Evaluaciones ---")
  println("Mejor nota de la primera evaluación: " + notasAlta)
  println("Mejor nota de la segunda evaluación: " + notasAlta2)
  println("Número de aprobados de la primera: " + nAprobados)
  println("Número de aprobados de la segunda: " + nAprobados2)

  if(nAprobados < nAprobados2){
    println("El grupo ha mejorado")
  }else if(nAprobados > nAprobados2){
    println("El grupo ha empeorado")
  }else{
    println("El grupo se mantuvo igual")
  }

  val nuevosEstudiantes = "Carlos" :: estudiantes

  println("Lista original: " + estudiantes)
  println("Lista nueva: " + nuevosEstudiantes)
}

