package app

class TestSpaceShipOperators {

    //The spaceship operator (<=>) delegates to the compareTo method of the object:
    static void main(String[] args) {
        def res = (1 <=> 1) //equal vales
        println res

        res = (2 <=> 1)//greater than
        println res

        res = (1 <=> 12) //less than
        println res

    }
}
