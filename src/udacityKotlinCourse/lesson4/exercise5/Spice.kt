package udacityKotlinCourse.lesson4.exercise5

class  Spice(val name : String = "curry", val spiciness : String = "mild") {
  /*  val spiceName : String = "curry"
    val spiciness : String = "mild"
    val heat : Int  get() = 5*/


    val heat : Int  get() {
        return  when (spiciness) {
            "mild"->1
            "medium"->3
            "spicy"->4
            "very spicy"->7
            "extremely spicy"->10
            else -> 0
        }
    }



    init {
        println("Init Spice created $name $spiciness $heat")
    }

    fun makeDefaultSalt() {
        Spice("Salt")
    }

}
