package mspr.happilan

import android.content.Intent
import android.os.Bundle
import android.support.v4.content.ContextCompat.startActivity
import android.view.View
import android.widget.Toast

// Start it with :
//resultIntent = Intent(this, Result::class.java)
//startActivity(resultIntent);
//resultIntent.putExtra(Result.RESULT_IS_SUCCESS, resultSuccess)

class Result {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_result)
        if (RESULT_IS_SUCCESS == false) {
            textView.result_title = getString(R.string.result_failed_title)
            textView.result_content = getString(R.string.result_failed_content)
        }
    }
    fun resultContinue(view: View) {
        var takePicIntent = Intent(this, TakePic::class.java)
        startActivity(takePicIntent);
    }
    fun resultStop(view: View) {
        var homeIntent = Intent(this, Home::class.java)
        startActivity(homeIntent);
    }
}

