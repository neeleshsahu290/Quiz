package com.Neelesh.quiz.constaints_data

import com.Neelesh.quiz.data_class.Question

object BookAuthorObject {
    fun getQuestions(): ArrayList<Question> {
        val Questionlist = ArrayList<Question>()
        val que1 = Question(
            1, " Who wrote the Book “Gandhi and Stalin”?",
            " Raj Narayan", "Anita Desai", "Louis Fisher", "V.S.Naipaul",
            3
        )
        Questionlist.add(que1)
        val que2 = Question(
            1, "Which among the following is not a work of Rabindranath Tagore?",
            " Chitra", " Kapala Kundala", "The Court Dancer", "Chithrangada",
            2
        )
        Questionlist.add(que2)
        val que3 = Question(
            1, "Who is the author of the Book  ‘Across the Bench – Insight into the Indian Military Judicial System’?",
            "Gauri Lankesh", "General Bipin Rawat", "Madhav Gadgi", " Lt Gen Gyan Bhushan",
            4
        )
        Questionlist.add(que3)
        val que4 = Question(
            1, "Who is the author of the book ‘winning like sourav think & succeed like ganguly’?",
            "Kuldeeep Mishra", "Abhirup Bhattacharya", "Subodh Bhattacharya", "None of these",
            2
        )
        Questionlist.add(que4)
        val que5 = Question(
            1, "The book “No Spin” is the autobiography of",
            "Shane Warne", "Ricky Ponting", "Michael Clarke", "None of these",
            2
        )
        Questionlist.add(que5)

        val que6 = Question(
            1, "A new book on Maharana Pratap named “Maharana Pratap: The Invincible Warrior” authored by historian ",
            " Rima Hooja", "Shashi Tharoor", "Ramachandra Guha", "None of these",
            1
        )
        Questionlist.add(que6)

        val que7 = Question(
            1, " Who is the author of the book “Sea Prayer”?",
            "Dan Brown", "Khaled Hosseini", "Michael Clarke", "Yann Martel",
            2
        )
        Questionlist.add(que7)

        val que8 = Question(
            1, "The book “No Spin” is the autobiography of",
            "Shane Warne", "Ricky Ponting", "Michael Clarke", "None of these",
            2
        )
        Questionlist.add(que8)

        val que9 = Question(
            1, " Who is the author of the book “The Paradoxical Prime Minister”?",
            "Subramanian Swamy", "Arnab Goswami", "Shashi Tharoor", "None of these",
            3
        )
        Questionlist.add(que9)

        val que10 = Question(
            1, "Pm Modi released a book “Timeless Laxman”, based on the life and times of which legendary cartoonist?",
            "R. K. Laxman", " K. Shankar Pilla", "Abu Abraham", "None of these",
            1
        )
        Questionlist.add(que10)

        return Questionlist
    }
}