package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    ImageButton btn_ac,btn_plusmi,btn_porce,btn_divi,btn_seven, btn_eight, btn_nine, btn_multi, btn_four, btn_five, btn_six, btn_sub, btn_one, btn_two,
            btn_tree, btn_plus, btn_zero, btn_dote, btn_equals;
    EditText edit_textExp;
    RecyclerView recyView;

    LinearLayout linearLayout;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        FindIds();

        btn_zero.setOnClickListener(this);
        btn_one.setOnClickListener(this);
        btn_two.setOnClickListener(this);
        btn_tree.setOnClickListener(this);
        btn_four.setOnClickListener(this);
        btn_five.setOnClickListener(this);
        btn_six.setOnClickListener(this);
        btn_seven.setOnClickListener(this);
        btn_eight.setOnClickListener(this);
        btn_nine.setOnClickListener(this);
        btn_plusmi.setOnClickListener(this);
        btn_porce.setOnClickListener(this);
        btn_divi.setOnClickListener(this);
        btn_multi.setOnClickListener(this);
        btn_sub.setOnClickListener(this);
        btn_plus.setOnClickListener(this);

        btn_dote.setOnClickListener(this);

        //resolver o problema de não apagar o zero ao começar a digitar
        btn_ac.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edit_textExp.setText("0");
            }
        });

        btn_equals.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


            }
        });

    }

    public void SetExpre(String string, boolean id){

        if(id){
            edit_textExp.append(string);
        }
    }

    //aqui esta todos os ids
    private void FindIds(){
        linearLayout = findViewById(R.id.linearLayout);
        btn_ac = findViewById(R.id.btn_ac);
        btn_plusmi = findViewById(R.id.btn_plusmi);
        btn_porce = findViewById(R.id.btn_porce);
        btn_divi = findViewById(R.id.btn_dive);
        btn_seven = findViewById(R.id.btn_seven);
        btn_eight = findViewById(R.id.btn_eight);
        btn_nine = findViewById(R.id.btn_nine);
        btn_multi = findViewById(R.id.btn_multi);
        btn_four = findViewById(R.id.btn_four);
        btn_five = findViewById(R.id.btn_five);
        btn_six = findViewById(R.id.btn_six);
        btn_sub = findViewById(R.id.btn_sub);
        btn_one = findViewById(R.id.btn_one);
        btn_two = findViewById(R.id.btn_two);
        btn_tree = findViewById(R.id.btn_tree);
        btn_plus = findViewById(R.id.btn_plus);
        btn_zero = findViewById(R.id.btn_zero);
        btn_dote = findViewById(R.id.btn_dote);
        btn_equals = findViewById(R.id.btn_equals);
        edit_textExp = findViewById(R.id.edit_textExp);
        recyView = findViewById(R.id.recyView);

    }


    //aqui estou definindo o que vai ser digitado ao clicar nos botoes
    @Override
    public void onClick(View view) {

        int id = view.getId();
        if (id == R.id.btn_zero) {
            SetExpre("0", true);
        } else if (id == R.id.btn_one) {
            SetExpre("1", true);
        } else if (id == R.id.btn_two) {
            SetExpre("2", true);
        } else if (id == R.id.btn_tree) {
            SetExpre("3", true);
        } else if (id == R.id.btn_four) {
            SetExpre("4", true);
        } else if (id == R.id.btn_five) {
            SetExpre("5", true);
        } else if (id == R.id.btn_six) {
            SetExpre("6", true);
        } else if (id == R.id.btn_seven) {
            SetExpre("7", true);
        } else if (id == R.id.btn_eight) {
            SetExpre("8", true);
        } else if (id == R.id.btn_nine) {
            SetExpre("9", true);
        } else if (id == R.id.btn_dote) {
            SetExpre("0", true);
        } else if (id == R.id.btn_multi) {
            SetExpre("*", true);
        } else if (id == R.id.btn_plus) {
            SetExpre("+", true);
        } else if (id == R.id.btn_dive) {
            SetExpre("/", true);
        } else if (id == R.id.btn_porce) {
            SetExpre("%", true);
        } else if (id == R.id.btn_sub) {
            SetExpre("-", true);
        }



    }
}