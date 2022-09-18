package me.ways4.herbysquizzapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class ResultActivity : AppCompatActivity() {
    fun finApp() {


    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_result)
        val tvName: TextView = findViewById(R.id.tv_name)
        val tvScore: TextView = findViewById(R.id.tv_score)
        val btnFinish: Button = findViewById(R.id.btn_finish)
        val btnRepeat: Button = findViewById((R.id.btn_repeat))

        tvName.text = intent.getStringExtra(Constants.USER_NAME)
        var txtScore: String = "Deine Erfolgsquote beträgt " +
                "${intent.getIntExtra(Constants.CORRECT_ANSWERS, 0).toString()} von ${
                    intent.getIntExtra(
                        Constants.TOTAL_QUESTIONS, 0
                    ).toString()
                }" +
                " korrekte Antworten."
        tvScore.text = txtScore

        btnRepeat.setOnClickListener() {
            startActivity(Intent(this, MainActivity::class.java))
        }
        btnFinish.setOnClickListener() {
            finish()

        }
    }

}