/**
  * Created by shuhei.shogen on 2/4/17.
  */
object P02 {

  def penultimate[T](list: List[T]): T = list match {
    case x::_::Nil => x
    case _::y::xs => penultimate(y::xs)
    case _ => sys.error("Error")
  }

}
