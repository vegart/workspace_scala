import P09.pack

object P10 extends App{

//  (*) Run-length encoding of a list.
//    Use the result of problem P09 to implement the so-called run-length encoding data compression method. Consecutive duplicates of elements are encoded as tuples (N, E) where N is the number of duplicates of the element E.
//  Example:
//
//    pack example => List(List(a, a), List(b), List(c), List(d, d, d), List(e), List(f), List(g, g), List(h, h, h), List(i))
//  scala> encode(List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e))
//  res0: List[(Int, Symbol)] = List((4,'a), (1,'b), (2,'c), (2,'a), (1,'d), (4,'e))
  def encode(lis : List[Any]) = {
    pack(lis).map(x=> (x.length-> x.head))
  }

  print(encode(List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e)))
}
