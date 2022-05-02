package com.Neelesh.quiz.constaints_data

import com.Neelesh.quiz.data_class.Question

object DamsindiaObject {
    fun getQuestions(): ArrayList<Question>{
        val Questionlist = ArrayList<Question>()
        val  que1 = Question(
            1, " Which of the following dams is not on the River Krishna?",
            "Nagar junasagar", "Krishnaraja Sagar", "Srisailam", "Alamatti",
            2
        )
        Questionlist.add(que1)
        val  que2 = Question(
            1, "Hirakud dam, one of the longest dams (length – 25.8 km) in the world is located on river",
            "Godavari", "Tungabhadra", "Mahanadi", "Brahmaputra",
            3
        )
        Questionlist.add(que2)
        val  que3 = Question(
            1, " Which of the following dams is also known as Maharana Pratap Sagar?",
            "Ukai Dam", "Pong Dam", "Thein Dam", "Koyna Dam",
            2
        )
        Questionlist.add(que3)
        val  que4 = Question(
            1, "Raighat dam is situated on river",
            "Narmada", "Sutlej", "Chambal", "Betwa",
            4
        )
        Questionlist.add(que4)
        val  que5 = Question(
            1, " On which river is the Bhakra Nangal Dam located",
            "Sutlej", "Ravi", "Chenab", "Beas",
            1
        )
        Questionlist.add(que5)
        val  que6 = Question(
            1, "On which river has ‘Naranarayan Setu’ been built?",
            "Ganga", "Brahmaputra", "Mahanadi", "Godavari",
            2
        )
        Questionlist.add(que6)
        val  que7 = Question(
            1, "Which of the following dams is located on the river Ravi?",
            "Pong", "Ukai", "Baglihar", "Thein",
            4
        )
        Questionlist.add(que7)

        val  que8 = Question(
            1, " Maithon Dam, which was in news during the 34th National Games is located on which of the following rivers?",
            "Damodar", "Barakar", "Hooghly", "Padma",
            2
        )
        Questionlist.add(que8)

        val  que9 = Question(
            1, "  The 'Govind Ballabh Pant Sagar' is the biggest artificial lake in India is formed behind which dam project?",
            "Rihand Dam Project", "Kosi Project", " Bhakhra-Nangal Project", "Damodar Valley Project",
            1
        )
        Questionlist.add(que9)

        val  que10 = Question(
            1, "Rihand Dam is situated on which of the following river?",
            " Chenab", "Rihand", " Yamuna", "Godavari",
            2
        )
        Questionlist.add(que10)

        return Questionlist
    }
}