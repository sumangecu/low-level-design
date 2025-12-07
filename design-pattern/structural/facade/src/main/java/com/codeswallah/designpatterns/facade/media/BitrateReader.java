package com.codeswallah.designpatterns.facade.media;

import com.codeswallah.designpatterns.facade.media.type.Codec;

public class BitrateReader {
    public static VideoFile read(VideoFile file, Codec codec) {
        System.out.println("BitrateReader: reading file...");
        return file;
    }

    public static VideoFile convert(VideoFile buffer, Codec targetCodecType) {
        System.out.println("BitrateReader: writing file...");
        return buffer;
    }
}
