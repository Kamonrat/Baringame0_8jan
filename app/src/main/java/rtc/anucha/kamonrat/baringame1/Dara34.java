package rtc.anucha.kamonrat.baringame1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class Dara34 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dara34);
    }
    public void onClickmq (View view) {
        ImageButton btn_start = (ImageButton) findViewById(R.id.imageButton358);
        Intent intent = new Intent(Dara34.this, Dara35.class);
        startActivity(intent);
    }
    public void onClickmr (View view) {
        ImageButton btn_start = (ImageButton) findViewById(R.id.imageButton359);
        Intent intent = new Intent(Dara34.this, Dara35.class);
        startActivity(intent);
    }
    public void onClickms (View view) {
        ImageButton btn_start = (ImageButton) findViewById(R.id.imageButton360);
        Intent intent = new Intent(Dara34.this, Dara35.class);
        startActivity(intent);
    }
    public void onClickmt (View view) {
        ImageButton btn_start = (ImageButton) findViewById(R.id.imageButton361);
        Intent intent = new Intent(Dara34.this, Dara35.class);
        startActivity(intent);
        finish();
    }
}
