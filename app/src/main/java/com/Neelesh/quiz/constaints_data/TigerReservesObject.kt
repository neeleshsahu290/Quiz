package com.Neelesh.quiz.constaints_data

import com.Neelesh.quiz.data_class.Question

object TigerReservesObject {
    fun getQuestions(): ArrayList<Question> {
        val Questionlist = ArrayList<Question>()
        val que1 = Question(
            1, "Rajaji Tiger Reserve is located in which state ?",
            "Meghalaya", "Kerala", "Uttarakhand", "Maharashtra",
            3
        )
        Questionlist.add(que1)
        val que2 = Question(
            1, "The Tiger reserve located in Tamil Nadu is",
            "Sariska Tiger Reserve", "Sathyamangalam Tiger Reserve", "Pilibhit Tiger Reserve", "Mukundara Hills Tiger Reserve",
            2
        )
        Questionlist.add(que2)
        val que3 = Question(
            1, "Ranthambore Tiger Reserve lies in which state of India ?",
            "Rajasthan", "Kerala", "Karnataka", "BIhar",
            1
        )
        Questionlist.add(que3)
        val que4 = Question(
            1, "Pench Tiger Reserve is located in which of the following state ?",
            "Maharashtra", "Oddisa", "Assam", "Gujarat",
            1
        )
        Questionlist.add(que4)
        val que5 = Question(
            1, "Kanha Tiger Reserve is situated in",
            "Maharastra", "Madhya Pradesh", "Rajasthan", "Tamil Nadu",
            2
        )
        Questionlist.add(que5)
        val que6 = Question(
            1, "Which Tiger reserve is located in Karnataka ?",
            "Periyar Tiger Reserve", "Achanakmar Tiger Reserve", "Valmiki Tiger Reserve", "Nagarhole Tiger Reserve",
            4
        )
        Questionlist.add(que6)
        val que7 = Question(
            1, "Indravati Tiger Reserves is located in which state ?",
            "Odisha", "Chhattisgrah", "Rajasthan", "Tamil Nadu",
            2
        )
        Questionlist.add(que7)
        val que8 = Question(
            1, "Biligiri Rangaswamy Temple Tiger Reserve is located in which state?",
            "Karnataka", "Tamil Nadu", "Kerala", "Telangana",
            1
        )
        Questionlist.add(que8)
        val que9 = Question(
            1, "In which of the following state is Kawal Tiger Reserve located?",
            "Maharastra", " Kerala", "Rajasthan", "Telangana",
            2
        )
        Questionlist.add(que9)
        val que19 = Question(
            1, "Dudhwa Tiger Reserve is located in which state?",
            "Bihar", "Uttar Pradesh", "Rajasthan", "Jharkhand",
            2
        )
        Questionlist.add(que19)

        return Questionlist
    }
}