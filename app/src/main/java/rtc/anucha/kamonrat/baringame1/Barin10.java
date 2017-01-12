package rtc.anucha.kamonrat.baringame1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class Barin10 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_barin10);
    }
    public void onClickbg (View view){
        ImageButton btn_start = (ImageButton) findViewById(R.id.imageButton70);
        Intent intent = new Intent(Barin10.this,Barin11.class);
        startActivity(intent);
    }
    public void onClickbh (View view){
        ImageButton btn_start = (ImageButton) findViewById(R.id.imageButton71);
        Intent intent = new Intent(Barin10.this,Barin11.class);
        startActivity(intent);
    }
    public void onClickbi (View view){
        ImageButton btn_start = (ImageButton) findViewById(R.id.imageButton72);
        Intent intent = new Intent(Barin10.this,Barin11.class);
        startActivity(intent);
    }
    public void onClickbj (View view){
        ImageButton btn_start = (ImageButton) findViewById(R.id.imageButton74);
        Intent intent = new Intent(Barin10.this,Barin11.class);
        startActivity(intent);
        finish();
    }
}
