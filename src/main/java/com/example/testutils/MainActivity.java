package com.example.testutils;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity {

    @BindView(R.id.et)
    EditText et;
    @BindView(R.id.btn)
    Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
    }


    @OnClick({R.id.btn})
    public void onViewClicked(View view) {
        switch (view.getId()) {
            case R.id.btn:
                TUtil.setConfig(getResources().getColor(R.color.colorAccent), getResources().getColor(R.color.colorPrimary), Gravity.LEFT, 120, 85, 1);
                TUtil.show("234");
                break;
        }
    }
}
