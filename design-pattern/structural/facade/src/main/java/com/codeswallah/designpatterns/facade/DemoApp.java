package com.codeswallah.designpatterns.facade;

import java.io.File;

public class DemoApp {
    public static void main(String[] args) {
        VideoConversionFacade converter = new VideoConversionFacade();
        File mp4Video = converter.convertVideo("youtubevideo.ogg", "mp4");
    }
}
