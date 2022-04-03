package com.example.diceroller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val rollButton: Button = findViewById(R.id.button)
        rollButton.setOnClickListener { rolledDice()}
    }

    fun rolledDice(){
        val rollDice1 = roll()
        val rollDice2 = roll()
        val diceImage1 : ImageView = findViewById(R.id.imageView)
        val diceImage2 : ImageView = findViewById(R.id.imageView1)

        val roll1 = when((1..6).random()){
            1-> R.drawable.objek_1
            2-> R.drawable.objek_2
            3-> R.drawable.objek_3
            4-> R.drawable.objek_4
            5-> R.drawable.objek_5
            else -> R.drawable.objek_6
        }
        val roll2 = when((1..6).random()){
            1-> R.drawable.objek_1
            2-> R.drawable.objek_2
            3-> R.drawable.objek_3
            4-> R.drawable.objek_4
            5-> R.drawable.objek_5
            else -> R.drawable.objek_6
        }
        diceImage1.setImageResource(roll1)
        diceImage1.contentDescription = rollDice1.toString()
        diceImage2.setImageResource(roll2)
        diceImage2.contentDescription = rollDice2.toString()

        if (roll1 == roll2){
            val toast = Toast.makeText(this, "Selamat anda dapat dadu double!", Toast.LENGTH_SHORT)
            toast.show()
        }else{
            val toast = Toast.makeText(this, "Anda belum beruntung!", Toast.LENGTH_SHORT)
            toast.show()
        }
    }
}
fun roll() :Int {
    return (1..6).random()
}


