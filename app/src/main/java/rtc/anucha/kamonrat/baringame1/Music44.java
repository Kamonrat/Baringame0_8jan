package rtc.anucha.kamonrat.baringame1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class Music44 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_music44);
    }
    public void onClickacy (View view) {
        ImageButton btn_start = (ImageButton) findViewById(R.id.imageButton778);
        Intent intent = new Intent(Music44.this,Music45.class);
        startActivity(intent);
    }
    public void onClickacz (View view) {
        ImageButton btn_start = (ImageButton) findViewById(R.id.imageButton779);
        Intent intent = new Intent(Music44.this,Music45.class);
        startActivity(intent);
    }
    public void onClickada (View view) {
        ImageButton btn_start = (ImageButton) findViewById(R.id.imageButton780);
        Intent intent = new Intent(Music44.this,Music45.class);
        startActivity(intent);
    }
    public void onClickadb (View view) {
        ImageButton btn_start = (ImageButton) findViewById(R.id.imageButton781);
        Intent intent = new Intent(Music44.this,Music45.class);
        startActivity(intent);
    }
}
