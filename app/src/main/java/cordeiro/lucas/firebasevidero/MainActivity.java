package cordeiro.lucas.firebasevidero;

import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.MediaController;
import android.widget.VideoView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        VideoView videoView = findViewById(R.id.videoView);

        MediaController mediaController = new MediaController(this);
        mediaController.setAnchorView(videoView);

        //Local video with Enviroment.getExternalStorageDirectory().getPath()+"/media/1.mp4"
        Uri uri = Uri.parse("https://firebasestorage.googleapis.com/v0/b/fir-app-b71c8.appspot.com/o/Corpo%20de%20Bombeiros.mp4?alt=media&token=8e7c32f6-1bc7-4373-b9a5-9b2c885e48b4");

        videoView.setMediaController(mediaController);
        videoView.setVideoURI(uri);
        //videoView.requestFocus();
        videoView.start();
    }
}
