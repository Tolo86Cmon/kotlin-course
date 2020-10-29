package udemyKotlinCourse.lessons.classes

enum class BandMember(val instrument: String) {
    MARCO("Guitar"){
        override fun typeOfMusic()= "rock"
    },
    GIANNI("Drum"){
        override fun typeOfMusic()= "punk"
    },
    LUCA("Voice"){
        override fun typeOfMusic()= "classic"
    };

   open fun typeOfMusic() = "pop"
}

fun main() {
    println(BandMember.LUCA.instrument)
}