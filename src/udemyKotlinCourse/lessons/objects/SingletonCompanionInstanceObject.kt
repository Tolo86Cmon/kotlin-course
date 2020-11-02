package udemyKotlinCourse.lessons.objects

class EventManager {

    private constructor() {
    }

    companion object {
        private lateinit var instance: EventManager

        val managerInstance: EventManager
            get() {
                if (instance == null) {
                    instance = EventManager()
                }

                return instance
            }
    }

    fun sendEvent(eventName: String): Boolean {
        return true;
    }
}