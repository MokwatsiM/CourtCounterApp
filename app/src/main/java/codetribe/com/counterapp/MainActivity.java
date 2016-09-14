package codetribe.com.counterapp;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private int pointA;
    private int pointB;
    private MediaPlayer clock;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
clock = new MediaPlayer();
clock = MediaPlayer.create(this,R.raw.clock);



    }
    public void addTeamA3Points(View view)
    {
        pointA+=3;
        displayForTeamA(pointA);
        clock.start();

    }
    public void addTeamA2Points(View view)
    {
        pointA+=2;
        displayForTeamA(pointA);
        clock.start();

    }

    public void addTeamAFreeThrowPoints (View view)
    {
        pointA+=1;
        displayForTeamA(pointA);
        clock.start();

    }

    public void displayForTeamA(int score)
    {
        TextView scoreView = (TextView) findViewById(R.id.txvTeamAScore);
        scoreView.setText(""+score);
    }

    public void addTeamB3Points(View view)
    {
        pointB+=3;
        displayForTeamB(pointB);
        clock.start();

    }
    public void addTeamB2Points(View view)
    {
        pointB+=2;
        displayForTeamB(pointB);
        clock.start();

    }

    public void addTeamBFreeThrowPoints (View view)
    {
        pointB+=1;
        displayForTeamB(pointB);
        clock.start();
       
    }

    public void displayForTeamB(int score)
    {
        TextView scoreView = (TextView) findViewById(R.id.txvTeamBScore);
        scoreView.setText(""+score);
    }
    public void resetScreen(View view)
    {

        pointA = 0;
        pointB=0;
        displayForTeamA(pointA);
        displayForTeamB(pointB);
    }




}
