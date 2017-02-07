package com.example.wiehan.kate_app_final;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.jjoe64.graphview.GraphView;
import com.jjoe64.graphview.series.DataPoint;
import com.jjoe64.graphview.series.LineGraphSeries;

public class Advance_Display_ScenOne extends AppCompatActivity {

    GraphView graphBBAdvance ;
    GraphView graphPulseAdvance ;
    GraphView graphRRAdvance;
    GraphView graphTempAdvance;
    TextView BPNumAdvance ;
    TextView pulseNumAdvance ;
    TextView RRNumAdvance ;
    TextView tempNumAdvance ;
    TextView textInfo ;

    TextView textPatientNo ;
    TextView textPatientInfo ;
    LineGraphSeries<DataPoint> seriesBP ;
    LineGraphSeries<DataPoint> seriesPulse ;
    LineGraphSeries<DataPoint> seriesRR ;
    LineGraphSeries<DataPoint> seriesTemp ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_advance_display_scen_one);

        BPNumAdvance = (TextView)  findViewById(R.id.BPNum_Scen1) ;
        pulseNumAdvance = (TextView)  findViewById(R.id.pulseNumAdvance_Scen1) ;
        RRNumAdvance = (TextView)  findViewById(R.id.RRNumAdvance_Scen1) ;
        tempNumAdvance = (TextView)  findViewById(R.id.tempNumAdvance_Scen1) ;
        textInfo = (TextView) findViewById(R.id.textInfo_Scen1) ;

        textPatientInfo = (TextView) findViewById(R.id.textPatientInfo_Scen1) ;
        textPatientNo = (TextView) findViewById(R.id.textPatientNo_Scen1) ;

        graphBBAdvance = (GraphView)findViewById(R.id.graphBBAdvance_Scen1) ;
        graphBBAdvance.getGridLabelRenderer().setHorizontalLabelsVisible(false);
        graphBBAdvance.getGridLabelRenderer().setVerticalLabelsVisible(false);
        graphBBAdvance.getViewport().setXAxisBoundsManual(true);
        graphBBAdvance.getViewport().setScrollableY(false);
        graphBBAdvance.getViewport().setMinX(0);
        graphBBAdvance.getViewport().setMaxX(100);
        graphBBAdvance.getViewport().setYAxisBoundsManual(true);
        graphBBAdvance.getViewport().setMinY(0);
        graphBBAdvance.getViewport().setMaxY(1.5);

        graphPulseAdvance = (GraphView)findViewById(R.id.graphPulseAdvance_Scen1) ;
        graphPulseAdvance.getGridLabelRenderer().setHorizontalLabelsVisible(false);
        graphPulseAdvance.getGridLabelRenderer().setVerticalLabelsVisible(false);
        graphPulseAdvance.getViewport().setXAxisBoundsManual(true);
        graphPulseAdvance.getViewport().setScrollableY(false);
        graphPulseAdvance.getViewport().setMinX(0);
        graphPulseAdvance.getViewport().setMaxX(100);
        graphPulseAdvance.getViewport().setYAxisBoundsManual(true);
        graphPulseAdvance.getViewport().setMinY(0);
        graphPulseAdvance.getViewport().setMaxY(1);

        graphRRAdvance = (GraphView)findViewById(R.id.graphRRAdvance_Scen1) ;
        graphRRAdvance.getGridLabelRenderer().setHorizontalLabelsVisible(false);
        graphRRAdvance.getGridLabelRenderer().setVerticalLabelsVisible(false);
        graphRRAdvance.getViewport().setXAxisBoundsManual(true);
        graphRRAdvance.getViewport().setScrollableY(false);
        graphRRAdvance.getViewport().setMinX(0);
        graphRRAdvance.getViewport().setMaxX(100);
        graphRRAdvance.getViewport().setYAxisBoundsManual(true);
        graphRRAdvance.getViewport().setMinY(0);
        graphRRAdvance.getViewport().setMaxY(1);

        graphTempAdvance = (GraphView)findViewById(R.id.graphTempAdvance_Scen1) ;
        graphTempAdvance.getGridLabelRenderer().setHorizontalLabelsVisible(false);
        graphTempAdvance.getGridLabelRenderer().setVerticalLabelsVisible(false);
        graphTempAdvance.getViewport().setXAxisBoundsManual(true);
        graphTempAdvance.getViewport().setScrollableY(false);
        graphTempAdvance.getViewport().setMinX(0);
        graphTempAdvance.getViewport().setMaxX(100);
        graphTempAdvance.getViewport().setYAxisBoundsManual(true);
        graphTempAdvance.getViewport().setMinY(0);
        graphTempAdvance.getViewport().setMaxY(1);


        Button createActionPlan = (Button) findViewById(R.id.buttonCAPAdvance_Scen1);

        createActionPlan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), Action_Plan.class);
                startActivity(intent);
            }
        });

        final Button patientOne = (Button) findViewById(R.id.patient_One_Button_Adv_Scen1) ;

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

        final Button patientTwo = (Button) findViewById(R.id.patient_Two_Button_Adv_Scen1) ;

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
        for (int i = 0; i < 1000; i++) {
            x += 0.2;
            if(y <= 0.75) {
                y +=0.005;
            }

            seriesBP.appendData(new DataPoint(x, y), true, 1000);
        }
        x = 0 ;
        y = 0 ;
        for (int i = 0; i < 1000; i++) {
            x += 0.4;
            y = Math.cos(x) *0.8;

            if(y <0) {
                y = 0 ;
            }
            seriesPulse.appendData(new DataPoint(x, y), true, 1000);
        }

        x = 0 ;
        y = 0.25 ;
        for (int i = 0; i < 1000; i++) {
            x += 0.2;
            if(y <= 0.5) {
                y +=0.002;
            }
            seriesRR.appendData(new DataPoint(x, y), true, 1000);
        }

        x = 0 ;
        y = 0.5 ;
        for (int i = 0; i < 1000; i++) {
            x += 0.2 ;
            if(x > 20) {
                if(y<0.9) {
                    y += 0.001;
                }
            }
            seriesTemp.appendData(new DataPoint(x, y), true, 1000);
        }
    }

    private void patientTwoRandomGraphs() {
        double x = 0;
        double y = 0.5 ;
        for (int i = 0; i < 1000; i++) {
            x += 0.2;
            if(y <= 0.75) {
                y +=0.0025;
            }

            seriesBP.appendData(new DataPoint(x, y), true, 1000);
        }
        x = 0 ;
        y = 0 ;
        for (int i = 0; i < 1000; i++) {
            x += 0.4;
            y = Math.cos(x);
            if(y <0) {
                y = 0 ;
            }
            seriesPulse.appendData(new DataPoint(x, y), true, 1000);
        }

        x = 0 ;
        y = 0.25 ;
        for (int i = 0; i < 1000; i++) {
            x += 0.2;
            if(y <= 0.4) {
                y +=0.00125;
            }
            seriesRR.appendData(new DataPoint(x, y), true, 1000);
        }

        x = 0 ;
        y = 0.5 ;
        for (int i = 0; i < 1000; i++) {
            x += 0.2 ;
            if(x > 25) {
                if(y<0.8) {
                    y += 0.001;
                }
            }
            seriesTemp.appendData(new DataPoint(x, y), true, 1000);
        }
    }

}

