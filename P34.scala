import P33.gcd

object P34 extends App {

//  (**) Calculate Euler's totient function phi(m).
//    Euler's so-called totient function phi(m) is defined as the number of positive integers r (1 <= r <= m) that are coprime to m.
//  scala> 10.totient
//  res0: Int = 4

  implicit class primeMethods(val target: Int)  {

    def isCoprimeTo(num : Int) = {
      gcd(num,target) == 1
    }

    def totient = {
      (1 to target).map(each=> each.isCoprimeTo(target)).filter(_==true).length
    }

    def allTotient = {
      (1 to target).map(each=> each.isCoprimeTo(target)).filter(_==true)
    }

  }
  //print(gcd(100,99))
  print(5.totient)
}
