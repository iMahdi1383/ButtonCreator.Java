package com.example.mahdiaskarpoor;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();

        startActivity(getIntent());
    }

    public void AddNewButton(View v)
    {
        LinearLayout mainLayout = findViewById(R.id.mainLayout);
        Button newButton = new Button(this);
        newButton.setLayoutParams(new LayoutParams(LayoutParams.MATCH_PARENT, LayoutParams.WRAP_CONTENT));
        newButton.setText("Mahdi Askarpoor");
        newButton.setOnClickListener(v1 -> AddNewText());
        mainLayout.addView(newButton);
    }

    private void AddNewText() {
        LinearLayout mainLayout = findViewById(R.id.mainLayout);
        TextView newText = new TextView(this);
        newText.setLayoutParams(new LayoutParams(LayoutParams.MATCH_PARENT, LayoutParams.WRAP_CONTENT));
        newText.setText("مهدی عسکرپور | کاردانی نرم افزار ورودی مهر 1401");
        mainLayout.addView(newText);
    }


}