package rtc.anucha.kamonrat.baringame1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class Dara42 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dara42);
    }
    public void onClicknw (View view) {
        ImageButton btn_start = (ImageButton) findViewById(R.id.imageButton390);
        Intent intent = new Intent(Dara42.this, Dara43.class);
        startActivity(intent);
    }
    public void onClicknx (View view) {
        ImageButton btn_start = (ImageButton) findViewById(R.id.imageButton391);
        Intent intent = new Intent(Dara42.this, Dara43.class);
        startActivity(intent);
    }
    public void onClickny (View view) {
        ImageButton btn_start = (ImageButton) findViewById(R.id.imageButton392);
        Intent intent = new Intent(Dara42.this, Dara43.class);
        startActivity(intent);
    }
    public void onClicknz (View view) {
        ImageButton btn_start = (ImageButton) findViewById(R.id.imageButton393);
        Intent intent = new Intent(Dara42.this, Dara43.class);
        startActivity(intent);
    }
}
