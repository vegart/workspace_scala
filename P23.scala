object P23 extends App{
//  (**) Extract a given number of randomly selected elements from a list.
//  Example:
//    scala> randomSelect(3, List('a, 'b, 'c, 'd, 'f, 'g, 'h))
//  res0: List[Symbol] = List('e, 'd, 'a)

  def randomSelect(len : Int, lis : List[Symbol])  = {

    def omg(len: Int, sourceList: List[Symbol],update : List[Symbol]):List[Symbol] = {
      if(update.length == len) update
      else{
        val rand = scala.util.Random.nextInt(sourceList.length)
        print("here   : ") ; println((sourceList take rand):::(sourceList drop rand+1))
        omg(len, (sourceList take rand):::(sourceList drop rand+1), (sourceList take rand+1).reverse.head :: update)
      }
    }
    omg(len,lis,List[Symbol]())
  }

  print(randomSelect(8, List('a, 'b, 'c, 'd, 'e, 'f, 'g, 'h)))
}
