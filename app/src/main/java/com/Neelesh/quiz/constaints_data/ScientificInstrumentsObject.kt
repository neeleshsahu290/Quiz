package com.Neelesh.quiz.constaints_data

import com.Neelesh.quiz.data_class.Question

object ScientificInstrumentsObject {
    fun getQuestions(): ArrayList<Question> {
        val Questionlist = ArrayList<Question>()
        val que1 = Question(
            1,  "Which device is used to measure the depth of seas and oceans?",
            "A. Gravometer" ,"B. Fathometer" ,"C. Gyroscope" ,"D. Dilatometers",
            2
        )
        Questionlist.add(que1)
        val que2 = Question(
            1, "Name a devise used to measure the sharpness of the electric current?",
            "A. Gravometer" ,"B. Electrometer" ,"C. Galvanometer" ,"D. Dynamometer",
            3
        )
        Questionlist.add(que2)
        val que3 = Question(
            1,  "Name an instrument used to measure the sound waves inside the water?",
            "A. Comograph" ,"B. Dictaphone" ,"C. Crescograph" ,"D. Hydrophone",
            4
        )
        Questionlist.add(que3)
        val que4 = Question(
            1,  "Name a device used to measure atmospheric humidity?",
            "A. Hygrometer" ,"B. Gravometer" ,"C. Avometer" ,"D. Calorimeter",
            1
        )
        Questionlist.add(que4)
        val que5 = Question(
            1,  "Which device is used to detect and measure the purification of the milk?",
            "A. Microphone" ,"B. Heart Lungs Machine", "C. Ganong Respiratory" ,"D. Lactometer",
            4
        )
        Questionlist.add(que5)
        val que6 = Question(
            1,   "The equipment through which any substance be cut into very small pieces",
            "A. Manometer:" ,"B. Microtome" ,"C. Micrometer" ,"D. Machmeter",
            2
        )
        Questionlist.add(que6)
        val que7 = Question(
            1,  "Through which device the illumination and intensity of two light sources are compared?",
            "A. Pyrometer" ,"B. Phototeligraphic" ,"C. Photometer","D. Periscope",
            3
        )
        Questionlist.add(que7)
        val que8 = Question(
            1,  "Name a device through which the truthness of the human being is examined?",
                    "A. Paicnometer" ,"B. Quadrant" ,"C. Polygraph" ,"D. Radiometer",
            3
        )
        Questionlist.add(que8)
        val que9 = Question(
            1,   "Which devise is used to measure the intensity of the earthquake?",
            "A. Seismograph" ,"B. Oscilliograph" ,"C. Comograph" ,"D. Cardiograph",
            1
        )
        Questionlist.add(que9)
        val que10 = Question(
            1,  "Which device is used to listen the vibrations of the heart and lungs?",
                    "A. Spectroscope", "B. Stethoscope" ,"C. Stereoscope" ,"D. None of the above",
            2
        )
        Questionlist.add(que10)
        return Questionlist
    }
}