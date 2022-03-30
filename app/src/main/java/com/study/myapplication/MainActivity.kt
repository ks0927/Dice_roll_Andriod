package com.study.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import androidx.databinding.DataBindingUtil
import com.study.myapplication.databinding.ActivityMainBinding
import kotlin.math.log
import kotlin.random.Random

class MainActivity : AppCompatActivity() {
    private lateinit var binding : ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        binding =DataBindingUtil.setContentView(this,R.layout.activity_main)

        val diceimage1 =binding.IVDice1
        val diceimage2 =binding.IVDice2

        binding.btnStart.setOnClickListener{
            Toast.makeText(this,"주사위 굴리기",Toast.LENGTH_SHORT).show()

            val num1 = Random.nextInt(1,6)
            val num2 = Random.nextInt(1,6)

            Log.d("MainActivity",num1.toString())  //로그 찍어보기
            Log.d("MainActivity",num2.toString())  //로그 찍어보기기
           if(num1 ==1) {
                diceimage1.setImageResource(R.drawable.dice_1)
            }else if(num1 ==2){
                diceimage1.setImageResource(R.drawable.dice_2)
            }else if(num1 ==3){
                diceimage1.setImageResource(R.drawable.dice_3)
            }else if(num1 ==4){
                diceimage1.setImageResource(R.drawable.dice_4)
            }else if(num1 ==5){
                diceimage1.setImageResource(R.drawable.dice_5)
            }else{
                diceimage1.setImageResource(R.drawable.dice_6)
            }

            if(num2 ==1) {
                diceimage2.setImageResource(R.drawable.dice_1)
            }else if(num2 ==2){
                diceimage2.setImageResource(R.drawable.dice_2)
            }else if(num2 ==3){
                diceimage2.setImageResource(R.drawable.dice_3)
            }else if(num2 ==4){
                diceimage2.setImageResource(R.drawable.dice_4)
            }else if(num2 ==5){
                diceimage2.setImageResource(R.drawable.dice_5)
            }else{
                diceimage2.setImageResource(R.drawable.dice_6)
            }
        }
    }
}