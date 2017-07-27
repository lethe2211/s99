/**
  * Created by shuhei.shogen on 2/3/17.
  */
object P01 {

  def last[T](list: List[T]): T = list match {
    case x::Nil => x
    case x::xs => last(xs)
    case _ => sys.error("Error")
  }

}
