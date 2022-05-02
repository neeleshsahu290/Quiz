package com.Neelesh.quiz.constaints_data

import com.Neelesh.quiz.data_class.Question

object SuperlativeIndiaObject {
    fun getQuestions(): ArrayList<Question> {
        val Questionlist = ArrayList<Question>()
        val que1 = Question(
            1,  "What is the Largest Museum in India?",
            "a) National Museum,New Delhi " ,
                    "b) Indian museum, Kolkatta",
                            "c) Sri Venkateshwara Museum",
                                    "d) Amaravathi Museum , Amarathi",
            2
        )
        Questionlist.add(que1)
        val que2 = Question(
            1, "what is the Largest Auditorium in India?",

                    "a) Sri Shanmukhananda Hall (Mumbai)",

        "b) FICCI Auditorium",

        "c) Ambedkar Auditorium",

        "d) Kamani Auditorium",
            1
        )
        Questionlist.add(que2)
        val que3 = Question(
            1, "In which State highest waterfall is situated?",
            "a) Talakona (Chittor)",
                    "b) Dabbe Falls (Karnataka)",
                            "c) Bagra Falls (Odisha)",
            "d) Kunchikal Falls (Karnataka)",
            4
        )
        Questionlist.add(que3)
        val que4 = Question(
            1,  "what is the longest river of South India?",
            "a) Mahanadi" ,"b) Krishna" ,"c) Tapti" ,"d) Godawari",
            4
        )
        Questionlist.add(que4)
        val que5 = Question(
            1, "What is the Largest Public sector Bank?",
                    "a) Bank of India",
                "b) Canara Bank",
        "c) Central Bank of India",
        "d) State Bank of India",
            4
        )
        Questionlist.add(que5)

        val que6 = Question(
            1, "What is the largest Saline Water Lake?",
            "a) Sambhar lake, Rajasthan " ,
                    "b) Wular Lake " ,
                    "c) Pulicat Lake " ,
                    "d) Tulsi Lake",
            1
        )
        Questionlist.add(que6)

        val que7 = Question(
            1,  "What is the highest Airport in India?",
            "a) Indira Gandhi International Airport " ,
                    "b) Rajiv Gandhi International Airport " ,
                    "c) Bengaluru International Airport " ,
                    "d) Leh Airport (Ladakh)",
            4
        )
        Questionlist.add(que7)

        val que8 = Question(
            1,  "In which State has a longest Coastal Line?",
            "a) Gujarat " ,
                    "b) Kerala " ,
                    "c) Andhra Pradesh " ,
                    "d) Madya Pradesh",
            1
        )
        Questionlist.add(que8)

        val que9 = Question(
            1,  "In which Place Longest Sea beach Located? " ,
                    "a) Gokarna " ,
                    "b) Chennai " ,
                    "c) Kovalam " ,
                    "d) Kerala",
            2
        )
        Questionlist.add(que9)

        val que10 = Question(
            1,  "Which Temple has a longest Corridar?",
            "a) Ramanathaswamy Temple " ,
                    "b) Lingaraja Temple " ,
                    "c) Meenakshi Amman Temple " ,
                    "d) Omkareshwar Temple",
            1
        )
        Questionlist.add(que10)

        return Questionlist
    }
}