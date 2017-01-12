package rtc.anucha.kamonrat.baringame1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class Dara32 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dara32);
    }
    public void onClickmi (View view) {
        ImageButton btn_start = (ImageButton) findViewById(R.id.imageButton352);
        Intent intent = new Intent(Dara32.this, Dara33.class);
        startActivity(intent);
    }
    public void onClickmj (View view) {
        ImageButton btn_start = (ImageButton) findViewById(R.id.imageButton353);
        Intent intent = new Intent(Dara32.this, Dara33.class);
        startActivity(intent);
    }
    public void onClickmk (View view) {
        ImageButton btn_start = (ImageButton) findViewById(R.id.imageButton354);
        Intent intent = new Intent(Dara32.this, Dara33.class);
        startActivity(intent);
    }
    public void onClickml (View view) {
        ImageButton btn_start = (ImageButton) findViewById(R.id.imageButton355);
        Intent intent = new Intent(Dara32.this, Dara33.class);
        startActivity(intent);
        finish();
    }
}
