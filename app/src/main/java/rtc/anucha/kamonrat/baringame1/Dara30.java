package rtc.anucha.kamonrat.baringame1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class Dara30 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dara30);
    }
    public void onClickma (View view) {
        ImageButton btn_start = (ImageButton) findViewById(R.id.imageButton345);
        Intent intent = new Intent(Dara30.this, Dara31.class);
        startActivity(intent);
    }
    public void onClickmb (View view) {
        ImageButton btn_start = (ImageButton) findViewById(R.id.imageButton346);
        Intent intent = new Intent(Dara30.this, Dara31.class);
        startActivity(intent);
    }
    public void onClickmc (View view) {
        ImageButton btn_start = (ImageButton) findViewById(R.id.imageButton347);
        Intent intent = new Intent(Dara30.this, Dara31.class);
        startActivity(intent);
    }
    public void onClickmd (View view) {
        ImageButton btn_start = (ImageButton) findViewById(R.id.imageButton348);
        Intent intent = new Intent(Dara30.this, Dara31.class);
        startActivity(intent);
        finish();
    }
}
