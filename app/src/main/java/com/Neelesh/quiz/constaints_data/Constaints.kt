package com.Neelesh.quiz.constaints_data

import com.Neelesh.quiz.data_class.Question

object Constaints {

    const val User_name : String = "user name"
    const val total_question : String = "total question"
    const val correct_answers : String ="correct answers"




    fun getQuestions(): ArrayList<Question>{
        val Questionlist = ArrayList<Question>()
        val  que1 = Question(
            1, "What is the Capital of Andhra Pradesh",
            "Truvendurum", "Hyderabad", "Amaravati", "Chennai",
            3
        )
        Questionlist.add(que1)
        val  que2 = Question(
            1, "What is the Capital of Arunachal Pradesh",
            "Gwatahi", "Itanagar", "Tezu", "Tawang",
            2
        )
        Questionlist.add(que2)
        val  que3 = Question(
            1, "What is the Capital of Assam",
            "raipur", "Tsang", "Dispur", "panaji",
            3
        )
        Questionlist.add(que3)
        val  que4 = Question(
            1, "What is the Capital of Bihar",
            "Patna", "Gaya", "Mumba", "Pune",
            1
        )
        Questionlist.add(que4)
        val  que5 = Question(
            1, "What is the Capital of Chattigarh",
            "Dehli", "Raipur", "bombay", "kolkata",
            2
        )
        Questionlist.add(que5)
        val  que6 = Question(
            1, "What is the Capital of Goa",
            "Panaji", "indore", "bombay", "kolkata",
            1
        )
        Questionlist.add(que6)
        val  que7 = Question(
            1, "What is the Capital of Gujarat",
            "Dehli", "indore", "Ahemdabad", "Ghandhinagar",
            4
        )
        Questionlist.add(que7)
        val  que8 = Question(
            1, "What is the Capital of Haryana",
            "Dehli", "Chandigarh", "bombay", "kolkata",
            2
        )
        Questionlist.add(que8)
        val  que9 = Question(
            1, "What is the Capital of Himachal Pradesh",
            "Shimla", "indore", "Ranchi", "kolkata",
            1
        )
        Questionlist.add(que9)
        val  que10 = Question(
            1, "What is the Capital of Jharkhand",
            "Dehli", "indore", "Ranchi", "kolkata",
            3
        )
        Questionlist.add(que10)
        val  que11 = Question(
            1, "What is the Capital of Karnataka",
            "Dehli", "Banglore", "bombay", "kolkata",
            2
        )
        Questionlist.add(que11)
        val  que12 = Question(
            1, "What is the Capital of Kerla",
            "Dehli", "indore", "bombay", "Thiruvanthapuram",
            4
        )
        Questionlist.add(que12)
        val  que13 = Question(
            1, "What is the Capital of Madhya Pradesh",
            "Dehli", "indore", "bhopal", "kolkata",
            3
        )
        Questionlist.add(que13)

        val  que15 = Question(
            1, "What is the Capital of Manipur",
            "Dehli", "indore", "Imphal", "kolkata",
            3
        )
        Questionlist.add(que15)
        val  que16 = Question(
            1, "What is the Capital of Mizoram",
            "Dehli", "indore", "bombay", "Aizawl",
            4
        )
        Questionlist.add(que16)
        val  que17 = Question(
            1, "What is the Capital of Meghalaya",
            "Shillong", "indore", "bombay", "kolkata",
            1
        )
        Questionlist.add(que17)
        val  que18 = Question(
            1, "What is the Capital of Nagaland",
            "Dehli", "Kohima", "bombay", "kolkata",
            2
        )
        Questionlist.add(que18)
        val  que19 = Question(
            1, "What is the Capital of Odisha",
            "Dehli", "Bhubaneswar", "bombay", "kolkata",
            2
        )
        Questionlist.add(que19)
        val  que20 = Question(
            1, "What is the Capital of Punjab",
            "Chandigarh", "Chattigarh", "Patila", "Lucknow",
            1
        )
        Questionlist.add(que20)
        val  que21 = Question(
            1, "What is the Capital of Rajasthan",
            "jasalmer", "jodhpur", "Jaipur", "Bikaner",
            3
        )
        Questionlist.add(que21)
        val  que22 = Question(
            1, "What is the Capital of Sikkim",
            "Dehli", "indore", "bombay", "Gangtok",
            4
        )
        Questionlist.add(que22)

        val  que24 = Question(
            1, "What is the Capital of Telangana",
            "Raipur", "indore", "Ambravati", "Hyderabad",
            4
        )
        Questionlist.add(que24)
        val  que25 = Question(
            1, "What is the Capital of Uttar Pradesh",
            "Agra", "Lucknow", "Bhopal", "Varanashi",
            2
        )
        Questionlist.add(que25)
        val  que26 = Question(
            1, "What is the Capital of Tripura",
            "Gwatahi", "kohima", "Agartala", "kolkata",
            3
        )
        Questionlist.add(que26)
        val  que27 = Question(
            1, "What is the Capital of Uttrakhand",
            "Dehli", "indore", "Dehradun", "kolkata",
            3
        )
        Questionlist.add(que27)


        return Questionlist
    }
}