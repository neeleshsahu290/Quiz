package com.Neelesh.quiz.constaints_data

import com.Neelesh.quiz.data_class.Question

object AttonyGeneralObject {
    fun getQuestions(): ArrayList<Question> {
        val Questionlist = ArrayList<Question>()
        val que1 = Question(
            1,  "Who is the current Attorney General of India?",
            "MuKul Rohatgi",
            "Rajiv Mehrishi",
            " K. K. Venugopal",
            "G Ashok Kumar",
            3
        )
        Questionlist.add(que1)
        val que2 = Question(
            1, "Who holds the right to remove Attorney General of India?",
            "Supreme Court",
            "President",
            "Prime Minister",
            "Impeachment",
            2
        )
        Questionlist.add(que2)
        val que3 = Question(
            1, "Who was the 1st Attorney General of India? ",
            "Motilal C. Setalvad", "MuKul Rohatgi", "C. K. Daphtary", "Sunil Lamba",
            1
        )
        Questionlist.add(que3)
        val que4 = Question(
            1, "Which of the following is true about the Attorney General of India?",


        "(a) He has the right of audience in all the courts in India",
            "(b) His term of the office and remuneration is decided by the president"
            ,"(c) He advices the Government of India",
            "(d) All the above",
            4
        )
        Questionlist.add(que4)
        val que5 = Question(
            1, "Inclusion of the word “ fraternity is proposed by",
            "(a) Dr. Ambedkar",
            "(b) J.L. Nehru",
            "(c) J.B. Kriplani",
            "(d) Shyama Prasad Mukherjee",
            1
        )
        Questionlist.add(que5)
        val que6 = Question(
            1,  "Who prepared the preamble of the Indian Constitution?",

                "(a) Jawahar Lal Nehru",
            "(b) Vallabh Bhai Patel",
            "(c) Rajendra Prasad",
            "(d) Dr. B.R. Ambedkar",
            1
        )
        Questionlist.add(que6)
        /*val que7 = Question(
            1, "Where is Vedanthangal Bird Sanctuary present ?",
            "Kerala", "Assam", "Andhra Pradesh", "Tamil Nadu",
            4
        )
        Questionlist.add(que7)
        val que8 = Question(
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