object P41 extends App {

//  (**) A list of Goldbach compositions.
//  Given a range of integers by its lower and upper limit, print a list of all even numbers and their Goldbach composition.
//    scala> printGoldbachList(9 to 20)
//  10 = 3 + 7
//  12 = 5 + 7
//  14 = 3 + 11
//  16 = 3 + 13
//  18 = 5 + 13
//  20 = 3 + 17
//  In most cases, if an even number is written as the sum of two prime numbers, one of them is very small. Very rarely, the primes are both bigger than, say, 50. Try to find out how many such cases there are in the range 2..3000.
//
//  Example (minimum value of 50 for the primes):
//
//  scala> printGoldbachListLimited(1 to 2000, 50)
//  992 = 73 + 919
//  1382 = 61 + 1321
//  1856 = 67 + 1789
//  1928 = 61 + 1867


  implicit class factorMethods(val target: Int) {

    def getAllMultipliers(num:Int):List[Int] = {
      if(isPrime(num))
        List(num)
      else
        (2 to num).filter(each=> num % each == 0).toList
    }

    def isPrime(num:Int) = {
      if(num < 2)
        false
      else
        (2 to math.sqrt(num).toInt).map(each=> num % each == 0).filter(_==true).length == 0
    }

    def goldbach2= {
      if(target % 2  == 0)
        (1 to target/2).filter(each => isPrime(each) & isPrime(target- each)).toList.map(each2=>List(each2,(target-each2)))
      else
        List()
    }

    def goldbachWithCondition(num: Int)= {
      if(target % 2  == 0)
        (1 to target/2).filter(each => isPrime(each) & isPrime(target- each) & each > num & (target-each) > num
        ).toList.map(each2=>List(each2,(target-each2)))
      else
        List()
    }
  }

  def printGoldbachList(rng : Range) = {
    rng.map(x1 => x1.goldbach2).filter(_.length > 0).toList
  }

  def printGoldbachListLimited(rng: Range, limit : Int) = {
    rng.map(x1 => x1.goldbachWithCondition(limit)).filter(_.length > 0).toList
  }

  //print(printGoldbachList(9 to 20))
  print( printGoldbachListLimited(1 to 2000, 50))
}
