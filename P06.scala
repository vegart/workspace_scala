object P06 extends App{

//  (*) Find out whether a list is a palindrome.
//    Example:
//    scala> isPalindrome(List(1, 2, 3, 2, 1))
//  res0: Boolean = true

  def isPalindrome(lis : List[Any]) : Boolean = {
    (lis.reverse == lis )
  }

  print(isPalindrome(List(1, 2, 3, 2, 1)))
}
