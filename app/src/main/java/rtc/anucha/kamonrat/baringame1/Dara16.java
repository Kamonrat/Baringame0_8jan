package rtc.anucha.kamonrat.baringame1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class Dara16 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dara16);
    }
    public void onClickju (View view) {
        ImageButton btn_start = (ImageButton) findViewById(R.id.imageButton286);
        Intent intent = new Intent(Dara16.this, Dara17.class);
        startActivity(intent);
    }
    public void onClickjv (View view) {
        ImageButton btn_start = (ImageButton) findViewById(R.id.imageButton287);
        Intent intent = new Intent(Dara16.this, Dara17.class);
        startActivity(intent);
    }
    public void onClickjw (View view) {
        ImageButton btn_start = (ImageButton) findViewById(R.id.imageButton288);
        Intent intent = new Intent(Dara16.this, Dara17.class);
        startActivity(intent);
    }
    public void onClickjx (View view) {
        ImageButton btn_start = (ImageButton) findViewById(R.id.imageButton289);
        Intent intent = new Intent(Dara16.this, Dara17.class);
        startActivity(intent);
        finish();
    }
}
