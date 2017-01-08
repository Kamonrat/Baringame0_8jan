package rtc.anucha.kamonrat.baringame1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class Dara15 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dara15);
    }
    public void onClickjq (View view) {
        ImageButton btn_start = (ImageButton) findViewById(R.id.imageButton282);
        Intent intent = new Intent(Dara15.this, Dara16.class);
        startActivity(intent);
    }
    public void onClickjr (View view) {
        ImageButton btn_start = (ImageButton) findViewById(R.id.imageButton283);
        Intent intent = new Intent(Dara15.this, Dara16.class);
        startActivity(intent);
    }
    public void onClickjs (View view) {
        ImageButton btn_start = (ImageButton) findViewById(R.id.imageButton284);
        Intent intent = new Intent(Dara15.this, Dara16.class);
        startActivity(intent);
    }
    public void onClickjt (View view) {
        ImageButton btn_start = (ImageButton) findViewById(R.id.imageButton285);
        Intent intent = new Intent(Dara15.this, Dara16.class);
        startActivity(intent);
    }
}
