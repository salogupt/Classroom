package app

class TestSafeIndex {

    static void main(String[] args) {
        String[] array = ['wera', 'eer']
        def val1 =  array[1]

        //val1 =  array[10]
        array = null
        //Cannot invoke method getAt() on null object
        /*val1 =  array[0]
        println val1*/
        val1 =  array?[1]  //checks the array null ness
        println val1
    }
}
