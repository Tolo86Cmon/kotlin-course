package udemyKotlinCourse.lessons.conditionals

fun main() {
    val myMoney = 10

    //Java version
    if (myMoney > 0 && myMoney <= 5) {
        print("I can spend")
    } else if (myMoney > 5 && myMoney <= 20) {
        print("I can buy i nice meal")
    } else if (myMoney > 20) {
        print("I'm rich'")
    }

    //Kotlin version con "range" e "until"check
    if (myMoney in 1..5) {
        print("I can spend")
    } else if (myMoney in 6 until 20) {
        print("I can buy i nice meal")
    } else if (myMoney > 20) {
        print("I'm rich'")
    }

    // When Kotlin con variabile ripetuta
    when {
        myMoney in 1..5 -> {
            print("I can spend")
        }
        myMoney in 6..20 -> {
            print("I can buy i nice meal")
        }
        myMoney > 20 -> {
            print("I'm rich'")
        }
    }

    // When Kotlin con variabile in condizione
    when(myMoney) {
       in 1..5 -> {
            print("I can spend")
        }
         in 6..20 -> {
            print("I can buy i nice meal")
        }
         in 21..100 -> {
            print("I'm rich'")
        }
    }
}