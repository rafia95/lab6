package anwar.ca.loancalculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import anwar.ca.loancalculator.LoanCalculator;

public class MainActivity extends AppCompatActivity {

    private EditText edittext1;
    private EditText edittext2;
    private EditText edittext3;
    private TextView txtview1;
    private TextView txtview2;
    private TextView txtview3;
    private TextView txtview4;
    private TextView txtview5;
    private TextView txtview6;
    private TextView txtview7;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    void onClick(View view) {
        edittext1 = (EditText) findViewById(R.id.editText);
        String str1 = edittext1.getText().toString();
        edittext2 = (EditText) findViewById(R.id.editText2);
        String str2 = edittext2.getText().toString();
        edittext3 = (EditText) findViewById(R.id.editText3);
        String str3 = edittext3.getText().toString();
        if(str1 == null || str2 == null || str3 == null || str1.isEmpty() || str2.isEmpty() || str3.isEmpty())
        {
            txtview5 = (TextView) findViewById(R.id.textView13);
            txtview5.setText("Please fill every field!");
        }
        else {
        double d1 = Double.parseDouble(str1);
        int d2 = Integer.parseInt(str2);
        double d3 = Double.parseDouble(str3);
        if(d2 > 25 || d2 < 1)
        {
            txtview7 = (TextView) findViewById(R.id.textView15);
            txtview7.setText("The term should be 1-25 years!");
        }
        else
        if (d3 > 100)
        {
            txtview6 = (TextView) findViewById(R.id.textView14);
            txtview6.setText("The interest rate cannot be over 100!");
        }
        else
        if(d1 < 0 || d2 < 0 || d3 < 0)
        {
            txtview4 = (TextView) findViewById(R.id.textView12);
            txtview4.setText("The values cannot be negative!");
        }

else {
            LoanCalculator calc = new LoanCalculator(d1, d2, d3);

            double payment = Math.round(calc.getMonthlyPayment() * 100) / 100;
            String strPayment = String.valueOf(payment);
            txtview1 = (TextView) findViewById(R.id.textView8);
            txtview1.setText(strPayment);

            double totalLoan = Math.round(calc.getTotalCostOfLoan());
            String strLoan = String.valueOf(totalLoan);
            txtview2 = (TextView) findViewById(R.id.textView9);
            txtview2.setText(strLoan);

            double totalInterest = Math.round(calc.getTotalInterest());
            String strInterest = String.valueOf(totalInterest);
            txtview3 = (TextView) findViewById(R.id.textView10);
            txtview3.setText(strInterest);
        }
    }}

    void onClear(View view){
        edittext1 = (EditText) findViewById(R.id.editText);
        edittext1.setText("");

        edittext2 = (EditText) findViewById(R.id.editText2);
        edittext2.setText("");

        edittext3 = (EditText) findViewById(R.id.editText3);
        edittext3.setText("");

        txtview1 = (TextView) findViewById(R.id.textView8);
        txtview1.setText("0");

        txtview2 = (TextView) findViewById(R.id.textView9);
        txtview2.setText("0");

        txtview3 = (TextView) findViewById(R.id.textView10);
        txtview3.setText("0");

    }
}
