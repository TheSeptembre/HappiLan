package mspr.happilan.happilan;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class HomeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        final Button buttonVigile = findViewById(R.id.button3);
        buttonVigile.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(HomeActivity.this, ResultActivity.class);
                intent.putExtra("RESULT", true);
                startActivity(intent);
            }
        });


        final Button buttonEmploye = findViewById(R.id.button4);
        buttonEmploye.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(HomeActivity.this, ResultActivity.class);
                intent.putExtra("RESULT", false);
                startActivity(intent);
            }
        });





    }

}