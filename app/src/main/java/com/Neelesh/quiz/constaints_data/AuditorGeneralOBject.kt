package com.Neelesh.quiz.constaints_data

import com.Neelesh.quiz.data_class.Question

object AuditorGeneralOBject {
    fun getQuestions(): ArrayList<Question> {
        val Questionlist = ArrayList<Question>()
        val que1 = Question(
            1, "In which article of Indian Constitution, the post of the Comptroller and Auditor General of India has been envisaged?",

        "(a) Article 76","(b) Article 153","(c) Article 14","(d) Article 127",
                    3
        )
        Questionlist.add(que1)
        val que2 = Question(
            1, "Who conducts the appointment of the Comptroller and Auditor General of India?",

                "(a) Finance Minister","(b) President of India",
            "(c) Parliament","(d) Prime Minister",
            2
        )
        Questionlist.add(que2)
        val que3 = Question(
            1,  "How long is the tenure of the Comptroller and Auditor General of India?",

        "(a) 6 years",
            "(b) 5 years",
            "(c) The tenure is not fixed",
            "(d) 3 years",
            1
        )
        Questionlist.add(que3)
        val que4 = Question(
            1, "Who is the CAG  of India?",
            "MuKul Rohatgi",
            "Rajiv Mehrishi",
            "Shashi Kant Sharma",
            "A.K. Chandra",
            2
        )
        Questionlist.add(que4)
        val que5 = Question(
            1, "Who was the  first CAG  of India?",
            "A.K. Chandra", "V. Narahari Rao", "VN Kaul", "Vinod Rai",
            2
        )
        Questionlist.add(que5)
        /*val que6 = Question(
            1, "Which state houses the Great Indian Bustard Sanctuary?",
            "Maharashtra", "Assam", "Bihar", "Manipur",
            2
        )
        Questionlist.add(que6)
        val que7 = Question(
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