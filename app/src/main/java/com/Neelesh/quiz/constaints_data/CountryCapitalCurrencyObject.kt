package com.Neelesh.quiz.constaints_data

import com.Neelesh.quiz.data_class.Question

object CountryCapitalCurrencyObject {
    fun getQuestions(): ArrayList<Question>{
        val Questionlist = ArrayList<Question>()
        val  que1 = Question(
            1, "What is the Capital of Australia",
            "Sydney", "Perth", "Melbourne", "Canberra",
            4
        )
        Questionlist.add(que1)
        val  que2 = Question(
            1, "Astana is the capital city of",
            "Sweden", "Kazakhstan", "Kuwait", "Kyrgyzstan",
            2
        )
        Questionlist.add(que2)
        val  que3 = Question(
            1, " Which country has more than one official capital?",
            "Egypt", "South Africa", "Switzerland", "United Kingdom",
            2
        )
        Questionlist.add(que3)
        val  que4 = Question(
            1, "What is the Capital of Argentina?",
            "Buenos Aires", "Manama", "Amsterdam", "Washington D.C",
            1
        )
        Questionlist.add(que4)
        val  que5 = Question(
            1, "The currency of Tajikistan?",
            "Paise", "Rupee", "Rupiah", "Taka",
            4
        )
        Questionlist.add(que5)
        val  que6 = Question(
            1, "The capital of Malaysia is?",
            "Bangkok", "Jakarta", "Kuala Lumpur", "Port Louis",
            3
        )
        Questionlist.add(que6)
        val  que7 = Question(
            1, "What is the national currency of Rwanda?",
            "Rwandan pound", "Rwandan rand", "Rwandan dinar", "Rwandan franc",
            4
        )
        Questionlist.add(que7)
        val  que8 = Question(
            1, "What is the Capital of Albania?",
            "Tirane", "Yerevan", "Melekeok", "Abuja",
            1
        )
        Questionlist.add(que8)
        val  que9 = Question(
            1, "What is the national currency of Saint Lucia?",
            "US Dollar", "East Caribbean dollar", "East Caribbean franc", "East Caribbean peso",
            2
        )
        Questionlist.add(que9)
        val  que10 = Question(
            1, "What is the national currency of Romania?",
            "Romanian Leu", "Romanian ruble", "Romanian liira", "Romanian zloty",
            1
        )
        Questionlist.add(que10)
        val  que11 = Question(
            1, "What is the Capital of Bosnia and Herzegovina?",
            "Bangui", "Sarajevo", "Thimphu", "Libreville",
            2
        )
        Questionlist.add(que11)
        val  que12 = Question(
            1, "What is the national currency of Qatar?",
            "Qatari dirham", "Qatari dina", "Qatari shekel", "Qatari riyal",
            4
        )
        Questionlist.add(que12)
        val  que13 = Question(
            1, "The capital of Peru?",
            "Albania", "Bruno Aires", "Leema", "None of these",
            3
        )
        Questionlist.add(que13)
        val  que14 = Question(
            1, "Dinar is the currency of which of the following countries?",
            "Bahrain", "Bhutan", " Brazil", "Georgia",
            1
        )
        Questionlist.add(que14)
        val  que15 = Question(
            1, "The capital of New Zealand is",
            "Auckland", " Wellington", "Auckland", "Napier",
            2
        )
        Questionlist.add(que15)
        val  que16 = Question(
            1, "Which of the following is capital of Georgia?",
            "Thimpu", "Tehran", "Riga", "Tbilisi",
            4
        )
        Questionlist.add(que16)
        val  que17 = Question(
            1, "What is the Capital of Meghalaya",
            "Shillong", "indore", "bombay", "kolkata",
            1
        )
        Questionlist.add(que17)
        val  que18 = Question(
            1, "Is Maputo the capital of?",
            "Angola", "Guinea Bissau", "Mozambique", " Portugal",
            3
        )
        Questionlist.add(que18)
        val  que19 = Question(
            1, " What is the national currency of Jordan?",
            "Jordanian down", "Jordanian dinar", " Jordanian shekel", "Jordanian liire",
            2
        )
        Questionlist.add(que19)
        val  que20 = Question(
            1, "What is the national currency of Angola?",
            "Angolan kwanzarial", " Angolan kwanza", "Angolan peso", "Angolan pound",
            2
        )
        Questionlist.add(que20)

        return Questionlist
    }
}