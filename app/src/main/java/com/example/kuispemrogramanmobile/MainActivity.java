package com.example.kuispemrogramanmobile;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {
    static final String mp = "";
    static final String ph = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    static void outApk(Activity activity) {
        AlertDialog.Builder alert = new AlertDialog.Builder(activity); alert
                .setTitle("Keluar")
                .setMessage("Serius Mau keluar?")
                .setPositiveButton("IYE'", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        activity.finishAffinity();
                    }
                })
                .setNegativeButton("NDAJI", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        dialog.dismiss();
                    }
                })
                .show();
    }
    public void map(View view) {
        if (!mp.isEmpty()) {
            Intent i = new Intent(Intent.ACTION_VIEW);
            i.setData(Uri.parse(mp));
            startActivity(i);
        }
    }

    public void bio(View view) {
        startActivity(new Intent(this, MainActivity2.class));
    }
    public void exitApk(View view) {
        outApk(this);
    }

    public void chat(View view) {
        if (!ph.isEmpty()) {
            Intent i = new Intent(Intent.ACTION_SENDTO);
            i.setData(Uri.parse("smsto:" + ph));
            i.putExtra("sms_body", "Fauzi Asham Nasrul (H071191020)");
            startActivity(i);
        }
    }
}