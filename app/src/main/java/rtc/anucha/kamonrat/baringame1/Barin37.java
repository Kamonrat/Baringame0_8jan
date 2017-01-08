package rtc.anucha.kamonrat.baringame1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class Barin37 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_barin37);
    }
    public void onClickfk (View view){
        ImageButton btn_start = (ImageButton) findViewById(R.id.imageButton178);
        Intent intent = new Intent(Barin37.this,Barin38.class);
        startActivity(intent);
    }
    public void onClickfl (View view){
        ImageButton btn_start = (ImageButton) findViewById(R.id.imageButton179);
        Intent intent = new Intent(Barin37.this,Barin38.class);
        startActivity(intent);
    }
    public void onClickfm (View view){
        ImageButton btn_start = (ImageButton) findViewById(R.id.imageButton180);
        Intent intent = new Intent(Barin37.this,Barin38.class);
        startActivity(intent);
    }
    public void onClickfn (View view){
        ImageButton btn_start = (ImageButton) findViewById(R.id.imageButton181);
        Intent intent = new Intent(Barin37.this,Barin38.class);
        startActivity(intent);
    }
}
