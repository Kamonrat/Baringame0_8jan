package rtc.anucha.kamonrat.baringame1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class Dara11 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dara11);
    }
    public void onClickiz (View view) {
        ImageButton btn_start = (ImageButton) findViewById(R.id.imageButton267);
        Intent intent = new Intent(Dara11.this, Dara12.class);
        startActivity(intent);
    }
    public void onClickja (View view) {
        ImageButton btn_start = (ImageButton) findViewById(R.id.imageButton268);
        Intent intent = new Intent(Dara11.this, Dara12.class);
        startActivity(intent);
    }
    public void onClickjb (View view) {
        ImageButton btn_start = (ImageButton) findViewById(R.id.imageButton269);
        Intent intent = new Intent(Dara11.this, Dara12.class);
        startActivity(intent);
    }
    public void onClickjd (View view) {
        ImageButton btn_start = (ImageButton) findViewById(R.id.imageButton270);
        Intent intent = new Intent(Dara11.this, Dara12.class);
        startActivity(intent);
        finish();
    }
}
