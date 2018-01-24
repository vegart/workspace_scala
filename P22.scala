object P22 extends App {
//  (*) Create a list containing all integers within a given range.
//    Example:
//    scala> range(4, 9)
//  res0: List[Int] = List(4, 5, 6, 7, 8, 9)

  def range(start : Int, end : Int) : List[Int] = {

    def countup(lis : List[Int],len: Int): List[Int] =   {
      if(len == lis.length) lis
      else countup( ((lis.reverse.head+1)::lis.reverse).reverse ,len)
    }
    countup(List(start),end-start+1)
  }

  print(range(4, 20))
}
