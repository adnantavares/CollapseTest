package com.example.adnant.collapsetest;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class MotionActivity extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_motion);

        TextView t1 = (TextView) findViewById(R.id.hello);
        final TextView t2 = (TextView) findViewById(R.id.hello2);
        final TextView t3 = (TextView) findViewById(R.id.hello3);

        t1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (t2.getVisibility() == View.GONE) {
                    t2.setVisibility(View.VISIBLE);
                    t3.setVisibility(View.VISIBLE);
                } else {
                    t2.setVisibility(View.GONE);
                    t3.setVisibility(View.GONE);
                }
            }
        });

        TextView c1 = (TextView) findViewById(R.id.card);
        final TextView c2 = (TextView) findViewById(R.id.card2);
        final TextView c3 = (TextView) findViewById(R.id.card3);

        c1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (c2.getVisibility() == View.GONE) {
                    c2.setVisibility(View.VISIBLE);
                    c3.setVisibility(View.VISIBLE);
                } else {
                    c2.setVisibility(View.GONE);
                    c3.setVisibility(View.GONE);
                }
            }
        });

    }
}
