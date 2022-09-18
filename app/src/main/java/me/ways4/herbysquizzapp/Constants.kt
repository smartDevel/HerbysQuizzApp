package me.ways4.herbysquizzapp

import java.util.ArrayList

object Constants {

    const val USER_NAME: String = "user_name"
    const val TOTAL_QUESTIONS: String = "total_questions"
    const val CORRECT_ANSWERS: String = "correct_answers"

    fun getQuestions(): ArrayList<Question> {
        val questionList = ArrayList<Question>()
        val que1 = Question(
            1,
            "Zu welchem Staat gehört die dargestellte Flagge ?",
            R.drawable.ic_flag_of_argentina,
            "Argentinien",
            "Belgien",
            "Dänemark",
            "Niederlande",
            1


        )
        questionList.add(que1)

        val que2 = Question(
            2,
            "Zu welchem Staat gehört die dargestellte Flagge ?",
            R.drawable.ic_flag_of_belgium,
            "Argentinien",
            "Belgien",
            "Fiji-Inseln",
            "Niederlande",
            2


        )
        questionList.add(que2)

        val que3 = Question(
            3,
            "Zu welchem Staat gehört die dargestellte Flagge ?",
            R.drawable.ic_flag_of_india,
            "Irland",
            "Pakistan",
            "Kuwait",
            "Indien",
            4


        )
        questionList.add(que3)
        val que4 = Question(
            4,
            "Zu welchem Staat gehört die dargestellte Flagge ?",
            R.drawable.ic_flag_of_brazil,
            "Brasilien",
            "Ecuador",
            "Malaysia",
            "Nepal",
            1


        )
        questionList.add(que4)
        val que5 = Question(
            5,
            "Zu welchem Staat gehört die dargestellte Flagge ?",
            R.drawable.ic_flag_of_fiji,
            "Tonga",
            "Kumba",
            "Fiji-Inseln",
            "Komoren",
            3


        )
        questionList.add(que5)

        val que6 = Question(
            6,
            "Zu welchem Staat gehört die dargestellte Flagge ?",
            R.drawable.ic_flag_of_denmark,
            "Norwegen",
            "Dänemark",
            "Finnland",
            "England",
            2


        )
        questionList.add(que6)

        return questionList
    }

}