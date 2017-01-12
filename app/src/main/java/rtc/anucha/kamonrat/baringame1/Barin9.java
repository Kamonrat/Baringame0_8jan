package rtc.anucha.kamonrat.baringame1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class Barin9 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_barin9);
    }
    public void onClickbc (View view){
        ImageButton btn_start = (ImageButton) findViewById(R.id.imageButton66);
        Intent intent = new Intent(Barin9.this,Barin10.class);
        startActivity(intent);
    }
    public void onClickbd (View view){
        ImageButton btn_start = (ImageButton) findViewById(R.id.imageButton67);
        Intent intent = new Intent(Barin9.this,Barin10.class);
        startActivity(intent);
    }
    public void onClickbe (View view){
        ImageButton btn_start = (ImageButton) findViewById(R.id.imageButton68);
        Intent intent = new Intent(Barin9.this,Barin10.class);
        startActivity(intent);
    }
    public void onClickbf (View view){
        ImageButton btn_start = (ImageButton) findViewById(R.id.imageButton69);
        Intent intent = new Intent(Barin9.this,Barin10.class);
        startActivity(intent);
        finish();

    }
}
