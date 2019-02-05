package mspr.happilan.happilan;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class FormActivity extends AppCompatActivity{

    protected void onCreate(Bundle savedInstanceState, Boolean RESULT) {
        super.onCreate(savedInstanceState);

        Boolean RESULT_IS_SUCCESS = RESULT;

        View content = (View)getLayoutInflater().inflate(R.layout.activity_form, null);
        Button mButton = (Button) findViewById(R.id.btn_submit);
        TextView tvTitle = (TextView)content.findViewById(R.id.result_title);
        TextView tvContent = (TextView)content.findViewById(R.id.result_content);


        if (RESULT_IS_SUCCESS == false) {
            tvTitle.setText(R.string.result_failed_title);
            tvContent.setText(R.string.result_failed_content);
        }

        setContentView(R.layout.activity_form);

        mButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });
    }

}
