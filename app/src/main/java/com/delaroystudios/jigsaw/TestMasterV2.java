package com.delaroystudios.jigsaw;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class TestMasterV2 extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test_master_v2);
    }   // Main Method

    public void clickGoToMain(View view) {
        startActivity(new Intent(TestMasterV2.this, MainActivity.class));
    }

}   // Main Class
