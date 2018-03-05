package com.cayhualla.scrollviewactivity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

public class RadioButtontActivity extends AppCompatActivity {

    private RadioGroup radioGroup;
    private TextView displText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_radio_buttont);

        radioGroup=(RadioGroup)findViewById(R.id.radioGroup);
        displText=(TextView)findViewById(R.id.dsplayText);

    }

    public void radioButtonClicked(View view){
        boolean checked=((RadioButton)view).isChecked();
        switch (view.getId()){
            case R.id.radioButton1:
                if (checked)
                    Toast.makeText(getApplicationContext(),"Parece que le es  fácil RelativeLayout ",
                            Toast.LENGTH_SHORT).show();
                break;

            case R.id.radioButton2:
                Toast.makeText(getApplicationContext(),"Parece que le es  fácil LinearLayout  ",
                        Toast.LENGTH_SHORT).show();
                break;

            case R.id.radioButton3:
                Toast.makeText(getApplicationContext(),"Parece que le es  fácil FrameLayout   ",
                        Toast.LENGTH_SHORT).show();
                break;

            case R.id.radioButton4:
                Toast.makeText(getApplicationContext(),"Parece que le es  fácil TablleLayout    ",
                        Toast.LENGTH_SHORT).show();
                break;

            case R.id.radioButton5:
                Toast.makeText(getApplicationContext(),"Parece que le es  fácil Grid Layout\n",
                        Toast.LENGTH_SHORT).show();
                break;
 }
    }
    public void answer(View view){
        int radioButtonId=radioGroup.getCheckedRadioButtonId();
        if (radioButtonId== -1){
            Toast.makeText(this,"Este campo es requerido", Toast.LENGTH_LONG).show();

        }else {
            if (radioButtonId == R.id.radioButton1){
                Toast.makeText(this, "Tu seleccionaste RelativeLayout", Toast.LENGTH_SHORT).show();
            }else if (radioButtonId == R.id.radioButton2){
                Toast.makeText(this, "Tu seleccionaste LinearLayout", Toast.LENGTH_SHORT).show();
            }
            RadioButton radioButton = (RadioButton) findViewById(radioButtonId);
            Toast.makeText(this, "Este texto es " + radioButton.getText(), Toast.LENGTH_SHORT).show();

        }
    }

}
