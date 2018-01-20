object P20 extends App {
//  (*) Remove the Kth element from a list.
//  Return the list and the removed element in a Tuple. Elements are numbered from 0.
//  Example:
//
//    scala> removeAt(1, List('a, 'b, 'c, 'd))
//  res0: (List[Symbol], Symbol) = (List('a, 'c, 'd),'b)

  def removeAt(ind : Int, lis : List[Symbol]) = {

    val removed = ((lis drop ind).head)
    (lis filter(_ != removed)) -> removed
  }


  print(removeAt(1, List('a, 'b, 'c, 'd)))
}
