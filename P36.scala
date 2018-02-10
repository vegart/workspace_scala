
object P36 extends App {

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
      println("x1 = " + x1 + " , divider = " + divider + ", finish = " + finish)
      if(x1 % divider != 0)
        finish
      else
        repNum(x1/divider,divider,finish+1)
    }

    def primeFactorMultiplicity= {
      val primeMultipliers = getMultipliers(target).filter(isPrime(_))
      val Quot             = target / primeMultipliers.reduceLeft(_*_)

      val grouped = primeMultipliers.map(each=> (each,repNum(Quot,each,1)))
      grouped
    }
  }

  print(5.primeFactorMultiplicity)
}
