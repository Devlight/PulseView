package com.gigamole.pulseview;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.gigamole.library.PulseView;

public class MainActivity extends Activity implements
        View.OnClickListener,
        PulseView.PulseListener {

    private PulseView mPulseView;

    private int mCounter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initUI();
    }

    private void initUI() {
        mPulseView = (PulseView) findViewById(R.id.pv);
        mPulseView.setPulseListener(this);
        mPulseView.setOnClickListener(this);

//        mPulseView.setPulseColor(Color.BLACK);
//        mPulseView.setPulseCount(5);
//        mPulseView.setPulseMeasure(PulseView.PulseMeasure.WIDTH);
//        mPulseView.setIconHeight(200);
//        mPulseView.setIconWidth(200);
//        mPulseView.setIconRes(R.drawable.icon);
//        mPulseView.setPulseAlpha(70);
//        mPulseView.setInterpolator(new LinearInterpolator());
    }

    @Override
    public void onClick(final View v) {
        if (mCounter++ % 2 == 0) mPulseView.startPulse();
        else mPulseView.finishPulse();
    }

    @Override
    public void onStartPulse() {
//        Toast.makeText(MainActivity.this, "Start pulse", Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onFinishPulse() {
//        Toast.makeText(MainActivity.this, "Finish pulse", Toast.LENGTH_SHORT).show();
    }
}
