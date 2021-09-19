object TestFunction {
  def function(x: Double): Double = (x * x * x) - (3 * x) + 1

  def functiond1(x: Double): Double = 3 * x * x - 3

  def function2(x: Double): Double = Math.pow(x, 4) + Math.pow(Math.E, -x)

  def function2d1(x: Double): Double = 4 * Math.pow(x, 3) - Math.pow(Math.E, -x)
}
