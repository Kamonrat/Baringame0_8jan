package rtc.anucha.kamonrat.baringame1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class Dara4 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dara4);
    }
    public void onClickhw (View view) {
        ImageButton btn_start = (ImageButton) findViewById(R.id.imageButton238);
        Intent intent = new Intent(Dara4.this, Dara5.class);
        startActivity(intent);
    }
    public void onClickhx (View view) {
        ImageButton btn_start = (ImageButton) findViewById(R.id.imageButton239);
        Intent intent = new Intent(Dara4.this, Dara5.class);
        startActivity(intent);
    }
    public void onClickhy (View view) {
        ImageButton btn_start = (ImageButton) findViewById(R.id.imageButton240);
        Intent intent = new Intent(Dara4.this, Dara5.class);
        startActivity(intent);
    }
    public void onClickhz (View view) {
        ImageButton btn_start = (ImageButton) findViewById(R.id.imageButton241);
        Intent intent = new Intent(Dara4.this, Dara5.class);
        startActivity(intent);
        finish();
    }
}
