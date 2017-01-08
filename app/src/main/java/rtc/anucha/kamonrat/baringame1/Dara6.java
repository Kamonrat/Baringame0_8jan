package rtc.anucha.kamonrat.baringame1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class Dara6 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dara6);
    }
    public void onClickie (View view) {
        ImageButton btn_start = (ImageButton) findViewById(R.id.imageButton246);
        Intent intent = new Intent(Dara6.this, Dara7.class);
        startActivity(intent);
    }
    public void onClickif (View view) {
        ImageButton btn_start = (ImageButton) findViewById(R.id.imageButton247);
        Intent intent = new Intent(Dara6.this, Dara7.class);
        startActivity(intent);
    }
    public void onClickig (View view) {
        ImageButton btn_start = (ImageButton) findViewById(R.id.imageButton248);
        Intent intent = new Intent(Dara6.this, Dara7.class);
        startActivity(intent);
    }
    public void onClickih (View view) {
        ImageButton btn_start = (ImageButton) findViewById(R.id.imageButton249);
        Intent intent = new Intent(Dara6.this, Dara7.class);
        startActivity(intent);
    }
}
