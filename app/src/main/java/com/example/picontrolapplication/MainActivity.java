package com.example.picontrolapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MainActivity extends AppCompatActivity {

    private TextView ip;
    private EditText edip;
    private Button bsave, bstart, bstop, brestart, bswitchoff, bcapture;
    private WebView webView;
    private String my_ip = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        set_UI_components();

        bsave.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String tmp = edip.getText().toString().trim();
                if(format_IP(tmp)){
                    my_ip = tmp;
                    ip.setText("DEV IP: "+my_ip);
                }
                else{
                    Toast.makeText(MainActivity.this,"Invalid IP", Toast.LENGTH_SHORT).show();
                }
            }
        });



        bstart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

        bstop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

        brestart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

        bswitchoff.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

        bcapture.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
    }

    private void set_UI_components(){
        ip = (TextView)findViewById(R.id.textView);
        edip = (EditText)findViewById(R.id.editText);
        bsave = (Button)findViewById(R.id.button_save);
        bstart = (Button)findViewById(R.id.button_start_v);
        bstop = (Button)findViewById(R.id.button_stop_v);
        brestart = (Button)findViewById(R.id.button_restart);
        bswitchoff = (Button)findViewById(R.id.button_switchoff);
        bcapture = (Button)findViewById(R.id.button_capture);
        webView = (WebView)findViewById(R.id.webView);
    }

    private boolean format_IP(String s){
        String IPADDRESS_PATTERN =
                "^([01]?\\d\\d?|2[0-4]\\d|25[0-5])\\." +
                        "([01]?\\d\\d?|2[0-4]\\d|25[0-5])\\." +
                        "([01]?\\d\\d?|2[0-4]\\d|25[0-5])\\." +
                        "([01]?\\d\\d?|2[0-4]\\d|25[0-5])$";
        Pattern pattern = Pattern.compile(IPADDRESS_PATTERN);
        Matcher matcher = pattern.matcher(s);
        return matcher.matches();
    }
}
