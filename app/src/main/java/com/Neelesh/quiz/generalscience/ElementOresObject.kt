package com.Neelesh.quiz.generalscience

import com.Neelesh.quiz.data_class.Question

object ElementOresObject {
    fun getQuestions(): ArrayList<Question> {
        val Questionlist = ArrayList<Question>()
        val que1 = Question(
            1,  "…………. is not a form of Carbon" ,
                    "1.Hematite" ,
                    "2.Lonsdaleite" ,
                    "3.Graphite" ,
                    "4.Both 1 and 3",
            1
        )
        Questionlist.add(que1)
        val que2 = Question(
            1, "The Ore of Alumium is" ,
                    "1.Galena" ,
                    "2.Bauxite" ,
                    "3.Aluminium Sulphtae" ,
                    "4.Cinnbar",
            2


        )
        Questionlist.add(que2)
        val que3 = Question(
            1, "Calve rite is the ore of ……………" ,
                    "1.Aluminium" ,
                    "2.Silver" ,
                    "3.Gold" ,
                    "4.Platinum",
            3
        )
        Questionlist.add(que3)
        val que4 = Question(
            1,  "Which of the following is the ore of Mercury ?" ,
                    "1.Rock Salt" ,
                    "2.Glance" ,
                    "3.Cinnbar" ,
                    "4.Dolomite",
            3
        )
        Questionlist.add(que4)
        val que5 = Question(
            1,  "Calamine is the ore of which of the following ?" ,
                    "1.Magnesium" ,
                    "2.Sodium" ,
                    "3.Sulphur" ,
                    "4.Zinc",
            4
        )
        Questionlist.add(que5)
        val que6 = Question(
            1,  "Bornite and Malachite is the ore of ……………" ,
                    "1.Calcium" ,
                    "2.Copper" ,
                    "3.Carbon" ,
                    "4.Chlorine",
            2

        )
        Questionlist.add(que6)
        val que7 = Question(
            1, "Which is/are the ore of Phosphorous ?" ,
                    "1.Floreopetite" ,
                    "2.Phosphoric acid" ,
                    "3.Phosphorite" ,
                    "4.Both 1 and 3",
            4
        )
        Questionlist.add(que7)
        val que8 = Question(
            1, "………………… is the ore of  Calcium" ,
                    "1.Calcium Oxide" ,
                    "2.Lime Stone" ,
                    "3.Calve Rite" ,
                    "4.Calcium Pyrites",
            2
        )
        Questionlist.add(que8)
        val que9 = Question(
            1,  "Galena is the ore of which of the following ?" ,
                    "1.Lead" ,
                    "2.Carbon" ,
                    "3.Nickel" ,
                    "4.Mercury",
            1
        )
        Questionlist.add(que9)
        /*val que10 = Question(
            1, "Who was the chief of the air staff of IAF during Kargil war?",
            "a) Shashindra Pal Tyagi",
            "b) Anil Kumar Browne",
            "c) Anil Yashwant Tipnis",
            "d) None of these",
            3
        )
        Questionlist.add(que10)*/
        return Questionlist
    }
}