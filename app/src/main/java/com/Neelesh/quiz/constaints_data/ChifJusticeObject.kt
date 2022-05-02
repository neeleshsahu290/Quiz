package com.Neelesh.quiz.constaints_data

import com.Neelesh.quiz.data_class.Question

object ChifJusticeObject {
    fun getQuestions(): ArrayList<Question> {
        val Questionlist = ArrayList<Question>()
        val que1 = Question(
            1,  "Sharad Arvind Bobde is the ....Chief Justice of India",
                "(a) 47th","(b) 46th",
            "(c) 45th","(d) 48th",
            1
        )
        Questionlist.add(que1)
        val que2 = Question(
            1,  "Who was the first Chief Justice of India from Indian soil?",
            "(a) G.V. Mavlankar","(b) Justice A.K. Sarkar",
            "(c) C.D Deshmukh",
            "(d) Justice Harilal Jekisundas Kania",
        4
        )
        Questionlist.add(que2)
        val que3 = Question(
            1,  "To whom the Chief Justice of India submits his resignation?",
                "(a) The President of India",
            "(b) The Senior most judge of the Supreme Court",
            "(c) Speaker",
            "(d) Law Minister",
                    1
        )
        Questionlist.add(que3)
        val que4 = Question(
            1, "The Chief Justice of India holds the post till...",
        "(a) The age of 62 years",
            "(b) Till the age of 65 years or 5 years of tenure whichever is earlier",
            "(c) Till the age of 65 years or 3 years of tenure whichever is earlier",
            "(d) Till the age of 65 years",
     4
        )
        Questionlist.add(que4)
        val que5 = Question(
            1, "The President can declare a judge an executive chief justice of the Supreme Court of India when ...",

        "(A) The post of Chief Justice is vacant",
            "(B) Chief Justice is temporarily absent",
            "(C) Chief Justice is unable to discharge his obligations",
            "(D) All of the above",
            4
        )
        Questionlist.add(que5)
        val que6 = Question(
            1, "Who was the first woman judge of the Supreme Court of India?",
                "(a) Sujata Manoha","(b) Ranjana Desai",
            "(c) Fathima Beevi",
            "(d) Gyan Sudha Misra",
                   3
        )
        Questionlist.add(que6)
        val que7 = Question(
            1, "Who can remove the Judge of the Supreme Court?",
            "(A) Chief Justice of the Supreme Court","(B) Only President",
            "(C) Only Parliament","(D) Both Parliament and President",
            4
        )
        Questionlist.add(que7)
        /*val que8 = Question(
            1, "Which of the following bird sanctuaries is not present in Andhra Pradesh ?",
            "Atapaka Bird Sanctuary", "Pulicat Lake Bird Sanctuary", "Khijadiya Bird Sanctuary", "Nelapattu Bird Sanctuary",
            3
        )
        Questionlist.add(que8)
        val que9 = Question(
            1, "Which of the following pairs is incorrect?",
            "Kutch Bustard Sanctuary – Gujarat", "Khaparwas Wildlife Sanctuary – Rajasthan", "Bankapura Peacock Sanctuary – Karnataka", "Pakshipathalam Bird Sanctuary – Kerala",
            2
        )
        Questionlist.add(que9)
        val que10 = Question(
            1, "Which of the following pairs is correct?",
            "Mayani Bird Sanctuary – Assam", "Harike bird sanctuary – Punjab", "Khichan Bird Sanctuary – Tamil Nadu", "Vettangudi Bird Sanctuary – Uttar Pradesh",
            2
        )
        Questionlist.add(que10)*/
        return Questionlist
    }
}