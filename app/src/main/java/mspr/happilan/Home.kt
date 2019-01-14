package mspr.happilan


import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.view.View
import android.widget.Button
import kotlinx.android.synthetic.main.activity_home.*

class Home : AppCompatActivity() {

    override fun onCreate(savedInstanceStat: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        val textView = findViewById<TextView>(R.id.text_view)
        val button3 = findViewById<Button>(R.id.button3);
        val button4 = findViewById<Button>(R.id.button4);


        button3.setOnClickListener {
            counter++
            textView.text = "Click counter : $counter"
        }
            button4.setOnClickListener{
                counter++
                textView.text = "Click counter : $counter"
        }
    }
    }
}