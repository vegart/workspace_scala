object P39  extends App{
//  (*) A list of prime numbers.
//  Given a range of integers by its lower and upper limit, construct a list of all prime numbers in that range.
//  scala> listPrimesinRange(7 to 31)
//  res0: List[Int] = List(7, 11, 13, 17, 19, 23, 29, 31)

  def isPrime(num:Int) = {
    if(num < 2)
      false
    else
      (2 to math.sqrt(num).toInt).map(each=> num % each == 0).filter(_==true).length == 0
  }

  def listPrimesinRange(rng : Range):List[Int] = {

    rng.toList.filter(each=>isPrime(each))
  }

  print(listPrimesinRange(7 to 31))
}
