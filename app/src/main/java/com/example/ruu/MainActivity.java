package com.example.ruu;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    public Button buttonFurther;
    public Button buttonCheck;
    public TextView textView;
    public EditText editText;
    String[] letterArr = new String[]{"и", "е", "и", "и", "и", "и", "и", "и", "и", "и", "и", "и", "и", "и", "и", "и", "и", "и", "и", "и", "и", "и", "и", "и", "е", "е", "е", "е", "е", "е", "е", "е", "е", "е", "е", "е", "е", "е", "е", "е", "е", "е", "е", "е"};
    String[] endArr = new String[]{"ватный", "мировать", "мадонна", "мат", "митив", "вилегия", "оритет", "украсить", "видение", "дираться", "ключение", "сяга", "лежный", "тязание", "обретение", "чудливый", "чуда", "даное", "страстие", "способиться", "менять", "вередливый", "ятель", "сутствовать", "амбула", "стиж", "валировать", "вращать", "зидент", "зирать", "зидиум", "людия", "мьера", "небрегать", "образовать", "одолевать", "парат", "пона", "пятствие", "рогатива", "следовать", "тендент", "тензия", "цедент"};
    public int num = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar().hide();
        buttonCheck = (Button) findViewById(R.id.buttonDal);
        buttonFurther = (Button) findViewById(R.id.buttonPro);
        textView = (TextView) findViewById(R.id.textViewSmen);
        editText = (EditText) findViewById(R.id.editText);
        buttonCheck.setOnClickListener(this);
        buttonFurther.setOnClickListener(new NewWord());
    }

    @Override
    //проверка на правильность
    public void onClick(View v) {
        String string = editText.getText().toString();
        if (string.equals(letterArr[num])) {
            editText.setTextColor(Color.GREEN);
        } else {
            editText.setTextColor(Color.RED);
        }
    }

    //новое слово
    class NewWord extends AppCompatActivity implements View.OnClickListener {
        @SuppressLint("ResourceAsColor")
        @Override
        public void onClick(View v) {
            editText.setTextColor(R.color.text);
            int newNum = (int) (Math.random() * letterArr.length);
            num = newNum;
            editText.setText("");
            textView.setText(endArr[newNum]);
        }
    }
}
