package com.cayhualla.scrollviewactivity;

import android.content.DialogInterface;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class SimpleDialogActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_simple_dialog);
    }

    public void showDialog(View view){
        final AlertDialog alertDialog=new AlertDialog.Builder(this).create();

        alertDialog.setTitle("Titulo del dialogo de alerta");
        alertDialog.setMessage("Estyo es el mensaje de alerta en Android");
        alertDialog.setButton(AlertDialog.BUTTON_NEUTRAL, "OK", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                dialog.dismiss();

            }
        });
        alertDialog.show();
    }
}
