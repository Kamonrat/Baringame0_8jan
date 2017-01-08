package rtc.anucha.kamonrat.baringame1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class Dara45 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dara45);
    }
    public void onClickoi (View view) {
        ImageButton btn_start = (ImageButton) findViewById(R.id.imageButton402);
        Intent intent = new Intent(Dara45.this, Dara46.class);
        startActivity(intent);
    }
    public void onClickoj (View view) {
        ImageButton btn_start = (ImageButton) findViewById(R.id.imageButton403);
        Intent intent = new Intent(Dara45.this, Dara46.class);
        startActivity(intent);
    }
    public void onClickok (View view) {
        ImageButton btn_start = (ImageButton) findViewById(R.id.imageButton404);
        Intent intent = new Intent(Dara45.this, Dara46.class);
        startActivity(intent);
    }
    public void onClickol (View view) {
        ImageButton btn_start = (ImageButton) findViewById(R.id.imageButton405);
        Intent intent = new Intent(Dara45.this, Dara46.class);
        startActivity(intent);
    }
}
