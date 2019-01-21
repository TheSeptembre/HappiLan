package mspr.happilan


import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.view.View
import android.widget.Button
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_home.*

class Home : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)
    }

    fun employeContinue(view: View) {
        var takePicIntent = Intent(this, CameraPreview::class.java)
        startActivity(takePicIntent);

    }

    fun vigileContinue(view: View) {
        var takePicIntent = Intent(this, CameraPreview::class.java)
        startActivity(takePicIntent);
    }
}