import P32.{max, min}

object P33 extends App {

//  (*) Determine whether two positive integer numbers are coprime.
//    Two numbers are coprime if their greatest common divisor equals 1.
//  scala> 35.isCoprimeTo(64)
//  res0: Boolean = true
def gcd(x1:Int, x2:Int): Int = {
    if(x1 == 0 | x2 == 0)
      if(x1 == 0) x2
      else if(x2 == 0) x1
      else 0
    else {
      val great = max(x1,x2)
      val small = min(x1,x2)
      gcd(small,great%small)
    }
  }

  implicit class primeMethods(val target: Int)  {
    def isCoprimeTo(num : Int) = {
      gcd(num,target) == 1
    }
  }
  print(35.isCoprimeTo(64))
}
