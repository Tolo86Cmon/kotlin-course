package udemyKotlinCourse.challanges

class Account(private var pin: Int = 46789, private var balance: Int) {


    init {
        println("Actual balance is $balance")
    }


    fun withdraw(amount: Int) {
        when {
            amount > balance -> {
                println("You cannot withdraw the money. Insufficient balance")
            }
            pin != 46789 -> {
                println("Pin incorrect")
            }
            else -> {
                balance -= amount
                println("You are going to withdraw $amount")
            }
        }

    }

    fun deposit(amount: Int) {
        balance += amount
        println("You are going to deposit $amount")
    }

    fun check() {
        println("Current Amount is $balance")
    }
}

fun main() {
    val accountBalance = Account(balance = 700)
    accountBalance.withdraw(800)
    accountBalance.deposit(20)
    accountBalance.check()
}
