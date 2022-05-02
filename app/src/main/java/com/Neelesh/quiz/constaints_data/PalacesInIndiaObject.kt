package com.Neelesh.quiz.constaints_data

import com.Neelesh.quiz.data_class.Question

object PalacesInIndiaObject {
    fun getQuestions(): ArrayList<Question> {
        val Questionlist = ArrayList<Question>()
        val que1 = Question(
            1, "Where the Bishnupur Group of Temples is located in India",
            "Uttarakhand" ,"UttaraPradesh" ,"Bihar" ,"West Bengal",
            4
        )
        Questionlist.add(que1)
        val que2 = Question(
            1, "Where is Golconda Fort located in India." ,
            "Telangana" ,"Rajastan" ,"Delhi" ,"Punjab",
        1

        )
        Questionlist.add(que2)
        val que3 = Question(
            1, "Where is Dindigul Fort located in India.",
            "Andhra Pradesh" ,"Tamil Nadu" ,"Telangana","Karnataka",
            2

        )
        Questionlist.add(que3)
        val que4 = Question(
            1, "Chittaurgarh Fort is located in",
            "Madhya Pradesh" ,"Delhi" ,"Rajastan" ,"Hyderabad",
            3

        )
        Questionlist.add(que4)
        val que5 = Question(
            1, "Gwalior Fort is located in" ,
                    "Madhya Pradesh" ,"Uttar Pradesh" ,"Arunachal Pradesh" ,"Telangana",
            1
        )
        Questionlist.add(que5)
        val que6 = Question(
            1, "Where is Kangra Fort located in India.",
            "Uttar Pradesh" ,"Himachal Pradesh" ,"Rajastan","Haryana",
            2
        )
        Questionlist.add(que6)
        val que7 = Question(
            1, "Rani-Ki-Vav is located in",
            "Gujarat" ,"Madhya Pradesh" ,"Rajastan" ,"Maharashtra",
            1
        )
        Questionlist.add(que7)
        val que8 = Question(
            1, "Where is located Jantar Mantar in India.",
            "Delhi" ,"Hyderabad" ,"Rajastan" ,"Jammu & Kashmir",
            1

        )
        Questionlist.add(que8)
        val que9 = Question(
            1, "Where is Karanghar Palace located  in India.",
            "Assam" ,"Odisha" ,"Rajastan" ,"Delhi",
            1
        )
        Questionlist.add(que9)
        val que10 = Question(
            1, "Where is located 'Kotla Feroz Shah' in India.",
            "Delhi" ,"Mumbai" ,"Kolkata" ,"Hyderabad",
            1
        )
        Questionlist.add(que10)
        return Questionlist
    }
}