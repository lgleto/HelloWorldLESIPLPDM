package ipca.example.helloword

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.LinearLayout
import android.widget.TextView

class MainActivity : AppCompatActivity(){

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val textViewHelloWorld = findViewById<TextView>(R.id.textViewHelloWorld)
        val buttonTranslate = findViewById<Button>(R.id.buttonTranslate)

        buttonTranslate.setOnClickListener {
            textViewHelloWorld.text = "Olá mundo!"
        }

    }

}