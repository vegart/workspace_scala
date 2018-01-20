object P13  extends App{

//  (**) Run-length encoding of a list (direct solution).
//    Implement the so-called run-length encoding data compression method directly. I.e. don't use other methods you've written (like P09's pack); do all the work directly.
//  Example:
//
//    scala> encodeDirect(List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e))
//  res0: List[(Int, Symbol)] = List((4,'a), (1,'b), (2,'c), (2,'a), (1,'d), (4,'e))

  def encodeDirect(lis : List[Symbol]) = {
    var retList = List[Tuple2[Int,Symbol]]()

    for(x <- lis) {
      if (retList == Nil) retList = (1 -> x) :: retList
      else {
        val (count,target) = retList.reverse.head
        if(target == x){
          retList = ((count+1,target) :: retList.reverse.tail).reverse
        }
        else{
          retList = ((1->x)::retList.reverse).reverse
        }
      }
    }
    retList
  }

  print(encodeDirect(List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e)))
}
