package sg.edu.rp.c346.id22017424.p05_mymodules;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    //Step 1
    TextView tv;
    Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        btn = findViewById(R.id.button);

        btn.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i = new Intent(SecondActivity.this, MainActivity.class);
            startActivity(i);
        }
        });

        //Step 2
        tv = findViewById(R.id.textView);
        Intent intentCReceived = getIntent();
        String code = intentCReceived.getStringExtra("code");
        tv.setText("Module Code: " + code);

        tv = findViewById(R.id.textView2);
        Intent intentReceived2 = getIntent();
        String name = intentReceived2.getStringExtra("name");
        tv.setText("Module Name: " + name);

        tv = findViewById(R.id.textView3);
        Intent intentReceived3 = getIntent();
        int year = intentReceived3.getIntExtra("year",0);
        tv.setText("Academic Year: " + year);

        tv = findViewById(R.id.textView4);
        Intent intentReceived4 = getIntent();
        int sem = intentReceived4.getIntExtra("sem",0);
        tv.setText("Semester: " + sem);

        tv = findViewById(R.id.textView5);
        Intent intentReceived5 = getIntent();
        int cred = intentReceived5.getIntExtra("cred", 0);
        tv.setText("Module Credit: " + cred);

        tv = findViewById(R.id.textView6);
        Intent intentReceived6 = getIntent();
        String venue = intentReceived6.getStringExtra("venue");
        tv.setText("Venue: " + venue);

    }
}