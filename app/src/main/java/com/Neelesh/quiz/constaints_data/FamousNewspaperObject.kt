package com.Neelesh.quiz.constaints_data

import com.Neelesh.quiz.data_class.Question

object FamousNewspaperObject {
    fun getQuestions(): ArrayList<Question> {
        val Questionlist = ArrayList<Question>()
        val que1 = Question(
            1, "The Wall Street Journal is belong to which Country?",
                    "Uk" ,"UsA" ,"Germany","Australia",
            2
        )
        Questionlist.add(que1)
        val que2 = Question(
            1, "The Nikkel is belong to which Country?",
        "China" ,"south Korea" ,"Vietnem" ,"Japan",
            4
        )
        Questionlist.add(que2)
        val que3 = Question(
            1, "The Global Times is belong to which Country?",
                    "Uk", "China","Usa" ,"Austria",
            2
        )
        Questionlist.add(que3)
        val que4 = Question(
            1,  "The Sun is belong to which Country",
            "Britain", "Usa" ,"Hungary" ,"France",
            1
        )
        Questionlist.add(que4)
        val que5 = Question(
            1, "The GaZette is belong to which Country",
            "Brazil" ,"Colombia" ,"Mexico" ,"Canada",
            4
        )
        Questionlist.add(que5)

        return Questionlist
    }
}