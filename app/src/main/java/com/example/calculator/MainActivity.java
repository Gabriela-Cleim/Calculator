package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    ImageButton btn_ac, btn_plusmi, btn_porce, btn_divi, btn_seven, btn_eight, btn_nine, btn_multi, btn_four, btn_five, btn_six, btn_sub, btn_one, btn_two,
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
        btn_equals.setOnClickListener(this);


        //resolver o problema de não apagar o zero ao começar a digitar
        btn_ac.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edit_textExp.setText("");
            }
        });

//        btn_equals.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//
//            }
//        });

    }

    public void SetExpre(String s, boolean id) {

        if (id) {
            edit_textExp.append(s);
        }

        String valueOne= "";
        String valueTwo = "";
        String newOp = String.valueOf(edit_textExp.getText());

        if (btn_plus.isPressed()) { //vai rodar isso depois de apertar o + então aqui vai guardar o primeiro valor
            valueTwo = String.valueOf(edit_textExp.getText()); //1 + 1
            //newOp = String.valueOf(edit_textExp.getText());
            //newOp = newOp.replaceAll("[0-9]", "+");
            btn_plus.setImageResource(R.drawable.pluspress);
            System.out.println("1 " + valueTwo);
            edit_textExp.setText(valueTwo + "+");
            //edit_textExp.setText("");

        } else{ //vai rodar isso antes de apertar o + então aqui vai guardar o primeiro valor
            valueOne = String.valueOf(edit_textExp.getText()); //1
            System.out.println("1 " + valueOne);
            //String newOp = String.valueOf(edit_textExp.getText());
            btn_plus.setImageResource(R.drawable.mais);
            //edit_textExp.setText("");
        }

        if (btn_sub.isPressed()) {
            valueTwo = String.valueOf(edit_textExp.getText()); //1 + 1
            newOp = String.valueOf(edit_textExp.getText());
            newOp = newOp.replaceAll("0123456789", "-");
            btn_sub.setImageResource(R.drawable.subpress);
            System.out.println("1 " + valueTwo);
            edit_textExp.setText(valueTwo + "+");
            //edit_textExp.setText("");

        } else {
            valueOne = String.valueOf(edit_textExp.getText()); //1
            System.out.println("1 " + valueOne);
            //String newOp = String.valueOf(edit_textExp.getText());
            //edit_textExp.setText("");
            btn_sub.setImageResource(R.drawable.menos);
        }

        if (btn_multi.isPressed()) {
            //String result = String.valueOf(edit_textExp.getText());
            btn_multi.setImageResource(R.drawable.mulpress);


        } else {
            //String newOp = String.valueOf(edit_textExp.getText());
            btn_multi.setImageResource(R.drawable.vezes);
            System.out.println(newOp);
        }

        if (btn_divi.isPressed()) {
            //String result = String.valueOf(edit_textExp.getText());
            btn_divi.setImageResource(R.drawable.divipress);

        } else {
            //String newOp = String.valueOf(edit_textExp.getText());
            btn_divi.setImageResource(R.drawable.divi);
            System.out.println(newOp);
        }

        if (btn_porce.isPressed()) {
            //String result = String.valueOf(edit_textExp.getText());
            btn_porce.setImageResource(R.drawable.porcepress);

        } else {
            //String newOp = String.valueOf(edit_textExp.getText());
            btn_porce.setImageResource(R.drawable.porce);
            System.out.println(newOp);
        }

        if (btn_dote.isPressed()) {
            //String result = String.valueOf(edit_textExp.getText());

        }



        if (btn_equals.isPressed()) {
            if (valueTwo != null && valueOne != null) {
                valueOne = valueOne.replaceAll("\\+", "");
                valueTwo = valueTwo.replaceAll("\\+", "");

                System.out.println("entrou");
                String newResultPlus = String.valueOf(Integer.parseInt(valueOne) + Integer.parseInt(valueTwo));
                        edit_textExp.setText(newResultPlus);
                        System.out.println("foi");


//                switch (s){
//                    case "+":
//                        String newResultPlus = String.valueOf(Integer.parseInt(valueOne) + Integer.parseInt(valueOne));
//                        edit_textExp.setText(newResultPlus);
//                        System.out.println("foi");
//                        break;
//
//                    case "-":
//                        String newResultMinus = String.valueOf(Integer.parseInt(valueOne) - Integer.parseInt(valueOne));
//                        edit_textExp.setText(newResultMinus);
//                        System.out.println("foi");
//                        break;
//
//                    default:
//                        System.out.println("Entrou no switch");
//                }
//                String newResult = String.valueOf(Integer.parseInt(valueOne) + Integer.parseInt(valueOne));
//                edit_textExp.setText(newResult);

            } else {
                System.out.println("bosta");
            }
        }





    }

    //logica do botão equals
//    public void equals(){
//        String valueOne = String.valueOf(edit_textExp.getText());
//        String valueTwo = String.valueOf(edit_textExp.getText());
//        if(btn_equals.isPressed()){
//            if(valueOne.contains("+") || valueTwo.contains("+")){
//                valueOne = valueOne.replaceAll("\\+", "");
//                valueTwo = valueTwo.replaceAll("\\+", "");
//                String newResult = String.valueOf(Integer.parseInt(valueOne) + Integer.parseInt(valueTwo));
//                edit_textExp.setText(newResult);
//                System.out.println("foi");
//            }else{
//                System.out.println("bosta");
//            }
//        }
//    }

    //aqui esta todos os ids
    private void FindIds() {
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
            SetExpre(".", false);
        } else if (id == R.id.btn_multi) {
            SetExpre("*", false);
        } else if (id == R.id.btn_plus) {
            SetExpre("+", false);
        } else if (id == R.id.btn_dive) {
            SetExpre("/", false);
        } else if (id == R.id.btn_porce) {
            SetExpre("%", false);
        } else if (id == R.id.btn_sub) {
            SetExpre("-", false);
        } else if (id == R.id.btn_equals) {
            SetExpre("", false);
        }


    }
}