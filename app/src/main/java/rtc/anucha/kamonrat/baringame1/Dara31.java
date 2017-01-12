package rtc.anucha.kamonrat.baringame1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class Dara31 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dara31);
    }
    public void onClickme (View view) {
        ImageButton btn_start = (ImageButton) findViewById(R.id.imageButton342);
        Intent intent = new Intent(Dara31.this, Dara32.class);
        startActivity(intent);
    }
    public void onClickmf (View view) {
        ImageButton btn_start = (ImageButton) findViewById(R.id.imageButton343);
        Intent intent = new Intent(Dara31.this, Dara32.class);
        startActivity(intent);
    }
    public void onClickmg (View view) {
        ImageButton btn_start = (ImageButton) findViewById(R.id.imageButton344);
        Intent intent = new Intent(Dara31.this, Dara32.class);
        startActivity(intent);
    }
    public void onClickmh (View view) {
        ImageButton btn_start = (ImageButton) findViewById(R.id.imageButton349);
        Intent intent = new Intent(Dara31.this, Dara32.class);
        startActivity(intent);
        finish();
    }
}
