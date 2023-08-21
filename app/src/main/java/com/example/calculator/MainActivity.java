package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.graphics.drawable.Drawable;
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
        //SetAction();

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
                edit_textExp.setText(" ");
            }
        });

        btn_equals.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


            }
        });

    }

//    public void SetAction(){
//        btn_plus.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                String result = String.valueOf(edit_textExp.getText());
//                btn_plus.setBackgroundColor(getColor(R.color.back3));
//                System.out.println(result);
//            }
//        });
//
//        btn_sub.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                String result1 = String.valueOf(edit_textExp.getText());
//                btn_plus.setBackgroundColor(getColor(R.color.back3));
//                System.out.println(result1);
//            }
//        });
//    }

    public void SetExpre(String string, boolean id, char op){

        if(id){
            edit_textExp.append(string);
        }

        if(btn_plus.isPressed()){
            String result = String.valueOf(edit_textExp.getText());
            btn_plus.setImageResource(R.drawable.pluspress);
            System.out.println(result);
            edit_textExp.setText(result + "+");

        }else{
            String newOp = String.valueOf(edit_textExp.getText());
            btn_plus.setImageResource(R.drawable.mais);
            System.out.println(newOp);
        }


        if (btn_sub.isPressed()) {
            String result = String.valueOf(edit_textExp.getText());
            btn_sub.setImageResource(R.drawable.subpress);
            System.out.println(result);
            edit_textExp.setText(result + "-");

        }else{
            String newOp = String.valueOf(edit_textExp.getText());
            btn_sub.setImageResource(R.drawable.menos);
            System.out.println(newOp);
        }


        if (btn_multi.isPressed()) {
            String result = String.valueOf(edit_textExp.getText());
            btn_multi.setImageResource(R.drawable.mulpress);
            System.out.println(result);
            edit_textExp.setText(result + "*");

        }else{
            String newOp = String.valueOf(edit_textExp.getText());
            btn_multi.setImageResource(R.drawable.vezes);
            System.out.println(newOp);
        }

        if (btn_divi.isPressed()) {
            String result = String.valueOf(edit_textExp.getText());
            btn_divi.setImageResource(R.drawable.divipress);
            System.out.println(result);
            edit_textExp.setText(result + "/");
        }else{
            String newOp = String.valueOf(edit_textExp.getText());
            btn_divi.setImageResource(R.drawable.divi);
            System.out.println(newOp);
        }

        if (btn_porce.isPressed()) {
            String result = String.valueOf(edit_textExp.getText());
            btn_porce.setImageResource(R.drawable.porcepress);
            System.out.println(result);
            edit_textExp.setText(result + "%");
        }else{
            String newOp = String.valueOf(edit_textExp.getText());
            btn_porce.setImageResource(R.drawable.porce);
            System.out.println(newOp);
        }

        if (btn_dote.isPressed()) {
            String result = String.valueOf(edit_textExp.getText());
            //btn_dote.setImageResource(R.drawable.dotepress);
            System.out.println(result);
            edit_textExp.setText(result + ".");
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
            SetExpre("0", true, '0');
        } else if (id == R.id.btn_one) {
            SetExpre("1", true, '1');
        } else if (id == R.id.btn_two) {
            SetExpre("2", true, '2');
        } else if (id == R.id.btn_tree) {
            SetExpre("3", true, '3');
        } else if (id == R.id.btn_four) {
            SetExpre("4", true, '4');
        } else if (id == R.id.btn_five) {
            SetExpre("5", true, '5');
        } else if (id == R.id.btn_six) {
            SetExpre("6", true, '6');
        } else if (id == R.id.btn_seven) {
            SetExpre("7", true, '7');
        } else if (id == R.id.btn_eight) {
            SetExpre("8", true,'8');
        } else if (id == R.id.btn_nine) {
            SetExpre("9", true, '9');
        } else if (id == R.id.btn_dote) {
            SetExpre(".", false, '.');
        } else if (id == R.id.btn_multi) {
            SetExpre("*", false, '*');
        } else if (id == R.id.btn_plus) {
            SetExpre("+", false,'+');
        } else if (id == R.id.btn_dive) {
            SetExpre("/", false,'/');
        } else if (id == R.id.btn_porce) {
            SetExpre("%", false,'%');
        } else if (id == R.id.btn_sub) {
            SetExpre("-", false, '-');
        }




    }
}