class Test {

  def add(x: Int, y: Int): Int = {
    var sum: Int = x + y
    //println("sum is" +sum)
    return sum

  }
}
object Demo1
{
  def main (args : Array [String]): Unit =
  {

    val p = new Test()
    val c=p.add(10,20)
    println("sum is"+c)
  }
}