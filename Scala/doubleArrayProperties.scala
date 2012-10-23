import org.scalacheck._
import org.scalacheck.Prop._

object doubleArrayProperties extends Properties("StdArray.doubleArray") {

  property(" doubleArray length ") = 
      forAll((a:Array[Int]) => 
      StdArray.doubleArray(a).length == 2*a.length
    ) 

  property(" doubleArray content first half ") = 
    forAll((a:Array[Int]) => 
    forAll(Gen.choose(0,a.length-1))(ix => 
    StdArray.doubleArray(a)(ix)  ==  a(ix)
			    )
	 )


  property(" doubleArray content second half ") = 
    forAll((a:Array[Int]) => 
    forAll(Gen.choose(a.length,2*a.length-1))(ix => 
        0 == StdArray.doubleArray(a)(ix)
					    )
	 )

  
}

