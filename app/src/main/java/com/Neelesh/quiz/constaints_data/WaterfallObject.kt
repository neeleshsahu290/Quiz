package com.Neelesh.quiz.constaints_data

import com.Neelesh.quiz.data_class.Question

object WaterfallObject {
    fun getQuestions(): ArrayList<Question> {
        val Questionlist = ArrayList<Question>()
        val que1 = Question(
            1, "Dudhsagar falls is located in which of the following States in India?",

                     "Kerala", "Goa" ,"Karnataka" ,"Madhya Pradesh",
            2
        )
        Questionlist.add(que1)
        val que2 = Question(
            1, "Which of the following is the highest waterfall of India?",
            "Thoseghar waterfalls", "Palani falls" ,"Lodh falls" ,"Magod falls",
            1

        )
        Questionlist.add(que2)
        val que3 = Question(
            1, "Barehipani falls are located in which of the following districts of Odisha?",
            "Mayurbhanj", "Kalahandi" ,"Jarsuguda" ,"Jajapur",
            1
        )
        Questionlist.add(que3)
        val que4 = Question(
            1, "Jog Falls are located in which of the following States in India?",
            "Kerala" ,"Manipur" ,"Meghalaya" ,"Karnataka",
        4
        )
        Questionlist.add(que4)
        val que5 = Question(
            1, "Thoseghar Falls are located in which of the following States in India?",
            "Madhya Pradesh", "Maharashtra" ,"Gujarat" ,"Uttrakhand",
            2
        )
        Questionlist.add(que5)

        val que6 = Question(
            1, "Thoseghar Falls are located in which of the following States in India?",
            "Madhya Pradesh", "Maharashtra" ,"Gujarat" ,"Uttrakhand",
            2
        )
        Questionlist.add(que6)

        val que7 = Question(
            1, "Thoseghar Falls are located in which of the following States in India?",
            "Madhya Pradesh", "Maharashtra" ,"Gujarat" ,"Uttrakhand",
            2
        )
        Questionlist.add(que7)

        val que8 = Question(
            1, "Thoseghar Falls are located in which of the following States in India?",
            "Madhya Pradesh", "Maharashtra" ,"Gujarat" ,"Uttrakhand",
            2
        )
        Questionlist.add(que8)

        val que9 = Question(
            1, "Thoseghar Falls are located in which of the following States in India?",
            "Madhya Pradesh", "Maharashtra" ,"Gujarat" ,"Uttrakhand",
            2
        )
        Questionlist.add(que9)

        val que10 = Question(
            1, "Thoseghar Falls are located in which of the following States in India?",
            "Madhya Pradesh", "Maharashtra" ,"Gujarat" ,"Uttrakhand",
            2
        )
        Questionlist.add(que10)
        return Questionlist
    }
}