package rtc.anucha.kamonrat.baringame1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class Dara27 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dara27);
    }
    public void onClicklo (View view) {
        ImageButton btn_start = (ImageButton) findViewById(R.id.imageButton330);
        Intent intent = new Intent(Dara27.this, Dara28.class);
        startActivity(intent);
    }
    public void onClicklp (View view) {
        ImageButton btn_start = (ImageButton) findViewById(R.id.imageButton331);
        Intent intent = new Intent(Dara27.this, Dara28.class);
        startActivity(intent);
    }
    public void onClicklq (View view) {
        ImageButton btn_start = (ImageButton) findViewById(R.id.imageButton332);
        Intent intent = new Intent(Dara27.this, Dara28.class);
        startActivity(intent);
    }
    public void onClicklr (View view) {
        ImageButton btn_start = (ImageButton) findViewById(R.id.imageButton333);
        Intent intent = new Intent(Dara27.this, Dara28.class);
        startActivity(intent);
    }
}
