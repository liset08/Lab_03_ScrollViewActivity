package com.cayhualla.scrollviewactivity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.CheckBox;
import android.widget.Toast;

public class CheckBoxActivity extends AppCompatActivity {
    private CheckBox checkBox;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_check_box);
        checkBox =(CheckBox)findViewById(R.id.checkBox);

        checkBox.setChecked(true);
        if (checkBox.isChecked())
            Toast.makeText(this,"Primer checkbox esta revisado",Toast.LENGTH_LONG).show();
    }
}
