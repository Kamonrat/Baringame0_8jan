package rtc.anucha.kamonrat.baringame1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class Music8 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_music8);
    }
    public void onClickxk (View view) {
        ImageButton btn_start = (ImageButton) findViewById(R.id.imageButton630);
        Intent intent = new Intent(Music8.this,Music9.class);
        startActivity(intent);
    }
    public void onClickxl (View view) {
        ImageButton btn_start = (ImageButton) findViewById(R.id.imageButton631);
        Intent intent = new Intent(Music8.this,Music9.class);
        startActivity(intent);
    }
    public void onClickxm (View view) {
        ImageButton btn_start = (ImageButton) findViewById(R.id.imageButton632);
        Intent intent = new Intent(Music8.this,Music9.class);
        startActivity(intent);
    }
    public void onClickxn (View view) {
        ImageButton btn_start = (ImageButton) findViewById(R.id.imageButton633);
        Intent intent = new Intent(Music8.this,Music9.class);
        startActivity(intent);
    }
}
