package rtc.anucha.kamonrat.baringame1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class Dara41 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dara41);
    }
    public void onClickns (View view) {
        ImageButton btn_start = (ImageButton) findViewById(R.id.imageButton386);
        Intent intent = new Intent(Dara41.this, Dara42.class);
        startActivity(intent);
    }
    public void onClicknt (View view) {
        ImageButton btn_start = (ImageButton) findViewById(R.id.imageButton387);
        Intent intent = new Intent(Dara41.this, Dara42.class);
        startActivity(intent);
    }
    public void onClicknu (View view) {
        ImageButton btn_start = (ImageButton) findViewById(R.id.imageButton388);
        Intent intent = new Intent(Dara41.this, Dara42.class);
        startActivity(intent);
    }
    public void onClicknv (View view) {
        ImageButton btn_start = (ImageButton) findViewById(R.id.imageButton389);
        Intent intent = new Intent(Dara41.this, Dara42.class);
        startActivity(intent);
        finish();
    }
}
