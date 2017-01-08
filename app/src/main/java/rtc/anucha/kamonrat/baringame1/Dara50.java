package rtc.anucha.kamonrat.baringame1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class Dara50 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dara50);
    }
    public void onClickoq (View view) {
        ImageButton btn_start = (ImageButton) findViewById(R.id.imageButton422);
        Intent intent = new Intent(Dara50.this, Dara50.class);
        startActivity(intent);
    }
    public void onClickor (View view) {
        ImageButton btn_start = (ImageButton) findViewById(R.id.imageButton423);
        Intent intent = new Intent(Dara50.this, Dara50.class);
        startActivity(intent);
    }
    public void onClickos (View view) {
        ImageButton btn_start = (ImageButton) findViewById(R.id.imageButton424);
        Intent intent = new Intent(Dara50.this, Dara50.class);
        startActivity(intent);
    }
    public void onClickot (View view) {
        ImageButton btn_start = (ImageButton) findViewById(R.id.imageButton425);
        Intent intent = new Intent(Dara50.this, Dara50.class);
        startActivity(intent);
    }
}
