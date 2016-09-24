package com.example.woongbook.whereiswoong;

import android.app.Activity;
import android.content.DialogInterface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Switch;

public class MainActivity extends Activity implements View.OnClickListener{

    private Button findingLocationButton ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        findingLocationButton = (Button) findViewById(R.id.findingLocationButton);
        findingLocationButton.setOnClickListener(this);

    }

    private void initUI(){
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
    }


    @Override
    public void onClick(View v) {

    }
}
