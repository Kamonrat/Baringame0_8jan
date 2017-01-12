package rtc.anucha.kamonrat.baringame1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class Dara18 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dara18);
    }
    public void onClickkc (View view) {
        ImageButton btn_start = (ImageButton) findViewById(R.id.imageButton294);
        Intent intent = new Intent(Dara18.this, Dara19.class);
        startActivity(intent);
    }
    public void onClickkd (View view) {
        ImageButton btn_start = (ImageButton) findViewById(R.id.imageButton295);
        Intent intent = new Intent(Dara18.this, Dara19.class);
        startActivity(intent);
    }
    public void onClickke (View view) {
        ImageButton btn_start = (ImageButton) findViewById(R.id.imageButton296);
        Intent intent = new Intent(Dara18.this, Dara19.class);
        startActivity(intent);
    }
    public void onClickkf (View view) {
        ImageButton btn_start = (ImageButton) findViewById(R.id.imageButton297);
        Intent intent = new Intent(Dara18.this, Dara19.class);
        startActivity(intent);
        finish();
    }
}
