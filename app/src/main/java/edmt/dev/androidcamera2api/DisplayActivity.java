package edmt.dev.androidcamera2api;

import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

public class DisplayActivity extends AppCompatActivity {

    // UI Views
    ImageView imageView;

    // Objects
    byte[] bytes;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display);
        initViews();
       // Intent intent = getIntent();
      //  bytes = (byte[]) intent.getSerializableExtra("map");
      //  Bitmap bitmap = BitmapFactory.decodeByteArray(bytes, 0, bytes.length); // convert to bitmap from byte array
      //  imageView.setImageBitmap(bitmap);
    }

    private void initViews() {
        imageView = findViewById(R.id.imageView);
    }


}
