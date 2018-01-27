object P25 extends App {

//  (*) Generate a random permutation of the elements of a list.
//    Hint: Use the solution of problem P23.
//  Example:
//
//    scala> randomPermute(List('a, 'b, 'c, 'd, 'e, 'f))
//  res0: List[Symbol] = List('b, 'a, 'd, 'c, 'e, 'f)
  def randomPermute(lis: List[Symbol]):List[Symbol] = {

  def omg(len: Int, sourceList: List[Symbol],update : List[Symbol]):List[Symbol] = {
    if(update.length == len) update
    else{
      val rand = scala.util.Random.nextInt(sourceList.length)
      omg(len, (sourceList take rand):::(sourceList drop rand+1), (sourceList take rand+1).reverse.head :: update)
    }
  }
  omg(lis.length,lis,List[Symbol]())
}

  print(randomPermute(List('a, 'b, 'c, 'd, 'e, 'f)))
}
