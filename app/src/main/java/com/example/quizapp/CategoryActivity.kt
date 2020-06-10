package com.example.quizapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_category.*

class CategoryActivity : AppCompatActivity() {

    private var mUserName: String? = null

    override fun onCreate(savedInstanceState: Bundle?) {

        //Hide status bar on top of phone
        window.decorView.systemUiVisibility = View.SYSTEM_UI_FLAG_FULLSCREEN

        mUserName = intent.getStringExtra(FlagConstants.USER_NAME)

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_category)

        tv_flags.setOnClickListener{
            val intent = Intent(this, QuizQuestionsActivity::class.java)
            intent.putExtra(FlagConstants.USER_NAME, mUserName)
            startActivity(intent)
            finish()
        }
    }
}