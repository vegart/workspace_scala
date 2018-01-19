object P01 extends App {
/*
  P01 (*) Find the last element of a list.
  Example:
    scala> last(List(1, 1, 2, 3, 5, 8))
  res0: Int = 8
*/
  def last(lis:List[Any]) : Any = lis  match {
      case Nil => Nil
      case x::xs   =>
       if(xs == Nil) x
       else last(xs)
  }

  print(last(List()))
}
