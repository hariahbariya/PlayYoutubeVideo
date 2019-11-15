package com.example.admin.playyoutubevideo;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.pierfrancescosoffritti.androidyoutubeplayer.core.player.YouTubePlayer;
import com.pierfrancescosoffritti.androidyoutubeplayer.core.player.listeners.AbstractYouTubePlayerListener;
import com.pierfrancescosoffritti.androidyoutubeplayer.core.player.views.YouTubePlayerView;

public class VideoAdpterClass extends RecyclerView.Adapter<VideoAdpterClass.VideoViewHolder> {

    public String[] video_url;
    public class VideoViewHolder extends RecyclerView.ViewHolder
    {
        YouTubePlayerView youTubePlayerView;
        public VideoViewHolder(@NonNull View itemView) {
            super(itemView);
            youTubePlayerView=(YouTubePlayerView)itemView.findViewById(R.id.youtube_video);
            youTubePlayerView.toggleFullScreen();
        }
    }

    public VideoAdpterClass(String[] video_url) {
        this.video_url = video_url;
    }

    @NonNull
    @Override
    public VideoViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater=LayoutInflater.from(parent.getContext());
        View view=inflater.inflate(R.layout.videoitms, parent, false);
        return new VideoViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull VideoViewHolder holder, int position) {
        final String url=video_url[position];
        holder.youTubePlayerView.addYouTubePlayerListener(new AbstractYouTubePlayerListener() {
            @Override
            public void onReady(YouTubePlayer youTubePlayer) {
                youTubePlayer.cueVideo(url,0);
            }
        });
    }

    @Override
    public int getItemCount() {
        return video_url.length;
    }


}
