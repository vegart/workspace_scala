object P27 extends App {

//  (**) Group the elements of a set into disjoint subsets.
//  a) In how many ways can a group of 9 people work in 3 disjoint subgroups of 2, 3 and 4 persons?
//  Write a function that generates all the possibilities.
//    Example:
//
//    scala> group3(List("Aldo", "Beat", "Carla", "David", "Evi", "Flip", "Gary", "Hugo", "Ida"))
//  res0: List[List[List[String]]] = List(List(List(Aldo, Beat), List(Carla, David, Evi), List(Flip, Gary, Hugo, Ida)), ...
//  .map(y=>
//    y::lis.filter(!y.toSet.contains(_)).combinations(4).toList)).toList


  def group3(lis: List[String]) = {
    //    :List[List[List[String]]]
    lis.combinations(2).toList.flatMap(x1=>
      lis.filter(!x1.contains(_)).combinations(3).toList.map(y1=>List(x1):::List(y1))).flatMap(x2=>
      lis.filter(!x2.flatten.contains(_)).combinations(4).toList.flatMap(y2=>List(x2:::List(y2))))
  }
  val x = group3(List("Aldo", "Beat", "Carla", "David", "Evi", "Flip", "Gary", "Hugo", "Ida"))

}
