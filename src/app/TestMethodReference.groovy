package app

class TestMethodReference {

    static void main(String[] args) {
        def strData = 'string example of method reference'
        //Define the function reference
        def funRef = strData.&toUpperCase  //String method reference
        //invoke the fuction
        def upper = funRef()
        println "The result is $upper"

        def intObject  = Integer.&new  //Reference to Integer constuctor
        def intValue1 =intObject(234)
        def intValue2 =intObject(678)
        println intValue1
        println intValue2
        def stringUpper = String.&toUpperCase
        def res = stringUpper('abcd')
        println "The result is $res"






    }
}
