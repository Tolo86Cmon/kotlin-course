package udacityKotlinCourse.lesson4.aquarium

class Aquarium(var width : Int = 20 , var heigh : Int = 40, var length : Int = 100 ) {


    // one liner declaration it looks like more as a property
    var volume: Int
        get() = width * length * heigh / 1000
        set(value) {
            heigh = (value * 1000) / (width * length)
        }

    constructor(numberOfFish: Int): this() {
        val water: Int = numberOfFish * 2000
        val tank : Double = water + water * 0.1
        heigh = (tank / (length* width)).toInt()

    }


}
