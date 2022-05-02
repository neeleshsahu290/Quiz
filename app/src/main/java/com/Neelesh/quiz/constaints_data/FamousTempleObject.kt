package com.Neelesh.quiz.constaints_data

import com.Neelesh.quiz.data_class.Question

object FamousTempleObject {
    fun getQuestions(): ArrayList<Question> {
        val Questionlist = ArrayList<Question>()
        val que1 = Question(
            1, "Tungnath Temple is situated in which Indian city?",
            "Chamoli" ,"Mandi" ,"Chamba","Shimla",
            1
        )
        Questionlist.add(que1)
        val que2 = Question(
            1, "Sri Ranganathaswamy Temple is dedicated to which deity?",
            "Lord Shiva" ,"Lord Vishnu" ,"Goddess Durga" ,"Goddess Lakshm",
            2
        )
        Questionlist.add(que2)
        val que3 = Question(
            1, "In which place Govardhan Math is situated, which established by Shankaracharya?",
            "Cuttack", "Puri","Bhubaneswar" ,"Hyderabad",
            2
        )
        Questionlist.add(que3)
        val que4 = Question(
            1,  "In which place Sharda Math is situated, which established by Shankaracharya?",
            "Bhuj", "Rajkot" ,"Dwarka" ,"Surat",
            3
        )
        Questionlist.add(que4)
        val que5 = Question(
            1, "In which place Jyothi Math is situated, which established by Shankaracharya?",
            "Kedarnath" ,"Badrikasram" ,"Haridwar" ,"Rishikesh",
            2
        )
        Questionlist.add(que5)
        val que6 = Question(
            1, "The Gadkalika Devi temple is located in which city?",
            "Nashik" ,"Mumbai" ,"Indore" ,"Ujjain",
        4
        )
        Questionlist.add(que6)
        val que7 = Question(
            1, "Mundeshwari Temple is located in which district of Bihar?",
            "Sitamarhi" ,"Kaimur" ,"Gaya" ,"Bhagalpur",
            2
        )
        Questionlist.add(que7)
        val que8 = Question(
            1, "Where is Khajuraho Temples located?" ,
            "Ujjain, Madhya Pradesh",
            "Guwahati, Assam",
            "Chhatarpur, Madhya Pradesh" ,
                    "Varanasi, Uttar Pradesh",
            3
        )
        Questionlist.add(que8)
        return Questionlist
    }
}