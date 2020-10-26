package com.webstart.the_clicker

import android.R
import android.content.Context
import android.os.Bundle
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*



class MainActivity : AppCompatActivity() {
    var score = 0

    var level: Int = 1

    private val flowers = intArrayOf(R.drawable.krustymurder,
            R.drawable.krustypetrole,)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)



        var sharedPreferences = this.getSharedPreferences("monburger", Context.MODE_PRIVATE)
        var editor = sharedPreferences.edit()

        image_burger.setOnClickListener {
            score += 1
            score_label.text = "$score"
        }

        button_up.setOnClickListener {
            if (score >=100) {
                level += 1
                lvl_label.text = "$level"
                score -= 100
                score_label.text ="$score"

            }
            else if (level==2 ) {
                
            }


        }
        var sharedpref = this.getSharedPreferences("monburger", Context.MODE_PRIVATE)
        var editor = sharedpref.edit()





            }


        }

