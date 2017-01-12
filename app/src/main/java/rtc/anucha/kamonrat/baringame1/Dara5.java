package rtc.anucha.kamonrat.baringame1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class Dara5 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dara5);
    }
    public void onClickia (View view) {
        ImageButton btn_start = (ImageButton) findViewById(R.id.imageButton242);
        Intent intent = new Intent(Dara5.this, Dara6.class);
        startActivity(intent);
    }
    public void onClickib (View view) {
        ImageButton btn_start = (ImageButton) findViewById(R.id.imageButton243);
        Intent intent = new Intent(Dara5.this, Dara6.class);
        startActivity(intent);
    }
    public void onClickic (View view) {
        ImageButton btn_start = (ImageButton) findViewById(R.id.imageButton244);
        Intent intent = new Intent(Dara5.this, Dara6.class);
        startActivity(intent);
    }
    public void onClickid (View view) {
        ImageButton btn_start = (ImageButton) findViewById(R.id.imageButton245);
        Intent intent = new Intent(Dara5.this, Dara6.class);
        startActivity(intent);
        finish();
    }
}
