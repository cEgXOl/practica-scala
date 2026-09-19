object Main extends App {
  val jugadores = List(
    "Alex",
    "Chen",
    "Marta",
    "Sindhu",
    "Luis"
  )

  val puntuaciones = Array(
    18, 24, 21, 20, 26
  )

  def bust(puntuacion: Int): Boolean = {
    puntuacion > 21
  }

  def estadoMano(puntuacion: Int): String = {
    if (bust(puntuacion)) {
      "VALIDA"
    } else {
      "BUST"
    }
  }

  def mejorMano(handA: Int, handB: Int): Int = {
    if (bust(handA) && bust(handB)) {
      0
    } else if (bust(handA)) {
      handB
    } else if (bust(handB)) {
      handA
    } else {
      if (handA > handB) {
        handA
      } else {
        handB
      }
    }
  }

  var i = 0
  var statsV = 0
  var bustM = 0
  var bestM = 0

  while (i < puntuaciones.length) {
    println(
      s"${jugadores(i)} -> ${puntuaciones(i)} -> ${estadoMano(puntuaciones(i))}"
    )

    if (bust(puntuaciones(i))) {
      bustM = bustM + 1
    } else {
      statsV = statsV + 1

      if (puntuaciones(i) > bestM) {
        bestM = puntuaciones(i)
      }
    }

    i = i + 1
  }

  println("--- Resumen de la ronda ---")
  println(s"Jugadores: $i")
  println(s"Manos válidas: $statsV")
  println(s"Bust: $bustM")
  println(s"Mejor puntuación válida: $bestM")

  i = 0
  var statsV2 = 0
  var bustM2 = 0
  var bestM2 = 0

  val puntuacionesRonda2 = Array(
    22, 19, 20, 21, 17
  )

  while (i < puntuacionesRonda2.length) {
    println(
      s"${jugadores(i)} -> ${puntuacionesRonda2(i)} -> ${estadoMano(puntuacionesRonda2(i))}"
    )

    if (bust(puntuacionesRonda2(i))) {
      bustM2 = bustM2 + 1
    } else {
      statsV2 = statsV2 + 1

      if (puntuacionesRonda2(i) > bestM2) {
        bestM2 = puntuacionesRonda2(i)
      }
    }

    i = i + 1
  }

  println("--- Resumen de la ronda 2 ---")
  println(s"Jugadores: $i")
  println(s"Manos válidas: $statsV2")
  println(s"Bust: $bustM2")
  println(s"Mejor puntuación válida: $bestM2")

  println("Comparación rondas")
  println(s"Mejor puntuación de la primera ronda: $bestM")
  println(s"Mejor puntuación de la segunda ronda: $bestM2")

  if (bestM > bestM2) {
    println("La primera ronda tuvo la mejor puntuación.")
  } else if (bestM2 > bestM) {
    println("La segunda ronda tuvo la mejor puntuación.")
  } else {
    println("Ambas rondas tuvieron la misma mejor puntuación.")
  }

  println("--- Segunda ronda con foreach ---")

  puntuacionesRonda2.foreach { puntuacion =>
    println(s"$puntuacion -> ${estadoMano(puntuacion)}")
  }

}
