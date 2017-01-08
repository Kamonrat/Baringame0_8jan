package rtc.anucha.kamonrat.baringame1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class Barin43 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_barin43);
    }
    public void onClickgi (View view){
        ImageButton btn_start = (ImageButton) findViewById(R.id.imageButton202);
        Intent intent = new Intent(Barin43.this,Barin44.class);
        startActivity(intent);
    }
    public void onClickgj (View view){
        ImageButton btn_start = (ImageButton) findViewById(R.id.imageButton203);
        Intent intent = new Intent(Barin43.this,Barin44.class);
        startActivity(intent);
    }
    public void onClickgk (View view){
        ImageButton btn_start = (ImageButton) findViewById(R.id.imageButton204);
        Intent intent = new Intent(Barin43.this,Barin44.class);
        startActivity(intent);
    }
    public void onClickgl (View view){
        ImageButton btn_start = (ImageButton) findViewById(R.id.imageButton205);
        Intent intent = new Intent(Barin43.this,Barin44.class);
        startActivity(intent);
    }
}
