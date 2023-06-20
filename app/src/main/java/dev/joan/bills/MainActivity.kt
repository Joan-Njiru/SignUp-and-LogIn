package dev.joan.bills

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import android.widget.Button
import android.widget.Toast
import dev.joan.bills.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    lateinit var btSignUp: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
//        setContentView(R.layout.activity_main)
        setContentView(binding.root)
        btSignUp=findViewById(R.id.btSignUp)
        btSignUp.setOnClickListener {
            val intent= Intent(this,Login::class.java)
            startActivity(intent)
        }
    }

    override fun onResume() {
        super.onResume()

        validateSignUp()


    }

    fun validateSignUp(){
        val name = binding.etUserName.text.toString()
        val email = binding.etEmailAddress.text.toString()
        val phone = binding.etPhoneNumber.text.toString()
        val password = binding.etPassWord.text.toString()
        var error = false

        if (name.isBlank()){
            binding.tilUserName.error = "UserName field cannot be empty"
            error = true
        }else{
            binding.tilUserName.error=null
        }
        if (email.isBlank()){
            binding.tilEmailAddress.error = "Email field cannot be empty"
            error = true
        }else{
            binding.tilEmailAddress.error=null
        }

        if (phone.isEmpty()){
            binding.tilPhoneNumber.error = "Phone number field cannot be empty"
            error = true
        }else{
            binding.tilPhoneNumber.error=null
        }
        if (password.isEmpty()){
            binding.tilPassWord.error = "Password field cannot be empty"
            error = true
        }else{
            binding.tilPassWord.error=null
        }

    }

}