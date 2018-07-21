object P46 extends App {

//  (**) Truth tables for logical expressions.
//  Define functions and, or, nand, nor, xor, impl, and equ (for logical equivalence) which return true or false according to the result of their respective operations; e.g. and(A, B) is true if and only if both A and B are true.
//  scala> and(true, true)
//  res0: Boolean = true

  def or(bool1: Boolean,bool2: Boolean):Boolean = {
      List(bool1,bool2).filter(_ == true).length > 0
  }
  println(or(true,false))

  def and(bool1: Boolean,bool2: Boolean):Boolean = {
    val sourceList = List(bool1,bool2)
    sourceList.filter(_ == true).length == sourceList.length
  }

  println(and(true,false))

  def nand(bool1: Boolean,bool2: Boolean):Boolean = {
    !and(bool1,bool2)
  }
  println(nand(true,false))

  def nor(bool1:Boolean ,  bool2 : Boolean) : Boolean = {
     ! or (bool1,bool2)
  }

  def xor(bool1:Boolean ,  bool2 : Boolean) : Boolean = {
    if(bool1 == bool2) false
    else true
  }


  def impl(bool1:Boolean ,  bool2 : Boolean) : Boolean = {
    or(!bool1,bool2)
  }

  def equ(bool1:Boolean ,  bool2 : Boolean) : Boolean = {
    if(bool1 == bool2) true
    else false

  }



//  scala> xor(true. true)
//  res1: Boolean = false
//  A logical expression in two variables can then be written as an function of two variables, e.g: (a: Boolean, b: Boolean) => and(or(a, b), nand(a, b))
//
//  Now, write a function called table2 which prints the truth table of a given logical expression in two variables.
//
//  scala> table2((a: Boolean, b: Boolean) => and(a, or(a, b)))
//  A     B     result
//  true  true  true
//  true  false true
//  false true  false
//  false false false




  //table2((a: Boolean, b: Boolean) => and(a, or(a, b)))
}
