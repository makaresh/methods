import NewthonMethod.*

object Launcher extends App {
  @main def run(start: Double, eps:Double, a: Double, b: Double): Unit = {
    println(s"Newthon method with start point $start")
    NewthonMethod.method(start, TestFunction.function, TestFunction.functiond1, eps)
    println(s"Middle point method with bounds [$a; $b]")
    MiddlePointMethod.method(a, b, TestFunction.function2, TestFunction.function2d1, eps)
  }
}
