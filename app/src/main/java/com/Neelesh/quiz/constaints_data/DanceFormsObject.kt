package com.Neelesh.quiz.constaints_data

import com.Neelesh.quiz.data_class.Question

object DanceFormsObject {
    fun getQuestions(): ArrayList<Question> {
        val Questionlist = ArrayList<Question>()
        val que1 = Question(
            1, "Kuchipudi is the classical dance form of which Indian state?",
            "Tamil Nadu", "Andhra Pradesh", "Karnataka", "Kerala",
            2
        )
        Questionlist.add(que1)
        val que2 = Question(
            1, "Kathakali is the dance form of which Indian state?",
            "Tamil Nadu", "Andhra Pradesh", "Karnataka", "Kerala",
            4
        )
        Questionlist.add(que2)
        val que3 = Question(
            1, "Giddha is the folk dance of which state?",
            "Uttar Pradesh", "Himachal Pradesh" ,"Madhya Pradesh" ,"Punjab",
            4
        )
        Questionlist.add(que3)
        val que4 = Question(
            1, "Pandit Birju Maharaj is related to which classical dance form of India?",
            "Odishi" ,"Kathakali", "Kathak" ,"Kuchipudi",
            3
        )
        Questionlist.add(que4)
        val que5 = Question(
            1, "Rajasthan is popular for which folk dance?",
            "Ghero" ,"Raas Leela" ,"Ghumar" ,"Gadhwali",
            3
        )
        Questionlist.add(que5)

        val que6 = Question(
            1, "Dandiya Rasa is the folk dance of which Indian state?",
                    "Rajasthan" ,"Uttar Pradesh ","Chattisgarh" ,"Gujarat",
            4
        )
        Questionlist.add(que6)

        val que7 = Question(
            1, "Ghero is the folk dance form of which Indian state?",
            "Madhya Pradesh", "Nagaland" ,"Himachal Pradesh" ,"Uttarakhand",
            1
        )
        Questionlist.add(que7)

        val que8 = Question(
            1, "Nautanki is the folk dance of which state?",
            "Uttar Pradesh" ,"Bihar" ,"Jharkhand" ,"Assam",
            1
        )
        Questionlist.add(que8)

        val que9 = Question(
            1, "Bagurumba is the dance form of which Indian state?",
            "Gujarat" ,"Odisha","Assam" ,"Telengana",
            3
        )
        Questionlist.add(que9)

        val que10 = Question(
            1, "Nati is a dance form of which Indian state?",
            "Andhra Pradesh" ,"Madhya Pradesh" ,"UttarPradesh" ,"Himachal Pradesh",
        4
        )
        Questionlist.add(que10)
        return Questionlist
    }
}