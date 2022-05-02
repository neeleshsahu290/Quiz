package com.Neelesh.quiz.constaints_data

import com.Neelesh.quiz.data_class.Question

object BirdSanctuaryObject {
    fun getQuestions(): ArrayList<Question> {
        val Questionlist = ArrayList<Question>()
        val que1 = Question(
            1, "Chintamoni Kar Bird Sanctuary is located in which state ?",
            "Kerala", "West Bengal", "Karnataka", "Tamil Nadu",
            2
        )
        Questionlist.add(que1)
        val que2 = Question(
            1, "Which state houses the Attiveri Bird Sanctuary ?",
            "Punjab", "Odisha", "Karnataka", "Uttar Pradesh",
            3
        )
        Questionlist.add(que2)
        val que3 = Question(
            1, "Which of the following bird sanctuaries is not present in Bihar ? ",
            "Nagi Dam Bird Sanctuary", "Najafgarh drain bird sanctuary", "Nakti Dam Bird Sanctuary", "Bhimband Wildlife Sanctuary",
            2
        )
        Questionlist.add(que3)
        val que4 = Question(
            1, "In which state is Porbandar Bird Sanctuary present?",
            "Uttar Pradesh", "West Bengal", "Himachal Pradesh", "Gujarat",
            4
        )
        Questionlist.add(que4)
        val que5 = Question(
            1, "Which state houses the Great Indian Bustard Sanctuary?",
            "Maharashtra", "Assam", "Bihar", "Manipur",
            2
        )
        Questionlist.add(que5)
        val que6 = Question(
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
        Questionlist.add(que10)
        return Questionlist
    }
}