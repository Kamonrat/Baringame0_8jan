package rtc.anucha.kamonrat.baringame1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class Dara28 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dara28);

    }
    public void onClickls (View view) {
        ImageButton btn_start = (ImageButton) findViewById(R.id.imageButton334);
        Intent intent = new Intent(Dara28.this, Dara29.class);
        startActivity(intent);
    }
    public void onClicklt (View view) {
        ImageButton btn_start = (ImageButton) findViewById(R.id.imageButton335);
        Intent intent = new Intent(Dara28.this, Dara29.class);
        startActivity(intent);
    }
    public void onClicklu (View view) {
        ImageButton btn_start = (ImageButton) findViewById(R.id.imageButton336);
        Intent intent = new Intent(Dara28.this, Dara29.class);
        startActivity(intent);
    }
    public void onClicklv (View view) {
        ImageButton btn_start = (ImageButton) findViewById(R.id.imageButton337);
        Intent intent = new Intent(Dara28.this, Dara29.class);
        startActivity(intent);
    }
}
