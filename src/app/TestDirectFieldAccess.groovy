package app


class Human {
    private  String name
    Human(String name) { this.name = name}
    String getName() {
        println "Human.getName()"
        name
    }
}


//use of .@ forces usage of the direct field instead of the getter
class TestDirectFieldAccess {
    static void main(String[] args) {
        def user = new Human('Mohan')
        println user.name
        println "******"
        //Direct access and skip getName()
        //user.@name == 'Baba'

        user.@name ="Baba"
        def value = user.@name
        println "New User name is $value"
    }
}
