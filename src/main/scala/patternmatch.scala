object patternmatch
{

    def main(args: Array[String]): Unit = {

      val b = scala.io.StdIn.readInt()
       b match{
         case 1 => println("One")
         case 2 => println("Two")
         case _ => println("No")
           }
      val a= scala.io.StdIn.readLine()
      a match {
        case "makhan" => print("one")
        case "Hello"=>print("two")
        case _ => print("none ")
      }
    }
}
