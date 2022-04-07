object Factorial
{
   def main (args: Array[String]): Unit =
  {
    var i=scala.io.StdIn.readInt()
    fact(i)

  }

  def fact(x : BigInt): Unit =
  {
    var y :BigInt =1
    var k =x
    while(k>0)
      {
        if(x==1)
          {
            print(x)
          }
        else
          {
            y*=k

          }
          k-=1


      }
      print(y)
  }

}
