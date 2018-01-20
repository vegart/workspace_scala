object P05 extends App {

//  P05 (*) Reverse a list.
//  Example:
//    scala> reverse(List(1, 1, 2, 3, 5, 8))
//  res0: List[Int] = List(8, 5, 3, 2, 1, 1)
  def reverse(lis : List[Any]) : List[Any] = lis match {
    case Nil => Nil
    case _   => lis.reverse.head :: reverse(lis.head :: lis.tail take (lis.length -1) )
  }

  print(reverse(List(1, 1, 2, 3, 5, 8)))

}
