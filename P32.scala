object P32 extends App {

//  (**) Determine the greatest common divisor of two positive integer numbers.
//    Use Euclid's algorithm.
//  scala> gcd(36, 63)
//  res0: Int = 9
//  https://www.khanacademy.org/computing/computer-science/cryptography/modarithmetic/a/the-euclidean-algorithm
  def max(x1:Int, x2: Int): Int = if (x1 > x2) x1 else x2
  def min(x1:Int, x2: Int): Int = if (x1 < x2) x1 else x2

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

  print(gcd(36, 63))
}
