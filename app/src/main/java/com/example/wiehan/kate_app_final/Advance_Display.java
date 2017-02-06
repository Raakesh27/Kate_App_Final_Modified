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

public class Advance_Display extends AppCompatActivity {

    GraphView graphBBAdvance ;
    GraphView graphPulseAdvance ;
    GraphView graphRRAdvance;
    GraphView graphTempAdvance;
    TextView BPNumAdvance ;
    TextView pulseNumAdvance ;
    TextView RRNumAdvance ;
    TextView tempNumAdvance ;
    TextView textInfo ;
    TextView BPSumP1, BPSumP2 ;
    TextView pulseSumP1, pulseSumP2 ;
    TextView RRSumP1, RRSumP2 ;
    TextView tempSumP1, tempSumP2 ;
    TextView textPatientNo ;
    TextView textPatientInfo ;
    LineGraphSeries<DataPoint> seriesBP ;
    LineGraphSeries<DataPoint> seriesPulse ;
    LineGraphSeries<DataPoint> seriesRR ;
    LineGraphSeries<DataPoint> seriesTemp ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_advance_display);

        BPNumAdvance = (TextView)  findViewById(R.id.graphBPAdvance) ;
        pulseNumAdvance = (TextView)  findViewById(R.id.pulseNumAdvance) ;
        RRNumAdvance = (TextView)  findViewById(R.id.RRNumAdvance) ;
        tempNumAdvance = (TextView)  findViewById(R.id.tempNumAdvance) ;
        textInfo = (TextView) findViewById(R.id.textInfo) ;

        BPSumP1 = (TextView) findViewById(R.id.BPsumP1)  ;
        BPSumP2 = (TextView) findViewById(R.id.BPsumP2)  ;
        pulseSumP1 = (TextView) findViewById(R.id.pulseSumP1) ;
        pulseSumP2 = (TextView) findViewById(R.id.pulseSumP2) ;
        RRSumP1 = (TextView) findViewById(R.id.RRSumP1) ;
        RRSumP2 = (TextView) findViewById(R.id.RRSumP2) ;
        tempSumP1 = (TextView) findViewById(R.id.tempSumP1) ;
        tempSumP2 = (TextView) findViewById(R.id.tempSumP2) ;

        textPatientInfo = (TextView) findViewById(R.id.textPatientInfo) ;
        textPatientNo = (TextView) findViewById(R.id.textPatientNo) ;

        graphBBAdvance = (GraphView)findViewById(R.id.graphBBAdvance) ;
        graphBBAdvance.getGridLabelRenderer().setHorizontalLabelsVisible(false);
        graphBBAdvance.getGridLabelRenderer().setVerticalLabelsVisible(false);
        graphBBAdvance.getViewport().setScrollable(true);

        graphPulseAdvance = (GraphView)findViewById(R.id.graphPulseAdvance) ;
        graphPulseAdvance.getGridLabelRenderer().setHorizontalLabelsVisible(false);
        graphPulseAdvance.getGridLabelRenderer().setVerticalLabelsVisible(false);
        graphPulseAdvance.getViewport().setScrollable(true);

        graphRRAdvance = (GraphView)findViewById(R.id.graphRRAdvance) ;
        graphRRAdvance.getGridLabelRenderer().setHorizontalLabelsVisible(false);
        graphRRAdvance.getGridLabelRenderer().setVerticalLabelsVisible(false);
        graphRRAdvance.getViewport().setScrollable(true);

        graphTempAdvance = (GraphView)findViewById(R.id.graphTempAdvance) ;
        graphTempAdvance.getGridLabelRenderer().setHorizontalLabelsVisible(false);
        graphTempAdvance.getGridLabelRenderer().setVerticalLabelsVisible(false);
        graphTempAdvance.getViewport().setScrollable(true);

        BPSumP1.setText("BP 120/80");
        BPSumP2.setText("BP 124/80");
        pulseSumP1.setText("Pulse 70");
        pulseSumP2.setText("Pulse 78");
        RRSumP1.setText("RR 18");
        RRSumP2.setText("RR 16");
        tempSumP1.setText("Temp 98.6");
        tempSumP2.setText("Temp 97.2");

        Button createActionPlan = (Button) findViewById(R.id.buttonCAPAdvance);

        createActionPlan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), Activity_Scenario.class);
                startActivity(intent);
            }
        });

        final Button patientOne = (Button) findViewById(R.id.patient_One_Button_Adv) ;

        patientOne.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                graphBBAdvance.removeAllSeries();
                graphPulseAdvance.removeAllSeries();
                graphRRAdvance.removeAllSeries();
                graphTempAdvance.removeAllSeries();

                textPatientNo.setText("Patient 1:");
                textPatientInfo.setText("Maddy. Female. 29");
                BPNumAdvance.setText("120/80 ");
                pulseNumAdvance.setText("70 ");
                RRNumAdvance.setText("18 ");
                tempNumAdvance.setText("98.6 ");
                textInfo.setText("\nFentanyl administered : 7:34 pm\nFluids givens : 7:40 pm");

                seriesBP = new LineGraphSeries<DataPoint>();
                seriesPulse = new LineGraphSeries<DataPoint>();
                seriesRR = new LineGraphSeries<DataPoint>();
                seriesTemp = new LineGraphSeries<DataPoint>();


                patienOneRandomGraphs();

                graphPulseAdvance.addSeries(seriesPulse);
                graphBBAdvance.addSeries(seriesBP);
                graphRRAdvance.addSeries(seriesRR);
                graphTempAdvance.addSeries(seriesTemp);

            }
        });

        final Button patientTwo = (Button) findViewById(R.id.patient_Two_Button_Adv) ;

        patientTwo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                graphBBAdvance.removeAllSeries();
                graphPulseAdvance.removeAllSeries();
                graphRRAdvance.removeAllSeries();
                graphTempAdvance.removeAllSeries();

                textPatientNo.setText("Patient 2:");
                textPatientInfo.setText("Jeff. Male. 25");

                BPNumAdvance.setText("124/80 ");
                pulseNumAdvance.setText("78 ");
                RRNumAdvance.setText("16 ");
                tempNumAdvance.setText("97.2 ");
                textInfo.setText("\nFentanyl administered : 7:41 pm\nFluids givens : 7:52 pm");

                seriesBP = new LineGraphSeries<DataPoint>();
                seriesPulse = new LineGraphSeries<DataPoint>();
                seriesRR = new LineGraphSeries<DataPoint>();
                seriesTemp = new LineGraphSeries<DataPoint>();


                patientTwoRandomGraphs();

                graphPulseAdvance.addSeries(seriesPulse);
                graphBBAdvance.addSeries(seriesBP);
                graphRRAdvance.addSeries(seriesRR);
                graphTempAdvance.addSeries(seriesTemp);
            }


        });






    }

    private void patienOneRandomGraphs() {
        double x = 0;
        double y = 0.5 ;
        for (int i = 0; i < 400; i++) {
            x += 0.1;
            if(y <= 1) {
                y +=0.005;
            }

            seriesBP.appendData(new DataPoint(x, y), true, 400);
        }
        x = 0 ;
        y = 0 ;
        for (int i = 0; i < 400; i++) {
            x += 0.1;
            y = Math.cos(x) +0.5;
            if(y <0) {
                y = 0 ;
            }
            seriesPulse.appendData(new DataPoint(x, y), true, 400);
        }

        x = 0 ;
        y = 0.25 ;
        for (int i = 0; i < 400; i++) {
            x += 0.1;
            if(y <= 0.5) {
                y +=0.002;
            }
            seriesRR.appendData(new DataPoint(x, y), true, 400);
        }

        x = 0 ;
        y = 1 ;
        for (int i = 0; i < 400; i++) {
            x += 0.1 ;
            if(x > 20) {
                y += 0.001 ;
            }
            seriesTemp.appendData(new DataPoint(x, y), true, 400);
        }
    }

    private void patientTwoRandomGraphs() {
        double x = 0;
        double y = 0.5 ;
        for (int i = 0; i < 400; i++) {
            x += 0.1;
            if(y <= 1) {
                y +=0.0025;
            }

            seriesBP.appendData(new DataPoint(x, y), true, 400);
        }
        x = 0 ;
        y = 0 ;
        for (int i = 0; i < 400; i++) {
            x += 0.25;
            y = Math.cos(x) +0.5;
            if(y <0) {
                y = 0 ;
            }
            seriesPulse.appendData(new DataPoint(x, y), true, 400);
        }

        x = 0 ;
        y = 0.25 ;
        for (int i = 0; i < 400; i++) {
            x += 0.1;
            if(y <= 0.4) {
                y +=0.00125;
            }
            seriesRR.appendData(new DataPoint(x, y), true, 400);
        }

        x = 0 ;
        y = 1 ;
        for (int i = 0; i < 400; i++) {
            x += 0.1 ;
            if(x > 25) {
                y += 0.001 ;
            }
            seriesTemp.appendData(new DataPoint(x, y), true, 400);
        }
    }

}

