import org.scalatest.FunSuite

/**
  * Created by shuhei.shogen on 2/4/17.
  */
class P01$Test extends FunSuite {

  test("Normal case") {
    assert(P01.last(List(1, 1, 2, 3, 5, 8)) == 8)
  }

}
