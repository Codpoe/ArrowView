package me.codpoe.arrowview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.SeekBar;
import android.widget.TextView;

import me.codpoe.library.ArrowView;

public class MainActivity extends AppCompatActivity {

    private ArrowView mArrowView;
    private TextView mTextView;
    private SeekBar mSeekBar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mArrowView = (ArrowView) findViewById(R.id.arrow_view);
        mTextView = (TextView) findViewById(R.id.tv);
        mSeekBar = (SeekBar) findViewById(R.id.seek_bar);

        mSeekBar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int i, boolean b) {
                mArrowView.setOffset(i / 100f);
                mTextView.setText(String.valueOf(i / 100f));
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });

    }
}
