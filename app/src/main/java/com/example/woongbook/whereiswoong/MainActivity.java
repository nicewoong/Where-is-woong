package com.example.woongbook.whereiswoong;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends Activity implements View.OnClickListener{

    private Button saveLocationButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



    }

    private void initUI(){
        //init button setting
        saveLocationButton = (Button) findViewById(R.id.findingLocationButton);
        saveLocationButton.setOnClickListener(this);

    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
    }


    @Override
    public void onClick(View v) {
        switch(v.getId()){
            case R.id.findingLocationButton:


                break;
        }
    }
}
