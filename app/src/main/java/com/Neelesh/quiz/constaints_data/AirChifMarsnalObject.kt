package com.Neelesh.quiz.constaints_data

import com.Neelesh.quiz.data_class.Question

object AirChifMarsnalObject {
    fun getQuestions(): ArrayList<Question> {
        val Questionlist = ArrayList<Question>()
        val que1 = Question(
            1,  "Who was the first and the only Param Vir Chakra recipient of Indian Air Force?",
        "a) Nirmal Jit Singh Sekhon",
        "b) Arun Khetarpal",
        "c) Somnath Sharma",
        "d) None of these",
            1
        )
        Questionlist.add(que1)
        val que2 = Question(
            1, "Who was the first Indian to be the chief of air staff?",
                    "a) Subrata Mukherjee",
        "b) Subroto Mukerjee",
        "c) Arjan Singh",
        "d) None of these",
            2


        )
        Questionlist.add(que2)
        val que3 = Question(
            1, "Where is the headquarters of IAF?",
        "a) Kolkata",
        "b) Mumbai",
        "c) New Delhi",
        "d) Banglore",
        3

        )
        Questionlist.add(que3)
        val que4 = Question(
            1,  "Who is the current Chief Marshal of the Air Force?",
        "a) Arjan Singh",
        "b) Arup Raha",
        "c) Rakesh Kumar Singh Bhadauria",
        "d) Birender Singh Dhanoa",
        3
        )
        Questionlist.add(que4)
        val que5 = Question(
            1,  "Who was the first and the only five star rank officer of IAF?",
        "a) K M Cariappa",
        "b) Arjan Singh",
        "c) Sam Manekshaw",
        "d) None of these",
        2
        )
        Questionlist.add(que5)
        val que6 = Question(
            1,  "What was the prior name of Indian Air Force?"
        ,"a) Hawai IAF",
        "b) Royal IAF",
        "c) Sky IAF",
            "d) None of these",
            2

        )
        Questionlist.add(que6)
        val que7 = Question(
            1, "Who is the first woman Air Marshal of Indian Air Force?",
                    "a) Harita Kaur Deol",
                "b) Punita Arora",
        "c) Padmavathy Bandopadhyay",
        "d) None of these",
            3
        )
        Questionlist.add(que7)
        val que8 = Question(
            1, "Who was the Chief of the Air Staff of IAF during 1971 war?",
                    "a) Subroto Mukerjee",
        "b) Arjan Singh",
        "c) Pratap Chandra Lal",
        "d) None of these",
            3
        )
        Questionlist.add(que8)
        val que9 = Question(
            1,  "Who is the father of Indian Air Force?",
        "a) Pratap Chandra Lal",
        "b) Subroto Mukerjee",
        "c) Arjan Singh",
        "d) None of these",
            2
        )
        Questionlist.add(que9)
        val que10 = Question(
            1, "Who was the chief of the air staff of IAF during Kargil war?",
        "a) Shashindra Pal Tyagi",
        "b) Anil Kumar Browne",
        "c) Anil Yashwant Tipnis",
        "d) None of these",
            3
        )
        Questionlist.add(que10)
        return Questionlist
    }
}