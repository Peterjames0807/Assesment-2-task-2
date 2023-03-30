package com.example.assessment

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.*
import androidx.appcompat.app.AppCompatActivity
import java.util.*


class MainActivity : AppCompatActivity() {

    //Declare Variable
    lateinit var percentage : TextView
    lateinit var sPinner1 : Spinner
    lateinit var sPinner2 : Spinner
    lateinit var onActionClick : Button
    lateinit var onActionView : Button
    lateinit var Img1 : ImageView
    lateinit var Img2 : ImageView


    //Set array to zodiac signs
    val firstlist1= arrayOf("Aries", "Taurus", "Gemini", "Cancer", "Leo", "Virgo", "Libra", "Scorpio", "Sagittarius", "Capricorn", "Aquarius", "Pisces")
    val firstlist2= arrayOf("Aries", "Taurus", "Gemini", "Cancer", "Leo", "Virgo", "Libra", "Scorpio", "Sagittarius", "Capricorn", "Aquarius", "Pisces")


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //get variables
        onActionClick = findViewById(R.id.onAction)
        onActionView = findViewById<Button>(R.id.OnactionView)
        sPinner1 = findViewById(R.id.spinner1)
        sPinner2 = findViewById(R.id.spinner2)
        Img1 = findViewById(R.id.img1)
        Img2 = findViewById(R.id.img2)
        percentage = findViewById(R.id.percenTage)


        var arrayAdapter1 = ArrayAdapter(this, android.R.layout.simple_spinner_item, firstlist1)
        var arrayAdapter2 = ArrayAdapter(this, android.R.layout.simple_spinner_item, firstlist2)
        arrayAdapter1.setDropDownViewResource(android.R.layout.simple_spinner_item)
        arrayAdapter2.setDropDownViewResource(android.R.layout.simple_spinner_item)
        sPinner1.adapter= arrayAdapter1
        sPinner2.adapter= arrayAdapter1

        //onActionClick.setOnClickListener{
         //   var intent = Intent(this, Page2Activity::class.java)
         //   startActivity(intent)
        //}

        onActionClick.setOnClickListener{

            //Option 1
            if(sPinner1.selectedItemPosition==0 && sPinner2.selectedItemPosition==0){
                Img1.setImageResource(R.drawable.aries)
                Img2.setImageResource(R.drawable.aries)
                val randomPercentage = generateRandomPercentage()
                percentage.setText("$randomPercentage %")
            }
            if(sPinner1.selectedItemPosition==0 && sPinner2.selectedItemPosition==1){
                Img1.setImageResource(R.drawable.aries)
                Img2.setImageResource(R.drawable.taurus)
                val randomPercentage = generateRandomPercentage()
                percentage.setText("$randomPercentage %")
            }
            if(sPinner1.selectedItemPosition==0 && sPinner2.selectedItemPosition==2){
                Img1.setImageResource(R.drawable.aries)
                Img2.setImageResource(R.drawable.gemini)
                val randomPercentage = generateRandomPercentage()
                percentage.setText("$randomPercentage %")
            }
            if(sPinner1.selectedItemPosition==0 && sPinner2.selectedItemPosition==3){
                Img1.setImageResource(R.drawable.aries)
                Img2.setImageResource(R.drawable.cancer)
                val randomPercentage = generateRandomPercentage()
                percentage.setText("$randomPercentage %")
            }
            if(sPinner1.selectedItemPosition==0 && sPinner2.selectedItemPosition==4){
                Img1.setImageResource(R.drawable.aries)
                Img2.setImageResource(R.drawable.leo)
                val randomPercentage = generateRandomPercentage()
                percentage.setText("$randomPercentage %")
            }
            if(sPinner1.selectedItemPosition==0 && sPinner2.selectedItemPosition==5){
                Img1.setImageResource(R.drawable.aries)
                Img2.setImageResource(R.drawable.virgo)
                val randomPercentage = generateRandomPercentage()
                percentage.setText("$randomPercentage %")
            }
            if(sPinner1.selectedItemPosition==0 && sPinner2.selectedItemPosition==6){
                Img1.setImageResource(R.drawable.aries)
                Img2.setImageResource(R.drawable.libra)
                val randomPercentage = generateRandomPercentage()
                percentage.setText("$randomPercentage %")
            }
            if(sPinner1.selectedItemPosition==0 && sPinner2.selectedItemPosition==7){
                Img1.setImageResource(R.drawable.aries)
                Img2.setImageResource(R.drawable.scorpio)
                val randomPercentage = generateRandomPercentage()
                percentage.setText("$randomPercentage %")
            }
            if(sPinner1.selectedItemPosition==0 && sPinner2.selectedItemPosition==8){
                Img1.setImageResource(R.drawable.aries)
                Img2.setImageResource(R.drawable.sagittarius)
                val randomPercentage = generateRandomPercentage()
                percentage.setText("$randomPercentage %")
            }
            if(sPinner1.selectedItemPosition==0 && sPinner2.selectedItemPosition==9){
                Img1.setImageResource(R.drawable.aries)
                Img2.setImageResource(R.drawable.capricorn)
                val randomPercentage = generateRandomPercentage()
                percentage.setText("$randomPercentage %")
            }
            if(sPinner1.selectedItemPosition==0 && sPinner2.selectedItemPosition==10){
                Img1.setImageResource(R.drawable.aries)
                Img2.setImageResource(R.drawable.aquarius)
                val randomPercentage = generateRandomPercentage()
                percentage.setText("$randomPercentage %")
            }
            if(sPinner1.selectedItemPosition==0 && sPinner2.selectedItemPosition==11){
                Img1.setImageResource(R.drawable.aries)
                Img2.setImageResource(R.drawable.pisces)
                val randomPercentage = generateRandomPercentage()
                percentage.setText("$randomPercentage %")
            }

            //Option 2
            if(sPinner1.selectedItemPosition==1 && sPinner2.selectedItemPosition==0){
                Img1.setImageResource(R.drawable.taurus)
                Img2.setImageResource(R.drawable.aries)
                val randomPercentage = generateRandomPercentage()
                percentage.setText("$randomPercentage %")
            }
            if(sPinner1.selectedItemPosition==1 && sPinner2.selectedItemPosition==1){
                Img1.setImageResource(R.drawable.taurus)
                Img2.setImageResource(R.drawable.taurus)
                val randomPercentage = generateRandomPercentage()
                percentage.setText("$randomPercentage %")
            }
            if(sPinner1.selectedItemPosition==1 && sPinner2.selectedItemPosition==2){
                Img1.setImageResource(R.drawable.taurus)
                Img2.setImageResource(R.drawable.gemini)
                val randomPercentage = generateRandomPercentage()
                percentage.setText("$randomPercentage %")
            }
            if(sPinner1.selectedItemPosition==1 && sPinner2.selectedItemPosition==3){
                Img1.setImageResource(R.drawable.taurus)
                Img2.setImageResource(R.drawable.cancer)
                val randomPercentage = generateRandomPercentage()
                percentage.setText("$randomPercentage %")
            }
            if(sPinner1.selectedItemPosition==1 && sPinner2.selectedItemPosition==4){
                Img1.setImageResource(R.drawable.taurus)
                Img2.setImageResource(R.drawable.leo)
                val randomPercentage = generateRandomPercentage()
                percentage.setText("$randomPercentage %")
            }
            if(sPinner1.selectedItemPosition==1 && sPinner2.selectedItemPosition==5){
                Img1.setImageResource(R.drawable.taurus)
                Img2.setImageResource(R.drawable.virgo)
                val randomPercentage = generateRandomPercentage()
                percentage.setText("$randomPercentage %")
            }
            if(sPinner1.selectedItemPosition==1 && sPinner2.selectedItemPosition==6){
                Img1.setImageResource(R.drawable.taurus)
                Img2.setImageResource(R.drawable.libra)
                val randomPercentage = generateRandomPercentage()
                percentage.setText("$randomPercentage %")
            }
            if(sPinner1.selectedItemPosition==1 && sPinner2.selectedItemPosition==7){
                Img1.setImageResource(R.drawable.taurus)
                Img2.setImageResource(R.drawable.scorpio)
                val randomPercentage = generateRandomPercentage()
                percentage.setText("$randomPercentage %")
            }
            if(sPinner1.selectedItemPosition==1 && sPinner2.selectedItemPosition==8){
                Img1.setImageResource(R.drawable.taurus)
                Img2.setImageResource(R.drawable.sagittarius)
                val randomPercentage = generateRandomPercentage()
                percentage.setText("$randomPercentage %")
            }
            if(sPinner1.selectedItemPosition==1 && sPinner2.selectedItemPosition==9){
                Img1.setImageResource(R.drawable.taurus)
                Img2.setImageResource(R.drawable.capricorn)
                val randomPercentage = generateRandomPercentage()
                percentage.setText("$randomPercentage %")
            }
            if(sPinner1.selectedItemPosition==1 && sPinner2.selectedItemPosition==10){
                Img1.setImageResource(R.drawable.taurus)
                Img2.setImageResource(R.drawable.aquarius)
                val randomPercentage = generateRandomPercentage()
                percentage.setText("$randomPercentage %")
            }
            if(sPinner1.selectedItemPosition==1 && sPinner2.selectedItemPosition==11){
                Img1.setImageResource(R.drawable.taurus)
                Img2.setImageResource(R.drawable.pisces)
                val randomPercentage = generateRandomPercentage()
                percentage.setText("$randomPercentage %")
            }

            //Option 3
            if(sPinner1.selectedItemPosition==2 && sPinner2.selectedItemPosition==0){
                Img1.setImageResource(R.drawable.gemini)
                Img2.setImageResource(R.drawable.aries)
                val randomPercentage = generateRandomPercentage()
                percentage.setText("$randomPercentage %")
            }
            if(sPinner1.selectedItemPosition==2 && sPinner2.selectedItemPosition==1){
                Img1.setImageResource(R.drawable.gemini)
                Img2.setImageResource(R.drawable.taurus)
                val randomPercentage = generateRandomPercentage()
                percentage.setText("$randomPercentage %")
            }
            if(sPinner1.selectedItemPosition==2 && sPinner2.selectedItemPosition==2){
                Img1.setImageResource(R.drawable.gemini)
                Img2.setImageResource(R.drawable.gemini)
                val randomPercentage = generateRandomPercentage()
                percentage.setText("$randomPercentage %")
            }
            if(sPinner1.selectedItemPosition==2 && sPinner2.selectedItemPosition==3){
                Img1.setImageResource(R.drawable.gemini)
                Img2.setImageResource(R.drawable.cancer)
                val randomPercentage = generateRandomPercentage()
                percentage.setText("$randomPercentage %")
            }
            if(sPinner1.selectedItemPosition==2 && sPinner2.selectedItemPosition==4){
                Img1.setImageResource(R.drawable.gemini)
                Img2.setImageResource(R.drawable.leo)
                val randomPercentage = generateRandomPercentage()
                percentage.setText("$randomPercentage %")
            }
            if(sPinner1.selectedItemPosition==2 && sPinner2.selectedItemPosition==5){
                Img1.setImageResource(R.drawable.gemini)
                Img2.setImageResource(R.drawable.virgo)
                val randomPercentage = generateRandomPercentage()
                percentage.setText("$randomPercentage %")
            }
            if(sPinner1.selectedItemPosition==2 && sPinner2.selectedItemPosition==6){
                Img1.setImageResource(R.drawable.gemini)
                Img2.setImageResource(R.drawable.libra)
                val randomPercentage = generateRandomPercentage()
                percentage.setText("$randomPercentage %")
            }
            if(sPinner1.selectedItemPosition==2 && sPinner2.selectedItemPosition==7){
                Img1.setImageResource(R.drawable.gemini)
                Img2.setImageResource(R.drawable.scorpio)
                val randomPercentage = generateRandomPercentage()
                percentage.setText("$randomPercentage %")
            }
            if(sPinner1.selectedItemPosition==2 && sPinner2.selectedItemPosition==8){
                Img1.setImageResource(R.drawable.gemini)
                Img2.setImageResource(R.drawable.sagittarius)
                val randomPercentage = generateRandomPercentage()
                percentage.setText("$randomPercentage %")
            }
            if(sPinner1.selectedItemPosition==2 && sPinner2.selectedItemPosition==9){
                Img1.setImageResource(R.drawable.gemini)
                Img2.setImageResource(R.drawable.capricorn)
                val randomPercentage = generateRandomPercentage()
                percentage.setText("$randomPercentage %")
            }
            if(sPinner1.selectedItemPosition==2 && sPinner2.selectedItemPosition==10){
                Img1.setImageResource(R.drawable.gemini)
                Img2.setImageResource(R.drawable.aquarius)
                val randomPercentage = generateRandomPercentage()
                percentage.setText("$randomPercentage %")
            }
            if(sPinner1.selectedItemPosition==2 && sPinner2.selectedItemPosition==11){
                Img1.setImageResource(R.drawable.gemini)
                Img2.setImageResource(R.drawable.pisces)
                val randomPercentage = generateRandomPercentage()
                percentage.setText("$randomPercentage %")
            }

            //Option 4
            if(sPinner1.selectedItemPosition==3 && sPinner2.selectedItemPosition==0){
                Img1.setImageResource(R.drawable.cancer)
                Img2.setImageResource(R.drawable.aries)
                val randomPercentage = generateRandomPercentage()
                percentage.setText("$randomPercentage %")
            }
            if(sPinner1.selectedItemPosition==3 && sPinner2.selectedItemPosition==1){
                Img1.setImageResource(R.drawable.cancer)
                Img2.setImageResource(R.drawable.taurus)
                val randomPercentage = generateRandomPercentage()
                percentage.setText("$randomPercentage %")
            }
            if(sPinner1.selectedItemPosition==3 && sPinner2.selectedItemPosition==2){
                Img1.setImageResource(R.drawable.cancer)
                Img2.setImageResource(R.drawable.gemini)
                val randomPercentage = generateRandomPercentage()
                percentage.setText("$randomPercentage %")
            }
            if(sPinner1.selectedItemPosition==3 && sPinner2.selectedItemPosition==3){
                Img1.setImageResource(R.drawable.cancer)
                Img2.setImageResource(R.drawable.cancer)
                val randomPercentage = generateRandomPercentage()
                percentage.setText("$randomPercentage %")
            }
            if(sPinner1.selectedItemPosition==3 && sPinner2.selectedItemPosition==4){
                Img1.setImageResource(R.drawable.cancer)
                Img2.setImageResource(R.drawable.leo)
                val randomPercentage = generateRandomPercentage()
                percentage.setText("$randomPercentage %")
            }
            if(sPinner1.selectedItemPosition==3 && sPinner2.selectedItemPosition==5){
                Img1.setImageResource(R.drawable.cancer)
                Img2.setImageResource(R.drawable.virgo)
                val randomPercentage = generateRandomPercentage()
                percentage.setText("$randomPercentage %")
            }
            if(sPinner1.selectedItemPosition==3 && sPinner2.selectedItemPosition==6){
                Img1.setImageResource(R.drawable.cancer)
                Img2.setImageResource(R.drawable.libra)
                val randomPercentage = generateRandomPercentage()
                percentage.setText("$randomPercentage %")
            }
            if(sPinner1.selectedItemPosition==3 && sPinner2.selectedItemPosition==7){
                Img1.setImageResource(R.drawable.cancer)
                Img2.setImageResource(R.drawable.scorpio)
                val randomPercentage = generateRandomPercentage()
                percentage.setText("$randomPercentage %")
            }
            if(sPinner1.selectedItemPosition==3 && sPinner2.selectedItemPosition==8){
                Img1.setImageResource(R.drawable.cancer)
                Img2.setImageResource(R.drawable.sagittarius)
                val randomPercentage = generateRandomPercentage()
                percentage.setText("$randomPercentage %")
            }
            if(sPinner1.selectedItemPosition==3 && sPinner2.selectedItemPosition==9){
                Img1.setImageResource(R.drawable.cancer)
                Img2.setImageResource(R.drawable.capricorn)
                val randomPercentage = generateRandomPercentage()
                percentage.setText("$randomPercentage %")
            }
            if(sPinner1.selectedItemPosition==3 && sPinner2.selectedItemPosition==10){
                Img1.setImageResource(R.drawable.cancer)
                Img2.setImageResource(R.drawable.aquarius)
                val randomPercentage = generateRandomPercentage()
                percentage.setText("$randomPercentage %")
            }
            if(sPinner1.selectedItemPosition==3 && sPinner2.selectedItemPosition==11){
                Img1.setImageResource(R.drawable.cancer)
                Img2.setImageResource(R.drawable.pisces)
                val randomPercentage = generateRandomPercentage()
                percentage.setText("$randomPercentage %")
            }

            //Option 5
            if(sPinner1.selectedItemPosition==4 && sPinner2.selectedItemPosition==0){
                Img1.setImageResource(R.drawable.leo)
                Img2.setImageResource(R.drawable.aries)
                val randomPercentage = generateRandomPercentage()
                percentage.setText("$randomPercentage %")
            }
            if(sPinner1.selectedItemPosition==4 && sPinner2.selectedItemPosition==1){
                Img1.setImageResource(R.drawable.leo)
                Img2.setImageResource(R.drawable.taurus)
                val randomPercentage = generateRandomPercentage()
                percentage.setText("$randomPercentage %")
            }
            if(sPinner1.selectedItemPosition==4 && sPinner2.selectedItemPosition==2){
                Img1.setImageResource(R.drawable.leo)
                Img2.setImageResource(R.drawable.gemini)
                val randomPercentage = generateRandomPercentage()
                percentage.setText("$randomPercentage %")
            }
            if(sPinner1.selectedItemPosition==4 && sPinner2.selectedItemPosition==3){
                Img1.setImageResource(R.drawable.leo)
                Img2.setImageResource(R.drawable.cancer)
            }
            if(sPinner1.selectedItemPosition==4 && sPinner2.selectedItemPosition==4){
                Img1.setImageResource(R.drawable.leo)
                Img2.setImageResource(R.drawable.leo)
                val randomPercentage = generateRandomPercentage()
                percentage.setText("$randomPercentage %")
            }
            if(sPinner1.selectedItemPosition==4 && sPinner2.selectedItemPosition==5){
                Img1.setImageResource(R.drawable.leo)
                Img2.setImageResource(R.drawable.virgo)
                val randomPercentage = generateRandomPercentage()
                percentage.setText("$randomPercentage %")
            }
            if(sPinner1.selectedItemPosition==4 && sPinner2.selectedItemPosition==6){
                Img1.setImageResource(R.drawable.leo)
                Img2.setImageResource(R.drawable.libra)
                val randomPercentage = generateRandomPercentage()
                percentage.setText("$randomPercentage %")
            }
            if(sPinner1.selectedItemPosition==4 && sPinner2.selectedItemPosition==7){
                Img1.setImageResource(R.drawable.leo)
                Img2.setImageResource(R.drawable.scorpio)
                val randomPercentage = generateRandomPercentage()
                percentage.setText("$randomPercentage %")
            }
            if(sPinner1.selectedItemPosition==4 && sPinner2.selectedItemPosition==8){
                Img1.setImageResource(R.drawable.leo)
                Img2.setImageResource(R.drawable.sagittarius)
                val randomPercentage = generateRandomPercentage()
                percentage.setText("$randomPercentage %")
            }
            if(sPinner1.selectedItemPosition==4 && sPinner2.selectedItemPosition==9){
                Img1.setImageResource(R.drawable.leo)
                Img2.setImageResource(R.drawable.capricorn)
                val randomPercentage = generateRandomPercentage()
                percentage.setText("$randomPercentage %")
            }
            if(sPinner1.selectedItemPosition==4 && sPinner2.selectedItemPosition==10){
                Img1.setImageResource(R.drawable.leo)
                Img2.setImageResource(R.drawable.aquarius)
                val randomPercentage = generateRandomPercentage()
                percentage.setText("$randomPercentage %")
            }
            if(sPinner1.selectedItemPosition==4 && sPinner2.selectedItemPosition==11){
                Img1.setImageResource(R.drawable.leo)
                Img2.setImageResource(R.drawable.pisces)
                val randomPercentage = generateRandomPercentage()
                percentage.setText("$randomPercentage %")
            }

            //Option 6
            if(sPinner1.selectedItemPosition==5 && sPinner2.selectedItemPosition==0){
                Img1.setImageResource(R.drawable.virgo)
                Img2.setImageResource(R.drawable.aries)
                val randomPercentage = generateRandomPercentage()
                percentage.setText("$randomPercentage %")
            }
            if(sPinner1.selectedItemPosition==5 && sPinner2.selectedItemPosition==1){
                Img1.setImageResource(R.drawable.virgo)
                Img2.setImageResource(R.drawable.taurus)
                val randomPercentage = generateRandomPercentage()
                percentage.setText("$randomPercentage %")
            }
            if(sPinner1.selectedItemPosition==5 && sPinner2.selectedItemPosition==2){
                Img1.setImageResource(R.drawable.virgo)
                Img2.setImageResource(R.drawable.gemini)
                val randomPercentage = generateRandomPercentage()
                percentage.setText("$randomPercentage %")
            }
            if(sPinner1.selectedItemPosition==5 && sPinner2.selectedItemPosition==3){
                Img1.setImageResource(R.drawable.virgo)
                Img2.setImageResource(R.drawable.cancer)
                val randomPercentage = generateRandomPercentage()
                percentage.setText("$randomPercentage %")
            }
            if(sPinner1.selectedItemPosition==5 && sPinner2.selectedItemPosition==4){
                Img1.setImageResource(R.drawable.virgo)
                Img2.setImageResource(R.drawable.leo)
                val randomPercentage = generateRandomPercentage()
                percentage.setText("$randomPercentage %")
            }
            if(sPinner1.selectedItemPosition==5 && sPinner2.selectedItemPosition==5){
                Img1.setImageResource(R.drawable.virgo)
                Img2.setImageResource(R.drawable.virgo)
                val randomPercentage = generateRandomPercentage()
                percentage.setText("$randomPercentage %")
            }
            if(sPinner1.selectedItemPosition==5 && sPinner2.selectedItemPosition==6){
                Img1.setImageResource(R.drawable.virgo)
                Img2.setImageResource(R.drawable.libra)
                val randomPercentage = generateRandomPercentage()
                percentage.setText("$randomPercentage %")
            }
            if(sPinner1.selectedItemPosition==5 && sPinner2.selectedItemPosition==7){
                Img1.setImageResource(R.drawable.virgo)
                Img2.setImageResource(R.drawable.scorpio)
                val randomPercentage = generateRandomPercentage()
                percentage.setText("$randomPercentage %")
            }
            if(sPinner1.selectedItemPosition==5 && sPinner2.selectedItemPosition==8){
                Img1.setImageResource(R.drawable.virgo)
                Img2.setImageResource(R.drawable.sagittarius)
                val randomPercentage = generateRandomPercentage()
                percentage.setText("$randomPercentage %")
            }
            if(sPinner1.selectedItemPosition==5 && sPinner2.selectedItemPosition==9){
                Img1.setImageResource(R.drawable.virgo)
                Img2.setImageResource(R.drawable.capricorn)
                val randomPercentage = generateRandomPercentage()
                percentage.setText("$randomPercentage %")
            }
            if(sPinner1.selectedItemPosition==5 && sPinner2.selectedItemPosition==10){
                Img1.setImageResource(R.drawable.virgo)
                Img2.setImageResource(R.drawable.aquarius)
                val randomPercentage = generateRandomPercentage()
                percentage.setText("$randomPercentage %")
            }
            if(sPinner1.selectedItemPosition==5 && sPinner2.selectedItemPosition==11){
                Img1.setImageResource(R.drawable.virgo)
                Img2.setImageResource(R.drawable.pisces)
                val randomPercentage = generateRandomPercentage()
                percentage.setText("$randomPercentage %")
            }

            //Option 7
            if(sPinner1.selectedItemPosition==6 && sPinner2.selectedItemPosition==0){
                Img1.setImageResource(R.drawable.libra)
                Img2.setImageResource(R.drawable.aries)
                val randomPercentage = generateRandomPercentage()
                percentage.setText("$randomPercentage %")
            }
            if(sPinner1.selectedItemPosition==6 && sPinner2.selectedItemPosition==1){
                Img1.setImageResource(R.drawable.libra)
                Img2.setImageResource(R.drawable.taurus)
                val randomPercentage = generateRandomPercentage()
                percentage.setText("$randomPercentage %")
            }
            if(sPinner1.selectedItemPosition==6 && sPinner2.selectedItemPosition==2){
                Img1.setImageResource(R.drawable.libra)
                Img2.setImageResource(R.drawable.gemini)
                val randomPercentage = generateRandomPercentage()
                percentage.setText("$randomPercentage %")
            }
            if(sPinner1.selectedItemPosition==6 && sPinner2.selectedItemPosition==3){
                Img1.setImageResource(R.drawable.libra)
                Img2.setImageResource(R.drawable.cancer)
                val randomPercentage = generateRandomPercentage()
                percentage.setText("$randomPercentage %")
            }
            if(sPinner1.selectedItemPosition==6 && sPinner2.selectedItemPosition==4){
                Img1.setImageResource(R.drawable.libra)
                Img2.setImageResource(R.drawable.leo)
                val randomPercentage = generateRandomPercentage()
                percentage.setText("$randomPercentage %")
            }
            if(sPinner1.selectedItemPosition==6 && sPinner2.selectedItemPosition==5){
                Img1.setImageResource(R.drawable.libra)
                Img2.setImageResource(R.drawable.virgo)
                val randomPercentage = generateRandomPercentage()
                percentage.setText("$randomPercentage %")
            }
            if(sPinner1.selectedItemPosition==6 && sPinner2.selectedItemPosition==6){
                Img1.setImageResource(R.drawable.libra)
                Img2.setImageResource(R.drawable.libra)
                val randomPercentage = generateRandomPercentage()
                percentage.setText("$randomPercentage %")
            }
            if(sPinner1.selectedItemPosition==6 && sPinner2.selectedItemPosition==7){
                Img1.setImageResource(R.drawable.libra)
                Img2.setImageResource(R.drawable.scorpio)
                val randomPercentage = generateRandomPercentage()
                percentage.setText("$randomPercentage %")
            }
            if(sPinner1.selectedItemPosition==6 && sPinner2.selectedItemPosition==8){
                Img1.setImageResource(R.drawable.libra)
                Img2.setImageResource(R.drawable.sagittarius)
                val randomPercentage = generateRandomPercentage()
                percentage.setText("$randomPercentage %")
            }
            if(sPinner1.selectedItemPosition==6 && sPinner2.selectedItemPosition==9){
                Img1.setImageResource(R.drawable.libra)
                Img2.setImageResource(R.drawable.capricorn)
                val randomPercentage = generateRandomPercentage()
                percentage.setText("$randomPercentage %")
            }
            if(sPinner1.selectedItemPosition==6 && sPinner2.selectedItemPosition==10){
                Img1.setImageResource(R.drawable.libra)
                Img2.setImageResource(R.drawable.aquarius)
                val randomPercentage = generateRandomPercentage()
                percentage.setText("$randomPercentage %")
            }
            if(sPinner1.selectedItemPosition==6 && sPinner2.selectedItemPosition==11){
                Img1.setImageResource(R.drawable.libra)
                Img2.setImageResource(R.drawable.pisces)
                val randomPercentage = generateRandomPercentage()
                percentage.setText("$randomPercentage %")
            }

            //Option 8
            if(sPinner1.selectedItemPosition==7 && sPinner2.selectedItemPosition==0){
                Img1.setImageResource(R.drawable.scorpio)
                Img2.setImageResource(R.drawable.aries)
                val randomPercentage = generateRandomPercentage()
                percentage.setText("$randomPercentage %")
            }
            if(sPinner1.selectedItemPosition==7 && sPinner2.selectedItemPosition==1){
                Img1.setImageResource(R.drawable.scorpio)
                Img2.setImageResource(R.drawable.taurus)
                val randomPercentage = generateRandomPercentage()
                percentage.setText("$randomPercentage %")
            }
            if(sPinner1.selectedItemPosition==7 && sPinner2.selectedItemPosition==2){
                Img1.setImageResource(R.drawable.scorpio)
                Img2.setImageResource(R.drawable.gemini)
                val randomPercentage = generateRandomPercentage()
                percentage.setText("$randomPercentage %")
            }
            if(sPinner1.selectedItemPosition==7 && sPinner2.selectedItemPosition==3){
                Img1.setImageResource(R.drawable.scorpio)
                Img2.setImageResource(R.drawable.cancer)
                val randomPercentage = generateRandomPercentage()
                percentage.setText("$randomPercentage %")
            }
            if(sPinner1.selectedItemPosition==7 && sPinner2.selectedItemPosition==4){
                Img1.setImageResource(R.drawable.scorpio)
                Img2.setImageResource(R.drawable.leo)
                val randomPercentage = generateRandomPercentage()
                percentage.setText("$randomPercentage %")
            }
            if(sPinner1.selectedItemPosition==7 && sPinner2.selectedItemPosition==5){
                Img1.setImageResource(R.drawable.scorpio)
                Img2.setImageResource(R.drawable.virgo)
                val randomPercentage = generateRandomPercentage()
                percentage.setText("$randomPercentage %")
            }
            if(sPinner1.selectedItemPosition==7 && sPinner2.selectedItemPosition==6){
                Img1.setImageResource(R.drawable.scorpio)
                Img2.setImageResource(R.drawable.libra)
                val randomPercentage = generateRandomPercentage()
                percentage.setText("$randomPercentage %")
            }
            if(sPinner1.selectedItemPosition==7 && sPinner2.selectedItemPosition==7){
                Img1.setImageResource(R.drawable.scorpio)
                Img2.setImageResource(R.drawable.scorpio)
                val randomPercentage = generateRandomPercentage()
                percentage.setText("$randomPercentage %")
            }
            if(sPinner1.selectedItemPosition==7 && sPinner2.selectedItemPosition==8){
                Img1.setImageResource(R.drawable.scorpio)
                Img2.setImageResource(R.drawable.sagittarius)
                val randomPercentage = generateRandomPercentage()
                percentage.setText("$randomPercentage %")
            }
            if(sPinner1.selectedItemPosition==7 && sPinner2.selectedItemPosition==9){
                Img1.setImageResource(R.drawable.scorpio)
                Img2.setImageResource(R.drawable.capricorn)
                val randomPercentage = generateRandomPercentage()
                percentage.setText("$randomPercentage %")
            }
            if(sPinner1.selectedItemPosition==7 && sPinner2.selectedItemPosition==10){
                Img1.setImageResource(R.drawable.scorpio)
                Img2.setImageResource(R.drawable.aquarius)
                val randomPercentage = generateRandomPercentage()
                percentage.setText("$randomPercentage %")
            }
            if(sPinner1.selectedItemPosition==7 && sPinner2.selectedItemPosition==11){
                Img1.setImageResource(R.drawable.scorpio)
                Img2.setImageResource(R.drawable.pisces)
                val randomPercentage = generateRandomPercentage()
                percentage.setText("$randomPercentage %")
            }

            //Option 9
            if(sPinner1.selectedItemPosition==8 && sPinner2.selectedItemPosition==0){
                Img1.setImageResource(R.drawable.sagittarius)
                Img2.setImageResource(R.drawable.aries)
                val randomPercentage = generateRandomPercentage()
                percentage.setText("$randomPercentage %")
            }
            if(sPinner1.selectedItemPosition==8 && sPinner2.selectedItemPosition==1){
                Img1.setImageResource(R.drawable.sagittarius)
                Img2.setImageResource(R.drawable.taurus)
                val randomPercentage = generateRandomPercentage()
                percentage.setText("$randomPercentage %")
            }
            if(sPinner1.selectedItemPosition==8 && sPinner2.selectedItemPosition==2){
                Img1.setImageResource(R.drawable.sagittarius)
                Img2.setImageResource(R.drawable.gemini)
                val randomPercentage = generateRandomPercentage()
                percentage.setText("$randomPercentage %")
            }
            if(sPinner1.selectedItemPosition==8 && sPinner2.selectedItemPosition==3){
                Img1.setImageResource(R.drawable.sagittarius)
                Img2.setImageResource(R.drawable.cancer)
                val randomPercentage = generateRandomPercentage()
                percentage.setText("$randomPercentage %")
            }
            if(sPinner1.selectedItemPosition==8 && sPinner2.selectedItemPosition==4){
                Img1.setImageResource(R.drawable.sagittarius)
                Img2.setImageResource(R.drawable.leo)
                val randomPercentage = generateRandomPercentage()
                percentage.setText("$randomPercentage %")
            }
            if(sPinner1.selectedItemPosition==8 && sPinner2.selectedItemPosition==5){
                Img1.setImageResource(R.drawable.sagittarius)
                Img2.setImageResource(R.drawable.virgo)
                val randomPercentage = generateRandomPercentage()
                percentage.setText("$randomPercentage %")
            }
            if(sPinner1.selectedItemPosition==8 && sPinner2.selectedItemPosition==6){
                Img1.setImageResource(R.drawable.sagittarius)
                Img2.setImageResource(R.drawable.libra)
                val randomPercentage = generateRandomPercentage()
                percentage.setText("$randomPercentage %")
            }
            if(sPinner1.selectedItemPosition==8 && sPinner2.selectedItemPosition==7){
                Img1.setImageResource(R.drawable.sagittarius)
                Img2.setImageResource(R.drawable.scorpio)
                val randomPercentage = generateRandomPercentage()
                percentage.setText("$randomPercentage %")
            }
            if(sPinner1.selectedItemPosition==8 && sPinner2.selectedItemPosition==8){
                Img1.setImageResource(R.drawable.sagittarius)
                Img2.setImageResource(R.drawable.sagittarius)
                val randomPercentage = generateRandomPercentage()
                percentage.setText("$randomPercentage %")
            }
            if(sPinner1.selectedItemPosition==8 && sPinner2.selectedItemPosition==9){
                Img1.setImageResource(R.drawable.sagittarius)
                Img2.setImageResource(R.drawable.capricorn)
                val randomPercentage = generateRandomPercentage()
                percentage.setText("$randomPercentage %")
            }
            if(sPinner1.selectedItemPosition==8 && sPinner2.selectedItemPosition==10){
                Img1.setImageResource(R.drawable.sagittarius)
                Img2.setImageResource(R.drawable.aquarius)
                val randomPercentage = generateRandomPercentage()
                percentage.setText("$randomPercentage %")
            }
            if(sPinner1.selectedItemPosition==8 && sPinner2.selectedItemPosition==11){
                Img1.setImageResource(R.drawable.sagittarius)
                Img2.setImageResource(R.drawable.pisces)
                val randomPercentage = generateRandomPercentage()
                percentage.setText("$randomPercentage %")
            }


            //Option 10
            if(sPinner1.selectedItemPosition==9 && sPinner2.selectedItemPosition==0){
                Img1.setImageResource(R.drawable.capricorn)
                Img2.setImageResource(R.drawable.aries)
                val randomPercentage = generateRandomPercentage()
                percentage.setText("$randomPercentage %")
            }
            if(sPinner1.selectedItemPosition==9 && sPinner2.selectedItemPosition==1){
                Img1.setImageResource(R.drawable.capricorn)
                Img2.setImageResource(R.drawable.taurus)
                val randomPercentage = generateRandomPercentage()
                percentage.setText("$randomPercentage %")
            }
            if(sPinner1.selectedItemPosition==9 && sPinner2.selectedItemPosition==2){
                Img1.setImageResource(R.drawable.capricorn)
                Img2.setImageResource(R.drawable.gemini)
                val randomPercentage = generateRandomPercentage()
                percentage.setText("$randomPercentage %")
            }
            if(sPinner1.selectedItemPosition==9 && sPinner2.selectedItemPosition==3){
                Img1.setImageResource(R.drawable.capricorn)
                Img2.setImageResource(R.drawable.cancer)
                val randomPercentage = generateRandomPercentage()
                percentage.setText("$randomPercentage %")
            }
            if(sPinner1.selectedItemPosition==9 && sPinner2.selectedItemPosition==4){
                Img1.setImageResource(R.drawable.capricorn)
                Img2.setImageResource(R.drawable.leo)
                val randomPercentage = generateRandomPercentage()
                percentage.setText("$randomPercentage %")
            }
            if(sPinner1.selectedItemPosition==9 && sPinner2.selectedItemPosition==5){
                Img1.setImageResource(R.drawable.capricorn)
                Img2.setImageResource(R.drawable.virgo)
                val randomPercentage = generateRandomPercentage()
                percentage.setText("$randomPercentage %")
            }
            if(sPinner1.selectedItemPosition==9 && sPinner2.selectedItemPosition==6){
                Img1.setImageResource(R.drawable.capricorn)
                Img2.setImageResource(R.drawable.libra)
                val randomPercentage = generateRandomPercentage()
                percentage.setText("$randomPercentage %")
            }
            if(sPinner1.selectedItemPosition==9 && sPinner2.selectedItemPosition==7){
                Img1.setImageResource(R.drawable.capricorn)
                Img2.setImageResource(R.drawable.scorpio)
                val randomPercentage = generateRandomPercentage()
                percentage.setText("$randomPercentage %")
            }
            if(sPinner1.selectedItemPosition==9 && sPinner2.selectedItemPosition==8){
                Img1.setImageResource(R.drawable.capricorn)
                Img2.setImageResource(R.drawable.sagittarius)
                val randomPercentage = generateRandomPercentage()
                percentage.setText("$randomPercentage %")
            }
            if(sPinner1.selectedItemPosition==9 && sPinner2.selectedItemPosition==9){
                Img1.setImageResource(R.drawable.capricorn)
                Img2.setImageResource(R.drawable.capricorn)
                val randomPercentage = generateRandomPercentage()
                percentage.setText("$randomPercentage %")
            }
            if(sPinner1.selectedItemPosition==9 && sPinner2.selectedItemPosition==10){
                Img1.setImageResource(R.drawable.capricorn)
                Img2.setImageResource(R.drawable.aquarius)
                val randomPercentage = generateRandomPercentage()
                percentage.setText("$randomPercentage %")
            }
            if(sPinner1.selectedItemPosition==9 && sPinner2.selectedItemPosition==11){
                Img1.setImageResource(R.drawable.capricorn)
                Img2.setImageResource(R.drawable.pisces)
                val randomPercentage = generateRandomPercentage()
                percentage.setText("$randomPercentage %")
            }


            //Option 11
            if(sPinner1.selectedItemPosition==10 && sPinner2.selectedItemPosition==0){
                Img1.setImageResource(R.drawable.aquarius)
                Img2.setImageResource(R.drawable.aries)
                val randomPercentage = generateRandomPercentage()
                percentage.setText("$randomPercentage %")
            }
            if(sPinner1.selectedItemPosition==10 && sPinner2.selectedItemPosition==1){
                Img1.setImageResource(R.drawable.aquarius)
                Img2.setImageResource(R.drawable.taurus)
                val randomPercentage = generateRandomPercentage()
                percentage.setText("$randomPercentage %")
            }
            if(sPinner1.selectedItemPosition==10 && sPinner2.selectedItemPosition==2){
                Img1.setImageResource(R.drawable.aquarius)
                Img2.setImageResource(R.drawable.gemini)
                val randomPercentage = generateRandomPercentage()
                percentage.setText("$randomPercentage %")
            }
            if(sPinner1.selectedItemPosition==10 && sPinner2.selectedItemPosition==3){
                Img1.setImageResource(R.drawable.aquarius)
                Img2.setImageResource(R.drawable.cancer)
                val randomPercentage = generateRandomPercentage()
                percentage.setText("$randomPercentage %")
            }
            if(sPinner1.selectedItemPosition==10 && sPinner2.selectedItemPosition==4){
                Img1.setImageResource(R.drawable.aquarius)
                Img2.setImageResource(R.drawable.leo)
                val randomPercentage = generateRandomPercentage()
                percentage.setText("$randomPercentage %")
            }
            if(sPinner1.selectedItemPosition==10 && sPinner2.selectedItemPosition==5){
                Img1.setImageResource(R.drawable.aquarius)
                Img2.setImageResource(R.drawable.virgo)
                val randomPercentage = generateRandomPercentage()
                percentage.setText("$randomPercentage %")
            }
            if(sPinner1.selectedItemPosition==10 && sPinner2.selectedItemPosition==6){
                Img1.setImageResource(R.drawable.aquarius)
                Img2.setImageResource(R.drawable.libra)
                val randomPercentage = generateRandomPercentage()
                percentage.setText("$randomPercentage %")
            }
            if(sPinner1.selectedItemPosition==10 && sPinner2.selectedItemPosition==7){
                Img1.setImageResource(R.drawable.aquarius)
                Img2.setImageResource(R.drawable.scorpio)
                val randomPercentage = generateRandomPercentage()
                percentage.setText("$randomPercentage %")
            }
            if(sPinner1.selectedItemPosition==10 && sPinner2.selectedItemPosition==8){
                Img1.setImageResource(R.drawable.aquarius)
                Img2.setImageResource(R.drawable.sagittarius)
                val randomPercentage = generateRandomPercentage()
                percentage.setText("$randomPercentage %")
            }
            if(sPinner1.selectedItemPosition==10 && sPinner2.selectedItemPosition==9){
                Img1.setImageResource(R.drawable.aquarius)
                Img2.setImageResource(R.drawable.capricorn)
                val randomPercentage = generateRandomPercentage()
                percentage.setText("$randomPercentage %")
            }
            if(sPinner1.selectedItemPosition==10 && sPinner2.selectedItemPosition==10){
                Img1.setImageResource(R.drawable.aquarius)
                Img2.setImageResource(R.drawable.aquarius)
                val randomPercentage = generateRandomPercentage()
                percentage.setText("$randomPercentage %")
            }
            if(sPinner1.selectedItemPosition==10 && sPinner2.selectedItemPosition==11){
                Img1.setImageResource(R.drawable.aquarius)
                Img2.setImageResource(R.drawable.pisces)
                val randomPercentage = generateRandomPercentage()
                percentage.setText("$randomPercentage %")
            }


            //Option 12
            if(sPinner1.selectedItemPosition==11 && sPinner2.selectedItemPosition==0){
                Img1.setImageResource(R.drawable.pisces)
                Img2.setImageResource(R.drawable.aries)
                val randomPercentage = generateRandomPercentage()
                percentage.setText("$randomPercentage %")
            }
            if(sPinner1.selectedItemPosition==11 && sPinner2.selectedItemPosition==1){
                Img1.setImageResource(R.drawable.pisces)
                Img2.setImageResource(R.drawable.taurus)
                val randomPercentage = generateRandomPercentage()
                percentage.setText("$randomPercentage %")
            }
            if(sPinner1.selectedItemPosition==11 && sPinner2.selectedItemPosition==2){
                Img1.setImageResource(R.drawable.pisces)
                Img2.setImageResource(R.drawable.gemini)
                val randomPercentage = generateRandomPercentage()
                percentage.setText("$randomPercentage %")
            }
            if(sPinner1.selectedItemPosition==11 && sPinner2.selectedItemPosition==3){
                Img1.setImageResource(R.drawable.pisces)
                Img2.setImageResource(R.drawable.cancer)
                val randomPercentage = generateRandomPercentage()
                percentage.setText("$randomPercentage %")
            }
            if(sPinner1.selectedItemPosition==11 && sPinner2.selectedItemPosition==4){
                Img1.setImageResource(R.drawable.pisces)
                Img2.setImageResource(R.drawable.leo)
                val randomPercentage = generateRandomPercentage()
                percentage.setText("$randomPercentage %")
            }
            if(sPinner1.selectedItemPosition==11 && sPinner2.selectedItemPosition==5){
                Img1.setImageResource(R.drawable.pisces)
                Img2.setImageResource(R.drawable.virgo)
                val randomPercentage = generateRandomPercentage()
                percentage.setText("$randomPercentage %")
            }
            if(sPinner1.selectedItemPosition==11 && sPinner2.selectedItemPosition==6){
                Img1.setImageResource(R.drawable.pisces)
                Img2.setImageResource(R.drawable.libra)
                val randomPercentage = generateRandomPercentage()
                percentage.setText("$randomPercentage %")
            }
            if(sPinner1.selectedItemPosition==11 && sPinner2.selectedItemPosition==7){
                Img1.setImageResource(R.drawable.pisces)
                Img2.setImageResource(R.drawable.scorpio)
                val randomPercentage = generateRandomPercentage()
                percentage.setText("$randomPercentage %")
            }
            if(sPinner1.selectedItemPosition==11 && sPinner2.selectedItemPosition==8){
                Img1.setImageResource(R.drawable.pisces)
                Img2.setImageResource(R.drawable.sagittarius)
                val randomPercentage = generateRandomPercentage()
                percentage.setText("$randomPercentage %")
            }
            if(sPinner1.selectedItemPosition==11 && sPinner2.selectedItemPosition==9){
                Img1.setImageResource(R.drawable.pisces)
                Img2.setImageResource(R.drawable.capricorn)
                val randomPercentage = generateRandomPercentage()
                percentage.setText("$randomPercentage %")
            }
            if(sPinner1.selectedItemPosition==11 && sPinner2.selectedItemPosition==10){
                Img1.setImageResource(R.drawable.pisces)
                Img2.setImageResource(R.drawable.aquarius)
                val randomPercentage = generateRandomPercentage()
                percentage.setText("$randomPercentage %")
            }
            if(sPinner1.selectedItemPosition==11 && sPinner2.selectedItemPosition==11){
                Img1.setImageResource(R.drawable.pisces)
                Img2.setImageResource(R.drawable.pisces)
                val randomPercentage = generateRandomPercentage()
                percentage.setText("$randomPercentage %")
            }
            //End
        }
    }

    fun generateRandomPercentage(): Double {
        val random = Random()
        val percentage = random.nextDouble() * 100.0
        return "%.2f".format(percentage).toDouble()
    }

    fun onActionClick (view: View){
        val intent = Intent(this, Page2Activity::class.java)
        startActivity(intent)
    }
}