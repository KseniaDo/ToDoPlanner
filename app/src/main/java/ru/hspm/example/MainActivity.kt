package ru.hspm.example

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.CheckBox
import android.widget.TextView
import android.widget.Toast
import android.widget.ImageView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.ContextCompat
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.navigation.findNavController

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        val view = findViewById<View>(R.id.main)
        ViewCompat.setOnApplyWindowInsetsListener(view) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        val ButtonAdd = view.findViewById<Button>(R.id.buttonadd)
        ButtonAdd.isLongClickable = true
        val ButtonQuest = view.findViewById<Button>(R.id.buttonquest)
        ButtonQuest.isLongClickable = true
        val HeaderText = view.findViewById<TextView>(R.id.headertext)
        val CheckBox1 = view.findViewById<CheckBox>(R.id.checkBox1)
        val CheckBox2 = view.findViewById<CheckBox>(R.id.checkBox2)
        val CheckBox3 = view.findViewById<CheckBox>(R.id.checkBox3)
        val CheckBox4 = view.findViewById<CheckBox>(R.id.checkBox4)
        val CheckBox5 = view.findViewById<CheckBox>(R.id.checkBox5)
        val CheckBox6 = view.findViewById<CheckBox>(R.id.checkBox6)
        val CheckBox7 = view.findViewById<CheckBox>(R.id.checkBox7)
        val imageSuccess1 = view.findViewById<ImageView>(R.id.imageSuccess1)
        val imageSuccess2 = view.findViewById<ImageView>(R.id.imageSuccess2)
        val imageSuccess3 = view.findViewById<ImageView>(R.id.imageSuccess3)
        val imageSuccess4 = view.findViewById<ImageView>(R.id.imageSuccess4)
        val imageSuccess5 = view.findViewById<ImageView>(R.id.imageSuccess5)
        val imageSuccess6 = view.findViewById<ImageView>(R.id.imageSuccess6)
        val imageSuccess7 = view.findViewById<ImageView>(R.id.imageSuccess7)

        CheckBox1.setOnCheckedChangeListener{_, isChecked ->
            if (!isChecked){
                CheckBox1.setBackgroundColor(ContextCompat.getColor(getApplicationContext(), R.color.progressTask))
                imageSuccess1.visibility = View.INVISIBLE
            } else {
                CheckBox1.setBackgroundColor(ContextCompat.getColor(getApplicationContext(), R.color.doneTask))
                imageSuccess1.visibility = View.VISIBLE
            }
        }

        CheckBox2.setOnCheckedChangeListener{_, isChecked ->
            if (!isChecked){
                CheckBox2.setBackgroundColor(ContextCompat.getColor(getApplicationContext(), R.color.progressTask))
                imageSuccess2.visibility = View.INVISIBLE
            } else {
                CheckBox2.setBackgroundColor(ContextCompat.getColor(getApplicationContext(), R.color.doneTask))
                imageSuccess2.visibility = View.VISIBLE
            }
        }

        CheckBox3.setOnCheckedChangeListener{_, isChecked ->
            if (!isChecked){
                CheckBox3.setBackgroundColor(ContextCompat.getColor(getApplicationContext(), R.color.progressTask))
                imageSuccess3.visibility = View.INVISIBLE
            } else {
                CheckBox3.setBackgroundColor(ContextCompat.getColor(getApplicationContext(), R.color.doneTask))
                imageSuccess3.visibility = View.VISIBLE
            }
        }

        CheckBox4.setOnCheckedChangeListener{_, isChecked ->
            if (!isChecked){
                CheckBox4.setBackgroundColor(ContextCompat.getColor(getApplicationContext(), R.color.progressTask))
                imageSuccess4.visibility = View.INVISIBLE
            } else {
                CheckBox4.setBackgroundColor(ContextCompat.getColor(getApplicationContext(), R.color.doneTask))
                imageSuccess4.visibility = View.VISIBLE
            }
        }

        CheckBox5.setOnCheckedChangeListener{_, isChecked ->
            if (!isChecked){
                CheckBox5.setBackgroundColor(ContextCompat.getColor(getApplicationContext(), R.color.progressTask))
                imageSuccess5.visibility = View.INVISIBLE
            } else {
                CheckBox5.setBackgroundColor(ContextCompat.getColor(getApplicationContext(), R.color.doneTask))
                imageSuccess5.visibility = View.VISIBLE
            }
        }

        CheckBox6.setOnCheckedChangeListener{_, isChecked ->
            if (!isChecked){
                CheckBox6.setBackgroundColor(ContextCompat.getColor(getApplicationContext(), R.color.progressTask))
                imageSuccess6.visibility = View.INVISIBLE
            } else {
                CheckBox6.setBackgroundColor(ContextCompat.getColor(getApplicationContext(), R.color.doneTask))
                imageSuccess6.visibility = View.VISIBLE
            }
        }

        CheckBox7.setOnCheckedChangeListener{_, isChecked ->
            if (!isChecked){
                CheckBox7.setBackgroundColor(ContextCompat.getColor(getApplicationContext(), R.color.progressTask))
                imageSuccess7.visibility = View.INVISIBLE
            } else {
                CheckBox7.setBackgroundColor(ContextCompat.getColor(getApplicationContext(), R.color.doneTask))
                imageSuccess7.visibility = View.VISIBLE
            }
        }



        val textLongAdd = Toast.makeText(this, "Add", Toast.LENGTH_LONG)
        val textLongQuest = Toast.makeText(this, "How to use", Toast.LENGTH_LONG)

        ButtonAdd.setOnLongClickListener { _ ->
            textLongAdd.show()
            true
        }

        ButtonQuest.setOnLongClickListener { _ ->
            textLongQuest.show()
            true
        }


        val defaultText = "ToDo Tasks"
        var checker = false

        HeaderText.setOnClickListener{
            if (!checker){
                HeaderText.text = "You can do it!"
                checker = true
            } else {
                HeaderText.text = defaultText
                checker = false
            }
        }
    }
}