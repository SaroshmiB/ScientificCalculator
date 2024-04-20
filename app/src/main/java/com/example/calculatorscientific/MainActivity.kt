package com.example.calculatorscientific

import android.annotation.SuppressLint
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import kotlin.math.*

class MainActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        val btn0: Button = findViewById(R.id.btn0)
        val btn1: Button = findViewById(R.id.btn1)
        val btn2: Button = findViewById(R.id.btn2)
        val btn3: Button = findViewById(R.id.btn3)
        val btn4: Button = findViewById(R.id.btn4)
        val btn5: Button = findViewById(R.id.btn5)
        val btn6: Button = findViewById(R.id.btn6)
        val btn7: Button = findViewById(R.id.btn7)
        val btn8: Button = findViewById(R.id.btn8)
        val btn9: Button = findViewById(R.id.btn9)
        val btnadd: Button = findViewById(R.id.btnadd)
        val btnsub: Button = findViewById(R.id.btnsub)
        val btnmul: Button = findViewById(R.id.btnmul)
        val btndiv: Button = findViewById(R.id.btndiv)
        val btnsin: Button = findViewById(R.id.btnsin)
        val btncos: Button = findViewById(R.id.btncos)
        val btntan: Button = findViewById(R.id.btntan)
        val btnlog: Button = findViewById(R.id.btnlog)
        val btnfact: Button = findViewById(R.id.btnfact)
        val btnfrac: Button = findViewById(R.id.btnfrac)
        val btnsq: Button = findViewById(R.id.btnsq)
        val btnroot: Button = findViewById(R.id.btnroot)
        val btnpow: Button = findViewById(R.id.btnpow)
        val btnmod: Button = findViewById(R.id.btnmod)
        val btndec:Button=findViewById(R.id.btndec)
        val btnallclr: Button = findViewById(R.id.btnac)
        val btnclr: Button = findViewById(R.id.btnclr)
        val btnequal: Button = findViewById(R.id.btnequal)
        val textbox: TextView = findViewById(R.id.textbox)
        val tv: TextView = findViewById(R.id.textView)
        var input: String
        var r: Double = 0.0
        var value: Int = 0
        var fact: Int = 1
        var num1: Double = 0.0
        var num2: Double = 0.0
        var result: Double = 0.0
        var op: String = ""

        btn0.setOnClickListener() {
            (textbox.getText().toString() + "0").also { textbox.text = it }
            tv.text = textbox.text.toString()
        }

        btn1.setOnClickListener() {

            (textbox.getText().toString() + "1").also { textbox.text = it }
            tv.text = textbox.text.toString()
        }

        btn2.setOnClickListener() {
            (textbox.getText().toString() + "2").also { textbox.text = it }
            tv.text = textbox.text.toString()
        }

        btn3.setOnClickListener() {
            (textbox.getText().toString() + "3").also { textbox.text = it }
            tv.text = textbox.text.toString()
        }

        btn4.setOnClickListener() {
            (textbox.getText().toString() + "4").also { textbox.text = it }
            tv.text = textbox.text.toString()
        }

        btn5.setOnClickListener() {
            (textbox.getText().toString() + "5").also { textbox.text = it }
            tv.text = textbox.text.toString()
        }

        btn6.setOnClickListener() {
            (textbox.getText().toString() + "6").also { textbox.text = it }
            tv.text = textbox.text.toString()
        }

        btn7.setOnClickListener() {
            (textbox.getText().toString() + "7").also { textbox.text = it }
            tv.text = textbox.text.toString()
        }

        btn8.setOnClickListener() {
            (textbox.getText().toString() + "8").also { textbox.text = it }
            tv.text = textbox.text.toString()
        }

        btn9.setOnClickListener() {
            (textbox.getText().toString() + "9").also { textbox.text = it }
            tv.text = textbox.text.toString()
        }
        btndec.setOnClickListener(){
            (textbox.getText().toString() + ".").also { textbox.text = it }
            tv.text = textbox.text.toString()
        }

        btnallclr.setOnClickListener() {
            textbox.text = ""
            tv.text = ""
            num1 = 0.0
            num2 = 0.0
            result = 0.0
            op = ""
        }

        btnclr.setOnClickListener() {
            input = textbox.getText().toString()
            input.substring(0, input.length - 1).also { input = it }
            textbox.text = input
        }
        btnadd.setOnClickListener() {
            num1 = textbox.getText().toString().toDouble()
            op = btnadd.text.toString()
            tv.text = textbox.getText().toString() + "+"
            textbox.text = ""
        }
        btnsub.setOnClickListener() {
            num1 = textbox.getText().toString().toDouble()
            op = btnsub.text.toString()
            tv.text = textbox.getText().toString() + "-"
            textbox.text = ""
        }
        btnmul.setOnClickListener() {
            num1 = textbox.getText().toString().toDouble()
            op = btnmul.text.toString()
            tv.text = textbox.getText().toString() + "x"
            textbox.text = ""
        }
        btndiv.setOnClickListener() {
            num1 = textbox.getText().toString().toDouble()
            op = btndiv.text.toString()
            tv.text = textbox.getText().toString() + "÷"
            textbox.text = ""
        }
        btnmod.setOnClickListener() {
            num1 = textbox.getText().toString().toDouble()
            op = "%"
            tv.text = textbox.getText().toString() + "%"
            textbox.text = ""
        }
        btnroot.setOnClickListener() {
            input = textbox.text.toString()
            tv.text = "√$input"
            r = sqrt(input.toDouble())
            r.toString().also { textbox.text = it }
        }
        btnsin.setOnClickListener() {
            input = textbox.text.toString()
            tv.text = "sin($input)"
            textbox.text = sin(input.toDouble()).toString()
        }
        btncos.setOnClickListener() {
            input = textbox.text.toString()
            tv.text = "cos($input)"
            textbox.text = cos(input.toDouble()).toString()

        }
        btntan.setOnClickListener() {
            input = textbox.text.toString()
            tv.text = "tan($input)"
            textbox.text = tan(input.toDouble()).toString()
        }
        btnlog.setOnClickListener() {
            input = textbox.text.toString()
            tv.text = "log($input)"
            textbox.text = log(input.toDouble(), 10.0).toString()
        }
        btnfrac.setOnClickListener() {
            input = textbox.text.toString()
            tv.text = "1/($input)"
            textbox.text = (1 / input.toDouble()).toString()
        }
        btnfact.setOnClickListener() {
            value = textbox.text.toString().toInt()
            tv.text = value.toString() + "!"
            textbox.text = factorial(value).toString()
        }
        btnsq.setOnClickListener() {
            var d: Double = textbox.getText().toString().toDouble()
            var square: Double = d * d
            tv.text = d.toString() + ""
            textbox.text = square.toString()
        }
        btnpow.setOnClickListener() {
            num1 = textbox.getText().toString().toDouble()
            op = btnpow.text.toString()
            tv.text = textbox.getText().toString() + "^"
            textbox.text = ""
        }

        btnequal.setOnClickListener() {
            num2 = textbox.text.toString().toDouble()
            when (op) {
                "+" -> result = num1 + num2
                "-" -> result = num1 - num2
                "x" -> result = num1 * num2
                "÷" -> result = num1 / num2
                "x^y" -> result = num1.pow(num2)
                "%" -> result = num1 % num2
            }
            textbox.text = result.toString()
            tv.text = ""
            num1 = 0.0
            num2 = 0.0
        }
    }
}
fun factorial(n: Int): Double {
    var fact = 1.0
    for (i in 1..n) {
        fact *= i
    }
    return fact
}