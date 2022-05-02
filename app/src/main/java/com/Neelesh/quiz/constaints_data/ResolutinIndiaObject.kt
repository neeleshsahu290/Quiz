package com.Neelesh.quiz.constaints_data

import com.Neelesh.quiz.data_class.Question

object ResolutinIndiaObject {
    fun getQuestions(): ArrayList<Question> {
        val Questionlist = ArrayList<Question>()
        val que1 = Question(
            1,  "Which of the following revolution aimed at the increased production of Overall development of Agriculture ?",
            "Golden Revolution",
                    "Black Revolution",
            "Evergreen Revolution",
            "Grey Revolution",
            3
        )
        Questionlist.add(que1)
        val que2 = Question(
            1,  "Which of the following revolution aimed at the increased production of Oil Seeds ?",
            "Yellow Revolution",
                    "White Revolution",
                            "Red Revolution",
                                    "Grey Revolution",
            1

        )
        Questionlist.add(que2)
        val que3 = Question(
            1, "Which of the following revolution aimed at the increased production of Milk/Dairy ?",
            "Grey Revolution " ,
                    "Red Revolution" ,
                    "White Revolution " ,
                    "Silver Revolution",
            3

        )
        Questionlist.add(que3)
        val que4 = Question(
            1, "Which of the following revolution aimed at the increased production of Egg/Poultry ?",
            "Silver Fiber Revolution " ,
                    "Silver Revolution " ,
                    "Red Revolution " ,
                    "Pink Revolution",
            2

        )
        Questionlist.add(que4)
        val que5 = Question(
            1, "Which of the following revolution aimed at the increased production of Cotton ?",
            "Red Revolution " ,
                    "Grey Revolution " ,
                    "Silver Revolution " ,
                    "Silver Fiber Revolution",
            4

        )
        Questionlist.add(que5)

        val que6 = Question(
            1, "Which of the following revolution aimed at the increased production of Food grains ?",
            "Pink Revolution",
            "Brown Revolution",
            "Green Revolution " ,
                    "Red Revolution",
            3

        )
        Questionlist.add(que6)

        val que7 = Question(
            1, "Which of the following revolution aimed at the increased production of Fruits/Overall Horticulture development/Honey ?",
            "Golden Revolution " ,
                    "Green Revolution " ,
                    "Black Revolution " ,
                    "Grey Revolution",
            1

        )
        Questionlist.add(que7)

        val que8 = Question(
            1, "Which of the following revolution aimed at the increased production of Onion /Pharmaceutical (India)/Prawn ?",
            "Pink Revolution " ,
                    "Round Revolution " ,
                    "White Revolution " ,
                    "Silver Revolution",
            1

        )
        Questionlist.add(que8)

        val que9 = Question(
            1, "Which of the following revolution aimed at the increased production of Jute ?",

                    "Green Revolution",
            "Grey Revolution " ,
                    "Golden Revolution " ,
                    "Golden Fiber Revolution",
            4
        )
        Questionlist.add(que9)

        val que10 = Question(
            1, "Which of the following revolution aimed at the increased production of Fish ?",
            "Pink Revolution " ,
                    "Blue Revolution " ,
                    "Red Revolution " ,
                    "Round Revolution",
            2
        )
        Questionlist.add(que10)

        return Questionlist
    }
}