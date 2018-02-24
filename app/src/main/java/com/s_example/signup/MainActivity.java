package com.s_example.signup;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

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
