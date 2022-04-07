class Ifelse
{
   def vote (x: Int) : String =
  {
    var t :String ="Eligble"
    var f :String ="Not-Eligble"
    if(x<18)
      {
        return f
      }
    else
      {
        return t
      }
  }

}

object Ifelse
{
  def main(args: Array[String]): Unit =
  {
    var f = new Ifelse()
    var s=f.vote(24)
    println(s)
  }

}

