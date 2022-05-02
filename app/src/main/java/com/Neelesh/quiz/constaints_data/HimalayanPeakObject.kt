package com.Neelesh.quiz.constaints_data

import com.Neelesh.quiz.data_class.Question

object HimalayanPeakObject {
    fun getQuestions(): ArrayList<Question> {
        val Questionlist = ArrayList<Question>()
        val que1 = Question(
            1,  "How many major mountain ranges having peaks of over 1000 meters are in India?",
        "4","6","8","2",
            2
        )
        Questionlist.add(que1)
        val que2 = Question(
            1, "Which is the highest Indian peak?",
        "Kangchenjunga" ,"Nanda Devi" ,"K10" ,"Kamet",
        1
            )
        Questionlist.add(que2)
        val que3 = Question(
            1, "Kangchenjunga is situated in which state?",
            "Uttarakhand" ,"Sikkim","J&K" ,"Arunachal Pradesh",
            2
        )
        Questionlist.add(que3)
        val que4 = Question(
            1, "What do you mean by world ‘Himalaya’?",
        "Land of peaks",
        "Land of rising sun",
            "Adobe of snow",
        "Land of mountains",
            3
        )
        Questionlist.add(que4)
        val que5 = Question(
            1, "Which of the following is the youngest range in India?",
            "Karakoram", "Pir Panjal Range" ,"Satpura" ,"Himalaya",
            4
        )
        Questionlist.add(que5)
        val que6 = Question(
            1, "Which is considered as the western point of the Himalayas?",
        "Nanga Parbat" ,"Namcha Barwa" ,"K2" ,"Kanchenjunga",
            1
        )
        Questionlist.add(que6)
        val que7 = Question(
            1, "Which mountain range lies under the disputed category of Indian and Pakistan?",
            "Himalaya" ,"Karakoram Range" ,"Pir Panjal Range" ,"None of these",
            2
        )
        Questionlist.add(que7)
        val que8 = Question(
            1, "Which range is also known as Lower Himalayas?",
            "Himalaya" ,"Karakoram Range" ,"Pir Panjal Range" ,"Vindhyachal",
            3
        )
        Questionlist.add(que8)
        return Questionlist
    }
}