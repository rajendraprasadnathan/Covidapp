package com.example.firelogin;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.Toast;
import android.app.Activity;

public class App3Activity extends Activity implements AdapterView.OnItemSelectedListener {
    Button button;
    String[] users = { "Select any state","Andhra Pradesh", "Arunachal Pradesh", "Assam", "Bihar", "Chattisgarh ","Goa","Gujarat","Haryana","Himachal Pradesh","Jharkhand","Karnataka","Kerala","Madhya Pradesh","Maharashtra","Manipur","Meghalaya","Mizoram","Nagaland","Odisha","Punjab","Rajasthan","Sikkim","Tamil Nadu","Telangana","Tripura","Uttarkand","Uttarpradesh","West Bengal","Andaman and Nicobar","Chandigarh","Dadra and Nagar Haveli and  daman and diu","Delhi","Jammu and Kashmir","Ladakh","Lakshadweep","Puducherry"};
    String[] phoneNum = {"0866-2410978","9436055743","6913347770","104","8558893911","0471-2552056","020-26127394","3852411668","108","102","7005539653","9439994859","0141-2225624","044-29510500","0381-2315879","18001805145","1800313444222","03192-232102","9779558282","011-22307145","01912520982","01982256462"};
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main3);
        Spinner spin = (Spinner) findViewById(R.id.spinner1);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, users);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spin.setAdapter(adapter);
        spin.setOnItemSelectedListener(this);
    }
    public void launchDialer(String number){
        String numberToDial = "tel:"+number;
        startActivity(new Intent(Intent.ACTION_DIAL, Uri.parse(numberToDial)));
    }
    @Override
    public void onItemSelected(AdapterView<?> arg0, View arg1, int position,long id) {
        Toast.makeText(getApplicationContext(), "Selected User: "+users[position] ,Toast.LENGTH_SHORT).show();
        switch (position) {
            case 0:
                // Whatever you want to happen when the first item gets selected
                break;
            case 1:
                launchDialer(phoneNum[0]);
                break;
            case 2:
                launchDialer(phoneNum[1]);
                break;
            case 3:
                launchDialer(phoneNum[2]);
                break;
            case 4:
                launchDialer(phoneNum[3]);
                break;
            case 5:
                launchDialer(phoneNum[3]);
                break;
            case 6:
                launchDialer(phoneNum[3]);
                break;
            case 7:
                launchDialer(phoneNum[3]);
                break;
            case 8:
                launchDialer(phoneNum[4]);
                break;
            case 9:
                launchDialer(phoneNum[3]);
                break;
            case 10:
                launchDialer(phoneNum[3]);
                break;
            case 11:
                launchDialer(phoneNum[3]);
                break;
            case 12:
                launchDialer(phoneNum[5]);
                break;
            case 13:
                launchDialer(phoneNum[3]);
                break;
            case 14:
                launchDialer(phoneNum[6]);
                break;
            case 15:
                launchDialer(phoneNum[7]);
                break;
            case 16:
                launchDialer(phoneNum[8]);
                break;
            case 17:
                launchDialer(phoneNum[9]);
                break;
            case 18:
                launchDialer(phoneNum[10]);
                break;
            case 19:
                launchDialer(phoneNum[11]);
                break;
            case 20:
                launchDialer(phoneNum[3]);
                break;
            case 21:
                launchDialer(phoneNum[12]);
                break;
            case 22:
                launchDialer(phoneNum[3]);
                break;
            case 23:
                launchDialer(phoneNum[13]);
                break;
            case 24:
                launchDialer(phoneNum[3]);
                break;
            case 25:
                launchDialer(phoneNum[14]);
                break;
            case 26:
                launchDialer(phoneNum[3]);
                break;
            case 27:
                launchDialer(phoneNum[15]);
                break;
            case 28:
                launchDialer(phoneNum[16]);
                break;
            case 29:
                launchDialer(phoneNum[17]);
                break;
            case 30:
                launchDialer(phoneNum[18]);
                break;
            case 31:
                launchDialer(phoneNum[3]);
                break;
            case 32:
                launchDialer(phoneNum[19]);
                break;
            case 33:
                launchDialer(phoneNum[20]);
                break;
            case 34:
                launchDialer(phoneNum[21]);
                break;
            case 35:
                launchDialer(phoneNum[3]);
                break;
            case 36:
                launchDialer(phoneNum[3]);
                break;

        }
    }
    @Override
    public void onNothingSelected(AdapterView<?> arg0) {
        // TODO - Custom Code
    }
}