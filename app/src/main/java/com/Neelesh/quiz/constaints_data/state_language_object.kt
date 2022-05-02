package com.Neelesh.quiz.constaints_data

import com.Neelesh.quiz.data_class.Question

object state_language_object {


    fun getQuestions(): ArrayList<Question>{
        val Questionlist = ArrayList<Question>()
        val  que1 = Question(
            1, "Dogri language is spoken in which state ?",
            "Punjab", "Himachal Pradesh", "Jammu and Kashmir", "Utter pradesh",
            3
        )
        Questionlist.add(que1)
        val  que2 = Question(
            1, "The main language of Goa is",
            "English", "Marathi", "Portuguese", "Konkani",
            4
        )
        Questionlist.add(que2)
        val  que3 = Question(
            1, "The Official language of pondicherry is",
            "Hindi", "English", "Kannada", "Konkani",
            2
        )
        Questionlist.add(que3)
        val  que4 = Question(
            1, "The Official language of Andhra Pradesh ",
            "Tamil", "Telugu", "Hindi", "Odia",
            2
        )
        Questionlist.add(que4)
        val  que5 = Question(
            1, "Malayalam language is spoken in which state",
            "Karnataka", "Tamil Nadu", "Chhattigarh", "kerala",
            4
        )
        Questionlist.add(que5)
        val  que6 = Question(
            1, "Khasi language is spoken in which state",
            "Meghalaya", "Manipur", "Mizoram", "Nagaland",
            1
        )
        Questionlist.add(que6)
        val  que7 = Question(
            1, "The Official language of Jammu and Kashmir is",
            "Kashmari", "Urdu", "Hindi", "English",
            2
        )
        Questionlist.add(que7)
        val  que8 = Question(
            1, "The Official language of Chandigarh is",
            "English", "Punjabi", "Hindi", "Urdu",
            1
        )
        Questionlist.add(que8)
        val  que9 = Question(
            1, "Kookborok language is spoken in which state",
            "Meghalaya", "Manipur", "Mizoram", "Tripura",
            4
        )
        Questionlist.add(que9)
        val  que10 = Question(
            1, "The Official language of Delhi is",
            "English", "Hindi", "Punjabi", "Urdu",
            2
        )
        Questionlist.add(que10)



        return Questionlist
    }
}