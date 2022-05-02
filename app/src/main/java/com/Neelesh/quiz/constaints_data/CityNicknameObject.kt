package com.Neelesh.quiz.constaints_data

import com.Neelesh.quiz.data_class.Question

object CityNicknameObject {
    fun getQuestions(): ArrayList<Question> {
        val Questionlist = ArrayList<Question>()
        val que1 = Question(
            1, "Which city is called the City of Pearls?",
            "Truvendurum", "Hyderabad", "Amaravati", "Chennai",
            2
        )
        Questionlist.add(que1)
        val que2 = Question(
            1, "Which city is called the Cultural City",
            "Rajahmundry", "Itanagar", "Mumbai", "Nagpur",
            1
        )
        Questionlist.add(que2)
        val que3 = Question(
            1, "Which city is named the Royal City?",
            "raipur", "Lucknow", "Chandigarh", "Patiala",
            4
        )
        Questionlist.add(que3)
        val que4 = Question(
            1, "Which of the following is called the City of Weavers?",
            "Panipat", "Gaya", "Kanpur", "Gwalior",
            1
        )
        Questionlist.add(que4)
        val que5 = Question(
            1, "Which of the following is the City of Temples?",
            "Kedarnath", "Allahabad", "Varanasi", "kolkata",
            3
        )
        Questionlist.add(que5)


        val que6 = Question(
            1, "Which of the following is called the Leather City?",
            "Kanpur", "Hyderabad", "Varanasi", "kolkata",
            3
        )
        Questionlist.add(que6)


        val que7 = Question(
            1, "Which city is called the City of Orange?",
            "Jaipur", "Allahabad", "Nagpur", "Surat",
            3
        )
        Questionlist.add(que7)

        val que8 = Question(
            1, "Which of the following is the City of Festivals?",
            "Madurai", "Allahabad", "Varanasi", "kolkata",
            1
        )
        Questionlist.add(que8)
        return Questionlist
    }
}