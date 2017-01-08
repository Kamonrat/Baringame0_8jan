package rtc.anucha.kamonrat.baringame1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class Animal27 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_animal27);
    }
    public void onClicksy (View view) {
        ImageButton btn_start = (ImageButton) findViewById(R.id.imageButton510);
        Intent intent = new Intent(Animal27.this, Animal28.class);
        startActivity(intent);
    }
    public void onClicksz (View view) {
        ImageButton btn_start = (ImageButton) findViewById(R.id.imageButton511);
        Intent intent = new Intent(Animal27.this, Animal28.class);
        startActivity(intent);
    }
    public void onClickta (View view) {
        ImageButton btn_start = (ImageButton) findViewById(R.id.imageButton512);
        Intent intent = new Intent(Animal27.this, Animal28.class);
        startActivity(intent);
    }
    public void onClicktb (View view){
        ImageButton btn_start = (ImageButton) findViewById(R.id.imageButton513);
        Intent intent = new Intent(Animal27.this,Animal28.class);
        startActivity(intent);
    }
}
