object named extends App {
  def speed(
      distance: Float,
      time: Float,
      units: String = "km/h"
  ): (Float, String) =
    (distance / time, units)
  println(speed(time = 10, distance = 100, units = "mph"))
}
