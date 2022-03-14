package gr.ss.koinoxrista;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button calculate = findViewById(R.id.calculate);
        calculate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                EditText price = findViewById(R.id.price);
                double euro = Double.valueOf(price.getText().toString());

                TextView p1 = findViewById(R.id.p1);
                p1.setText(String.format("%.4f" ,euro * 79.24 / 1000));

                TextView p2 = findViewById(R.id.p2);
                p2.setText(String.format("%.4f" ,euro * 49.09 / 1000));

                TextView p3 = findViewById(R.id.p3);
                p3.setText(String.format("%.4f" ,euro * 58.91 / 1000));

                TextView p4 = findViewById(R.id.p4);
                p4.setText(String.format("%.4f" ,euro * 78.22 / 1000));

                TextView p5 = findViewById(R.id.p5);
                p5.setText(String.format("%.4f" ,euro * 112.58 / 1000));

                TextView p6 = findViewById(R.id.p6);
                p6.setText(String.format("%.4f" ,euro * 86.53 / 1000));

                TextView p7 = findViewById(R.id.p7);
                p7.setText(String.format("%.4f" ,euro * 120.79 / 1000));

                TextView p8 = findViewById(R.id.p8);
                p8.setText(String.format("%.4f" ,euro * 86.53 / 1000));

                TextView p9 = findViewById(R.id.p9);
                p9.setText(String.format("%.4f" ,euro * 120.79 / 1000));

                TextView p10 = findViewById(R.id.p10);
                p10.setText(String.format("%.4f" ,euro * 86.53 / 1000));

                TextView p11 = findViewById(R.id.p11);
                p11.setText(String.format("%.4f" ,euro * 120.79 / 1000));

            }
        });

        TextView dateView = findViewById(R.id.date);
        setDate(dateView);
    }

    public void setDate (TextView view) {
        Date today = Calendar.getInstance().getTime();
        SimpleDateFormat formatter = new SimpleDateFormat("MMMM yyyy");
        String date = formatter.format(today);
        view.setText(date);
    }
}
