package mspr.happilan.happilan;

import android.content.Intent;
import android.graphics.Camera;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class ResultActivity extends AppCompatActivity {

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);
    }

    //TODO : DEBUG ***********************
    //Copier cette partie dans un nouveau projet et tester si on a le même problème.
    //Si non, c'est que ça vient de la manière dont on appelle l'activité.
    //************************************

    @Override
    protected void onStart() {
        super.onStart();
        Bundle b = getIntent().getExtras();
        Boolean RESULT_IS_SUCCESS = b.getBoolean("RESULT");

        View content = (View)getLayoutInflater().inflate(R.layout.activity_result, null);
        TextView tvTitle = (TextView)content.findViewById(R.id.result_title);
        TextView tvContent = (TextView)content.findViewById(R.id.result_content);

        if (RESULT_IS_SUCCESS == false) {
            tvTitle.setText(R.string.result_failed_title);
            tvContent.setText(R.string.result_failed_content);
        }



        final Button result_button = (Button) findViewById(R.id.result_button);
        result_button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(ResultActivity.this, CameraActivity.class);
                startActivity(intent);
            }
        });

        final Button result_stop_button = (Button) findViewById(R.id.result_stop_button);
        result_stop_button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(ResultActivity.this, HomeActivity.class);
                startActivity(intent);
            }
        });

    }
}
