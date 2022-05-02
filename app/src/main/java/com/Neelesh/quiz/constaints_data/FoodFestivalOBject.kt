package com.Neelesh.quiz.constaints_data

import com.Neelesh.quiz.data_class.Question

object FoodFestivalOBject {
    fun getQuestions(): ArrayList<Question> {
        val Questionlist = ArrayList<Question>()
        val que1 = Question(
            1, "Chinchilla Melon Festival belong to which country",
            "France" ,"Germany" ,"Australia" ,"Austria",
            3
        )
        Questionlist.add(que1)
        val que2 = Question(
            1, "Tomato festival is celebrated in",
            "Spain" ,"France" ,"Germany"  ,"Itly",
            1
        )
        Questionlist.add(que2)
        val que3 = Question(
            1, "International mango Festival belong to ?",
            "China" ,"Vietnam" ,"India" ,"Nepal",
            3
        )
        Questionlist.add(que3)
        val que4 = Question(
            1, "lvrea Orange Festival is celebrated on",
            "Spain" ,"France" ,"Germany"  ,"Itly",
            4
        )
        Questionlist.add(que4)
        val que5 = Question(
            1, "Grape Throwing  Festival is celebrated on?",
            "Spain" ,"France" ,"Germany"  ,"Itly",
            1
        )
        Questionlist.add(que5)

        val que6 = Question(
            1, "Oktoberfest is belong to",
            "Spain" ,"France" ,"Germany"  ,"Itly",
            3
        )
        Questionlist.add(que6)

        /*val que7 = Question(
            1, "River Musi flows through which of the following cities?",
            "Pune" ,"Banki","Hyderabad" ,"Karad",
            3
        )
        Questionlist.add(que7)

        val que8 = Question(
            1, "River Cooum flows through which of the following cities?",
            "Gwalior" ,"Chennai" ,"Daman" ,"Mirzapur",
            2
        )
        Questionlist.add(que8)

        val que9 = Question(
            1, "River Ghataprabha flows through which of the following cities?",
            "Bagalkot" ,"Malegaon" ,"Rajahmundry" ,"Nashik",
            1
        )
        Questionlist.add(que9)

        val que10 = Question(
            1, "Bengaluru is situated on the banks of river",
            "kaveri", "Krishna" ,"Vrishnabhavati" ,"Sharavathi",
            3

        )
        Questionlist.add(que10)*/

        return Questionlist
    }
}