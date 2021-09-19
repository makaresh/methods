import scala.annotation.tailrec

object MiddlePointMethod {
  @tailrec
  def method(a: Double, b: Double, fx: Double => Double, dfdx: Double => Double, eps: Double): Double = {
    val x = (a + b) / 2
    println(x)
    if (Math.abs(dfdx(x)) > eps)
      if (dfdx(x) > 0)
        method(a, x, fx, dfdx, eps)
      else
        method(x, b, fx, dfdx, eps)
    else
      x
  }
}
