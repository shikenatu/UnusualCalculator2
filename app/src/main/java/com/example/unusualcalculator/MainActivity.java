package com.example.unusualcalculator;

import android.content.res.ColorStateList;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private Button btn1;
    private Button btn2;
    private Button btn3;
    private Button btn4;
    private Button btn5;
    private Button btn6;
    private Button btn7;
    private Button btn8;
    private Button btn9;
    private Button btn0;
    private Button btnplus;
    private Button btnmin;
    private Button btnkakeru;
    private Button btnwaru;
    private Button btnequal;
    private Button btnClear;
    private TextView calctext;
    private TextView calctext2;

    private int calcphase = 0;
    private StringBuilder sb;
    private StringBuilder sb2;
    private int calc1;
    private int calc2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        btn1 = findViewById(R.id.btn1);
        btn1.setOnClickListener(this);
        btn2 = findViewById(R.id.btn2);
        btn2.setOnClickListener(this);
        btn3 = findViewById(R.id.btn3);
        btn3.setOnClickListener(this);
        btn4 = findViewById(R.id.btn4);
        btn4.setOnClickListener(this);
        btn5 = findViewById(R.id.btn5);
        btn5.setOnClickListener(this);
        btn6 = findViewById(R.id.btn6);
        btn6.setOnClickListener(this);
        btn7 = findViewById(R.id.btn7);
        btn7.setOnClickListener(this);
        btn8 = findViewById(R.id.btn8);
        btn8.setOnClickListener(this);
        btn9 = findViewById(R.id.btn9);
        btn9.setOnClickListener(this);
        btn0 = findViewById(R.id.btn0);
        btn0.setOnClickListener(this);
        btnplus = findViewById(R.id.btnpuls);
        btnplus.setOnClickListener(this);
        btnmin = findViewById(R.id.btnmin);
        btnmin.setOnClickListener(this);
        btnkakeru = findViewById(R.id.btnkakeru);
        btnkakeru.setOnClickListener(this);
        btnwaru = findViewById(R.id.btnwaru);
        btnwaru.setOnClickListener(this);
        btnequal = findViewById(R.id.btnequal);
        btnequal.setOnClickListener(this);
        btnClear = findViewById(R.id.btnClear);
        btnClear.setOnClickListener(this);

        sb = new StringBuilder();
        sb2 = new StringBuilder();
        calctext = findViewById(R.id.calctext);
        calctext2 = findViewById(R.id.calctext2);

    }
    private void btncolorback(){
        btn1.setBackgroundColor(Color.rgb(68,68,68));
        btn2.setBackgroundColor(Color.rgb(68,68,68));
        btn3.setBackgroundColor(Color.rgb(68,68,68));
        btn4.setBackgroundColor(Color.rgb(68,68,68));
        btn5.setBackgroundColor(Color.rgb(68,68,68));
        btn6.setBackgroundColor(Color.rgb(68,68,68));
        btn7.setBackgroundColor(Color.rgb(68,68,68));
        btn8.setBackgroundColor(Color.rgb(68,68,68));
        btn9.setBackgroundColor(Color.rgb(68,68,68));
        btn0.setBackgroundColor(Color.rgb(68,68,68));
        btnplus.setBackgroundColor(Color.rgb(68,68,68));


    }


    @Override
    public void onClick(View view){
        if(view.getId() == R.id.btn1){//1のボタンを押したときのもの
            if (sb.length()<10){
                sb.append("1");
                btn1.setBackgroundColor(Color.rgb(200,200,200));
                calctext.setText(sb);
            }
        }
        else if(view.getId() == R.id.btn2){
            if (sb.length()<10){
                sb.append("2");
                btn2.setBackgroundColor(Color.rgb(200,200,200));
                calctext.setText(sb);
            }
        }
        else if(view.getId() == R.id.btn3){
            if (sb.length()<10){
                sb.append("3");
                btn3.setBackgroundColor(Color.rgb(200,200,200));
                calctext.setText(sb);
            }
        }
        else if(view.getId() == R.id.btn4){
            if (sb.length()<10){
                sb.append("4");
                btn4.setBackgroundColor(Color.rgb(200,200,200));
                calctext.setText(sb);
            }
        }
        else if(view.getId() == R.id.btn5){
            if (sb.length()<10){
                sb.append("5");
                btn5.setBackgroundColor(Color.rgb(200,200,200));
                calctext.setText(sb);
            }
        }
        else if(view.getId() == R.id.btn6){
            if (sb.length()<10){
                sb.append("6");
                btn6.setBackgroundColor(Color.rgb(200,200,200));
                calctext.setText(sb);
            }
        }
        else if(view.getId() == R.id.btn7){
            if (sb.length()<10){
                sb.append("7");
                btn7.setBackgroundColor(Color.rgb(200,200,200));
                calctext.setText(sb);
            }
        }
        else if(view.getId() == R.id.btn8){
            if (sb.length()<10){
                sb.append("8");
                btn8.setBackgroundColor(Color.rgb(200,200,200));
                calctext.setText(sb);
            }
        }
        else if(view.getId() == R.id.btn9){
            if (sb.length()<10){
                sb.append("2");
                btn9.setBackgroundColor(Color.rgb(200,200,200));
                calctext.setText(sb);
            }
        }

        else if(view.getId() == R.id.btnpuls){//足し算の＋

            btnplus.setBackgroundColor(Color.rgb(200,200,200));
            calcphase = 1;

            String text = calctext.getText().toString();
            if(!text.equals("")){
                calc2 = Integer.parseInt(text);//文字列textを数列に変換
            }

            calc1 += calc2;
            calc2 = 0;

            sb2.append(text);
            sb.delete(0,sb.length());

            calctext.setText(String.valueOf(calc1));

        }
        if(view.getId() == R.id.btnClear){
            sb.delete(0,sb.length());

            calctext.setText(sb);
            calc1 = 0;
            calcphase = 0;
            btncolorback();

        }else if(view.getId() == R.id.btnequal){

            btncolorback();
        }

    }


}


