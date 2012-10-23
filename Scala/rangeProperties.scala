import org.scalacheck._
import org.scalacheck.Prop._

object rangeProperties extends Properties("StdArray.range") {

  
  // generate an arbitrary element of an array
  def elems(a : Array[Int]) : Gen[Int] = Gen.oneOf(a)
  
  // we will generate bounds for the range, so we need rather small integers.
  // this is a way of telling scalcheck to use integers between -10 and 10 
  // when we write forAll(x:Int).
  implicit def arbInt: Arbitrary[Int] = Arbitrary(Gen.choose(-10,10))
  
  // we will need to generate indices in an array
  def index(last:Int) = Gen.choose(0,last)
  
  
  property(" range length ") = 
    forAll((a:Int, b:Int) => 
      a <= b ==> (StdArray.range(a,b).length == b-a+1)
    ) 
  
  property(" range contents: first element ") = 
    forAll((a:Int, b:Int) => 
      a <= b ==> (StdArray.range(a,b)(0) == a)
     )
  
  property(" range contents: last  element ") = 
    forAll((a:Int, b:Int) => 
      a <= b ==> (StdArray.range(a,b)(b-a) == b)
     )
  
  
  
  property(" range contents: consequtive ") = 
    Prop.forAll((a:Int, b:Int) => 
      b - a > 1 ==> {
		val range = StdArray.range(a,b)
		forAll(index(b-a-1))(ix => range(ix+1) == range(ix)+1)
		    }
     )


  
}

