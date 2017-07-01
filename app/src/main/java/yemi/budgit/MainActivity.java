package yemi.budgit;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import static yemi.budgit.R.id.allowance;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    public void  calculate(View view) {
        /* this code accept users allowance input and initialize it to the variable allowance
            thank you!
         */
        EditText editText = (EditText) findViewById(allowance);
        String input = editText.getText().toString();
        int allowance = Integer.parseInt(input);

        // end of allowance accept and initialization
        double feeding = 0.4 * allowance;
        double clothing = 0.2 * allowance;
        double transport = 0.1 * allowance;
        double misceleneous = 0.1 * allowance;
        double savings = 0.2 * allowance;
        double studyMaterial = 0.2 * allowance;

        // the following line displays the calculated budgit for the user to see and record
        displayClothing(clothing);
        displayFeeding(feeding);
        displayMisceleneous(misceleneous);
        displaySavings(savings);
        displayStudyMaterial(studyMaterial);
        displayTransport(transport);


    }


    /**
     * the following line of codes setText for each textView category
     * @param number is displayed for each
     */
    private void displayMisceleneous(double number) {
        TextView budgetTextView = (TextView) findViewById(R.id.misceleneous_text_view);
        budgetTextView.setText("" + number);
    }

    private void displayFeeding(double number) {
        TextView feedingTextView = (TextView) findViewById(R.id.feeding_text_view);
        feedingTextView.setText("" + number);
    }

    private void displayClothing(double number) {
        TextView clothingTextView = (TextView) findViewById(R.id.clothing_text_view);
        clothingTextView.setText("" + number);
    }

    private void displayTransport(double number) {
        TextView transportTextView = (TextView) findViewById(R.id.transport_text_view);
        transportTextView.setText("" + number);
    }

    private void displayStudyMaterial(double number) {
        TextView studyMaterialTextView = (TextView) findViewById(R.id.studyMaterial_text_view);
        studyMaterialTextView.setText("" + number);
    }

    private void displaySavings(double number) {
        TextView savingsTextView = (TextView) findViewById(R.id.savings_text_view);
        savingsTextView.setText("" + number);
    }


    /**
     * the following lines of code resets the app for a fresh budgit analysis
     * @param view
     */
    public void reset(View view) {
        displayClothing(0);
        displayFeeding(0);
        displayMisceleneous(0);
        displaySavings(0);
        displayStudyMaterial(0);
        displayTransport(0);

    }

}
