package udemyKotlinCourse.lessons.loop_breakers

fun main() {

    // 1) Primo esempio breaker

    val mapFood = mapOf(
        "bananas" to 15,
        "mattresses" to 24,
        "dog kennels" to 42,
        "machine" to 120,
        "cheeses" to 5
    )

    var weight = 0
    val itemsVan = mutableListOf<String>()

    for ((cargoType,cargoWeight) in mapFood){
        print("Cargo weight is $weight")
        if (weight>100){
            println(" loop has been stopped")
            break
        }
        else if (weight + cargoWeight > 100){
            continue
        }
        else{
            println(" Adding $cargoType $cargoWeight")
            itemsVan.add(cargoType)
            weight += cargoWeight
        }

    }
}