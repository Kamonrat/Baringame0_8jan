package rtc.anucha.kamonrat.baringame1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class Dara46 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dara46);
    }
    public void onClickom (View view) {
        ImageButton btn_start = (ImageButton) findViewById(R.id.imageButton406);
        Intent intent = new Intent(Dara46.this, Dara47.class);
        startActivity(intent);
    }
    public void onClickon (View view) {
        ImageButton btn_start = (ImageButton) findViewById(R.id.imageButton407);
        Intent intent = new Intent(Dara46.this, Dara47.class);
        startActivity(intent);
    }
    public void onClickoo (View view) {
        ImageButton btn_start = (ImageButton) findViewById(R.id.imageButton408);
        Intent intent = new Intent(Dara46.this, Dara47.class);
        startActivity(intent);
    }
    public void onClickop (View view) {
        ImageButton btn_start = (ImageButton) findViewById(R.id.imageButton409);
        Intent intent = new Intent(Dara46.this, Dara47.class);
        startActivity(intent);
        finish();
    }
}
