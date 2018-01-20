object P15 extends App {
//  (**) Duplicate the elements of a list a given number of times.
//  Example:
//    scala> duplicateN(3, List('a, 'b, 'c, 'c, 'd))
//  res0: List[Symbol] = List('a, 'a, 'a, 'b, 'b, 'b, 'c, 'c, 'c, 'c, 'c, 'c, 'd, 'd, 'd)

  def duplicateN(dup: Int,lis : List[Symbol]) = {

    lis.map(x=> List.fill(dup)(x)).flatten

  }


  print(duplicateN(3, List('a, 'b, 'c, 'c, 'd)))
}
