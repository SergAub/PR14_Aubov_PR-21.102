package com.example.pr14_aubov_pr_21102;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class SignIn extends AppCompatActivity {
TextView Login, Password;
CheckBox Agreement;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signin);

        Login = (TextView) findViewById(R.id.editTextText);
        Password = (TextView) findViewById(R.id.editTextText2);
        Agreement = (CheckBox) findViewById(R.id.checkBox);
    }

    public void GoToMenu(View view){
        if(Login.getText().length() != 0 && Password.getText().length() != 0 && Agreement.isChecked() == true)
        {
            Intent intent = new Intent(this, Menu.class);
            startActivity(intent);
        }
        else{
            Toast toast = Toast.makeText(getApplicationContext(),
                    "Поля обязательны для заполнения!", Toast.LENGTH_SHORT);
            toast.show();
        }
    }
}