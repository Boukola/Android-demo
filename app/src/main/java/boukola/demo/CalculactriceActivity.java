package boukola.demo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class CalculactriceActivity extends AppCompatActivity {

    TextView workingsTV ;
    TextView resultsTV;

    String workings ="";
    int Number;
    EditText ed1;
    String oldNumber="";
    boolean isNewOp= true;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculactrice);
        initTextViews();

    }

    private void initTextViews() {
        workingsTV = (TextView)findViewById( R.id.workingsTextView);
        resultsTV = (TextView)findViewById(R.id.resultTextView);
    }

    private void setWorkings (String givenValue){
        workings=workings+givenValue;
        workingsTV.setText(workings);
    }

    public void egalOnClick(View view) {
        String newNumber=ed1.getText().toString();
          double result=0.0;

        switch(workings) {
            case"+":
                result=Double.parseDouble(oldNumber)+Double.parseDouble(newNumber);
             break;
            case"-":
                result=Double.parseDouble(oldNumber)-Double.parseDouble(newNumber);
                break;
            case"/":
                result=Double.parseDouble(oldNumber)/Double.parseDouble(newNumber);
                break;
            case"*":
                result=Double.parseDouble(oldNumber)*Double.parseDouble(newNumber);
                break;
        }
     ed1.setText(result+"");
    }

    public void clearOnClick(View view) {
        workingsTV.setText("");
        workings="";
        resultsTV.setText("");
        leftbrackets=true;

    }

    boolean leftbrackets = true;
    public void bracketsOnClick(View view) {
        if (leftbrackets) {
            setWorkings("(");
            leftbrackets = false;
        }
        else{
            setWorkings(")");
            leftbrackets = true;
        }
    }


    public void powerOnClick(View view)

    {
        setWorkings("+/-"+Number);
    }

    public void divisionOnClick(View view) {
        setWorkings("/");
    }

    public void sevenOnClick(View view) {
        setWorkings("7");
    }

    public void eightOnClick(View view) {
        setWorkings("8");
    }

    public void nineOnClick(View view) {
        setWorkings("9");
    }

    public void multipleOnClick(View view) {
        setWorkings("*");
    }

    public void forOnClick(View view) {
        setWorkings("4");
    }

    public void fiveOnClick(View view) {
        setWorkings("3");
    }

    public void sixOnClick(View view) {
        setWorkings("6");
    }

    public void soustraireOnClick(View view) {
        setWorkings("-");
    }

    public void oneOnClick(View view) {
        setWorkings("1");
    }

    public void twoOnClick(View view) {
        setWorkings("2");
    }

    public void threeOnClick(View view) {
        setWorkings("3");
    }

    public void addOnClick(View view) {
        setWorkings("+");
    }

    public void nullOnClick(View view) {
        setWorkings("0");
    }

    public void virguleOnClick(View view) {
        setWorkings(".");
    }

    public void pecentOnClick(View view) {
        double no =Double.parseDouble(ed1.getText().toString())/100;
        ed1.setText(no+"");
        isNewOp=true;
    }
}