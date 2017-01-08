package rtc.anucha.kamonrat.baringame1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class Barin39 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_barin39);
    }
    public void onClickfs (View view){
        ImageButton btn_start = (ImageButton) findViewById(R.id.imageButton186);
        Intent intent = new Intent(Barin39.this,Barin40.class);
        startActivity(intent);
    }
    public void onClickft (View view){
        ImageButton btn_start = (ImageButton) findViewById(R.id.imageButton187);
        Intent intent = new Intent(Barin39.this,Barin40.class);
        startActivity(intent);
    }
    public void onClickfu (View view){
        ImageButton btn_start = (ImageButton) findViewById(R.id.imageButton188);
        Intent intent = new Intent(Barin39.this,Barin40.class);
        startActivity(intent);
    }
    public void onClickfv (View view){
        ImageButton btn_start = (ImageButton) findViewById(R.id.imageButton189);
        Intent intent = new Intent(Barin39.this,Barin40.class);
        startActivity(intent);

    }
}
