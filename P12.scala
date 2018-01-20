import P10.encode
object P12 extends App {

//  (**) Decode a run-length encoded list.
//    Given a run-length code list generated as specified in problem P10, construct its uncompressed version.
//  Example:
//
//    scala> decode(List((4, 'a), (1, 'b), (2, 'c), (2, 'a), (1, 'd), (4, 'e)))
//  res0: List[Symbol] = List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e)
  def decode(lis : List[Tuple2[Int,Symbol]]) = {
    var ret = List[Symbol]()
    for(targets <- lis){
      val (count,target) = targets
      println(List.fill(count)(target))
      ret =   List.fill(count)(target) ::: ret
    }
    ret.reverse
}

  print(decode(List((4, 'a), (1, 'b), (2, 'c), (2, 'a), (1, 'd), (4, 'e))))
}
