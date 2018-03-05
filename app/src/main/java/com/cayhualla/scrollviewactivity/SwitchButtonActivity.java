package com.cayhualla.scrollviewactivity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.CompoundButton;
import android.widget.Switch;
import android.widget.TextView;

import org.w3c.dom.Text;

public class SwitchButtonActivity extends AppCompatActivity {

    private Switch switchButton, switchButton2;
    private TextView textView, textView2;
    private String switchOn="Switch is ON";
    private String switchOff="Switch is OFF";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_switch_button);

        switchButton = (Switch) findViewById(R.id.switchButton);
        textView = (TextView) findViewById(R.id.textView);

        switchButton.setChecked(true);
        switchButton.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {

                    @Override
                    public void onCheckedChanged(CompoundButton compoundButton, boolean bChecked) {
                        if (bChecked){
                            textView.setText(switchOn);
                        }else{
                            textView.setText(switchOff);
                        }
                    }
                });

        if (switchButton.isChecked()){
            textView.setText(switchOn);
            }else {
            textView.setText(switchOff);
        }
        switchButton2 = (Switch) findViewById(R.id.switchButton2);
        textView2 = (TextView) findViewById(R.id.textView2);

        switchButton2.setChecked(true);
        switchButton2.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean bChecked) {
                if (bChecked){
                    textView2.setText(switchOn);
                }else {
                    textView2.setText(switchOff);
                }

            }
        });
        if (switchButton2.isChecked()) {
            textView2.setText(switchOn);
        } else {
            textView2.setText(switchOff);
        }


    }
}
