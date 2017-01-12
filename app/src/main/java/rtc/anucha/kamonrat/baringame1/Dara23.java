package rtc.anucha.kamonrat.baringame1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class Dara23 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dara23);
    }
    public void onClickkx (View view) {
        ImageButton btn_start = (ImageButton) findViewById(R.id.imageButton314);
        Intent intent = new Intent(Dara23.this, Dara24.class);
        startActivity(intent);
    }
    public void onClickky (View view) {
        ImageButton btn_start = (ImageButton) findViewById(R.id.imageButton315);
        Intent intent = new Intent(Dara23.this, Dara24.class);
        startActivity(intent);
    }
    public void onClickkz (View view) {
        ImageButton btn_start = (ImageButton) findViewById(R.id.imageButton316);
        Intent intent = new Intent(Dara23.this, Dara24.class);
        startActivity(intent);
    }
    public void onClickla (View view) {
        ImageButton btn_start = (ImageButton) findViewById(R.id.imageButton317);
        Intent intent = new Intent(Dara23.this, Dara24.class);
        startActivity(intent);
        finish();
    }
}
