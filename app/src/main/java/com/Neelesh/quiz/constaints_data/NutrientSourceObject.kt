package com.Neelesh.quiz.constaints_data

import com.Neelesh.quiz.data_class.Question

object NutrientSourceObject {
    fun getQuestions(): ArrayList<Question> {
        val Questionlist = ArrayList<Question>()
        val que1 = Question(
            1, " Different types of Vitamins are:",
            "A. Fat-Soluble " ,
                    "B. Water-Soluble" ,
                    "C. Both A and B " ,
                    "D. None of the above",
            3
        )
        Questionlist.add(que1)
        val que2 = Question(
            1, "Fat soluble Vitamins are:",
                    "A. Vitamin A" ,
                            "B. Vitamin D " ,
                            "C. Vitamin E " ,
                            "D. All of the above",
                    4
        )
        Questionlist.add(que2)
        val que3 = Question(
            1,   "Niacin is the chemical name of which Vitamin?",
        "A. Vitamin B3 " ,
                "B. Vitamin B1 " ,
                "C. Vitamin B2 " ,
                "D. Vitamin C",
            1
        )
        Questionlist.add(que3)
        val que4 = Question(
            1,  "Name the Vitamin that protects us from Pellagra disease?",
        "A. Vitamin B5 " ,
                "B. Vitamin B7 " ,
                "C. Vitamin B3 " ,
                "D. None of the above",
            3
        )
        Questionlist.add(que4)
        val que5 = Question(
            1,  "Retinol is the scientific name of which Vitamin? " ,
                    "A. Vitamin A " ,
                    "B. Vitamin D " ,
                    "C. Vitamin K " ,
                    "D. Vitamin C",
            1
        )
        Questionlist.add(que5)
        val que6 = Question(
            1,   "Vitamin C is present in:",
            "A. Tomatoes ",
                    "B. Papaya " ,
                    "C. Guava " ,
                    "D. All of the above " ,
                    4
        )
        Questionlist.add(que6)
        val que7 = Question(
            1,  "Vitamin A was discovered in which year?" ,
                    "A. 1910 " ,
                    "B. 1912 " ,
                    "C. 1922 " ,
                    "D. 1927",
            2
        )
        Questionlist.add(que7)
        val que8 = Question(
            1,   "Liver damage is caused due to the overdose of which vitamin?",
        "A. Vitamin B1 " ,
                "B. Vitamin B2 " ,
                "C. Vitamin B3 " ,
                "D. Vitamin D",
            3
        )
        Questionlist.add(que8)
        val que9 = Question(
            1,   "Name a substance that makes a vitamin metabolically ineffective?",
        "A. Anti-vitamin " ,
                "B. Antioxidants " ,
                "C. Cynocobalamine " ,
                "D. Riboflavinosis",
            1
        )
        Questionlist.add(que9)
        val que10 = Question(
            1,  "Name the vitamin which are essential for the health of the brain?",
        "A. Vitamin B6 " ,
                "B. Vitamin B9 " ,
                "C. Vitamin B12 " ,
                "D. All the above",
            4
        )
        Questionlist.add(que10)
        return Questionlist
    }
}