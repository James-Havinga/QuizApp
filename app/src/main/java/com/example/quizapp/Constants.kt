package com.example.quizapp

object Constants {

    const val USER_NAME: String = "user_name"
    const val TOTAL_QUESTIONS: String = "total_questions"
    const val CORRECT_ANSWERS: String = "correct_answers"

    // Flag Questions
    fun getFlagQuestions(): ArrayList<Question> {
        val questionsList = ArrayList<Question>()

        val que1 = Question(
            1,
            "What country does this flag belong to?",
            R.drawable.ic_america,
            "United States of America",
            "Argentina",
            "Austria",
            "Australia",
            1
        )

        questionsList.add(que1)

        val que2 = Question(
            2,
            "What country does this flag belong to?",
            R.drawable.ic_argentina,
            "Mexico",
            "Argentina",
            "Brazil",
            "North Korea",
            2
        )

        questionsList.add(que2)

        val que3 = Question(
            3,
            "What country does this flag belong to?",
            R.drawable.ic_canada,
            "United States of America",
            "Canada",
            "Denmark",
            "Mexico",
            2
        )

        questionsList.add(que3)

        val que4 = Question(
            4,
            "What country does this flag belong to?",
            R.drawable.ic_chad,
            "Morocco",
            "Botswana",
            "Chad",
            "Algeria",
            3
        )

        questionsList.add(que4)

        val que5 = Question(
            5,
            "What country does this flag belong to?",
            R.drawable.ic_china,
            "North Korea",
            "Taiwan",
            "China",
            "Spain",
            3
        )

        questionsList.add(que5)

        val que6 = Question(
            6,
            "What country does this flag belong to?",
            R.drawable.ic_jamaica,
            "Namibia",
            "Vietnam",
            "Jamaica",
            "Egypt",
            3
        )

        questionsList.add(que6)

        val que7 = Question(
            7,
            "What country does this flag belong to?",
            R.drawable.ic_morroco,
            "China",
            "Morroco",
            "Japan",
            "Iraq",
            2
        )

        questionsList.add(que7)

        val que8 = Question(
            8,
            "What country does this flag belong to?",
            R.drawable.ic_netherlands,
            "Spain",
            "Netherlands",
            "South Africa",
            "France",
            2
        )

        questionsList.add(que8)

        val que9 = Question(
            9,
            "What country does this flag belong to?",
            R.drawable.ic_new_zealand,
            "Italy",
            "Canada",
            "Australia",
            "New Zealand",
            4
        )

        questionsList.add(que9)

        val que10 = Question(
            10,
            "What country does this flag belong to?",
            R.drawable.ic_south_africa,
            "Ghana",
            "Brazil",
            "South Africa",
            "Australia",
            3
        )

        questionsList.add(que10)

        return questionsList
    }

    // Logo Questions
    fun getLogoQuestions(): ArrayList<Question> {
        val questionsList = ArrayList<Question>()

        val que1 = Question(
            1,
            "What company does this logo belong to?",
            R.drawable.ic_appl,
            "Apple",
            "Google",
            "Microsoft",
            "Clover",
            1
        )

        questionsList.add(que1)

        val que2 = Question(
            2,
            "What company does this logo belong to?",
            R.drawable.ic_audi,
            "Mercedes Benz",
            "Audi",
            "BMW",
            "Toyota",
            2
        )

        questionsList.add(que2)

        val que3 = Question(
            3,
            "What company does this logo belong to?",
            R.drawable.ic_caterpillar,
            "Caterone",
            "Caterpillar",
            "Cat",
            "Builders Warehouse",
            2
        )

        questionsList.add(que3)

        val que4 = Question(
            4,
            "What company does this logo belong to?",
            R.drawable.ic_ge,
            "Gentrified",
            "Generic",
            "GE",
            "Great Eats",
            3
        )

        questionsList.add(que4)

        val que5 = Question(
            5,
            "What company does this logo belong to?",
            R.drawable.ic_loius_vutton,
            "Dior",
            "Hermes",
            "Louis Vutton",
            "Gucci",
            3
        )

        questionsList.add(que5)

        val que6 = Question(
            6,
            "What company does this logo belong to?",
            R.drawable.ic_mastercard,
            "PayPal",
            "Visa",
            "Mastercard",
            "Debit",
            3
        )

        questionsList.add(que6)

        val que7 = Question(
            7,
            "What company does this logo belong to?",
            R.drawable.ic_mc_donalds,
            "Pizza Hut",
            "McDonald's",
            "KFC",
            "Wendy's",
            2
        )

        questionsList.add(que7)

        val que8 = Question(
            8,
            "What company does this logo belong to?",
            R.drawable.ic_nike,
            "Adidas",
            "Nike",
            "Total Sports",
            "Tick",
            2
        )

        questionsList.add(que8)

        val que9 = Question(
            9,
            "What company does this logo belong to?",
            R.drawable.ic_starbucks,
            "Trader Joe's",
            "Queensland",
            "Coffee",
            "Starbucks",
            4
        )

        questionsList.add(que9)

        val que10 = Question(
            10,
            "What company does this logo belong to?",
            R.drawable.ic_tmobile,
            "Telkom",
            "CellC",
            "T-Mobile",
            "MTN",
            3
        )

        questionsList.add(que10)

        return questionsList
    }

    // Animal Questions
    fun getAnimalQuestions(): ArrayList<Question> {
        val questionsList = ArrayList<Question>()

        val que1 = Question(
            1,
            "What is the name of this animal?",
            R.drawable.ic_african_elephant,
            "African Elephant",
            "Rhinoceros",
            "Hippopotamus",
            "Lion",
            1
        )

        questionsList.add(que1)

        val que2 = Question(
            2,
            "What is the name of this animal?",
            R.drawable.ic_african_wild_dog,
            "Domestic Dog",
            "African Wild Dog",
            "Hyena",
            "Mongoose",
            2
        )

        questionsList.add(que2)

        val que3 = Question(
            3,
            "What is the name of this animal?",
            R.drawable.ic_bongo,
            "Antelope",
            "Bongo",
            "Impala",
            "Reed Buck",
            2
        )

        questionsList.add(que3)

        val que4 = Question(
            4,
            "What is the name of this animal?",
            R.drawable.ic_grizzly_bear,
            "Polar Bear",
            "Black Bear",
            "Grizzly Bear",
            "Brown Bear",
            3
        )

        questionsList.add(que4)

        val que5 = Question(
            5,
            "What is the name of this animal?",
            R.drawable.ic_impala,
            "Inyala",
            "Kudu",
            "Impala",
            "Reed Buck",
            3
        )

        questionsList.add(que5)

        val que6 = Question(
            6,
            "What is the name of this animal?",
            R.drawable.ic_lion,
            "Cheetah",
            "Leopard",
            "Lion",
            "Domestic Cat",
            3
        )

        questionsList.add(que6)

        val que7 = Question(
            7,
            "What is the name of this animal?",
            R.drawable.ic_lynx,
            "Leopard",
            "Lynx",
            "Domestic Cat",
            "Lion",
            2
        )

        questionsList.add(que7)

        val que8 = Question(
            8,
            "What is the name of this animal?",
            R.drawable.ic_moose,
            "Kudu",
            "Moose",
            "Elk",
            "Deer",
            2
        )

        questionsList.add(que8)

        val que9 = Question(
            9,
            "What is the name of this animal?",
            R.drawable.ic_sloth,
            "Orangutan",
            "Chimpanzee",
            "Lemur",
            "Sloth",
            4
        )

        questionsList.add(que9)

        val que10 = Question(
            10,
            "What is the name of this animal?",
            R.drawable.ic_tiger,
            "Domestic Cat",
            "Leopard",
            "Tiger",
            "Lion",
            3
        )

        questionsList.add(que10)

        return questionsList
    }
}