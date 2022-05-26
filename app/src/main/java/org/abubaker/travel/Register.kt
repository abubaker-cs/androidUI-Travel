package org.abubaker.travel

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import org.abubaker.travel.databinding.ActivityRegisterBinding

class Register : AppCompatActivity() {

    private lateinit var binding: ActivityRegisterBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)


        binding = ActivityRegisterBinding.inflate(layoutInflater)
        setContentView(binding.root)


        // Back
        binding.btnBack.setOnClickListener {

            val i = Intent(this@Register, Login::class.java)
            startActivity(i)

        }

    }

    // Continue:
    // https://www.youtube.com/watch?v=D63bgYexWqM&t=1068s&ab_channel=Adityatprtma


}