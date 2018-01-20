object P16 extends App {
//  (**) Drop every Nth element from a list.
  //  Example:
  //    scala> drop(3, List('a, 'b, 'c, 'd, 'e, 'f, 'g, 'h, 'i, 'j, 'k))
  //  res0: List[Symbol] = List('a, 'b, 'd, 'e, 'g, 'h, 'j, 'k)

  def drop(ind : Int, lis : List[Symbol] ) = {
    lis.map(x=> if((lis.indexOf(x)+1) %(ind) == 0){} else x).filter(_ != ())
  }

  print(drop(3, List('a, 'b, 'c, 'd, 'e, 'f, 'g, 'h, 'i, 'j, 'k)))
}
