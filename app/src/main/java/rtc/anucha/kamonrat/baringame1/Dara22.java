package rtc.anucha.kamonrat.baringame1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class Dara22 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dara22);
    }
    public void onClickkt (View view) {
        ImageButton btn_start = (ImageButton) findViewById(R.id.imageButton310);
        Intent intent = new Intent(Dara22.this, Dara23.class);
        startActivity(intent);
    }
    public void onClickku (View view) {
        ImageButton btn_start = (ImageButton) findViewById(R.id.imageButton311);
        Intent intent = new Intent(Dara22.this, Dara23.class);
        startActivity(intent);
    }
    public void onClickkv (View view) {
        ImageButton btn_start = (ImageButton) findViewById(R.id.imageButton312);
        Intent intent = new Intent(Dara22.this, Dara23.class);
        startActivity(intent);
    }
    public void onClickkw (View view) {
        ImageButton btn_start = (ImageButton) findViewById(R.id.imageButton313);
        Intent intent = new Intent(Dara22.this, Dara23.class);
        startActivity(intent);
        finish();
    }
}
