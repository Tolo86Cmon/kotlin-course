package udacityKotlinCourse.lesson4.aquarium

fun main(args: Array<String>) {
    buildAquarium()
}

fun buildAquarium() {
    val aquarium = Aquarium()
    println(
        "Length-> ${aquarium.length} " +
                "Width-> ${aquarium.width} " +
                "High-> ${aquarium.heigh} " +
                "Volume as property-> ${aquarium.volume}"



    )
    val aquarium2 = Aquarium(numberOfFish = 20)

    println(
        "Length-> ${aquarium2.length} " +
                "Width-> ${aquarium2.width} " +
                "High-> ${aquarium2.heigh} " +
                "Volume as property-> ${aquarium2.volume}")
}
