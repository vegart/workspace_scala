object P04 extends App{
//  P04 (*) Find the number of elements of a list.
//    Example:
//    scala> length(List(1, 1, 2, 3, 5, 8))
//  res0: Int = 6

  def length(lis : List[Any]) : Int = lis match {
    case Nil => 0
    case x::xs =>
      xs match {
        case Nil => 1
        case _ => 1 + length(xs)
      }
  }

  print(length(List(1,2,3,4,5,6,7,2,2)))

}
