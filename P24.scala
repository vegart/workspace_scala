object P24 extends App{
//  (*) Lotto: Draw N different random numbers from the set 1..M.
//    Example:
//    scala> lotto(6, 49)
//  res0: List[Int] = List(23, 1, 17, 33, 21, 37)

  def lotto(take: Int, seq: Int) : List[Int] = {

    def omg(len: Int, sourceList: List[Int],update : List[Int]):List[Int] = {
      if(update.length == len) update
      else{
        val rand = scala.util.Random.nextInt(sourceList.length)
        omg(len, (sourceList take rand):::(sourceList drop rand+1), (sourceList take rand+1).reverse.head :: update)
      }
    }
    omg(take,(1 to seq).toList,List[Int]())
  }

  print(lotto(6, 49))
}

