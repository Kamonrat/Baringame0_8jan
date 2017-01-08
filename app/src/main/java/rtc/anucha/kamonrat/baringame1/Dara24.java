package rtc.anucha.kamonrat.baringame1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class Dara24 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dara24);
    }
    public void onClicklb (View view) {
        ImageButton btn_start = (ImageButton) findViewById(R.id.imageButton318);
        Intent intent = new Intent(Dara24.this, Dara25.class);
        startActivity(intent);
    }
    public void onClickld (View view) {
        ImageButton btn_start = (ImageButton) findViewById(R.id.imageButton319);
        Intent intent = new Intent(Dara24.this, Dara25.class);
        startActivity(intent);
    }
    public void onClickle (View view) {
        ImageButton btn_start = (ImageButton) findViewById(R.id.imageButton320);
        Intent intent = new Intent(Dara24.this, Dara25.class);
        startActivity(intent);
    }
    public void onClicklf (View view) {
        ImageButton btn_start = (ImageButton) findViewById(R.id.imageButton321);
        Intent intent = new Intent(Dara24.this, Dara25.class);
        startActivity(intent);
    }
}
