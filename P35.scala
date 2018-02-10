import P34.primeMethods
import P33.gcd
import P31._

object P35 extends App {
//  (**) Determine the prime factors of a given positive integer.
//  Construct a flat list containing the prime factors in ascending order.
//    scala> 315.primeFactors
//  res0: List[Int] = List(3, 3, 5, 7)


  implicit class factorMethods(val target: Int) {

    def getMultipliers(num:Int):List[Int] = {
      (2 to math.sqrt(num).toInt).filter(each=> num % each == 0).toList
    }

    def isPrime(num:Int) = {
      if(num < 2)
        false
      else
      (2 to math.sqrt(num).toInt).map(each=> num % each == 0).filter(_==true).length == 0
    }

    def repNum(x1: Int, divider: Int, finish : Int):Int = {

      if(x1 % divider != 0)
        finish
      else
        repNum(x1/divider,divider,finish+1)
    }

    def primeFactors= {
      val primeMultipliers = getMultipliers(target).filter(isPrime(_))
      val Quot             = target / primeMultipliers.reduceLeft(_*_)

      val grouped = primeMultipliers.map(each=> List.fill(repNum(Quot,each,1))(each)).flatten
      grouped

    }
  }

  print(315.primeFactors)

}
