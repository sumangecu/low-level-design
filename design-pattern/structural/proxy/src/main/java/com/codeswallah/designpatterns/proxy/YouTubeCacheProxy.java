package com.codeswallah.designpatterns.proxy;

import com.codeswallah.designpatterns.proxy.medialib.ThirdPartyYouTubeImpl;
import com.codeswallah.designpatterns.proxy.medialib.ThirdPartyYouTubeLib;
import com.codeswallah.designpatterns.proxy.medialib.Video;

import java.util.HashMap;

public class YouTubeCacheProxy implements ThirdPartyYouTubeLib {

    private ThirdPartyYouTubeLib youtubeService;

    private HashMap<String, Video> cachePopular = new HashMap<>();
    private HashMap<String, Video> cacheAll = new HashMap<>();

    public YouTubeCacheProxy() {
        /**
         * Actual service object initialization.
         */
        this.youtubeService = new ThirdPartyYouTubeImpl();
    }

    @Override
    public HashMap<String, Video> popularVideos() {
        if (cachePopular.isEmpty()) {
            cachePopular = youtubeService.popularVideos();
        } else {
            System.out.println("Retrieved list from cache");
        }
        return cachePopular;
    }

    @Override
    public Video getVideo(String videoId) {
        Video video = cacheAll.get(videoId);
        if (video == null) {
            video = youtubeService.getVideo(videoId);
            cacheAll.put(videoId, video);
        } else {
            System.out.println("Retrieved video '" + videoId + "' from cache.");
        }
        return video;
    }
}
