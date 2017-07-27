import org.scalatest.FunSuite

/**
  * Created by shuhei.shogen on 2/4/17.
  */
class P02$Test extends FunSuite {

  test("Normal case") {
    assert(P02.penultimate(List(1, 1, 2, 3, 5, 8)) == 5)
  }

}
