package com.example.basicbankingapp
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView


class AccountDetailsActivity : AppCompatActivity() {

    private var accountBalance: Int = 5400

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_account_details)

        val balanceTextView: TextView = findViewById(R.id.balanceTextView)
        val transactionAmountEditText: EditText = findViewById(R.id.transactionAmountEditText)
        val withdrawButton: Button = findViewById(R.id.withdrawButton)
        val depositButton: Button = findViewById(R.id.depositButton)

        balanceTextView.text = "Available balance: $accountBalance"

        withdrawButton.setOnClickListener {
            val transactionAmount = transactionAmountEditText.text.toString().toInt()
            accountBalance -= transactionAmount
            updateBalanceTextView()

            val intent = Intent(this, TransactionActivity::class.java)
            intent.putExtra("accountBalance", accountBalance)
            startActivity(intent)
        }

        depositButton.setOnClickListener {
            val transactionAmount = transactionAmountEditText.text.toString().toInt()
            accountBalance += transactionAmount
            updateBalanceTextView()

            val intent = Intent(this, TransactionActivity::class.java)
            intent.putExtra("accountBalance", accountBalance)
            startActivity(intent)
        }
    }

    private fun updateBalanceTextView() {
        val balanceTextView: TextView = findViewById(R.id.balanceTextView)
        balanceTextView.text = "Available balance: $accountBalance"
    }
}
