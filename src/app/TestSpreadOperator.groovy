package app


class Vehicle {
    String make
    Double price
}
//The spread operator can be used on any class which
// implements the Iterable interface
class TestSpreadOperator {

    static void main(String[] args) {
        def vehicles = [
                new Vehicle(make: 'Maruti', price: 10000),
                new Vehicle(make: 'Ashok', price: 20999),
                new Vehicle(make: 'Mahendra', price: 43568)]

        def vehicleBrands = vehicles*.make
        for(value in vehicleBrands)
            println value

        def prices = vehicles*.price
        for(price in vehicleBrands)
            println price

    }
}
