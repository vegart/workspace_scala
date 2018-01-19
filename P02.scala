object P02 extends App {

  /*
  P02 (*) Find the last but one element of a list.
  Example:
  scala> penultimate(List(1, 1, 2, 3, 5, 8))
  res0: Int = 5
   */
  def penultimate(lis:List[Any]) : Any = lis  match {
    case Nil => Nil
    case x::xs   =>
      xs match {
        case Nil => x
        case y::ys =>
          if(ys == Nil) x
          else penultimate(y::ys)
      }
  }

  print(penultimate(List(1,2,3,4,5)))

}
