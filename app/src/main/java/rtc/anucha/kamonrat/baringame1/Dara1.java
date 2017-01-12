package rtc.anucha.kamonrat.baringame1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class Dara1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dara1);
    }
    public void onClickf (View view){
        ImageButton btn_start = (ImageButton) findViewById(R.id.imageButton9);
        Intent intent = new Intent(Dara1.this,Dara2.class);
        startActivity(intent);
    }
    public void onClickg (View view){
        ImageButton btn_start = (ImageButton) findViewById(R.id.imageButton14);
        Intent intent = new Intent(Dara1.this,Dara2.class);
        startActivity(intent);
    }
    public void onClickh (View view){
        ImageButton btn_start = (ImageButton) findViewById(R.id.imageButton15);
        Intent intent = new Intent(Dara1.this,Dara2.class);
        startActivity(intent);
    }
    public void onClickj (View view){
        ImageButton btn_start = (ImageButton) findViewById(R.id.imageButton16);
        Intent intent = new Intent(Dara1.this,Dara2.class);
        startActivity(intent);
        finish();

    }
}
