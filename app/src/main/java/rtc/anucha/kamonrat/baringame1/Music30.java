package rtc.anucha.kamonrat.baringame1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class Music30 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_music30);
    }
    public void onClickaau (View view) {
        ImageButton btn_start = (ImageButton) findViewById(R.id.imageButton719);
        Intent intent = new Intent(Music30.this,Music31.class);
        startActivity(intent);
    }
    public void onClickaav (View view) {
        ImageButton btn_start = (ImageButton) findViewById(R.id.imageButton720);
        Intent intent = new Intent(Music30.this,Music31.class);
        startActivity(intent);
    }
    public void onClickaaw (View view) {
        ImageButton btn_start = (ImageButton) findViewById(R.id.imageButton721);
        Intent intent = new Intent(Music30.this,Music31.class);
        startActivity(intent);
    }
    public void onClickaax (View view) {
        ImageButton btn_start = (ImageButton) findViewById(R.id.imageButton725);
        Intent intent = new Intent(Music30.this,Music31.class);
        startActivity(intent);
        finish();
    }
}
