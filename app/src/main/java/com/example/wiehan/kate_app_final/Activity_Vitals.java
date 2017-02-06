package com.example.wiehan.kate_app_final;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.jjoe64.graphview.GraphView;
import com.jjoe64.graphview.series.DataPoint;
import com.jjoe64.graphview.series.LineGraphSeries;

public class Activity_Vitals extends AppCompatActivity {

    GraphView graphBP ;
    GraphView graphPulse ;
    GraphView graphRR;
    GraphView graphTemp;
    TextView BPNum ;
    TextView pulseNum ;
    TextView RRNum ;
    TextView tempNum ;
    TextView summaryText ;
    LineGraphSeries<DataPoint> seriesBP ;
    LineGraphSeries<DataPoint> seriesPulse ;
    LineGraphSeries<DataPoint> seriesRR ;
    LineGraphSeries<DataPoint> seriesTemp ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vitals);

        BPNum = (TextView)  findViewById(R.id.BPNum) ;
        pulseNum = (TextView)  findViewById(R.id.pulseNum) ;
        RRNum = (TextView)  findViewById(R.id.RRNum) ;
        tempNum = (TextView)  findViewById(R.id.tempNum) ;
        summaryText = (TextView) findViewById(R.id.summaryText) ;

        graphBP = (GraphView)findViewById(R.id.graphBP) ;
        graphBP.getGridLabelRenderer().setHorizontalLabelsVisible(false);
        graphBP.getGridLabelRenderer().setVerticalLabelsVisible(false);
        graphBP.getViewport().setYAxisBoundsManual(true);
        graphBP.getViewport().setMinY(0);
        graphBP.getViewport().setMaxY(1.5);



        graphPulse = (GraphView)findViewById(R.id.graphPulse) ;
        graphPulse.getGridLabelRenderer().setHorizontalLabelsVisible(false);
        graphPulse.getGridLabelRenderer().setVerticalLabelsVisible(false);
        graphPulse.getViewport().setYAxisBoundsManual(true);
        graphPulse.getViewport().setMinY(0);
        graphPulse.getViewport().setMaxY(1);

        graphRR = (GraphView)findViewById(R.id.graphRR) ;
        graphRR.getGridLabelRenderer().setHorizontalLabelsVisible(false);
        graphRR.getGridLabelRenderer().setVerticalLabelsVisible(false);
        graphRR.getViewport().setYAxisBoundsManual(true);
        graphRR.getViewport().setMinY(0);
        graphRR.getViewport().setMaxY(1);

        graphTemp = (GraphView)findViewById(R.id.graphTemp) ;
        graphTemp.getGridLabelRenderer().setHorizontalLabelsVisible(false);
        graphTemp.getGridLabelRenderer().setVerticalLabelsVisible(false);
        graphTemp.getViewport().setYAxisBoundsManual(true);
        graphTemp.getViewport().setMinY(0);
        graphTemp.getViewport().setMaxY(1);

        Button buttonConGame = (Button) findViewById(R.id.buttonConGame);

        buttonConGame.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), Activity_Game.class);
                startActivity(intent);
            }
        });

        final Button patientOne = (Button) findViewById(R.id.patient_one_Button) ;

        patientOne.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                graphBP.removeAllSeries();
                graphPulse.removeAllSeries();
                graphRR.removeAllSeries();
                graphTemp.removeAllSeries();

                BPNum.setText("120/80 ");
                pulseNum.setText("70 ");
                RRNum.setText("18 ");
                tempNum.setText("98.6 ");
                summaryText.setText("\nSummary: 29 y/o female, Minor head injuries, Bruises and discoloration in temporal area.");

                seriesBP = new LineGraphSeries<DataPoint>();
                seriesPulse = new LineGraphSeries<DataPoint>();
                seriesRR = new LineGraphSeries<DataPoint>();
                seriesTemp = new LineGraphSeries<DataPoint>();


                patienOneRandomGraphs();

                graphPulse.addSeries(seriesPulse);
                graphBP.addSeries(seriesBP);
                graphRR.addSeries(seriesRR);
                graphTemp.addSeries(seriesTemp);

            }
        });

        final Button patientTwo = (Button) findViewById(R.id.patient_two_Button) ;

        patientTwo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                graphBP.removeAllSeries();
                graphPulse.removeAllSeries();
                graphRR.removeAllSeries();
                graphTemp.removeAllSeries();

                BPNum.setText("124/80 ");
                pulseNum.setText("78 ");
                RRNum.setText("16 ");
                tempNum.setText("97.2 ");
                summaryText.setText("\nSummary: 25 y/o male, Broken collarbone, Minor bruises.");

                seriesBP = new LineGraphSeries<DataPoint>();
                seriesPulse = new LineGraphSeries<DataPoint>();
                seriesRR = new LineGraphSeries<DataPoint>();
                seriesTemp = new LineGraphSeries<DataPoint>();


                patientTwoRandomGraphs();

                graphPulse.addSeries(seriesPulse);
                graphBP.addSeries(seriesBP);
                graphRR.addSeries(seriesRR);
                graphTemp.addSeries(seriesTemp);
            }


        });






    }

    private void patienOneRandomGraphs() {
        double x = 0;
        double y = 0.5 ;
        for (int i = 0; i < 400; i++) {
            x += 0.2;
            if(y <= 0.75) {
                y +=0.005;
            }

            seriesBP.appendData(new DataPoint(x, y), true, 400);
        }
        x = 0 ;
        y = 0 ;
        for (int i = 0; i < 400; i++) {
            x += 0.4;
            y = Math.cos(x) * 0.8;

            if(y <0) {
                y = 0 ;
            }
            seriesPulse.appendData(new DataPoint(x, y), true, 400);
        }

        x = 0 ;
        y = 0.25 ;
        for (int i = 0; i < 400; i++) {
            x += 0.2;
            if(y <= 0.5) {
                y +=0.002;
            }
            seriesRR.appendData(new DataPoint(x, y), true, 400);
        }

        x = 0 ;
        y = 0.5 ;
        for (int i = 0; i < 400; i++) {
            x += 0.2 ;
            if(x > 20) {
                if(y<0.9) {
                    y += 0.001;
                }
            }
            seriesTemp.appendData(new DataPoint(x, y), true, 400);
        }
    }

    private void patientTwoRandomGraphs() {
        double x = 0;
        double y = 0.5 ;
        for (int i = 0; i < 400; i++) {
            x += 0.2;
            if(y <= 0.75) {
                y +=0.0025;
            }

            seriesBP.appendData(new DataPoint(x, y), true, 400);
        }
        x = 0 ;
        y = 0 ;
        for (int i = 0; i < 400; i++) {
            x += 0.4;
            y = Math.cos(x);
            if(y <0) {
                y = 0 ;
            }
            seriesPulse.appendData(new DataPoint(x, y), true, 400);
        }

        x = 0 ;
        y = 0.25 ;
        for (int i = 0; i < 400; i++) {
            x += 0.2;
            if(y <= 0.4) {
                y +=0.00125;
            }
            seriesRR.appendData(new DataPoint(x, y), true, 400);
        }

        x = 0 ;
        y = 0.5 ;
        for (int i = 0; i < 400; i++) {
            x += 0.2 ;
            if(x > 25) {
                if(y<0.8) {
                    y += 0.001;
                }
            }
            seriesTemp.appendData(new DataPoint(x, y), true, 400);
        }
    }

}

