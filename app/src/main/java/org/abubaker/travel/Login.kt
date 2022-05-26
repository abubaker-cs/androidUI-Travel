package org.abubaker.travel

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import org.abubaker.travel.databinding.ActivityLoginBinding

class Login : AppCompatActivity() {

    private lateinit var binding: ActivityLoginBinding


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityLoginBinding.inflate(layoutInflater)
        setContentView(binding.root)


        // Create an Account
        binding.btnCreateAccount.setOnClickListener {

            val i = Intent(this@Login, Register::class.java)
            startActivity(i)

        }

        // Sign in
        binding.btnSignIn.setOnClickListener {

            val i = Intent(this@Login, MainActivity::class.java)
            startActivity(i)

        }


    }


}