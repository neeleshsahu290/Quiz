package com.Neelesh.quiz.constaints_data

import com.Neelesh.quiz.data_class.Question

object CbiDirectorObject {
    fun getQuestions(): ArrayList<Question> {
        val Questionlist = ArrayList<Question>()
        val que1 = Question(
            1,  "When was the Central Bureau of Investigation established?",
            "(a) 1982", "(b) 1963","(c) 1956","(d) 1971",
            2
        )
        Questionlist.add(que1)
        val que2 = Question(
            1, "Which committee recommended to establish the Central Bureau of Investigation?",
            "(a) Santhanam Committee",
                "(b) Rajmannar Committee","(c) Punchhi Committee","(d) None of the above",
            1
        )
        Questionlist.add(que2)
        val que3 = Question(
            1,  "Who appointments the director of Central Bureau of Investigation?",
            "(a) President",
            "(b) Prime Minister",
            "(c) Committee constituted under the chairmanship of Central Vigilance Commissioner",
            "(d) Committee constituted under the chairmanship of the Home Minister",
            3
        )
        Questionlist.add(que3)
        val que4 = Question(
            1,  "What is the tenure of director of Central Bureau of Investigation?",
            "(a) 5 years"  ,"(b) 4 years","(c) 3 years","(d) 2 years",
            2
        )
        Questionlist.add(que4)
        val que5 = Question(
            1,  "The Central Bureau of Investigation comes under the........",
            "(a) Ministry of Home Affairs",
            "(b) Ministry of Personnel and Training",
            "(c) Ministry of Women and Child Development",
            "(d) Ministry of Law",
            2
        )
        Questionlist.add(que5)
        val que6 = Question(
            1, "Who is the current Director of Central Bureau of Investigation?",
        "a) Rakesh Asthana",
        "b) A P Singh",
        "c) Rakesh Kumar Singh Bhadauria",
            "d) Rishi Kumar Shukla",
            4
        )
        Questionlist.add(que6)
        val que7 = Question(
            1,  "Which of the following works as the 'National Central Bureau' of INTERPOL?",
            "(a) Central Vigilance Commission",
            "(b) Central Bureau of Investigation",
            "(c) Chief Information Commissioner",
            "(d) Ministry of law",
            2
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