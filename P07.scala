import java.util

import scala.collection.immutable

object P07 extends App {

  println(flatten(List(List(1, 1), 2, List("a"),List(3, List(5, 8,List(3,4))))))
  //println(List(List(1,2),List(3,4)).flatten)

  def flatten(lis : List[Any]) : List[Any]  = lis match{
    //List(List(1,2),2,List(1,3)).foreach(each => println(each.getClass.getSimpleName)
      case List()   => List()
      case x :: xs  => {
        if(x.getClass.getSimpleName != "$colon$colon") {
          if(x == List())
            flatten(xs)
          else
            x :: flatten(xs)
        }
        else x match {
          case y:: ys => {
            flatten(y ::ys :: xs)
          }
        }
      }

  }

}












