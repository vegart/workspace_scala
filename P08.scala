/*
P08 (**) Eliminate consecutive duplicates of list elements.
  If a list contains repeated elements they should be replaced with a single copy of the element. The order of the elements should not be changed.
  Example:

  scala> compress(List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e))
res0: List[Symbol] = List('a, 'b, 'c, 'a, 'd, 'e)
*/

object P08 extends App{

  def compress(lis : List[Any]) : List[Any]  = {

    var retLis  = List[Any]();

    for(elem <- lis){
      if(retLis.isEmpty) retLis = (elem :: retLis)
      else
      if (retLis.head == elem){}
      else retLis = elem :: retLis
    }
    retLis.reverse
  }

  print(compress(List('a','b','c','d','d','e','f','g','g')))

}