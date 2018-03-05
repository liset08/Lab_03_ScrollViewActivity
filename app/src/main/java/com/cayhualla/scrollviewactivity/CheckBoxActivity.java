package com.cayhualla.scrollviewactivity;

import android.support.annotation.CheckResult;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.Toast;

public class CheckBoxActivity extends AppCompatActivity {
    private  CheckBox checkBox;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_check_box);
        checkBox =(CheckBox)findViewById(R.id.checkBox);

        checkBox.setChecked(true);
        if (checkBox.isChecked())
            Toast.makeText(this,"Primer checkbox esta revisado",Toast.LENGTH_LONG).show();
    }

    public void androidCheckBoxClicked(View view){

        switch (view.getId()){
            case R.id.checkBox:
                CheckBox checkBox=(CheckBox)view;
            if (checkBox.isChecked())
                Toast.makeText(this,checkBox.getText()+" seleccionado", Toast.LENGTH_LONG).show();
            else
                Toast.makeText(this, " Dejó de seleccionar "+checkBox.getText(), Toast.LENGTH_SHORT).show();

                break;

            case R.id.checkBox2:
                CheckBox checkBox2=(CheckBox)view;
                if (checkBox2.isChecked())
                    Toast.makeText(this, checkBox2.getText()+" seleccionado", Toast.LENGTH_SHORT).show();
                else
                    Toast.makeText(this, " Dejó de seleccionar "+checkBox2.getText(), Toast.LENGTH_SHORT).show();

                break;

            case R.id.checkBox3:
                CheckBox checkBox3=(CheckBox)view;
                if (checkBox3.isChecked())
                    Toast.makeText(this,checkBox3.getText()+" seleccionado", Toast.LENGTH_SHORT).show();
                else
                    Toast.makeText(this, " Dejó de seleccionar "+checkBox3.getText(), Toast.LENGTH_SHORT).show();

                break;

            case R.id.checkBox4:
                CheckBox checkBox4=(CheckBox)view;
                if (checkBox4.isChecked())
                    Toast.makeText(this,checkBox4.getText()+" seleccionado", Toast.LENGTH_SHORT).show();
                else
                    Toast.makeText(this, " Dejó de seleccionar "+checkBox4.getText(), Toast.LENGTH_SHORT).show();

                break;

            case R.id.checkBox5:
                CheckBox checkBox5=(CheckBox)view;
                if (checkBox5.isChecked())
                    Toast.makeText(this, checkBox5.getText()+" seleccionado", Toast.LENGTH_SHORT).show();
                else
                    Toast.makeText(this, " Dejó de seleccionar "+checkBox5.getText(), Toast.LENGTH_SHORT).show();

                break;

            case R.id.checkBox6:
                CheckBox checkBox6=(CheckBox)view;
                if (checkBox6.isChecked())
                    Toast.makeText(this, checkBox6.getText()+" seleccionado", Toast.LENGTH_SHORT).show();
                else
                    Toast.makeText(this, " Dejó de seleccionar "+checkBox6.getText(), Toast.LENGTH_SHORT).show();

                break;

            case R.id.checkBox7:
                CheckBox checkBox7=(CheckBox)view;
                if (checkBox7.isChecked())
                    Toast.makeText(this, checkBox7.getText()+" seleccionado", Toast.LENGTH_SHORT).show();
                else
                    Toast.makeText(this, " Dejó de seleccionar "+checkBox7.getText(), Toast.LENGTH_SHORT).show();

                break;

            case R.id.checkBox8:
                CheckBox checkBox8=(CheckBox)view;
                if (checkBox8.isChecked())
                    Toast.makeText(this, checkBox8.getText()+" seleccionado", Toast.LENGTH_SHORT).show();
                else
                    Toast.makeText(this, " Dejó de seleccionar "+checkBox8.getText(), Toast.LENGTH_SHORT).show();

                break;

            case R.id.checkBox9:
                CheckBox checkBox9=(CheckBox)view;
                if (checkBox9.isChecked())
                    Toast.makeText(this, checkBox9.getText()+" seleccionado", Toast.LENGTH_SHORT).show();
                else
                    Toast.makeText(this, " Dejó de seleccionar "+checkBox9.getText(), Toast.LENGTH_SHORT).show();

                break;

        }

    }

}
