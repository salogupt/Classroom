package app

class TestSubscript {

    static void main(String[] args) {
        def intRange = 2..8
        def value = intRange.get(0)
        println value

        //intRange[0] = 1
        println intRange[0]

    }
}
