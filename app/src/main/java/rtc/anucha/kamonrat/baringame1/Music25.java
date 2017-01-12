package rtc.anucha.kamonrat.baringame1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class Music25 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_music25);
    }
    public void onClickaaa (View view) {
        ImageButton btn_start = (ImageButton) findViewById(R.id.imageButton702);
        Intent intent = new Intent(Music25.this,Music26.class);
        startActivity(intent);
    }
    public void onClickaab (View view) {
        ImageButton btn_start = (ImageButton) findViewById(R.id.imageButton703);
        Intent intent = new Intent(Music25.this,Music26.class);
        startActivity(intent);
    }
    public void onClickaac (View view) {
        ImageButton btn_start = (ImageButton) findViewById(R.id.imageButton704);
        Intent intent = new Intent(Music25.this,Music26.class);
        startActivity(intent);
    }
    public void onClickaad (View view) {
        ImageButton btn_start = (ImageButton) findViewById(R.id.imageButton705);
        Intent intent = new Intent(Music25.this,Music26.class);
        startActivity(intent);
        finish();
    }
}
