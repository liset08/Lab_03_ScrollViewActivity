package com.cayhualla.scrollviewactivity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextClock;
import android.widget.TextView;

public class EditTextActivity extends AppCompatActivity {

    private EditText firstname, lastNamme;
    private TextView displayname;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edit_text);

        firstname=(EditText)findViewById(R.id.firstName);
        lastNamme=(EditText)findViewById(R.id.lastName);
        displayname=(TextView)findViewById(R.id.displayName);


    }

    public void register(View view){
        String getFirstName= firstname.getText().toString();
        String getLastName=lastNamme.getText().toString();
        if (getFirstName.length()==0 || getLastName.length()==0)
            displayname.setText("estos campos son requeridos");
        else
            displayname.setText("Usuario : " +getFirstName + " getLastName");
    }

}
