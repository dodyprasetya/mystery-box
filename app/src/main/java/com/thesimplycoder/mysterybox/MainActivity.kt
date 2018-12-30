package com.thesimplycoder.mysterybox

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import kotlin.random.Random

class MainActivity : AppCompatActivity() {

    var isBoxOpened: Boolean = false

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // button tap action
        btOpenBox.setOnClickListener {
            if (isBoxOpened == true) {
                resetBox()
            } else {
                openBox()
            }
        }
    }

    private fun openBox() {
        // get a random number from 0 until 3
        val number = Random.nextInt(4)

        // check the number
        if (number == 0) {
            ivImagePresent.setImageResource(R.drawable.car)
            tvPresent.text = "Congratulation! You get an amazing car"
        } else if (number == 1) {
            ivImagePresent.setImageResource(R.drawable.motorcycle)
            tvPresent.text = "Congratulation! You get a motorcycle"
        } else if (number == 2) {
            ivImagePresent.setImageResource(R.drawable.money)
            tvPresent.text = "Congratulation! You get $100,000"
        } else if (number == 3) {
            ivImagePresent.setImageResource(R.drawable.house)
            tvPresent.text = "Congratulation! You get a dream house!"
        }

        // change to play again button
        btOpenBox.text = "Play Again"
        isBoxOpened = true
    }

    private fun resetBox() {
        ivImagePresent.setImageResource(R.drawable.mysterybox)
        tvPresent.text = "Open the box again to get your present"
        btOpenBox.text = "Open Box"
        isBoxOpened = false
    }
}
