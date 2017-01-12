package rtc.anucha.kamonrat.baringame1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class Dara2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dara2);
    }
    public void onClickho (View view) {
        ImageButton btn_start = (ImageButton) findViewById(R.id.imageButton17);
        Intent intent = new Intent(Dara2.this, Dara3.class);
        startActivity(intent);
    }
    public void onClickhp (View view) {
        ImageButton btn_start = (ImageButton) findViewById(R.id.imageButton18);
        Intent intent = new Intent(Dara2.this, Dara3.class);
        startActivity(intent);
    }
    public void onClickhq (View view) {
        ImageButton btn_start = (ImageButton) findViewById(R.id.imageButton19);
        Intent intent = new Intent(Dara2.this, Dara3.class);
        startActivity(intent);
    }
    public void onClickhr (View view) {
        ImageButton btn_start = (ImageButton) findViewById(R.id.imageButton20);
        Intent intent = new Intent(Dara2.this, Dara3.class);
        startActivity(intent);
        finish();
    }
}
