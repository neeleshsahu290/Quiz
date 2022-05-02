package com.Neelesh.quiz.constaints_data

import com.Neelesh.quiz.data_class.Question

object CentralBankObject {
    fun getQuestions(): ArrayList<Question> {
        val Questionlist = ArrayList<Question>()
        val que1 = Question(
            1, "Which of the following countries has no Central Bank?",
            "Scotland", "Panama", "Armenia", "Bangladesh",
            2
        )
        Questionlist.add(que1)
        val que2 = Question(
            1, "What is the name of the Central bank of Antigua & Barbuda?",
            "Central Bank of Aruba", "Eastern Caribbean Central Bank", "Central Bank of Barbados", "Bank of the Republic",
            2
        )
        Questionlist.add(que2)
        val que3 = Question(
            1, "When was the first Central bank founded?",
            "1568", "1688", "1668", "1688",
            3
        )
        Questionlist.add(que3)
        val que4 = Question(
            1, "What is the name of the first institution recognized as the central bank of Sweden?",
            "Sveriges Riksbank", "National Bank of the Republic of Sweden", "Swedish Central Bank", "Institut Nacional Andorrà de Finances",
            1
        )
        Questionlist.add(que4)
        val que5 = Question(
            1, " How many Federal Reserve Banks are there?",
            "10", "12", "20", "24",
            2
        )
        Questionlist.add(que5)
        return Questionlist
    }
}