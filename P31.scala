

object P31  extends  App{
//  (**) Determine whether a given integer number is prime.
//    scala> 7.isPrime
//  res0: Boolean = true
  implicit class intMethods(val target: Int)  {
    def isPrime = {
      if(target < 2)
        false
      else
        (2 to math.sqrt(target).toInt).map(each=> target % each == 0).filter(_==true).length == 0
    }
  }

  print(7.isPrime)
}
