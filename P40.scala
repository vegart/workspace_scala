object P40 extends App{

//  (**) Goldbach's conjecture.
//  Goldbach's conjecture says that every positive even number greater than 2 is the sum of two prime numbers.
//    E.g. 28 = 5 + 23. It is one of the most famous facts in number theory that has not been proved to be correct in the general case.
//  It has been numerically confirmed up to very large numbers (much larger than Scala's Int can represent).
//    Write a function to find the two prime numbers that sum up to a given even integer.
//  scala> 28.goldbach
//  res0: (Int, Int) = (5,23)

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


    def goldbach= {

      if(target % 2  != 0)
        throw new Exception("2의배수 입력해라")

      (1 to target/2).filter(each => isPrime(each) & isPrime(target- each)).toList.map(each2=>List(each2,(target-each2)))
    }
  }

  print(28.goldbach)
}
