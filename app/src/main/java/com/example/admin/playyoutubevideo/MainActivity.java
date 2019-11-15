package com.example.admin.playyoutubevideo;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.Toolbar;

import com.pierfrancescosoffritti.androidyoutubeplayer.core.player.YouTubePlayer;
import com.pierfrancescosoffritti.androidyoutubeplayer.core.player.listeners.AbstractYouTubePlayerListener;
import com.pierfrancescosoffritti.androidyoutubeplayer.core.player.views.YouTubePlayerView;

public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        String[] url_videos_code={"j4axHXXEfjI","kJCCWtgsH_c","ULhlzAWc0K8","UacxMqnThZA","_yI2UscjY3c","XQVvDSE-YRw","jS-7aSIEJ3M","FY25rBkiA_U","wYrnkafl6Es","kzFYwzluzAc","byhA3D-TvS0"};
        recyclerView=findViewById(R.id.recycler_view_videos);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(new VideoAdpterClass(url_videos_code));
    }
}
