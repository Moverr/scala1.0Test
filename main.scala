object  HelloWorld {
  def main(args: Array[String]): Unit = {
    println("Test Me Mover : "+addInt(1,2))
  }

 def addInt(a:Int, b:Int) : Int = {
   var sum:Int = 0;
   sum = a + b;
   return sum
 }
}
