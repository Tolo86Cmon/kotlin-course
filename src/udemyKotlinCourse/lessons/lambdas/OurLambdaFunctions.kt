package udemyKotlinCourse.lessons.lambdas

enum class conversionTypeEnum {
    FROMCELSIUSTOFAHRENHEIT,
    FROMKGSTOTONS,
    FROMPOUNDSTOUSTON;

}
// Funzione che prende come input un int e una lambda expression e ritorna un double
fun fromCelsiusToFahrenheit(celsiusDegree: Int, converter: (Int) -> Double): Double {
    return converter(celsiusDegree)
}
// Funzione che prende come input una String e ritorna una lambda expression
fun conversionSelector(string: conversionTypeEnum): (Double) -> Double {

    when (string) {
        conversionTypeEnum.FROMCELSIUSTOFAHRENHEIT -> return { it * 1.8 + 35 }
        conversionTypeEnum.FROMKGSTOTONS -> return { it * 2.204623 }
        conversionTypeEnum.FROMPOUNDSTOUSTON -> return { it / 2000 }
        else -> return {it}
    }
}

fun main() {

    println("fromCelsiusToFahrenheit -> Result: ${fromCelsiusToFahrenheit(4) { it * 1.8 + 35 }}")
    println("conversionSelector -> ${conversionSelector(conversionTypeEnum.FROMPOUNDSTOUSTON)(56.6)}")
}
