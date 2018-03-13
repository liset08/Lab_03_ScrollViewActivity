package com.cayhualla.scrollviewactivity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextClock;
import android.widget.TextView;
import android.widget.Toast;

public class EditTextActivity extends AppCompatActivity {

    private EditText firstname, lastNamme;
    private TextView displayname;
    private Button button2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edit_text);

        firstname=(EditText)findViewById(R.id.firstName);
        lastNamme=(EditText)findViewById(R.id.lastName);
        displayname=(TextView)findViewById(R.id.displayName);
        button2=(Button)findViewById(R.id.button2);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(EditTextActivity.this,"",Toast.LENGTH_SHORT).show();

            }
        });

    }

    public void register(View view){  //parametro view
        String getFirstName= this.firstname.getText().toString();
        String getLastName=this.lastNamme.getText().toString();

        if (getFirstName.isEmpty() || getLastName.isEmpty())
            displayname.setText("estos campos son requeridos");
        else

            displayname.setText("Usuario : " +  getFirstName + getLastName );

        return;
    }

}
