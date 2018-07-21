import P49.appendToList

object P49 extends App{
/*
  (**) Gray code.
    An n-bit Gray code is a sequence of n-bit strings constructed according to certain rules. For example,
  n = 1: C(1) = ("0", "1").
    n = 2: C(2) = ("00", "01", "11", "10").
    n = 3: C(3) = ("000", "001", "011", "010", "110", "111", "101", "100").
    Find out the construction rules and write a function to generate Gray codes.

    scala> gray(3)
  res0 List[String] = List(000, 001, 011, 010, 110, 111, 101, 100)
  See if you can use memoization to make the function more efficient.
*/

  def appendToList(target:List[String], until_ : Int):List[String] = {

    if(until_ == 0){
      target
    }
    else{
      val string_0 = "0";
      val string_1 = "1";

      val retList = target.flatMap(each => List(string_0 + each, each + string_0, string_1 + each, each + string_1)).distinct

      appendToList(retList,until_ -1)
    }
  }
  def gray(gray_size :Int):List[String] =  {

    if(gray_size < 1)
      List()
    else if(gray_size ==1)
      List("0","1")
    else
      appendToList(List("0","1"),gray_size)
  }

  print(gray(5))


}
