package sg.edu.rp.c346.id22017424.p05_mymodules;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    //Event handling step 1
    TextView tvC203;
    TextView tvC206;
    TextView tvC218;
    TextView tvC235;
    TextView tvC346;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Event handling step 2
        tvC203 = findViewById(R.id.textViewC203);
        tvC206 = findViewById(R.id.textViewC206);
        tvC218 = findViewById(R.id.textViewC218);
        tvC235 = findViewById(R.id.textViewC235);
        tvC346 = findViewById(R.id.textViewC346);

        //Event handling step 3
        tvC203.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                Intent intent = new Intent(MainActivity.this, SecondActivity.class);
                intent.putExtra("code", "C203");
                intent.putExtra("name", "Web Appln Development in php");
                intent.putExtra("year", 2023);
                intent.putExtra("sem", 1);
                intent.putExtra("cred", 4);
                intent.putExtra("venue", "W64N");
                startActivity(intent);
            }
        });
        tvC206.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                Intent intent = new Intent(MainActivity.this, SecondActivity.class);
                intent.putExtra("code", "C206");
                intent.putExtra("name", "Software Development Process");
                intent.putExtra("year", 2023);
                intent.putExtra("sem", 1);
                intent.putExtra("cred", 4);
                intent.putExtra("venue", "W64N");
                startActivity(intent);
            }
        });

        tvC218.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                Intent intent = new Intent(MainActivity.this, SecondActivity.class);
                intent.putExtra("code", "C218");
                intent.putExtra("name", "UI/UX Design for Apps");
                intent.putExtra("year", 2023);
                intent.putExtra("sem", 1);
                intent.putExtra("cred", 4);
                intent.putExtra("venue", "W64N");
                startActivity(intent);
            }
        });

        tvC235.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                Intent intent = new Intent(MainActivity.this, SecondActivity.class);
                intent.putExtra("code", "C235");
                intent.putExtra("name", "IT Security and Management");
                intent.putExtra("year", 2023);
                intent.putExtra("sem", 1);
                intent.putExtra("cred", 4);
                intent.putExtra("venue", "W64N");
                startActivity(intent);
            }
        });

        tvC346.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                Intent intent = new Intent(MainActivity.this, SecondActivity.class);
                intent.putExtra("code", "C346");
                intent.putExtra("name", "Mobile App Development");
                intent.putExtra("year", 2023);
                intent.putExtra("sem", 1);
                intent.putExtra("cred", 4);
                intent.putExtra("venue", "E63A");
                startActivity(intent);
            }
        });

    }
}