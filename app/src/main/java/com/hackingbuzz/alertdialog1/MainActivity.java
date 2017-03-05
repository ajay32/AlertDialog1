package com.hackingbuzz.alertdialog1;

import android.content.DialogInterface;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void getAlertBox(View view) {


        new  AlertDialog.Builder(this) .setIcon(android.R.drawable.ic_dialog_alert) .setTitle("Are you sure?")
                .setMessage("Do you really want to delete this item ?")
                .setPositiveButton("Yes", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        Toast.makeText(MainActivity.this, "Item is deleted", Toast.LENGTH_SHORT).show();
                    }
                }).setNegativeButton("No", null).show();
    }
}
