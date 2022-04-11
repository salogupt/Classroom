package app

class User{

    def getValue(){

    }
}
class TestElvis {

    static void main(String [] args){
        def userName = "Baba"
        def data = 100 +  12
      //  def flag = (data > 100) ? userName : 'NoThing' //java ternery
        //variable = (condition) ? expression1 : expression2
        userName = "Moganrao"

       // def displayName = data ? userName : getData() //java ternery

      //  def displayName = (data > 100) ? readData() : getData() //java ternery

        def displayName = getBoolean() ? readData() : getData() //java ternery

        println "Java ternery result is $displayName"
        //userName = "Baba"
        data = false

        println "************"
       // displayName = data ?: 'Mohan' //groovy Elvis

        displayName = readData() ?: getData() //groovy Elvis
        println "Groovy Elvis result is $displayName"

        println "\n#######"
        //Elvis shirt hand
        def obj = new User()
        def value = obj.getValue()

        value ?= readData()
        println "The elvis shorhand value assigned is $value"

    }


    static getBoolean(){
        println "getBoolean()"
        def data = false
    }
    static getData(){
        println "getData()"
       def data = "From getData"
    }

    static readData(){
        println "readData()"
        def data = "From readData"
        //false
    }
}
