package com.example.firelogin;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.view.View;
import android.view.View.OnClickListener;
import android.net.Uri;
import android.widget.Toast;

import com.google.android.gms.auth.api.signin.GoogleSignInClient;

public class AppActivity extends Activity {

    Button button;
    private GoogleSignInClient mGoogleSignInClient;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        addListenerOnButton();
    }

    public void addListenerOnButton() {

        final Context
                context = this;

        button = (Button) findViewById(R.id.button1);


        button.setOnClickListener(new OnClickListener() {

            @Override
            public void onClick(View arg0) {
                Intent Getintent = new Intent(Intent.ACTION_VIEW,Uri.parse("https://epass.jantasamvad.org/epass/relief/english/"));
                startActivity(Getintent);

                //Intent intent1 = new Intent(context, login.class);
                // startActivity(intent1);

            }

        });

        button = (Button) findViewById(R.id.button2);
        button.setOnClickListener(new OnClickListener() {

            @Override
            public void onClick(View arg0) {

                Intent intent2 = new Intent(context, App3Activity.class);
                startActivity(intent2);

            }

        });
        button= (Button)findViewById(R.id.button3);

        button.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                Intent Getintent = new Intent(Intent.ACTION_VIEW,Uri.parse("https://www.covid19india.org/"));
                startActivity(Getintent);

            }
        });

        button= (Button)findViewById(R.id.button4);

        button.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                Intent Getintent = new Intent(Intent.ACTION_VIEW,Uri.parse("https://www.pmcares.gov.in/en/web/contribution/donate_india"));
                startActivity(Getintent);

            }
        });
        button= (Button)findViewById(R.id.button5);

        button.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                Intent Getintent = new Intent(Intent.ACTION_VIEW,Uri.parse("https://lgcmrelieffund.delhi.gov.in/Home.aspx"));
                startActivity(Getintent);

            }
        });
        button= (Button)findViewById(R.id.sign_out_button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mGoogleSignInClient.signOut();
                Toast.makeText(AppActivity.this,"You are Logged Out",Toast.LENGTH_SHORT).show();
                Intent intent2 = new Intent(AppActivity.this, MainActivity.class);
                startActivity(intent2);

            }

        });

    }


}