package com.Neelesh.quiz.constaints_data

import com.Neelesh.quiz.data_class.Question

object InternationalOrganisationObject {
    fun getQuestions(): ArrayList<Question> {
        val Questionlist = ArrayList<Question>()
        val que1 = Question(
            1, "Which of the following organ of United Nation initiates the attention to the Security Council on the endanger International Peace and Security?",
            "Special Committee of UN" ,"General Assembly of UN" ,"Developed Countries Committee" ,"All the above",
            2
            )
        Questionlist.add(que1)
        val que2 = Question(
            1, "How many countries are member to United Nations?",
            "193", "192", "183", "188",
            1
        )
        Questionlist.add(que2)
        val que3 = Question(
            1,  "The headquarters of World Intellectual Property Organization (WIPO) is located in",
            "Paris", "Madrid" ,"New York" ,"Geneva",
            4
        )
        Questionlist.add(que3)
        val que4 = Question(
            1, "Which of the following describe correctly the Group of Seven Countries (G-7)?",
        "They are developing countries", "They are industrialized countries" ,"They are holding Atomic Bomb technology","They are the countries who can launch their own satellites",
            2
        )
        Questionlist.add(que4)
        val que5 = Question(
            1, "The headquarters of International Atomic Energy Agency is located in",
                    "Vienna" ,"London" ,"Geneva" ,"Washington",
            1
        )
        Questionlist.add(que5)
        val que6 = Question(
            1, "The working language of the UNESCO is",
                "French only" ,"English only" ,"English and French" ,"English, French and Russian",
            3
        )
        Questionlist.add(que6)
        val que7 = Question(
            1, "Which of the following is not associated with the UNO?",
                "ILO" ,"WHO","ASEAN" ,"All of the above",
            3
        )
        Questionlist.add(que7)
        val que8 = Question(
            1,  "INTERPOL means",
                    "International Political Conference" ,"International Criminal Police Organization" ,"International Association of Police Officers" ,"None of these",
            2
        )
        Questionlist.add(que8)
        val que9 = Question(
            1,  "Amnesty International has its headquarters at",
                    "Berlin" ,"New York" ,"Washington" ,"London",
            4
        )
        Questionlist.add(que9)
        val que10 = Question(
            1, "Where was the first ever security Council Summit meeting held in early 1992?",
        "New York" ,"Paris" ,"Geneva" ,"London",
            1
        )
        Questionlist.add(que10)
        return Questionlist
    }
}