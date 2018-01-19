object P03 extends App{

  /*
  P03 (*) Find the Kth element of a list.
  By convention, the first element in the list is element 0.
  Example:
  scala> nth(2, List(1, 1, 2, 3, 5, 8))
  res0: Int = 2
  */

  def nth(pos: Int,lis: List[Any]): Any = pos match {
      case -1 => throw new Exception("INDEX NOT ALLOWED EXCEPTION")
      case _  => lis match {
        case Nil => Nil
        case _ =>
          if(pos > 0 && pos < lis.length) (lis take (pos+1)).reverse.head
          else nth(-1,Nil)
      }
  }

  print(nth(2, List(1, 1, 2, 3, 5, 8)))

}
