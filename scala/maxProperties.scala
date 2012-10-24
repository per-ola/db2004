import org.scalacheck._
import org.scalacheck.Prop._

object maxProperties extends Properties("StdArray.max") {
  
  //Properties that are just  test cases (examples)
  property ( "max(Array(1,2,3)) == 3 ") = StdArray.max(Array(1,2,3)) == 3
  property ( "max(Array(2,1)) == 2 ") = StdArray.max(Array(2,1)) == 2
  property ( "max(Array(1)) == 1 ") = StdArray.max(Array(1)) == 1
  
  // You can give names to generators
  def elems(a : Array[Int]) : Gen[Int] = Gen.oneOf(a)
  
  
  property("  max(a) belongs to a ") = 
    forAll( (a:Array[Int]) =>  a.length > 0 ==>  StdArray.belongs(StdArray.max(a),a)
    :| StdArray.toString(a)  // label for failed property so that it shows 
	   // the content of the array for which it failed
	 )
  
  
  property(" max(a) is upper bound for a ") =
    forAll( (a:Array[Int]) => forAll (Gen.oneOf(a)) (x  => StdArray.max(a) >= x)
    :|  StdArray.toString(a) 
	 )
}

