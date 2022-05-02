package com.Neelesh.quiz.constaints_data

import com.Neelesh.quiz.data_class.Question

object FirstFemaleObject {
    fun getQuestions(): ArrayList<Question> {
        val Questionlist = ArrayList<Question>()
        val que1 = Question(
            1,  "Who is the first women prime minister of India?",

                "(A) Mrs. Unnnati Sharma",
            "(B) Mrs. Indira Gandhi",
            "(C) Sarojini Naidu",
            "(D) Rekha Sain",
            2
        )
        Questionlist.add(que1)
        val que2 = Question(
            1,  "Who is the first woman Chief Minister of a State?",

        "(A) Ujwala Rai",
            "(B) Sucheta Kripalani",
            "(C) Razia Sultana",
            "(D) Rekha Sain",
            2
        )
        Questionlist.add(que2)
        val que3 = Question(
            1,  "Who is the first woman Minister?",

        "(A)Ujwala Rai","(B) Vijaya Laxmi Pandit",
            "(C) Leila Seth", "(D) Mother Teresa",
            2
        )
        Questionlist.add(que3)
        val que4 = Question(
            1, "Who is the first woman Speaker of Lok Sabha?",

                "(A) Laxmi Devi","(B) Pratibha Patil",
            "(C) Sushmita Sen","(D) Shanno Devi",
            4
        )
        Questionlist.add(que4)
        val que5 = Question(
            1,  "Who is the first Indian woman President of UN General Assembly",
            "(A) Vijay Laxmi Pandit",
            "(B) Indira Gandhi",
            "(C) Kiran Bedi",
            "(D) Leila Seth",
            1
        )
        Questionlist.add(que5)
        val que6 = Question(
            1, "Who is the first Indian woman President of Indian National Congress?",

                "(A) Indira Gandhi",
            "(B) Annie Besant",
            "(C) Kiran Bedi",
            "(D) Leila Seth",
            2
        )
        Questionlist.add(que6)
        val que7 = Question(
            1,  "Who is the first Muslim woman to sit on the throne on Delhi?",

                "(A) Laxmi Bai",
            "(B) Leila Seth",
            "(C) Arti Shah",
            "(D) Rajia Sultana",
            4
        )
        Questionlist.add(que7)
        val que8 = Question(
            1, "Who is the first woman to swim across the English Channel?",
            "(A) Leila Seth",
            "(B) Sushmita Sain",
            "(C)  Arti Shah",
            "(D) Kiran Bedi",
            3
        )
        Questionlist.add(que8)
        /*val que9 = Question(
            1, "Which of the following pairs is incorrect?",
            "Kutch Bustard Sanctuary – Gujarat", "Khaparwas Wildlife Sanctuary – Rajasthan", "Bankapura Peacock Sanctuary – Karnataka", "Pakshipathalam Bird Sanctuary – Kerala",
            2
        )
        Questionlist.add(que9)
        val que10 = Question(
            1, "Which of the following pairs is correct?",
            "Mayani Bird Sanctuary – Assam", "Harike bird sanctuary – Punjab", "Khichan Bird Sanctuary – Tamil Nadu", "Vettangudi Bird Sanctuary – Uttar Pradesh",
            2
        )
        Questionlist.add(que10)*/
        return Questionlist
    }
}