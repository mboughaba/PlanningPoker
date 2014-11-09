package com.shiwtin.planningpoker;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.TableLayout;


public class PlanningPokerDeck extends Activity {

    Button buttonZero;
    Button buttonHalf;
    Button buttonOne;
    Button buttonTwo;
    Button buttonThree;
    Button buttonFive;
    Button buttonEight;
    Button buttonThirteen;
    Button buttonTwenty;
    Button buttonForty;
    Button buttonHundred;
    Button buttonInfinity;
    Button buttonQuestion;
    Button buttonPause;
    Button buttonCross;

    Button buttonMain;

    TableLayout tableLayout;

    View.OnClickListener onClickListener;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);

        setContentView(R.layout.activity_planning_poker_deck);

        buttonZero = (Button) findViewById(R.id.buttonZero);
        buttonHalf = (Button) findViewById(R.id.buttonHalf);
        buttonOne = (Button) findViewById(R.id.buttonOne);
        buttonTwo = (Button) findViewById(R.id.buttonTwo);
        buttonThree = (Button) findViewById(R.id.buttonThree);
        buttonFive = (Button) findViewById(R.id.buttonFive);
        buttonEight = (Button) findViewById(R.id.buttonEight);
        buttonThirteen = (Button) findViewById(R.id.buttonThirteen);
        buttonTwenty = (Button) findViewById(R.id.buttonTwenty);
        buttonForty = (Button) findViewById(R.id.buttonForty);
        buttonHundred = (Button) findViewById(R.id.buttonHundred);
        buttonInfinity = (Button) findViewById(R.id.buttonInfinity);
        buttonQuestion = (Button) findViewById(R.id.buttonQuestion);
        buttonPause = (Button) findViewById(R.id.buttonPause);
        buttonCross = (Button) findViewById(R.id.buttonCross);

        buttonMain = (Button) findViewById(R.id.buttonMain);

        tableLayout = (TableLayout) findViewById(R.id.tableLayout);

        onClickListener = new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Button button = (Button) view;
                if (button != null && button.getVisibility() == View.VISIBLE) {
                    buttonMain.setText(button.getText());
                    tableLayout.setVisibility(View.INVISIBLE);
                    buttonMain.setVisibility(View.VISIBLE);
                }
            }
        };

        buttonZero.setOnClickListener(onClickListener);
        buttonHalf.setOnClickListener(onClickListener);
        buttonOne.setOnClickListener(onClickListener);
        buttonTwo.setOnClickListener(onClickListener);
        buttonThree.setOnClickListener(onClickListener);
        buttonFive.setOnClickListener(onClickListener);
        buttonEight.setOnClickListener(onClickListener);
        buttonThirteen.setOnClickListener(onClickListener);
        buttonTwenty.setOnClickListener(onClickListener);
        buttonForty.setOnClickListener(onClickListener);
        buttonHundred.setOnClickListener(onClickListener);
        buttonInfinity.setOnClickListener(onClickListener);
        buttonQuestion.setOnClickListener(onClickListener);
        buttonPause.setOnClickListener(onClickListener);
        buttonCross.setOnClickListener(onClickListener);

        buttonMain.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Button button = (Button) view;
                if (button != null && button.getVisibility() == View.VISIBLE) {
                    button.setVisibility(View.INVISIBLE);
                    tableLayout.setVisibility(View.VISIBLE);
                }
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_planning_poker_deck, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
