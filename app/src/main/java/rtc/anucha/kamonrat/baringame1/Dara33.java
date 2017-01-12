package rtc.anucha.kamonrat.baringame1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class Dara33 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dara33);
    }
    public void onClickmm (View view) {
        ImageButton btn_start = (ImageButton) findViewById(R.id.imageButton350);
        Intent intent = new Intent(Dara33.this, Dara34.class);
        startActivity(intent);
    }
    public void onClickmn (View view) {
        ImageButton btn_start = (ImageButton) findViewById(R.id.imageButton351);
        Intent intent = new Intent(Dara33.this, Dara34.class);
        startActivity(intent);
    }
    public void onClickmo (View view) {
        ImageButton btn_start = (ImageButton) findViewById(R.id.imageButton356);
        Intent intent = new Intent(Dara33.this, Dara34.class);
        startActivity(intent);
    }
    public void onClickmp (View view) {
        ImageButton btn_start = (ImageButton) findViewById(R.id.imageButton357);
        Intent intent = new Intent(Dara33.this, Dara34.class);
        startActivity(intent);
        finish();
    }
}
