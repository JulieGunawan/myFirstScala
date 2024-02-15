package Demo

object Demo {
    def main(args: Array[String]): Unit = {
      var x = 0;
      var y = 0;
      while (x<10){
        println("x= "+x);
        x+=1;
        //x++; this is not allowed in scala
      }

      do {
        println("y= " + y);
        y +=1;
      } while (y<10);
    }
}
