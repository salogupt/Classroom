package app

class TestSafeNavigation {

    static void main(String[] args) {
        def value = readValue(110)

      //  def text = value.substring(1)

        def res = value?.substring(1)
        println res
    }

    static readValue(num){
        def data = ""
        if(num > 100)
            data = null
        else
            data = "OHG_fafa"
    }
}