object P21 extends App{

//  (*) Insert an element at a given position into a list.
//    Example:
//    scala> insertAt('new, 1, List('a, 'b, 'c, 'd))
//  res0: List[Symbol] = List('a, 'new, 'b, 'c, 'd)

  def insertAt(sym: Symbol, ind: Int, lis: List[Symbol]) = {
    (lis take ind) ::: List(sym) ::: (lis drop ind)
  }

  print(insertAt('new, 1, List('a, 'b, 'c, 'd)))
}
