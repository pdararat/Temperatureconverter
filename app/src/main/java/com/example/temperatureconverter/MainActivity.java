
package com.example.temperatureconverter;
        import android.support.v7.app.AppCompatActivity;
        import android.os.Bundle;
        import android.view.View;
        import android.widget.Button;
        import android.widget.EditText;
        import android.widget.TextView;
        import com.example.temperatureconverter.Model.body;

       public class MainActivity extends AppCompatActivity {
       @Override
       protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button button1 = findViewById(R.id.button1);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText input = findViewById(R.id.editText);
                int number = Integer.parseInt(input.getText().toString());
                body body = new body(number);
                final TextView output = findViewById(R.id.textView);
                String show = Integer.toString(body.c_f());
                output.setText(show);
            }
        });
        Button button2 = findViewById(R.id.button2);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText input = findViewById(R.id.editText);
                int number = Integer.parseInt(input.getText().toString());
                body body = new body(number);
                final TextView output = findViewById(R.id.textView);
                String show = String.format("%.2f", body.f_c());
                output.setText(show);
            }
        });
    }
}