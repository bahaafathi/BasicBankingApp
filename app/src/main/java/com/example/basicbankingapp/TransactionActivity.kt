package com.example.basicbankingapp

import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import android.widget.TextView


class TransactionActivity : AppCompatActivity() {

    private var accountBalance: Int = 0;

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_transaction)
        val updatedBalanceTextView: TextView = findViewById(R.id.updatedBalanceTextView)
        val backButton: Button = findViewById(R.id.backButton)
        accountBalance = intent.getIntExtra("accountBalance", 0)

        updatedBalanceTextView.text = "Savings: $accountBalance"


        backButton.setOnClickListener {
            finish()
        }
    }
}
