package jp.techacademy.takayuk.calcapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AlertDialog
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(), View.OnClickListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        button1.setOnClickListener(this)
        button2.setOnClickListener(this)
        button3.setOnClickListener(this)
        button4.setOnClickListener(this)
    }

    override fun onClick(v: View) {
        var i = 0.0
        val intent = Intent(this, SecondActivity::class.java)

        when (v.id) {
            R.id.button1 -> {
                if (editText.length() == 0 && editText2.length() == 0){
                    showAlertDialog()
                } else {
                    i = editText.text.toString().toDouble() + editText2.text.toString().toDouble()
                    intent.putExtra("VALUE1", i)
                    startActivity(intent)
                }
            }
            R.id.button2 -> {
                if (editText.length() == 0 && editText2.length() == 0){
                    showAlertDialog()
                } else {
                    i = editText.text.toString().toDouble() - editText2.text.toString().toDouble()
                    intent.putExtra("VALUE1", i)
                    startActivity(intent)
                }
            }
            R.id.button3 -> {
                if (editText.length() == 0 && editText2.length() == 0){
                    showAlertDialog()
                } else {
                    i = editText.text.toString().toDouble() * editText2.text.toString().toDouble()
                    intent.putExtra("VALUE1", i)
                    startActivity(intent)
                }
            }
            R.id.button4 -> {
                if (editText.length() == 0 && editText2.length() == 0){
                    showAlertDialog()
                } else {
                    i = editText.text.toString().toDouble() / editText2.text.toString().toDouble()
                    intent.putExtra("VALUE1", i)
                    startActivity(intent)
                }
            }
        }


    }

    private fun showAlertDialog() {
        val alertDialogBuilder = AlertDialog.Builder(this)
        alertDialogBuilder.setMessage("何か数値を入力してください")
        alertDialogBuilder.setPositiveButton("閉じる"){dialog, which ->
        }

        val alertDialog = alertDialogBuilder.create()
        alertDialog.show()
    }

}