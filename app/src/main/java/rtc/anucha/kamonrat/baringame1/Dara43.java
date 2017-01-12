package rtc.anucha.kamonrat.baringame1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class Dara43 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dara43);
    }
    public void onClickoa (View view) {
        ImageButton btn_start = (ImageButton) findViewById(R.id.imageButton394);
        Intent intent = new Intent(Dara43.this, Dara44.class);
        startActivity(intent);
    }
    public void onClickob (View view) {
        ImageButton btn_start = (ImageButton) findViewById(R.id.imageButton395);
        Intent intent = new Intent(Dara43.this, Dara44.class);
        startActivity(intent);
    }
    public void onClickoc (View view) {
        ImageButton btn_start = (ImageButton) findViewById(R.id.imageButton396);
        Intent intent = new Intent(Dara43.this, Dara44.class);
        startActivity(intent);
    }
    public void onClickod (View view) {
        ImageButton btn_start = (ImageButton) findViewById(R.id.imageButton397);
        Intent intent = new Intent(Dara43.this, Dara44.class);
        startActivity(intent);
        finish();
    }
}
