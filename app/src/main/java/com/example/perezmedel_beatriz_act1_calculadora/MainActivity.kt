package com.example.perezmedel_beatriz_act1_calculadora

import android.os.Bundle
import android.util.Log
import android.view.View
import android.view.View.OnClickListener
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.perezmedel_beatriz_act1_calculadora.databinding.ActivityMainBinding
import kotlin.math.cos
import kotlin.math.sin
import kotlin.math.tan

class MainActivity : AppCompatActivity(), OnClickListener{

    private lateinit var binding: ActivityMainBinding
    private lateinit var tvOperation: TextView
    private lateinit var tvResult: TextView
    private var number: String = ""
    private var number1 = ""
    private var operation: String = ""
    private var result: String = ""




    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)


        tvOperation = binding.textOperation;
        tvResult = binding.texResult;


        binding.btnZero.setOnClickListener(this)
        binding.btnOne.setOnClickListener(this)
        binding.btnTwo.setOnClickListener(this)
        binding.btnThree.setOnClickListener(this)
        binding.btnFour.setOnClickListener(this)
        binding.btnFive.setOnClickListener(this)
        binding.btnSix.setOnClickListener(this)
        binding.btnSeven.setOnClickListener(this)
        binding.btnEight.setOnClickListener(this)
        binding.btnNine.setOnClickListener(this)
        binding.btnDivision.setOnClickListener(this)
        binding.btnMult.setOnClickListener(this)
        binding.btnSum.setOnClickListener(this)
        binding.btnSubstract.setOnClickListener(this)
        binding.btnRest.setOnClickListener(this)
        binding.btnResult.setOnClickListener(this)
        binding.btnRestart.setOnClickListener(this)
        binding.btnSquared?.setOnClickListener(this)
        binding.btnCos?.setOnClickListener(this)
        binding.btnSin?.setOnClickListener(this)
        binding.btnTangent?.setOnClickListener(this)

    }

    override fun onClick(v: View?) {
        when(v?.id) {
            binding.btnZero.id -> {
                number += binding.btnZero.text
                tvOperation.text = number1 + operation + number
            }
            binding.btnOne.id -> {
                number +=  binding.btnOne.text
                tvOperation.text = number1 + operation + number
            }
            binding.btnTwo.id -> {
                number += binding.btnTwo.text
                tvOperation.text = number1 + operation + number
            }
            binding.btnThree.id -> {
                number += binding.btnThree.text
                tvOperation.text = number1 + operation + number
            }
            binding.btnFour.id -> {
                number += binding.btnFour.text
                tvOperation.text = number1 + operation + number
            }
            binding.btnFive.id -> {
                number += binding.btnFive.text
                tvOperation.text = number1 + operation + number
            }
            binding.btnSix.id -> {
                number += binding.btnSix.text
                tvOperation.text = number1 + operation + number
            }
            binding.btnSeven.id -> {
                number += binding.btnSeven.text
                tvOperation.text = number1 + operation + number
            }
            binding.btnEight.id -> {
                number += binding.btnEight.text
                tvOperation.text = number1 + operation + number
                }
            binding.btnNine.id -> {
                number += binding.btnNine.text
                tvOperation.text = number1 + operation + number
            }
            binding.btnSum.id -> {
                operation = binding.btnSum.text.toString()
                tvOperation.text = number + operation
                number1 = number
                number = ""
            }
            binding.btnSubstract.id -> {
                operation = binding.btnSubstract.text.toString()
                tvOperation.text = number + operation
                number1 = number
                number = ""
            }
            binding.btnMult.id -> {
                operation = binding.btnMult.text.toString()
                tvOperation.text = number + operation
                number1 = number
                number = ""
            }
            binding.btnDivision.id -> {
                operation = binding.btnDivision.text.toString()
                tvOperation.text = number + operation
                number1 = number
                number = ""
            }
            binding.btnRest.id -> {
                operation = binding.btnRest.text.toString()
                tvOperation.text = number + operation
                number1 = number
                number = ""
            }
            binding.btnSquared?.id -> {
                operation = binding.btnSquared?.text.toString()
                tvOperation.text = number + operation
                number1 = number
                number = ""
            }
            binding.btnCos?.id -> {
                operation = binding.btnCos?.text.toString()
                tvOperation.text = number + operation
                number1 = number
                number = ""
            }
            binding.btnSin?.id -> {
                operation = binding.btnSin?.text.toString()
                tvOperation.text = number + operation
                number1 = number
                number = ""
            }
            binding.btnTangent?.id -> {
                operation = binding.btnTangent?.text.toString()
                tvOperation.text = number + operation
                number1 = number
                number = ""
            }
            binding.btnResult.id -> {
                if(operation.equals("+")) {
                    tvResult.text = sumar();
                }
                if(operation.equals("-")) {
                    tvResult.text = restar();
                }
                if(operation.equals("x")) {
                    tvResult.text = multiplicar();
                }
                if(operation.equals("÷")) {
                    tvResult.text = dividir();
                }
                if(operation.equals("%")) {
                    tvResult.text = resto();
                }
                if(operation.equals("x²")) {
                    tvResult.text = alCuadrado();
                }
                if(operation.equals("cos")) {
                    tvResult.text = coseno();
                }
                if(operation.equals("sin")) {
                    tvResult.text = seno();
                }
                if(operation.equals("tan")) {
                    tvResult.text = tangente();
                }
            }
            binding.btnRestart.id -> {
                tvOperation.text = ""
                tvResult.text = ""
                number = ""
                number1 = ""
                operation = ""
            }
    }
}

    private fun sumar(): String {
        result = (number1.toInt() + number.toInt()).toString()
        return result
    }

    private fun restar(): String {
        result = (number1.toInt() - number.toInt()).toString()
        return result
    }

    private fun multiplicar(): String {
        result = (number1.toInt() * number.toInt()).toString()
        return result
    }

    private fun dividir(): String {
        result = (number1.toInt() / number.toInt()).toString()
        return result
    }

    private fun resto(): String {
        result = (number1.toInt() % number.toInt()).toString()
        return result
    }

    private fun alCuadrado(): String {
        result = (number1.toInt() * number1.toInt()).toString()
        return result
    }

    private fun coseno(): String {
        val radians = Math.toRadians(number1.toDouble())
        result = cos(radians).toString()
        return  result
    }

    private fun seno(): String {
        val radians = Math.toRadians(number1.toDouble())
        result = sin(radians).toString()
        return result
    }

    private fun tangente(): String {
        val radians = Math.toRadians(number1.toDouble())
        result = tan(radians).toString()
        return result
    }
}
