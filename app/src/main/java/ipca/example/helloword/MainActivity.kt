package ipca.example.helloword

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.LinearLayout
import android.widget.TextView

class MainActivity : AppCompatActivity(), View.OnClickListener {

    lateinit var  textViewHelloWorld : TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //setContentView(R.layout.activity_main)

        textViewHelloWorld = TextView(this)
        textViewHelloWorld.text = "Hello World!"

        val buttonTranslate = Button(this)
        buttonTranslate.text = "Traduzir"
        buttonTranslate.setOnClickListener(this)

        val linearLayout = LinearLayout(this)
        linearLayout.addView(textViewHelloWorld)
        linearLayout.addView(buttonTranslate)
        linearLayout.orientation = LinearLayout.VERTICAL

        setContentView(linearLayout)

    }

    override fun onClick(p0: View?) {
        textViewHelloWorld.text = "Olá Mundo!"
    }
}