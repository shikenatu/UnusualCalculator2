package com.example.test_1;

import android.os.Bundle;
import android.widget.TextView;
import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import android.view.View;


public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    int n = 0;
    int calcCount = 0;
    int[] calc = new int[30];
    int[] calcResult = new int[30];
    int result; //入力した数字をちゃんとした数字にする

    int reru = 0, ru;
    String enzan;

    subActivity Enzan = new subActivity();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        findViewById(R.id.button).setOnClickListener(this);
        findViewById(R.id.button2).setOnClickListener(this);
        findViewById(R.id.button3).setOnClickListener(this);
        findViewById(R.id.button4).setOnClickListener(this);
        findViewById(R.id.button5).setOnClickListener(this);
        findViewById(R.id.button6).setOnClickListener(this);
        findViewById(R.id.button7).setOnClickListener(this);
        findViewById(R.id.button8).setOnClickListener(this);
        findViewById(R.id.button9).setOnClickListener(this);
        findViewById(R.id.button0).setOnClickListener(this);
        findViewById(R.id.button_plus).setOnClickListener(this);
        findViewById(R.id.button_waru).setOnClickListener(this);
        findViewById(R.id.button_min).setOnClickListener(this);
        findViewById(R.id.button_kakeru).setOnClickListener(this);
        findViewById(R.id.button_equal).setOnClickListener(this::onBtnAnswer);

    }//ボタンを定義する
    public void onClick(View view) {
        TextView Txtsuuji = findViewById(R.id.textview_1);
        String currentText = Txtsuuji.getText().toString();

        if (view.getId() == R.id.button) {
            String newText = currentText + "1";
            Txtsuuji.setText(newText);
            calc[n] = 1;
            n += 1;
        } else if (view.getId() == R.id.button2) {
            String newText = currentText + "2";
            Txtsuuji.setText(newText);
            calc[n] = 2;
            n += 1;
        } else if (view.getId() == R.id.button3) {
            String newText = currentText + "3";
            Txtsuuji.setText(newText);
            calc[n] = 3;
            n += 1;
        } else if (view.getId() == R.id.button4) {
            String newText = currentText + "4";
            Txtsuuji.setText(newText);
            calc[n] = 4;
            n += 1;
        }else if (view.getId() == R.id.button5) {
            String newText = currentText + "5";
            Txtsuuji.setText(newText);
            calc[n] = 5;
            n += 1;
        }else if (view.getId() == R.id.button6) {
            String newText = currentText + "6";
            Txtsuuji.setText(newText);
            calc[n] = 6;
            n += 1;
        }else if (view.getId() == R.id.button7) {
            String newText = currentText + "7";
            Txtsuuji.setText(newText);
            calc[n] = 7;
            n += 1;
        }else if (view.getId() == R.id.button8) {
            String newText = currentText + "8";
            Txtsuuji.setText(newText);
            calc[n] = 8;
            n += 1;
        }else if (view.getId() == R.id.button9) {
            String newText = currentText + "9";
            Txtsuuji.setText(newText);
            calc[n] = 9;
            n += 1;
        }else if (view.getId() == R.id.button0) {
            String newText = currentText + "0";
            Txtsuuji.setText(newText);
            calc[n] = 0;
            n += 1;
        }
    }//0~9をtextview_1に出す処理
    public void onBtnCalc(View view){
        TextView Txtsuuji = findViewById(R.id.textview_1);
        String currentText = Txtsuuji.getText().toString();

        if (view.getId() == R.id.button_waru) {
            String newText = currentText + "÷";
            Txtsuuji.setText(newText);
            enzan = "/";

        }else if (view.getId() == R.id.button_plus) {
            String newText = currentText + "＋";
            Txtsuuji.setText(newText);
            enzan = "+";
        }else if (view.getId() == R.id.button_min) {
            String newText = currentText + "－";
            Txtsuuji.setText(newText);
            enzan = "-";
        }else if (view.getId() == R.id.button_kakeru) {
            String newText = currentText + "✕";
            Txtsuuji.setText(newText);
            enzan = "*";
        }

    }//演算子を出す処理
    public void onBtnClear(View view){
        TextView Txtsuuji = findViewById(R.id.textview_1);
        Txtsuuji.setText("");
        for(int de = calc.length-1;de>=0;de--){
            calc[de]=0;
            calcResult[de] = 0;
        }
        n = 0;
        calcCount = 0;

    }//処理をすべて消す
    public void onBtnAnswer(View view){
        result = keisan.getKeisan(calc,n,calcResult,calcCount);
        TextView Answer = findViewById(R.id.textView_kotae);
        Answer.setText(String.valueOf(result));
  }// = を押したときの処理

}
class keisan{
    static int getKeisan(int[] calc,int n,int[] calcResult,int calcCount){
       int i = 0;
       int j = 1;

        while(j < n){
            int exponent = j; // 累乗する指数を設定
            double result = Math.pow(10, exponent);
            i = (int) (i + calc[n-1-j] * result);
            j++;
        }
        i += calc[n-1];

        calcResult[calcCount ] = i;
        calcCount +=1;
        return i  ; //resultに返る
    }//入力した数を数列にする処理
}