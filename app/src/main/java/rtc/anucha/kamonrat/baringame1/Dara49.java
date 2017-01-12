package rtc.anucha.kamonrat.baringame1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class Dara49 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dara49);
    }
    public void onClickpc (View view) {
        ImageButton btn_start = (ImageButton) findViewById(R.id.imageButton418);
        Intent intent = new Intent(Dara49.this, Dara50.class);
        startActivity(intent);
    }
    public void onClickpd (View view) {
        ImageButton btn_start = (ImageButton) findViewById(R.id.imageButton419);
        Intent intent = new Intent(Dara49.this, Dara50.class);
        startActivity(intent);
    }
    public void onClickpe (View view) {
        ImageButton btn_start = (ImageButton) findViewById(R.id.imageButton420);
        Intent intent = new Intent(Dara49.this, Dara50.class);
        startActivity(intent);
    }
    public void onClickpf (View view) {
        ImageButton btn_start = (ImageButton) findViewById(R.id.imageButton421);
        Intent intent = new Intent(Dara49.this, Dara50.class);
        startActivity(intent);
        finish();
    }
}
