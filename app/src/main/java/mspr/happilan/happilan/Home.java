import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
package mspr.happilan.happilan;


public class Home extends AppCompatActivity {

private Button mEmployeButton;
private Button mVigileButton;


protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mEmployeButton = (Button) findViewById(R.id.button3);
        mEmployeButton = (Button) findViewById(R.id.button4);

        }

        mEmployeButton.setOnClickListener(new View.OnClickListener() {

public void onClick(View v) {
        // Lancer la page Employe
        }
        });


public void onClick(View v) {
       //Lancer page Vigile
        }
        });