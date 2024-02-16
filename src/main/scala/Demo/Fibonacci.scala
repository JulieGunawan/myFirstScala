package Demo

object Fibonacci {

  def fibonacci(n:Int): Int = {
    if(n <=1){
      n
    } else {
      fibonacci(n-1) + fibonacci(n-2)
    }
  }

  def main(args: Array[String]): Unit = {
    for (i<- 0 until 5)
      println(fibonacci(i))
  }
}
