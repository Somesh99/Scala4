import scala.collection.immutable.HashSet
object Scala_Collection_Set {
  def main(args: Array[String]): Unit = {
    val name = Set("kapil","somesh","rohit","mohit")
    val rollnumber = Set("101","102","103","104","105")
    var setIntersection = name.intersect(rollnumber)
//    println("Intersection by using intersect method: "+setIntersection)

//    println("Intersection by using & operator: "+(name & rollnumber))
      var setUnion = name.union(rollnumber)
      println(setUnion)
    val mergeSet = name ++ rollnumber //merging two set
    println("After merging :"+mergeSet)  //1 method to print
    println(s"After merging :$mergeSet")  //2 method to print
    println("Elements in the name "+name.size)
    println("Elements in the Rollno "+rollnumber.size)
  // set is mutable and immutable both

  }
}
