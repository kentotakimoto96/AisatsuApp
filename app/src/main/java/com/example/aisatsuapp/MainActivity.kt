package com.example.aisatsuapp

import android.app.TimePickerDialog
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.app.AlertDialog
import android.util.Log
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(), View.OnClickListener {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        button1.setOnClickListener(this)
//        button2.setOnClickListener(this)
//        button3.setOnClickListener(this)
    }

    override fun onClick(v: View) {
            showTimePickerDialog()
    }


    private fun showTimePickerDialog() {
        val timePickerDialog = TimePickerDialog(
            this,
            TimePickerDialog.OnTimeSetListener { view, hour, minute ->
                Log.d("UI_PARTS", "$hour:$minute")

                if (hour >= 2 && hour <= 9){
                    textView2.text="おはよう"
                }else if (hour >= 10 && hour <= 17){
                    textView2.text="こんにちは"
                }else{
                    textView2.text="こんばんは"
                }
            },
            13, 0, true)
        timePickerDialog.show()
    }
}