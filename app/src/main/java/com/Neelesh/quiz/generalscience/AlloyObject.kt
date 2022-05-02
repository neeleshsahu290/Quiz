package com.Neelesh.quiz.generalscience

import com.Neelesh.quiz.data_class.Question

object AlloyObject {
    fun getQuestions(): ArrayList<Question> {
        val Questionlist = ArrayList<Question>()
        val que1 = Question(
            1,  "Which metal exists as a common component in Brass, Bronze and German Silver?, "+
                    "ब्रास, कांस्य और जर्मन रजत में एक आम घटक के रूप में कौन सा धातु मौजूद है?",
        "(a) Antimony / एंटीमोनी" ,
                "(b) Copper / कॉपर" ,
                "(c) Tin / टिन" ,
                "(d) Zinc  / जिंक",
            2
        )
        Questionlist.add(que1)
        val que2 = Question(
            1,"Which alloy contains nickel? " ,
                    "A.  Brass " ,
                    "B.  Bronze " ,
                    "C.  Invar " ,
                    "D.  Solder",
            3
        )
        Questionlist.add(que2)
        val que3 = Question(
            1,  "Brass is an alloy of, "+
        "पीतल किसकी मिश्र धातु है?",
            "(a) Copper and Nickel  / कॉपर और निकेल" ,
                    "(b) Nickel and Zinc  / निकेल और जिंक" ,
                    "(c) Copper and Zinc  / कॉपर और जिंक" ,
                    "(d) Iron and Nickel  / आयरन और निकेल",
            3

        )
        Questionlist.add(que3)
        val que4 = Question(
            1,   "Which one of the following elements is not present in stainless steel? " ,
                    "A.  Iron " ,
                    "B.  Tungsten " ,
                    "C.  Chromium " ,
                    "D.  Nickel",
            2
        )
        Questionlist.add(que4)
        val que5 = Question(
            1,  "Bronze is an alloy of " ,
                    "A.  Tin and zinc " ,
                    "B.  Iron and zinc " ,
                    "C.  Copper and zinc " ,
                    "D.  Copper and tin",
            4
        )
        Questionlist.add(que5)
        val que6 = Question(
            1,  "Which two metals combine to form Bell metal?" ,
                    "nickel and copper " ,
                            "zinc and copper " ,
                            "tin and copper " ,
                            "brass and nickel",
            3

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
            1, "Duralumin is an alloy of copper and " ,
                    "lead " ,
                    "zinc " ,
                    "tin " ,
                    "aluminium " ,
                    4
        )
        Questionlist.add(que8)
        /*val que9 = Question(
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
        Questionlist.add(que10)*/
        return Questionlist
    }
}