package com.Neelesh.quiz.constaints_data

import com.Neelesh.quiz.data_class.Question

object RiverSideCityObject {
    fun getQuestions(): ArrayList<Question> {
        val Questionlist = ArrayList<Question>()
        val que1 = Question(
            1, "Which of the following rivers flow through Badrinath?",
            "Alaknanda" ,"Bhadra" ,"Brahmani" ,"Brahmaputra",
            1
        )
        Questionlist.add(que1)
        val que2 = Question(
            1, "Which of the following rivers flow through Sambalpur?",
            "Mahanadi" ,"Meenachil" ,"Mula" ,"Mutha",
            1
        )
        Questionlist.add(que2)
        val que3 = Question(
            1, "Which of the following rivers flow through Tiruchirapalli?",
                    "Krishna" ,"Panchaganga" ,"Yamuna" ,"Kaveri",
            4
        )
        Questionlist.add(que3)
        val que4 = Question(
            1, "Which of the following rivers flow through Jabalpur?",
            "Musi" ,"Narmada" ,"Netravati" ,"Gurupur",
        2
        )
        Questionlist.add(que4)
        val que5 = Question(
            1, "Which of the following rivers flow through Ayodhya?",
            "Sabarmati" ,"Saryu" ,"Savitri" ,"Sharavathi",
            2
        )
        Questionlist.add(que5)

        val que6 = Question(
            1, "Vishwamitri river flows through which of the following cities?",
            "Madurai",  "Bangalore" ,"Agra","Vadodara",
            4
        )
        Questionlist.add(que6)

        val que7 = Question(
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
        Questionlist.add(que10)

        return Questionlist
    }
}