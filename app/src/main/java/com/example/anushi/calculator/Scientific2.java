package com.example.anushi.calculator;

import android.content.Intent;
import android.speech.tts.TextToSpeech;
import android.speech.tts.TextToSpeech.OnInitListener;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.text.DecimalFormat;
import java.util.Locale;

import static android.widget.Toast.makeText;
import static com.example.anushi.calculator.R.id.blcm;

public class Scientific2 extends AppCompatActivity implements OnInitListener {

    EditText et2;
    Button bdel,bpower,bsqrt,bclear,bsin,bexp,bpi;
    Button bcos,b7,b8,b9,bdiv,btan,b4,b5,b6,bmul,bln,b1,b2,b3,bsub,blog,b0,badd;
    Button bdot,bequals,blcm,bhcf,bmod,bfact,bc,bp;
    Double firstnum,secondnum;
    boolean sub,div,add,mul,sqrt,power,sin,cos,tan,logo,ln,expo,bblcm,bbhcf,bbpi,mod,fact,comb,per;
    private int MY_DATA_CHECK_CODE=0;
    private TextToSpeech myTTS;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_scientific2);


        final DecimalFormat f=new DecimalFormat("##.0000");
        et2=(EditText)findViewById(R.id.et2);

        b0=(Button)findViewById(R.id.b0);
        b0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                et2.setText(et2.getText()+"0");
                String words="0";
                speakWords(words);
            }
        });

        b1=(Button)findViewById(R.id.b1);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                et2.setText(et2.getText()+"1");
                String words="1";
                speakWords(words);
            }
        });

        b2=(Button)findViewById(R.id.b2);
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                et2.setText(et2.getText()+"2");
                String words="2";
                speakWords(words);
            }
        });

        b3=(Button)findViewById(R.id.b3);
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                et2.setText(et2.getText()+"3");
                String words="3";
                speakWords(words);
            }
        });

        b4=(Button)findViewById(R.id.b4);
        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                et2.setText(et2.getText()+"4");
                String words="4";
                speakWords(words);
            }
        });

        b5=(Button)findViewById(R.id.b5);
        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                et2.setText(et2.getText()+"5");
                String words="5";
                speakWords(words);
            }
        });

        b6=(Button)findViewById(R.id.b6);
        b6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                et2.setText(et2.getText()+"6");
                String words="6";
                speakWords(words);
            }
        });

        b7=(Button)findViewById(R.id.b7);
        b7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                et2.setText(et2.getText()+"7");
                String words="7";
                speakWords(words);
            }
        });

        b8=(Button)findViewById(R.id.b8);
        b8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                et2.setText(et2.getText()+"8");
                String words="8";
                speakWords(words);
            }
        });

        b9=(Button)findViewById(R.id.b9);
        b9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                et2.setText(et2.getText()+"9");
                String words="9";
                speakWords(words);
            }
        });


        badd=(Button)findViewById(R.id.badd);
        badd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                firstnum=Double.parseDouble(et2.getText()+ "");
                add=true;
                String words="Plus";
                speakWords(words);
                et2.setText(null);
            }
        });

        bsub=(Button)findViewById(R.id.bsub);
        bsub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String words="subtract";
                speakWords(words);
                firstnum=Double.parseDouble(et2.getText()+"");
                sub=true;
                et2.setText(null);
            }
        });

        bmul=(Button)findViewById(R.id.bmul);
        bmul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String words="multiply";
                speakWords(words);
                firstnum=Double.parseDouble(et2.getText()+"");
                mul=true;
                et2.setText(null);
            }
        });

        bdiv=(Button)findViewById(R.id.bdiv);
        bdiv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String words="divide";
                speakWords(words);
                firstnum=Double.parseDouble(et2.getText()+"");
                div=true;
                et2.setText(null);

            }
        });

        bdot=(Button)findViewById(R.id.bdot);
        bdot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String words="dot";
                speakWords(words);
                et2.setText(et2.getText()+".");
            }
        });

        bclear=(Button)findViewById(R.id.bclear);
        bclear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String words="clear";
                speakWords(words);
                et2.setText(null);
            }
        });
        bdel=(Button)findViewById(R.id.bdel);
        bdel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String words="Delete";
                speakWords(words);
                firstnum=Double.parseDouble(et2.getText()+"");
                String text=et2.getText().toString();
                et2.setText(text.substring(0,text.length()-1));
            }
        });
        bsqrt=(Button)findViewById(R.id.bsqrt);
        bsqrt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String words="Square root";
                speakWords(words);
                firstnum=Double.parseDouble(et2.getText()+" ");
                sqrt=true;
                et2.setText(null);
            }
        });

        bpower=(Button)findViewById(R.id.bpower);
        bpower.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String words="raised to power";
                speakWords(words);
                firstnum=Double.parseDouble(et2.getText()+"");
                power=true;
                et2.setText(null);
            }
        });

        bsin=(Button)findViewById(R.id.bsin);
        bsin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String words="sine";
                speakWords(words);
                firstnum=Double.parseDouble(et2.getText()+"");
                sin=true;
                et2.setText(null);
            }
        });

        bcos=(Button)findViewById(R.id.bcos);
        bcos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String words="cosine";
                speakWords(words);
                firstnum=Double.parseDouble(et2.getText()+"");
                cos=true;
                et2.setText(null);
            }
        });

        btan=(Button)findViewById(R.id.btan);
        btan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String words="tangent";
                speakWords(words);
                firstnum=Double.parseDouble(et2.getText()+"");
                tan=true;
                et2.setText(null);
            }
        });

        blog=(Button)findViewById(R.id.blog);
        blog.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String words="base 10 logarithm ";
                speakWords(words);
                firstnum=Double.parseDouble(et2.getText()+"");
                logo=true;
                et2.setText(null);
            }
        });

        bln=(Button)findViewById(R.id.bln);
        bln.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String words="natural logarithm";
                speakWords(words);
                firstnum=Double.parseDouble(et2.getText()+"");
                ln=true;
                et2.setText(null);
            }
        });

        bexp=(Button)findViewById(R.id.bexp);
        bexp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String words="exponent";
                speakWords(words);
                firstnum=Double.parseDouble(et2.getText()+"");
                expo=true;
                et2.setText(null);
            }
        });

        blcm=(Button)findViewById(R.id.blcm);
        blcm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String words="Lcm with";
                speakWords(words);
                firstnum=Double.parseDouble(et2.getText()+"");
                bblcm=true;
                et2.setText(null);
            }
        });

        bhcf=(Button)findViewById(R.id.bhcf);
        bhcf.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String words="hcf with";
                speakWords(words);
                firstnum=Double.parseDouble(et2.getText()+"");
                bbhcf=true;
                et2.setText(null);
            }
        });

        bpi=(Button)findViewById(R.id.bpi);
        bpi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String words="pi";
                speakWords(words);
                firstnum=Double.parseDouble(et2.getText()+"");
                bbpi=true;
                et2.setText(null);
            }
        });

        bmod=(Button)findViewById(R.id.bmod);
        bmod.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String words="mode";
                speakWords(words);
                firstnum=Double.parseDouble(et2.getText()+"");
                mod=true;
                et2.setText(null);
            }
        });

        bfact=(Button)findViewById(R.id.bfact);
        bfact.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String words="factorial";
                speakWords(words);
                firstnum=Double.parseDouble(et2.getText()+"");
                fact=true;
                et2.setText(null);
            }
        });

        bc=(Button)findViewById(R.id.bc);
        bc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String words= "combinations";
                speakWords(words);
                firstnum=Double.parseDouble(et2.getText()+"");
                comb=true;
                et2.setText(null);
            }
        });

        bp=(Button)findViewById(R.id.bp);
        bp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String words="permutation";
                speakWords(words);
                firstnum=Double.parseDouble(et2.getText()+"");
                per=true;
                et2.setText(null);
            }
        });

        if(bhcf.isPressed()) {
            String check=et2.getText().toString();
            if(TextUtils.isEmpty(check))
                Toast.makeText(Scientific2.this, "enter number", Toast.LENGTH_LONG).show();
        }

        bequals=(Button)findViewById(R.id.bequal);
        bequals.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                    if (sqrt == true) {
                        et2.setText((Double) Math.sqrt(firstnum) + "");
                        String result = removeTrailingZero(et2.getText().toString());
                        speakWords(result);
                        sqrt = false;
                    }
                    else if (sin == true) {
                        et2.setText((Double) Math.sin(firstnum) + "");
                        String result = removeTrailingZero(et2.getText().toString());
                        speakWords(result);
                        sin = false;
                    }
                    else if (cos == true) {
                        et2.setText((Double) Math.cos(firstnum) + "");
                        String result = removeTrailingZero(et2.getText().toString());
                        speakWords(result);
                        cos = false;
                    }
                    else if (tan == true) {
                        et2.setText((Double) Math.tan(firstnum) + "");
                        String result = removeTrailingZero(et2.getText().toString());
                        speakWords(result);
                        tan = false;
                    }
                    else if (logo == true) {
                        et2.setText((Double) Math.log10(firstnum) + "");
                        String result = removeTrailingZero(et2.getText().toString());
                        speakWords(result);
                        logo = false;
                    }
                    else if (ln == true) {
                        et2.setText((Double) Math.log(firstnum) + "");
                        String result = removeTrailingZero(et2.getText().toString());
                        speakWords(result);
                        ln = false;
                    }
                    else if (expo == true) {
                        et2.setText((Double) Math.exp(firstnum) + "");
                        String result = removeTrailingZero(et2.getText().toString());
                        speakWords(result);
                        expo = false;
                    }
                    else if (bbpi == true) {
                        et2.setText(firstnum * Math.PI + "");
                        String result = removeTrailingZero(et2.getText().toString());
                        speakWords(result);
                        bbpi = false;
                    }
                    else if(fact==true){
                        et2.setText(factorial(firstnum)+"");
                        String result=removeTrailingZero(et2.getText().toString());
                        speakWords(result);
                        fact=false;
                    }

                    secondnum = Double.parseDouble(et2.getText() + "");

                    if (add == true) {
                        et2.setText(firstnum + secondnum + "");
                        String result = removeTrailingZero(et2.getText().toString());
                        speakWords(result);
                        add = false;
                    }
                    else if (sub == true) {
                        et2.setText(firstnum - secondnum + "");
                        String result =removeTrailingZero(et2.getText().toString());
                        speakWords(result);
                        sub = false;
                    }
                    else if (mul == true) {
                        et2.setText(firstnum * secondnum + "");
                        String result = removeTrailingZero(et2.getText().toString());
                        speakWords(result);
                        mul = false;
                    }
                    else if (div == true) {
                        et2.setText(firstnum / secondnum + "");
                        String result = removeTrailingZero(et2.getText().toString());
                        speakWords(result);
                        div = false;
                    }
                    else if (power == true) {
                        et2.setText(Math.pow(firstnum, secondnum) + "");
                        String result =removeTrailingZero(et2.getText().toString());
                        speakWords(result);
                        power = false;
                    }
                    else if (bbhcf == true) {
                        et2.setText(hcf(firstnum, secondnum) + "");
                        String result = removeTrailingZero(et2.getText().toString());
                        speakWords(result);
                        bbhcf = false;
                    }
                    else if (bblcm == true) {
                        et2.setText(lcm(firstnum, secondnum) + "");
                        String result = removeTrailingZero(et2.getText().toString());
                        speakWords(result);
                        bblcm = false;
                    }
                    else if (mod == true) {
                        et2.setText(firstnum % secondnum + "");
                        String result = removeTrailingZero(et2.getText().toString());
                        speakWords(result);
                        mod = false;
                    }
                    else if(comb==true)
                    {
                        et2.setText(combi(firstnum,secondnum)+"");
                        String result=removeTrailingZero(et2.getText().toString());
                        speakWords(result);
                        comb=false;
                    }
            }
        });

        Intent checkTTSIntent = new Intent();
        checkTTSIntent.setAction(TextToSpeech.Engine.ACTION_CHECK_TTS_DATA);
        startActivityForResult(checkTTSIntent, MY_DATA_CHECK_CODE);
    }

    double hcf(Double a, Double b)
    {
        if(b==0)
            return a;
        else
            return hcf(b,a%b);

    }
    double lcm(Double a, Double b)
    {
        return (a*b)/hcf(a,b);
    }

    double factorial(Double a){
        if(a==0 || a==1)
            return 1;
        else
            return a*factorial(a-1);
    }

    double combi(Double n, Double r){
        if(r==n || r==0)
            return 1;
        else
            return (combi(n-1,r-1)+combi(n-1,r));
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

    private void speakWords(String speech) {

        myTTS.speak(speech, TextToSpeech.QUEUE_FLUSH, null);
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
            makeText(Scientific2.this, "Sorry! Text To Speech failed...", Toast.LENGTH_LONG).show();
        }
    }

}
