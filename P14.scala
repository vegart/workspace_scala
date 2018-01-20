object P14 extends App{

//  (*) Duplicate the elements of a list.
//    Example:
//    scala> duplicate(List('a, 'b, 'c, 'c, 'd))
//  res0: List[Symbol] = List('a, 'a, 'b, 'b, 'c, 'c, 'c, 'c, 'd, 'd)
  def duplicate(lis : List[Symbol]) = {
    (lis.map(x => List(x,x))).flatten
  }

  print(duplicate(List('a, 'b, 'c, 'c, 'd)))
}
