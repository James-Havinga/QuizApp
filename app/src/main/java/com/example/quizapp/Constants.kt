package com.example.quizapp

object Constants {

    const val USER_NAME: String = "user_name"
    const val TOTAL_QUESTIONS: String = "total_questions"
    const val CORRECT_ANSWERS: String = "correct_answers"

    fun getQuestions(): ArrayList<Question>{
        val questionsList = ArrayList<Question>()

        val que1 = Question(1,
        "What country does this flag belong to?",
            R.drawable.ic_america_flag,
            "United States of America",
            "Argentina",
            "Austria",
            "Australia",
            1
        )

        questionsList.add(que1)

        val que2 = Question(2,
            "What country does this flag belong to?",
            R.drawable.ic_argentina_flag,
            "Mexico",
            "Argentina",
            "Brazil",
            "North Korea",
            2
        )

        questionsList.add(que2)

        val que3 = Question(3,
            "What country does this flag belong to?",
            R.drawable.ic_canada_flag,
            "United States of America",
            "Canada",
            "Denmark",
            "Mexico",
            2
        )

        questionsList.add(que3)

        val que4 = Question(4,
            "What country does this flag belong to?",
            R.drawable.ic_chad_flag,
            "Morocco",
            "Botswana",
            "Chad",
            "Algeria",
            3
        )

        questionsList.add(que4)

        val que5 = Question(5,
            "What country does this flag belong to?",
            R.drawable.ic_china_flag,
            "North Korea",
            "Taiwan",
            "China",
            "Spain",
            3
        )

        questionsList.add(que5)

        val que6 = Question(6,
            "What country does this flag belong to?",
            R.drawable.ic_jamaica_flag,
            "Namibia",
            "Vietnam",
            "Jamaica",
            "Egypt",
            3
        )

        questionsList.add(que6)

        val que7 = Question(7,
            "What country does this flag belong to?",
            R.drawable.ic_morocco_flag,
            "China",
            "Morroco",
            "Japan",
            "Iraq",
            2
        )

        questionsList.add(que7)

        val que8 = Question(8,
            "What country does this flag belong to?",
            R.drawable.ic_netherlands_flag,
            "Spain",
            "Netherlands",
            "South Africa",
            "France",
            2
        )

        questionsList.add(que8)

        val que9 = Question(9,
            "What country does this flag belong to?",
            R.drawable.ic_new_zealand_flag,
            "Italy",
            "Canada",
            "Australia",
            "New Zealand",
            4
        )

        questionsList.add(que9)

        val que10 = Question(10,
            "What country does this flag belong to?",
            R.drawable.ic_south_africa_flag,
            "Ghana",
            "Brazil",
            "South Africa",
            "Australia",
            3
        )

        questionsList.add(que10)

        return questionsList
    }
}