package com.Neelesh.quiz.constaints_data

import com.Neelesh.quiz.data_class.Question

object CityFounderObject {
    fun getQuestions(): ArrayList<Question> {
        val Questionlist = ArrayList<Question>()
        val que1 = Question(
            1, "In 1459 AD, the Sun City i.e. Jodhpur was founded by",
            "Rao Jodha", "Jodha Bai", "Man Singh", "Rana Pratap",
            1
        )
        Questionlist.add(que1)
        val que2 = Question(
            1, "In 14th Century, Ambala was founded by",
            "Guru Govind Singh", "Amba Rajput king", "Amba Singh", "maharana Pratap",
            2
        )
        Questionlist.add(que2)
        val que3 = Question(
            1, " Jaunpur was founded by",
            "Sher Shah Suri", "Tsang", "Prathviraj Chauhan", "Feroz Shah Tuglaq",
            4
        )
        Questionlist.add(que3)
        val que4 = Question(
            1, "Fatehpur Sikri was founded by Akbar is situated in which State",
            "Rajasthan", "Uttar Pradesh", "Madhya Pradesh", "Haryana",
            2
        )
        Questionlist.add(que4)
        val que5 = Question(
            1, "In 1625 AD, Muradabad was founded by",
            "Rustam Khan", "Feroz Shah Tuglaq", "Akbar", "Saadat Khan",
            1
        )
        Questionlist.add(que5)
        return Questionlist
    }
}