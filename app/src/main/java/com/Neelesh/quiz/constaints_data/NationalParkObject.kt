package com.Neelesh.quiz.constaints_data

import com.Neelesh.quiz.data_class.Question

object NationalParkObject {
    fun getQuestions(): ArrayList<Question> {
        val Questionlist = ArrayList<Question>()
        val que1 = Question(
            1, "Pench National Park is located in which state ?",
            "Madhya Pradesh" ,"Haryana" ,"Karnataka" ,"Maharashtra",
            1
        )
        Questionlist.add(que1)
        val que2 = Question(
            1, "Mahavir Harina Vanasthali National Park is located in which state of India ?",
            "Odisha" ,"Telangana" ,"Andhra Pradesh" ,"Tripura",
            2
        )
        Questionlist.add(que2)
        val que3 = Question(
            1,  "Which of the following is correctly matched ?",
            "Govind Wildlife Sanctuary – West Bengal",
            "Indravati National Park – Chhattisgarh",
            "Pin Valley National Park – Haryana",
            "Kalesar National Park – Himachal Pradesh",
            2
        )
        Questionlist.add(que3)
        val que4 = Question(
            1, "Which of the following is not located in Andaman and Nicobar Islands ?",
            "Campbell Bay National Park" ,"Galathea National Park","Mahatma National Park" ,"All of these",
            4
        )
        Questionlist.add(que4)
        val que5 = Question(
            1,  "Chandoli National Park is located in which state of India ?",
            "Meghalaya" ,"Manipur" ,"Maharashtra" ,"Mizoram",
            3
        )
        Questionlist.add(que5)
        val que6 = Question(
            1,   "Kanha National Park is located in which state ?",
            "Madhya Pradesh" ,"Maharashtra" ,"Kerala", "Assam",
            1
        )
        Questionlist.add(que6)
        val que7 = Question(
            1,  "Salim Ali National Park is located in",
                    "Kerala" ,"Haryana" ,"Jammu & Kashmir" ,"Sikkim",
            3
        )
        Questionlist.add(que7)
        val que8 = Question(
            1,  " Which of the following is located in Assam ?",
            "Periyar National Park" ,"Khangchendzonga Park" ,"Valmiki National Park" ,"Kaziranga National Park",
            4
        )
        Questionlist.add(que8)
        val que9 = Question(
            1,   "……………… National Park is located in Karnataka",
            "Gorumara National Park",
            "Nagarhole National Park",
            "Mahatma National Park",
            "Betla National Park",
            2
        )
        Questionlist.add(que9)
        val que10 = Question(
            1,  "Balphakram National Park located in which state ?",
            "Meghalaya" ,"Manipur" ,"Maharashtra" ,"Mizoram",
            1
        )
        Questionlist.add(que10)
        return Questionlist
    }
}