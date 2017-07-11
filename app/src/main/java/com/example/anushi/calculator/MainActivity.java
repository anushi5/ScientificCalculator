package com.example.anushi.calculator;

import android.content.Intent;
import android.renderscript.Double2;
import android.speech.tts.TextToSpeech;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Locale;



public class MainActivity extends AppCompatActivity implements TextToSpeech.OnInitListener {

    EditText et1,et2;
    Button btn1,btn2,btn3,btn4,btn5,btn6,btn7,btn8,btn9,btndot;
    Button bt0,bt1,bt2,bt3,bt4,bt5,bt6,bt7,bt8,bt9;
    Double firstnum;
    Double secondnum;
    int x;
    boolean add,div,mul,sub,sqrt,cube;
    private int MY_DATA_CHECK_CODE=0;
    private TextToSpeech myTTS;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        et1=(EditText)findViewById(R.id.et1);
        bt0=(Button)findViewById(R.id.bt0);
        bt0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                et1.setText(et1.getText()+"0");
                String words="0";
                speakWords(words);
            }
        });

        bt1=(Button)findViewById(R.id.bt1);
        bt1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                et1.setText(et1.getText()+"1");
                String words="1";
                speakWords(words);
            }
        });

        bt2=(Button)findViewById(R.id.bt2);
        bt2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                et1.setText(et1.getText()+"2");
                String words="2";
                speakWords(words);
            }
        });

        bt3=(Button)findViewById(R.id.bt3);
        bt3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                et1.setText(et1.getText()+"3");
                String words="3";
                speakWords(words);
            }
        });

        bt4=(Button)findViewById(R.id.bt4);
        bt4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                et1.setText(et1.getText()+"4");
                String words="4";
                speakWords(words);
            }
        });

        bt5=(Button)findViewById(R.id.bt5);
        bt5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                et1.setText(et1.getText()+"5");
                String words="5";
                speakWords(words);
            }
        });

        bt6=(Button)findViewById(R.id.bt6);
        bt6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                et1.setText(et1.getText()+"6");
                String words="6";
                speakWords(words);
            }
        });

        bt7=(Button)findViewById(R.id.bt7);
        bt7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                et1.setText(et1.getText()+"7");
                String words="7";
                speakWords(words);
            }
        });

        bt8=(Button)findViewById(R.id.bt8);
        bt8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                et1.setText(et1.getText()+"8");
                String words="8";
                speakWords(words);
            }
        });

        bt9=(Button)findViewById(R.id.bt9);
        bt9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                et1.setText(et1.getText()+"9");
                String words="9";
                speakWords(words);
            }
        });

        btn5=(Button)findViewById(R.id.btn5);
        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                firstnum=Double.parseDouble(et1.getText()+ "");
                add=true;
                String words="Plus";
                speakWords(words);
                et1.setText(null);
            }
        });

        btn6=(Button)findViewById(R.id.btn6);
        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String words="subtract";
                speakWords(words);
                firstnum=Double.parseDouble(et1.getText()+"");
                sub=true;
                et1.setText(null);
            }
        });

        btn7=(Button)findViewById(R.id.btn7);
        btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String words="multiply";
                speakWords(words);
                firstnum=Double.parseDouble(et1.getText()+"");
                mul=true;
                et1.setText(null);
            }
        });

        btn8=(Button)findViewById(R.id.btn8);
        btn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String words="divide";
                speakWords(words);
                firstnum=Double.parseDouble(et1.getText()+"");
                div=true;
                et1.setText(null);

            }
        });

        btndot=(Button)findViewById(R.id.btndot);
        btndot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String words="dot";
                speakWords(words);
                et1.setText(et1.getText()+".");
            }
        });

        btn4=(Button)findViewById(R.id.btn4);
        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String words="clear";
                speakWords(words);
                et1.setText(null);
            }
        });
        btn1=(Button)findViewById(R.id.btn1);
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String words="Delete";
                speakWords(words);
                firstnum=Double.parseDouble(et1.getText()+"");
                String text=et1.getText().toString();
                et1.setText(text.substring(0,text.length()-1));
            }
        });
        btn2=(Button)findViewById(R.id.btn2);
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String words="Square root";
                speakWords(words);
                firstnum=Double.parseDouble(et1.getText()+" ");
                sqrt=true;
                et1.setText("sqrt("+et1.getText()+")");
            }
        });

        btn3=(Button)findViewById(R.id.btn3);
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String words="cube";
                speakWords(words);
                firstnum=Double.parseDouble(et1.getText()+"");
                cube=true;
                et1.setText(et1.getText()+"^3");
            }
        });

        btn9=(Button)findViewById(R.id.btn9);
        btn9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String words="Equals to";
                speakWords(words);

                if(sqrt==true)
                {
                    et1.setText((Double) Math.sqrt(firstnum)+"");
                    String result= removeTrailingZero(et1.getText().toString());
                    speakWords(result);
                    sqrt=false;
                }
                else if(cube==true)
                {
                    et1.setText(firstnum*firstnum*firstnum+"");
                    String result=removeTrailingZero(et1.getText().toString());
                    speakWords(result);
                    cube=false;
                }

                secondnum=Double.parseDouble(et1.getText()+"");

                if(add==true)
                {
                    et1.setText(firstnum+secondnum+"");
                    String result=removeTrailingZero(et1.getText().toString());
                    speakWords(result);
                    add=false;
                }
                else if(sub==true)
                {
                   // et1.setText(firstnum+"-"+secondnum);
                    et1.setText(firstnum-secondnum+"");
                    String result=removeTrailingZero(et1.getText().toString());
                    speakWords(result);
                    sub=false;
                }
                else if(mul==true)
                {
                    //et1.setText(firstnum+"*"+secondnum);
                    et1.setText(firstnum*secondnum+"");
                    String result=removeTrailingZero(et1.getText().toString());
                    speakWords(result);
                    mul=false;
                }
                else if(div==true)
                {
                    //et1.setText(firstnum+"/"+secondnum);
                    et1.setText(firstnum/secondnum+"");
                    String result=removeTrailingZero(et1.getText().toString());
                    speakWords(result);
                    div=false;
                }
            }
        });

        Intent checkTTSIntent = new Intent();
        checkTTSIntent.setAction(TextToSpeech.Engine.ACTION_CHECK_TTS_DATA);
        startActivityForResult(checkTTSIntent, MY_DATA_CHECK_CODE);


    }

    public boolean onCreateOptionsMenu(Menu menu) {

        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.main_menu, menu);
        return true;
    }

    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.sci:
                startActivity(new Intent(MainActivity.this, Scientific2.class));
                return true;
            case R.id.hist:
                startActivity(new Intent(MainActivity.this, About.class));
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }

    }


    private void speakWords(String speech) {

        myTTS.speak(speech, TextToSpeech.QUEUE_FLUSH, null);
     }

    private String removeTrailingZero(String formattingInput){
        if(!formattingInput.contains(".")){
            return formattingInput;
        }
        int dotPosition = formattingInput.indexOf(".");
        String newValue = formattingInput.substring(dotPosition, formattingInput.length());
        if(newValue.equals(".0")){
            return formattingInput.substring(0, dotPosition);
        }
        return formattingInput;
    }

      protected void onActivityResult(int requestCode, int resultCode, Intent data) {

        if (requestCode == MY_DATA_CHECK_CODE) {
            if (resultCode == TextToSpeech.Engine.CHECK_VOICE_DATA_PASS)
                myTTS = new TextToSpeech(this, this);
            }
            else {
                Intent installTTSIntent = new Intent();
                installTTSIntent.setAction(TextToSpeech.Engine.ACTION_INSTALL_TTS_DATA);
                startActivity(installTTSIntent);
            }
        }
    public void onInit(int initStatus) {

        if (initStatus == TextToSpeech.SUCCESS) {
            if(myTTS.isLanguageAvailable(Locale.US)==TextToSpeech.LANG_AVAILABLE)
                myTTS.setLanguage(Locale.US);
        }
        else if (initStatus == TextToSpeech.ERROR) {
            Toast.makeText(this, "Sorry! Text To Speech failed...", Toast.LENGTH_LONG).show();
        }
    }

}
