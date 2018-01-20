import P09.pack

object P11 extends App{

//  (*) Modified run-length encoding.
//  Modify the result of problem P10 in such a way that if an element has no duplicates it is simply copied into the result list. Only elements with duplicates are transferred as (N, E) terms.
//  Example:
//
//    scala> encodeModified(List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e))
//  res0: List[Any] = List((4,'a), 'b, (2,'c), (2,'a), 'd, (4,'e))

  def encodeModified(lis: List[Any]) = {
    pack(lis).map(x=>
      x match {
        case Nil => Nil
        case y::ys => if(ys.isEmpty) y else (x.length-> x.head)
      }
    )
  }

  print(encodeModified(List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e)))
}
