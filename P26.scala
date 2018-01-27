object P26 extends App {

//  (**) Generate the combinations of K distinct objects chosen from the N elements of a list.
//  In how many ways can a committee of 3 be chosen from a group of 12 people? We all know that there are C(12,3) = 220 possibilities (C(N,K)
//  denotes the well-known binomial coefficient).
//  For pure mathematicians, this result may be great. But we want to really generate all the possibilities.

//  Example:
//  scala> combinations(3, List('a, 'b, 'c, 'd, 'e, 'f))
//  res0: List[List[Symbol]] = List(List('a, 'b, 'c), List('a, 'b, 'd), List('a, 'b, 'e), ...

  def combinations(take : Int, lis: List[Symbol])  = {

    def hcombination(len: Int,mlis : List[Symbol],update:List[List[Symbol]]):List[List[Symbol]] = {
      if(len == update.head.length) update
      else
        hcombination(len,mlis,mlis.flatMap(x=>update.map(y=>x::y)))
    }
    val z = hcombination(take,lis,lis.map(x=>List(x))).
      map(z=>z.distinct).
      filter(_.length == take).
      map(x=>x.toSet).toSet.toList
    z.map(x=>x.toList)
}
  val x = combinations(3, List('a, 'b, 'c, 'd, 'e, 'f))
  println(x.length)
  println(x)
}
