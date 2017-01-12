package rtc.anucha.kamonrat.baringame1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class Dara29 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dara29);
    }
    public void onClicklw (View view) {
        ImageButton btn_start = (ImageButton) findViewById(R.id.imageButton338);
        Intent intent = new Intent(Dara29.this, Dara30.class);
        startActivity(intent);
    }
    public void onClicklx (View view) {
        ImageButton btn_start = (ImageButton) findViewById(R.id.imageButton339);
        Intent intent = new Intent(Dara29.this, Dara30.class);
        startActivity(intent);
    }
    public void onClickly (View view) {
        ImageButton btn_start = (ImageButton) findViewById(R.id.imageButton340);
        Intent intent = new Intent(Dara29.this, Dara30.class);
        startActivity(intent);
    }
    public void onClicklz (View view) {
        ImageButton btn_start = (ImageButton) findViewById(R.id.imageButton341);
        Intent intent = new Intent(Dara29.this, Dara30.class);
        startActivity(intent);
        finish();
    }
}
