package com.s_example.signup;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.transition.TransitionManager;
import android.view.Gravity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    ViewGroup viewGroup;
    TextView txt;
    EditText editLog;
    String show;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        Button btn_create =(Button)findViewById(R.id.create);
        txt= (TextView)findViewById(R.id.view);
        editLog = (EditText)findViewById(R.id.user);
        final EditText editPass = (EditText)findViewById(R.id.password);

        final ImageView btn = (ImageView) findViewById(R.id.btnAnimation);
        viewGroup = (ViewGroup)findViewById(R.id.group);


        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TransitionManager.beginDelayedTransition(viewGroup);
                LinearLayout.LayoutParams l = (LinearLayout.LayoutParams) btn.getLayoutParams();
                l.gravity= Gravity.LEFT;
            }
        });


        btn_create.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String pass = editPass.getText().toString();
                show= editLog.getText().toString();
                txt.setText("user = "+show+"\npawwword = "+pass);
//               Toast.makeText(getApplication(), ""+show+"", Toast.LENGTH_SHORT).show();
            }
        });
    }
}
