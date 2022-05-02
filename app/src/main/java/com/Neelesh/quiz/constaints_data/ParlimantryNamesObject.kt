package com.Neelesh.quiz.constaints_data

import com.Neelesh.quiz.data_class.Question

object ParlimantryNamesObject {
    fun getQuestions(): ArrayList<Question> {
        val Questionlist = ArrayList<Question>()
        val que1 = Question(
            1, "Name the parliament of Egypt?",
            "People's Asembly",
        "Majlis",
        "People's National Assembly",
        "Shoora",
            1
        )
        Questionlist.add(que1)
        val que2 = Question(
            1, "Parliament of Oman is known as:",
                    "Consultative Assembly",
                "Majlis-e-Shoora",
        "National Assembly",
                "National Congress",
            2

        )
        Questionlist.add(que2)
        val que3 = Question(
            1, "Parliament of Denmark is known as:",
            "Folketing",
        "National Chamber of Representatives",
                "Federal Assembly",
                "Peoples Assembly|",
1
        )
        Questionlist.add(que3)
        val que4 = Question(
            1, "Which country's parliament is called 'Mother of All Parliaments'?",
            "Britain",
                    "China",
                    "USA",
                    "Russia",
            1
        )
        Questionlist.add(que4)
        val que5 = Question(
            1, "Parliament of Sweden is known as:",
            "Riksdag",
        "People's Congress",
        "National Congress",
                "Parliament",
            1
        )
        Questionlist.add(que5)

        val que6 = Question(
            1, "The name of parliament of China is:",

            "Parliament",
            "National People's Assembly",
                    "National People's Congress",
                    "National Congress",
2
        )
        Questionlist.add(que6)

        val que7 = Question(
            1, "Althing is the parliament of _______?",

        "States General",
                "USA",
        "Iceland",
        "UK",
            3
        )
        Questionlist.add(que7)

        val que8 = Question(
            1, "Parliament of Norway is known as:",
        "People's Congress",
        "Storting",
        "National Congress",
                "Parliament",
2
        )
        Questionlist.add(que8)

        val que9 = Question(
            1, "What is the name of the parliament of Myanmar?",
                    "Folketing",
                    "Pyethic Hyltaw",
                    "Land Straad",
                    "Shergo",
            2

        )
        Questionlist.add(que9)

        val que10 = Question(
            1, "Name the parliament of Nepal?",
            "Rajya Sabha",
                "Rashtriya Panchayat",
                "Assembly",
        "Shergo",
            2
        )
        Questionlist.add(que10)

        return Questionlist
    }
}