object array
{

    def main (args: Array[String]): Unit =
    {
      //var i=scala.io.StdIn.readInt()
      var arr = Array(2,4,6,8,10,12)
      for(x <- arr)
      {
        println(x)
      }
      var sum =0
      for(x <- 0 to arr.length-1)
      {
        sum += arr(x)
      }
      println(sum)
    }
}
