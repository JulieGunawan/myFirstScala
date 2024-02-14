package Demo

object Demo {
    def main(args: Array[String]): Unit = {
      val name="mark";
      val age = 18;
      println("Hello World! "+ name + " who is " + age + " years old ");
      println(s"$name is $age years old");
      //to use type interpolation
      println(f"$name%s is $age%d years old")
    }



}
