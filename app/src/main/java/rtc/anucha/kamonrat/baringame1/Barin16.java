package rtc.anucha.kamonrat.baringame1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class Barin16 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_barin16);
    }
    public void onClickce (View view){
        ImageButton btn_start = (ImageButton) findViewById(R.id.imageButton94);
        Intent intent = new Intent(Barin16.this,Barin17.class);
        startActivity(intent);
    }
    public void onClickcf (View view){
        ImageButton btn_start = (ImageButton) findViewById(R.id.imageButton95);
        Intent intent = new Intent(Barin16.this,Barin17.class);
        startActivity(intent);
    }
    public void onClickcg (View view){
        ImageButton btn_start = (ImageButton) findViewById(R.id.imageButton96);
        Intent intent = new Intent(Barin16.this,Barin17.class);
        startActivity(intent);
    }
    public void onClickch (View view){
        ImageButton btn_start = (ImageButton) findViewById(R.id.imageButton97);
        Intent intent = new Intent(Barin16.this,Barin17.class);
        startActivity(intent);
        finish();
    }
}
