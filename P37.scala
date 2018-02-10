

object P37 extends App {

//  (**) Calculate Euler's totient function phi(m) (improved).
//    See problem P34 for the definition of Euler's totient function. If the list of the prime factors of a number m is known in the form of problem P36 then the function phi(m>) can be efficiently calculated as follows: Let [[p1, m1], [p2, m2], [p3, m3], ...] be the list of prime factors (and their multiplicities) of a given number m. Then phi(m) can be calculated with the following formula:
//    phi(m) = (p1-1)*p1(m1-1) * (p2-1)*p2(m2-1) * (p3-1)*p3(m3-1) * ...
//
//  Note that ab stands for the bth power of a.

  implicit class factorMethods(val target: Int) {

    def getMultipliers(num:Int):List[Int] = {

      if(isPrime(num))
        List(num)
      else
      (2 to math.sqrt(num).toInt).filter(each=> num % each == 0).toList
    }

    def isPrime(num:Int) = {
      if(num < 2)
        false
      else
        (2 to math.sqrt(num).toInt).map(each=> num % each == 0).filter(_==true).length == 0
    }

    def repNum(x1: Int, divider: Int, finish : Int):Int = {

      if(x1 % divider != 0 )
        finish
      else
        repNum(x1/divider,divider,finish+1)
    }

    def phi= {
      val primeMultipliers = getMultipliers(target).filter(isPrime(_))
      val Quot             = target / primeMultipliers.reduceLeft(_*_)

      val grouped = primeMultipliers.map(each=> (each-1)*scala.math.pow(each,repNum(Quot,each,1)-1).toInt)
      grouped.reduceLeft(_*_)
    }
  }
  print(10090.phi)

}
