package udemyKotlinCourse.lessons.objects

import java.time.Year

object CompanyRights {

    private val currentYear: Int = Year.now().value

    fun getTagLine() = "Our S.R.C Company"
    fun getCopyRightLine() = "Copyright \u00A9 $currentYear Our Company. All rights reserved"

}

fun main() {
    println(CompanyRights.getTagLine())
    println(CompanyRights.getCopyRightLine())
}