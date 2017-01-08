package rtc.anucha.kamonrat.baringame1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class Dara9 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dara9);
    }
    public void onClickir (View view) {
        ImageButton btn_start = (ImageButton) findViewById(R.id.imageButton258);
        Intent intent = new Intent(Dara9.this, Dara10.class);
        startActivity(intent);
    }
    public void onClickis (View view) {
        ImageButton btn_start = (ImageButton) findViewById(R.id.imageButton259);
        Intent intent = new Intent(Dara9.this, Dara10.class);
        startActivity(intent);
    }
    public void onClickit (View view) {
        ImageButton btn_start = (ImageButton) findViewById(R.id.imageButton260);
        Intent intent = new Intent(Dara9.this, Dara10.class);
        startActivity(intent);
    }
    public void onClickiu (View view) {
        ImageButton btn_start = (ImageButton) findViewById(R.id.imageButton261);
        Intent intent = new Intent(Dara9.this, Dara10.class);
        startActivity(intent);
    }
}
