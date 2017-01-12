package rtc.anucha.kamonrat.baringame1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class Dara36 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dara36);
    }
    public void onClickmy (View view) {
        ImageButton btn_start = (ImageButton) findViewById(R.id.imageButton366);
        Intent intent = new Intent(Dara36.this, Dara37.class);
        startActivity(intent);
    }
    public void onClickmz (View view) {
        ImageButton btn_start = (ImageButton) findViewById(R.id.imageButton367);
        Intent intent = new Intent(Dara36.this, Dara37.class);
        startActivity(intent);
    }
    public void onClickna (View view) {
        ImageButton btn_start = (ImageButton) findViewById(R.id.imageButton368);
        Intent intent = new Intent(Dara36.this, Dara37.class);
        startActivity(intent);
    }
    public void onClicknb (View view) {
        ImageButton btn_start = (ImageButton) findViewById(R.id.imageButton369);
        Intent intent = new Intent(Dara36.this, Dara37.class);
        startActivity(intent);
        finish();
    }
}
