package com.example.md_1

import android.app.Activity
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.InputType
import android.view.MotionEvent
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.ImageView
import androidx.navigation.Navigation.findNavController
import androidx.navigation.Navigation
import androidx.navigation.fragment.findNavController
import com.example.md_1.onboarding.ViewPagerFragment



class LoginActivity : AppCompatActivity() {
    private var isPasswordVisible = false
    private var pass: EditText? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
        supportActionBar?.hide()
        val prevbutton = findViewById<ImageView>(R.id.prevbutton)
        prevbutton.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }
        val name = findViewById<EditText>(R.id.editname)
        val mail = findViewById<EditText>(R.id.editmail)

        val pass = findViewById<EditText>(R.id.editpass)

        val sign = findViewById<Button>(R.id.button3)
        sign.setOnClickListener {

            if (name.text.isEmpty())
                name.hint = "Enter your name"
            else if (mail.text.isEmpty())
                mail.hint = "Enter your E-mail"
            else if (pass.text.isEmpty())
                pass.hint = "Enter your password"
            else {
                val bna = Intent(this, BottomNavigationActivity::class.java)
                startActivity(bna)
            }
            var password = pass

            pass.setOnTouchListener(View.OnTouchListener { _, event ->
                val right = 2
                if (event.action == MotionEvent.ACTION_UP) {
                    if (event.rawX >= password.right - password.compoundDrawables[right].bounds.width() - 50) {
                        val selection = password.selectionEnd
                        if (isPasswordVisible) {
                            password.setCompoundDrawablesRelativeWithIntrinsicBounds(
                                0,
                                0,
                                R.drawable.visibility_off,
                                0
                            )
                            password.inputType =
                                InputType.TYPE_CLASS_TEXT or InputType.TYPE_TEXT_VARIATION_PASSWORD
                            isPasswordVisible = false
                        } else {
                            password.setCompoundDrawablesRelativeWithIntrinsicBounds(
                                0,
                                0,
                                R.drawable.visibility_on,
                                0
                            )
                            password.inputType = 1
                            isPasswordVisible = true
                        }
                        pass.setSelection(selection)
                        this.pass = password
                        return@OnTouchListener true
                    }
                }
                false
            })

        }

    }
}
