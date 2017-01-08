package rtc.anucha.kamonrat.baringame1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class Dara37 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dara37);
    }
    public void onClicknc (View view) {
        ImageButton btn_start = (ImageButton) findViewById(R.id.imageButton370);
        Intent intent = new Intent(Dara37.this, Dara38.class);
        startActivity(intent);
    }
    public void onClicknd (View view) {
        ImageButton btn_start = (ImageButton) findViewById(R.id.imageButton371);
        Intent intent = new Intent(Dara37.this, Dara38.class);
        startActivity(intent);
    }
    public void onClickne (View view) {
        ImageButton btn_start = (ImageButton) findViewById(R.id.imageButton372);
        Intent intent = new Intent(Dara37.this, Dara38.class);
        startActivity(intent);
    }
    public void onClicknf (View view) {
        ImageButton btn_start = (ImageButton) findViewById(R.id.imageButton373);
        Intent intent = new Intent(Dara37.this, Dara38.class);
        startActivity(intent);
    }
}
