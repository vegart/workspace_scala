import scala.collection.mutable

/*
P08 (**) Eliminate consecutive duplicates of list elements.
  If a list contains repeated elements they should be replaced with a single copy of the element. The order of the elements should not be changed.
  Example:

  scala> compress(List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e))
res0: List[Symbol] = List('a, 'b, 'c, 'a, 'd, 'e)
*/

object P09 extends App{

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

  def pack(lis : List[Any]) : List[Any]  = {
    var retLis = List[Any]();
    var tempLis = List[Any]();
    val compressed = compress(lis);

    for(matcher <- compressed){
      for(elem <- lis){
        if(elem == matcher)  tempLis = elem :: tempLis;
      }
      retLis = retLis ::: List(tempLis)
      tempLis = Nil
    }
    retLis
  }




print(  pack(List('a','a','b','c','d','d','d','e','f','g','g','h','h','h','i')))

}