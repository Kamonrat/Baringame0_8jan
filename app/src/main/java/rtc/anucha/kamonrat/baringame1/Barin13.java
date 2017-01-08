package rtc.anucha.kamonrat.baringame1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class Barin13 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_barin13);
    }
    public void onClickbs (View view){
        ImageButton btn_start = (ImageButton) findViewById(R.id.imageButton82);
        Intent intent = new Intent(Barin13.this,Barin14.class);
        startActivity(intent);
    }
    public void onClickbt (View view){
        ImageButton btn_start = (ImageButton) findViewById(R.id.imageButton83);
        Intent intent = new Intent(Barin13.this,Barin14.class);
        startActivity(intent);
    }
    public void onClickbu (View view){
        ImageButton btn_start = (ImageButton) findViewById(R.id.imageButton84);
        Intent intent = new Intent(Barin13.this,Barin14.class);
        startActivity(intent);
    }
    public void onClickbv (View view){
        ImageButton btn_start = (ImageButton) findViewById(R.id.imageButton86);
        Intent intent = new Intent(Barin13.this,Barin14.class);
        startActivity(intent);
    }
}
