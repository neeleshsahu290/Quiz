package com.Neelesh.quiz.constaints_data

import com.Neelesh.quiz.data_class.Question

object FirstMaleObject {
    fun getQuestions(): ArrayList<Question> {
        val Questionlist = ArrayList<Question>()
        val que1 = Question(
            1, "First Aircraft Carrier Indian Ship",
                    "Acharya Vinoba Bhave",
                    "RD Katari",
                    "AK Gopalan",
                    "Vikrant",
            4

        )
        Questionlist.add(que1)
        val que2 = Question(
            1, "First Sikh President of India",
                    "Gyani Zail Singh",
                    "Rakesh Sharma",
                    "Bhanu Athaiya",
                    "Ruskin Bond",
            1

        )
        Questionlist.add(que2)
        val que3 = Question(
            1, "India’s First Open University",
        "Andhra Pradesh University",
        "Delhi University",
                "Mumbai University",
                "Nalanda University",
            1

        )
        Questionlist.add(que3)
        val que4 = Question(
            1, "First Indian Cosmonaut",
                    "Saiffudin Kichlu",
                    "Dr Hargovind Khurana",
                    "Rakesh Sharma",
                    "C Rajgopalachari",
            3

        )
        Questionlist.add(que4)
        val que5 = Question(
            1, "Who was the first Indian Scientist to win a Nobel Prize?",
            "A. CV Raman",
            "B. Amartya Sen",
            "C. Hargobind Khorana",
            "D. Subramanian Chrandrashekar",
            1
        )
        Questionlist.add(que5)
        val que6 = Question(
            1, "The first Indian to cross English Channel",
            "Mihir Sen",
            "Charan Singh",
            "C. Rajgopalachari",
            "Satyendra Nath Tagore",
            1
        )
        Questionlist.add(que6)
        /*val que7 = Question(
            1, "Where is Vedanthangal Bird Sanctuary present ?",
            "Kerala", "Assam", "Andhra Pradesh", "Tamil Nadu",
            4
        )
        Questionlist.add(que7)
        val que8 = Question(
            1, "Which of the following bird sanctuaries is not present in Andhra Pradesh ?",
            "Atapaka Bird Sanctuary", "Pulicat Lake Bird Sanctuary", "Khijadiya Bird Sanctuary", "Nelapattu Bird Sanctuary",
            3
        )
        Questionlist.add(que8)
        val que9 = Question(
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