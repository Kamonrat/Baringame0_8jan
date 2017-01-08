package rtc.anucha.kamonrat.baringame1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class Dara21 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dara21);
    }
    public void onClickkp (View view) {
        ImageButton btn_start = (ImageButton) findViewById(R.id.imageButton306);
        Intent intent = new Intent(Dara21.this, Dara22.class);
        startActivity(intent);
    }
    public void onClickkq (View view) {
        ImageButton btn_start = (ImageButton) findViewById(R.id.imageButton307);
        Intent intent = new Intent(Dara21.this, Dara22.class);
        startActivity(intent);
    }
    public void onClickkr (View view) {
        ImageButton btn_start = (ImageButton) findViewById(R.id.imageButton308);
        Intent intent = new Intent(Dara21.this, Dara22.class);
        startActivity(intent);
    }
    public void onClickks (View view) {
        ImageButton btn_start = (ImageButton) findViewById(R.id.imageButton309);
        Intent intent = new Intent(Dara21.this, Dara22.class);
        startActivity(intent);
    }
}
