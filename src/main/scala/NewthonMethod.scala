import org.graalvm.compiler.hotspot.nodes.`type`.MethodPointerStamp.method

import scala.annotation.tailrec

object NewthonMethod {

  @tailrec
  def method(start: Double, fx: Double => Double, dfdx: Double => Double, eps: Double): Double = {
    val xn = start - fx(start) / dfdx(start)
    println(xn)
    if (Math.abs(xn - start) > eps)
      method(xn, fx, dfdx, eps)
    else
      xn
  }
}
