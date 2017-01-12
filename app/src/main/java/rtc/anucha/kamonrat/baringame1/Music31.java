package rtc.anucha.kamonrat.baringame1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class Music31 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_music31);
    }
    public void onClickaay (View view) {
        ImageButton btn_start = (ImageButton) findViewById(R.id.imageButton726);
        Intent intent = new Intent(Music31.this,Music32.class);
        startActivity(intent);
    }
    public void onClickaaz (View view) {
        ImageButton btn_start = (ImageButton) findViewById(R.id.imageButton727);
        Intent intent = new Intent(Music31.this,Music32.class);
        startActivity(intent);
    }
    public void onClickaba (View view) {
        ImageButton btn_start = (ImageButton) findViewById(R.id.imageButton728);
        Intent intent = new Intent(Music31.this,Music32.class);
        startActivity(intent);
    }
    public void onClickabb (View view) {
        ImageButton btn_start = (ImageButton) findViewById(R.id.imageButton729);
        Intent intent = new Intent(Music31.this,Music32.class);
        startActivity(intent);
        finish();
    }
}
