package Demo

object ObjectOrientation extends App{
    //class and instance
    class Animal {
      //define fields
      val age: Int = 0
      def eat() = println("I'm eating")
    }

    val anAnimal = new Animal

    class Dog extends Animal {

    }

}
