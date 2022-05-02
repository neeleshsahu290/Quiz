package com.Neelesh.quiz.constaints_data

import com.Neelesh.quiz.data_class.Question

object MilitaryExerciseObject {
    fun getQuestions(): ArrayList<Question> {
        val Questionlist = ArrayList<Question>()
        val que1 = Question(
            1, "Avia Indra military exercise  held between which of the following country?",
                    "A) India and France",
                "B) India and China",
        "C) India and Russia",
        "D) India and Nepal",
            3
        )
        Questionlist.add(que1)
        val que2 = Question(
            1, "IBSAMAR trilateral naval exercise held between India, Brazil and___?",
                    "A) North Korea",
        "B) Switzerland",
        "C) Singapore",
        "D) South Africa",
            4
        )
        Questionlist.add(que2)
        val que3 = Question(
            1, "Maître military exercise conduct between India and___?",
        "A) Singapore",
        "B) Thailand",
        "C) Sri Lanka",
        "D) Bangladesh",
            2
        )
        Questionlist.add(que3)
        val que4 = Question(
            1, "Ajeya Warrior military exercise started between India and____?",
                    "A) USA",
                "B) Singapore",
        "C) UK",
        "D) Australia",
            3
        )
        Questionlist.add(que4)
        val que5 = Question(
            1, "Ausindex Naval exercise held between India and___?",
        "A) Canada",
        "B) Australia",
        "C) USA",
        "D) China",
            2
        )
        Questionlist.add(que5)
        val que6 = Question(
            1, "Prabal Dostyk military exercise held between India and___?",
                    "A) Kazakhstan",
                "B) Kyrgyzstan",
        "C) Tajikistan",
        "D) Turkmenistan",
            1
        )
        Questionlist.add(que6)
        val que7 = Question(
            1, "CORPAT naval exercise held between India and___?",
        "A) Malaysia",
        "B) Myanmar",
        "C) Nepal",
        "D) Indonesia",
            4
        )
        Questionlist.add(que7)
        val que8 = Question(
            1, "Lamitye military exercise held between India and ___?",
                    "A) USA",
                "B) Seychelles",
        "C) Oman",
        "D) South Korea",
            2
        )
        Questionlist.add(que8)
        val que9 = Question(
            1, "Which of the following country started Khanjar Military exercise with India?",
        "A) Kazakhstan",
        "B) Kyrgyzstan",
        "C) Turkmenistan",
        "D) Uzbekistan",
            2
        )
        Questionlist.add(que9)
        val que10 = Question(
            1, "Ekuverin military exercise started between India and __?",
                    "A) Myanmar",
                "B) Thailand",
        "C)Maldives",
        "D) Singapore",
            3

        )
        Questionlist.add(que10)
        return Questionlist
    }
}