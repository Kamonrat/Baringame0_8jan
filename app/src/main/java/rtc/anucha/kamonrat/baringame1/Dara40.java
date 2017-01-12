package rtc.anucha.kamonrat.baringame1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class Dara40 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dara40);
    }
    public void onClickno (View view) {
        ImageButton btn_start = (ImageButton) findViewById(R.id.imageButton382);
        Intent intent = new Intent(Dara40.this, Dara41.class);
        startActivity(intent);
    }
    public void onClicknp (View view) {
        ImageButton btn_start = (ImageButton) findViewById(R.id.imageButton383);
        Intent intent = new Intent(Dara40.this, Dara41.class);
        startActivity(intent);
    }
    public void onClicknq (View view) {
        ImageButton btn_start = (ImageButton) findViewById(R.id.imageButton384);
        Intent intent = new Intent(Dara40.this, Dara41.class);
        startActivity(intent);
    }
    public void onClicknr (View view) {
        ImageButton btn_start = (ImageButton) findViewById(R.id.imageButton385);
        Intent intent = new Intent(Dara40.this, Dara41.class);
        startActivity(intent);
        finish();
    }
}
