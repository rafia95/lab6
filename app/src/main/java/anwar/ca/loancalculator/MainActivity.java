package anwar.ca.loancalculator;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutCompat;
import android.view.View;
import android.webkit.WebSettings;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.app.ActionBar.LayoutParams;

import anwar.ca.loancalculator.LoanCalculator;

public class MainActivity extends AppCompatActivity {

    private EditText editText1;
    private EditText editText2;
    private EditText editText3;
    private TextView tv1;
    private TextView tv2;
    private TextView tv3;
    private TextView tv4;
    private TextView tv5;
    private TextView tv6;
    private TextView tv7;
    private TextView tv8;
    private TextView tv9;
    private TextView tv10;
    private TextView tv11;
    private Button btn1;
    private Button btn2;
    private LinearLayout.LayoutParams  buttonParams, params;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        createLayout1();

    }

    public void createLayout1(){
        // set up the Linear Layout container)
        LinearLayout llMain = new LinearLayout(this);
        // specifying vertical orientation
        llMain.setOrientation(LinearLayout.HORIZONTAL);
        // creating LayoutParams
        // public LinearLayout.LayoutParams (int width, int height, float
        // weight)
        params = new LinearLayout.LayoutParams(LinearLayoutCompat.LayoutParams.MATCH_PARENT,
                LayoutParams.MATCH_PARENT  );

        // set LinearLayout as a root element of the screen
        llMain.setLayoutParams(params);

        // set up the Linear Layout container)
        LinearLayout ll = new LinearLayout(this);
        // specifying vertical orientation
        ll.setOrientation(LinearLayout.VERTICAL);
        // creating LayoutParams
        // public LinearLayout.LayoutParams (int width, int height, float
        // weight)
        params = new LinearLayout.LayoutParams(500,
                LayoutParams.MATCH_PARENT);

        // set LinearLayout as a root element of the screen
        ll.setLayoutParams(params);

        tv1 = new TextView(this);
        tv1.setText("Total Amount");
        params.width = 600;
        params.height = 300;
        tv1.setHeight(128);
        tv1.setTextSize(25);

        tv2 = new TextView(this);
        tv2.setText("Term of Loan(years)");
        params.width = 600;
        params.height =300;
        tv2.setHeight(128);

        tv2.setTextSize(25);

        tv3 = new TextView(this);
        tv3.setText("Total Amount");
        params.width = 600;
        params.height = 300;
        tv3.setTextSize(25);

        buttonParams = new LinearLayout.LayoutParams(600,
                LayoutParams.WRAP_CONTENT, (float) 2);
        btn1 = new Button(this);
        btn1.setLayoutParams(buttonParams);
        btn1.setText("Calculate");
        btn1.setVisibility(View.VISIBLE);
        btn1.setOnClickListener(new View.OnClickListener() {
                                    @Override
                                    public void onClick(View view) {
                                        onClickCalc(view);
                                    }
        });
        tv4 = new TextView(this);
        tv4.setText("Results");
        params.width = 600;
        params.height = LayoutParams.WRAP_CONTENT;

        tv4.setTextSize(25);

        tv5 = new TextView(this);
        tv5.setText("Monthly Payment");
        params.width = 600;
        params.height = LayoutParams.WRAP_CONTENT;
        tv5.setTextSize(25);

        tv6 = new TextView(this);
        tv6.setText("Total Payment");
        params.width = 600;
        params.height = LayoutParams.WRAP_CONTENT;
        tv6.setTextSize(25);

        tv7 = new TextView(this);
        tv7.setText("Total_Interest");
        params.width = 600;
        params.height = LayoutParams.WRAP_CONTENT;
        tv7.setTextSize(25);




        // default width wrap, height wrap so no params
        ll.addView(tv1);
        ll.addView(tv2);
        ll.addView(tv3);
        ll.addView(btn1);

        ll.addView(tv4);
        ll.addView(tv5);
        ll.addView(tv6);
        ll.addView(tv7);
// set up the Linear Layout container)
        LinearLayout ll2 = new LinearLayout(this);
        // specifying vertical orientation
        ll2.setOrientation(LinearLayout.VERTICAL);
        // creating LayoutParams
        // public LinearLayout.LayoutParams (int width, int height, float
        // weight)
        params = new LinearLayout.LayoutParams(LinearLayoutCompat.LayoutParams.MATCH_PARENT,
                LayoutParams.MATCH_PARENT);

        // set LinearLayout as a root element of the screen
        ll2.setLayoutParams(params);
        editText1 = new EditText(this);
        params.width = 600;
        params.height = LayoutParams.WRAP_CONTENT;
        editText1.setTextSize(25);
       editText2 = new EditText(this);
        params.width = 600;
        params.height = LayoutParams.WRAP_CONTENT;
        editText2.setTextSize(25);
         editText3 = new EditText(this);
        params.width = 600;
        params.height = LayoutParams.WRAP_CONTENT;
        editText3.setTextSize(25);

        buttonParams = new LinearLayout.LayoutParams(600,
                LayoutParams.WRAP_CONTENT, (float) 2);
        btn2 = new Button(this);
        btn2.setLayoutParams(buttonParams);
        btn2.setText("Clear");
        btn2.setVisibility(View.VISIBLE);
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                onClear(view);
            }
        });

        tv8 = new TextView(this);
        params.width = 600;
        params.height = LayoutParams.WRAP_CONTENT;
        tv8.setTextSize(25);

        tv9 = new TextView(this);
        params.width = 600;
        params.height = LayoutParams.WRAP_CONTENT;
        tv9.setTextSize(25);

        tv10 = new TextView(this);
        params.width = 600;
        params.height = LayoutParams.WRAP_CONTENT;
        tv10.setTextSize(25);

        tv11 = new TextView(this);
        params.width = 600;
        params.height = LayoutParams.WRAP_CONTENT;
        tv11.setTextSize(25);

        ll2.addView(editText1);
        ll2.addView(editText2);
        ll2.addView(editText3);
        ll2.addView(btn2);
        ll2.addView(tv8);
        ll2.addView(tv9);
        ll2.addView(tv10);
        ll2.addView(tv11);

        llMain.addView(ll);
        llMain.addView(ll2);

        setContentView(llMain);

    }

    void onClickCalc(View view) {
        String str1 = editText1.getText().toString();
        String str2 = editText2.getText().toString();
        String str3 = editText3.getText().toString();
       /* if(str1 == null || str2 == null || str3 == null || str1.isEmpty() || str2.isEmpty() || str3.isEmpty()) {
            tv5 = (TextView) findViewById(R.id.textView13);
            tv5.setText("Please fill every field!");
        }
        else {
        */
        double d1 = Double.parseDouble(str1);
        int d2 = Integer.parseInt(str2);
        double d3 = Double.parseDouble(str3);
      /*  if(d2 > 25 || d2 < 1)
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
*/
            LoanCalculator calc = new LoanCalculator(d1, d2, d3);

            double payment = Math.round(calc.getMonthlyPayment() * 100.00) / 100.00;
            String strPayment = String.valueOf(payment);
            tv9.setText(strPayment);

            double totalLoan = Math.round(calc.getTotalCostOfLoan()* 100.00) / 100.00;
            String strLoan = String.valueOf(totalLoan);
            tv10.setText(strLoan);

            double totalInterest = Math.round(calc.getTotalInterest()* 100.00) / 100.00;
            String strInterest = String.valueOf(totalInterest);
            tv11.setText(strInterest);
    }


    void onClear(View view){
        editText1.setText("");

        editText2.setText("");

        editText3.setText("");

        tv9.setText("0");

        tv10.setText("0");

        tv11.setText("0");

    }


}
