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

    private EditText edittext1;
    private EditText edittext2;
    private EditText edittext3;
    private TextView tv1;
    private TextView tv2;
    private TextView tv3;
    private TextView tv4;
    private TextView tv5;
    private TextView tv6;
    private TextView tv7;
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
        params = new LinearLayout.LayoutParams(LinearLayoutCompat.LayoutParams.MATCH_PARENT,
                450);

        // set LinearLayout as a root element of the screen
        ll.setLayoutParams(params);

        tv1 = new TextView(this);
        tv1.setText("Total Amount");
        params.width = 750;
        params.height = LayoutParams.WRAP_CONTENT;
        tv1.setBackgroundColor(Color.CYAN);
        tv1.setTextSize(25);

        tv2 = new TextView(this);
        tv2.setText("Term of Loan(years)");
        params.width = 700;
        params.height = LayoutParams.WRAP_CONTENT;
        tv2.setBackgroundColor(Color.CYAN);
        tv2.setTextSize(25);

        tv3 = new TextView(this);
        tv3.setText("Total Amount");
        params.width = 700;
        params.height = LayoutParams.WRAP_CONTENT;
        tv3.setBackgroundColor(Color.CYAN);
        tv3.setTextSize(25);

        buttonParams = new LinearLayout.LayoutParams(0,
                LayoutParams.WRAP_CONTENT, (float) 2);
        btn1 = new Button(this);
        btn1.setLayoutParams(buttonParams);
        btn1.setText("Calculate");
        btn1.setOnClickListener(new View.OnClickListener() {
                                    @Override
                                    public void onClick(View view) {
                                        onClickCalc(view);
                                    }
        });
        tv4 = new TextView(this);
        tv4.setText("Results");
        params.width = 700;
        params.height = LayoutParams.WRAP_CONTENT;
        tv4.setBackgroundColor(Color.CYAN);
        tv4.setTextSize(25);

        tv5 = new TextView(this);
        tv5.setText("Monthly Payment");
        params.width = 700;
        params.height = LayoutParams.WRAP_CONTENT;
        tv5.setBackgroundColor(Color.CYAN);
        tv5.setTextSize(25);

        tv6 = new TextView(this);
        tv6.setText("Total Payment");
        params.width = 700;
        params.height = LayoutParams.WRAP_CONTENT;
        tv6.setBackgroundColor(Color.CYAN);
        tv6.setTextSize(25);

        tv7 = new TextView(this);
        tv7.setText("Total_Interest");
        params.width = 700;
        params.height = LayoutParams.WRAP_CONTENT;
        tv7.setBackgroundColor(Color.CYAN);
        tv7.setTextSize(25);



        ll.addView(btn1);

        // default width wrap, height wrap so no params
        ll.addView(tv1);
        ll.addView(tv2);
        ll.addView(tv3);
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
                450);

        // set LinearLayout as a root element of the screen
        ll2.setLayoutParams(params);
        EditText editText1 = new EditText(this);
        params.width = 700;
        params.height = LayoutParams.WRAP_CONTENT;
        editText1.setBackgroundColor(Color.GREEN);
        editText1.setTextSize(25);
        EditText editText2 = new EditText(this);
        params.width = 750;
        params.height = LayoutParams.WRAP_CONTENT;
        editText2.setBackgroundColor(Color.GREEN);
        editText2.setTextSize(25);
        EditText editText3 = new EditText(this);
        params.width = 700;
        params.height = LayoutParams.WRAP_CONTENT;
        editText3.setBackgroundColor(Color.GREEN);
        editText3.setTextSize(25);
        ll2.addView(editText1);
        ll2.addView(editText2);
        ll2.addView(editText3);

        llMain.addView(ll);
        llMain.addView(ll2);

        setContentView(llMain);

    }
    public void createLayout2(){
        // set up the Linear Layout container)
        LinearLayout ll2 = new LinearLayout(this);
        // specifying vertical orientation
        ll2.setOrientation(LinearLayout.VERTICAL);
        // creating LayoutParams
        // public LinearLayout.LayoutParams (int width, int height, float
        // weight)
        params = new LinearLayout.LayoutParams(LinearLayoutCompat.LayoutParams.MATCH_PARENT,
                450);

        // set LinearLayout as a root element of the screen
        ll2.setLayoutParams(params);
        EditText editText1 = new EditText(this);
        params.width = 700;
        params.height = LayoutParams.WRAP_CONTENT;
        editText1.setBackgroundColor(Color.GREEN);
        editText1.setTextSize(25);
        EditText editText2 = new EditText(this);
        params.width = 750;
        params.height = LayoutParams.WRAP_CONTENT;
        editText2.setBackgroundColor(Color.GREEN);
        editText2.setTextSize(25);
        EditText editText3 = new EditText(this);
        params.width = 700;
        params.height = LayoutParams.WRAP_CONTENT;
        editText3.setBackgroundColor(Color.GREEN);
        editText3.setTextSize(25);
        ll2.addView(editText1);
        ll2.addView(editText2);
        ll2.addView(editText3);
        setContentView(ll2);


    }
    void onClickCalc(View view) {
        String str1 = edittext1.getText().toString();
        String str2 = edittext2.getText().toString();
        String str3 = edittext3.getText().toString();
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
       //     txtview1 = (TextView) findViewById(R.id.textView8);
       //     txtview1.setText(strPayment);

            double totalLoan = Math.round(calc.getTotalCostOfLoan());
            String strLoan = String.valueOf(totalLoan);
       //     txtview2 = (TextView) findViewById(R.id.textView9);
       //     txtview2.setText(strLoan);

            double totalInterest = Math.round(calc.getTotalInterest());
            String strInterest = String.valueOf(totalInterest);
        //    txtview3 = (TextView) findViewById(R.id.textView10);
        //    txtview3.setText(strInterest);
     //   }
    }
//}
/*
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

    */
}
