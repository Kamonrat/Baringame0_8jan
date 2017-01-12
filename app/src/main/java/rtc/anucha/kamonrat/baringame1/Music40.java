package rtc.anucha.kamonrat.baringame1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class Music40 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_music40);
    }
    public void onClickaci (View view) {
        ImageButton btn_start = (ImageButton) findViewById(R.id.imageButton760);
        Intent intent = new Intent(Music40.this,Music41.class);
        startActivity(intent);
    }
    public void onClickacj (View view) {
        ImageButton btn_start = (ImageButton) findViewById(R.id.imageButton763);
        Intent intent = new Intent(Music40.this,Music41.class);
        startActivity(intent);
    }
    public void onClickack (View view) {
        ImageButton btn_start = (ImageButton) findViewById(R.id.imageButton764);
        Intent intent = new Intent(Music40.this,Music41.class);
        startActivity(intent);
    }
    public void onClickacl (View view) {
        ImageButton btn_start = (ImageButton) findViewById(R.id.imageButton765);
        Intent intent = new Intent(Music40.this,Music41.class);
        startActivity(intent);
        finish();
    }
}
