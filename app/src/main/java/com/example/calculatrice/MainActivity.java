package com.example.calculatrice;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;
import java.util.ArrayList;
import org.mariuszgromada.math.mxparser.*;

public class MainActivity extends AppCompatActivity {
    private Button btn1,btn2,btn3,btn4,btn5,btn6,btn7,btn8,btn9,btn0;
    private Button btnClear,btnEgal,btnPourcentage,btnDiviser,btnMultiply,
    btnAdd,btnSou,btnPO,btnPF,btnPoint;
    private TextView calcul;
    private ImageButton sup;
    private TextView resultat;
    ArrayList<String> historiqueCalcul = new ArrayList<String>();
    ArrayAdapter matching;
    private Object view;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Association des Buttons Numéros
        btn0 =(Button) findViewById(R.id.but0);
        btn1 =(Button) findViewById(R.id.but1);
        btn2 =(Button) findViewById(R.id.but2);
        btn3 =(Button) findViewById(R.id.but3);
        btn4 =(Button) findViewById(R.id.but4);
        btn5 =(Button) findViewById(R.id.but5);
        btn6 =(Button) findViewById(R.id.but6);
        btn7 =(Button) findViewById(R.id.but7);
        btn8 =(Button) findViewById(R.id.but8);
        btn9 =(Button) findViewById(R.id.but9);

        //Association des Buttons Opérateur
        btnClear =(Button) findViewById(R.id.butClear);
        btnPoint =(Button) findViewById(R.id.butPoint);
        btnEgal =(Button) findViewById(R.id.butEgal);
        btnPourcentage =(Button) findViewById(R.id.butPourcentage);
        btnDiviser =(Button) findViewById(R.id.butDivision);
        btnMultiply =(Button) findViewById(R.id.butmultiplication);
        btnSou =(Button) findViewById(R.id.butMoins);
        btnAdd =(Button) findViewById(R.id.butPlus);
        btnPO = (Button) findViewById(R.id.butPO);
        btnPF = (Button) findViewById(R.id.butPF);

        //Association des Champs Texte
        calcul= (TextView)findViewById(R.id.textCalcul);
        resultat= (TextView) findViewById(R.id.textResultat);

        sup=(ImageButton) findViewById(R.id.sup);


        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                CalculExpression("1");
            }
        });
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                CalculExpression("2");
            }
        });
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                CalculExpression("3");
            }
        });
        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                CalculExpression("4");
            }
        });
        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                CalculExpression("5");
            }
        });
        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                CalculExpression("6");
            }
        });
        btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                CalculExpression("7");
            }
        });
        btn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                CalculExpression("8");
            }
        });
        btn9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                CalculExpression("9");
            }
        });
        btn0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                CalculExpression("0");
            }
        });
        btnPoint.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                CalculExpression(".");
            }
        });
        btnPourcentage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                CalculExpression("%");
            }
        });
        btnDiviser.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                CalculExpression("/");
            }
        });
        btnPO.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                CalculExpression("(");
            }
        });
        btnPF.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                CalculExpression(")");
            }
        });
        btnMultiply.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                CalculExpression("*");
            }
        });
        btnSou.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                CalculExpression("-");
            }
        });
        btnAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                CalculExpression("+");
            }
        });
        btnClear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Clear();
            }
        });
        btnEgal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String expression = calcul.getText().toString();

                Expression ligne = new Expression(expression);
                String result = String.valueOf(ligne.calculate());
                    resultat.setText(result);
                }
        });

        resultat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calcul.setText(resultat.getText().toString());
                resultat.setText(" ");
            }
        });

        sup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String expression = calcul.getText().toString();
                calcul.setText(expression-1);
            }
        });



    }

    void CalculExpression(String value){
        String expression = calcul.getText().toString();
        expression = expression + value;
        calcul.setText(expression);
    }

    void Clear(){
        calcul.setText("");
        resultat.setText("0");
    }

}