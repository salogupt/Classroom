package app


/*When an object is coerced into another, unless the target type is the same as the
source type, coercion will return a new object.
        The rules of coercion differ depending on the source and target types,
        and coercion may fail if no conversion rules are found.*/

class Employee{
    def name
    def num
    Employee(nam, data){
        println "Employee()"
        name = nam
        num = data
    }
}
class TestCoercioAsOps {
    static void main(String[] args) {
        int num = 12
        String s1 =  num
        println s1
        String s = num as String
        println s
        String data = "1235"  //"123DF"
        Integer val = data as Integer
        println val

       // def emp =  data as Employee

        def array =["Nnaa", 234]

        def emp2 =  array as Employee
        println emp2.name
    }
}
