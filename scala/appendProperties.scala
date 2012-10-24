import org.scalacheck._
import org.scalacheck.Prop._

object appendProperties extends Properties("StdArray.append") {

  // we will need to generate indices in an array
  def index(last:Int) = Gen.choose(0,last)

  property(" append length ") = 
      forAll((a:Array[Int],b:Array[Int]) => 
      StdArray.append(a,b).length == a.length + b.length
	   )
					  
  
  property(" append prefix ") = 
    forAll((a:Array[Int],b:Array[Int]) => 
    forAll(index(a.length-1))(ix => 
    StdArray.append(a,b)(ix) == a(ix)
			    )
	 )    

  property(" append suffix ") = 
    forAll((a:Array[Int],b:Array[Int]) => 
    forAll(index(b.length-1))(ix => 
    StdArray.append(a,b)(ix+a.length) == b(ix)
			    )
	 )
  
  

  
}


