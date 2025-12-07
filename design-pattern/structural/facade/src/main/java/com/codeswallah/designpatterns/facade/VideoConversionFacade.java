package com.codeswallah.designpatterns.facade;

import com.codeswallah.designpatterns.facade.media.AudioMixer;
import com.codeswallah.designpatterns.facade.media.BitrateReader;
import com.codeswallah.designpatterns.facade.media.type.Codec;
import com.codeswallah.designpatterns.facade.media.VideoFile;
import com.codeswallah.designpatterns.facade.media.type.CodecFactory;
import com.codeswallah.designpatterns.facade.media.type.MPEG4CompressionCodec;
import com.codeswallah.designpatterns.facade.media.type.OggCompressionCodec;

import java.io.File;

public class VideoConversionFacade {
    public File convertVideo(String fileName, String targetType) {
        System.out.println("VideoConversionFacade: conversion started.");
        VideoFile file = new VideoFile(fileName);
        Codec sourceCodec = CodecFactory.extract(file);
        Codec destinationCodec;
        if (targetType.equals("mp4")) {
            destinationCodec = new MPEG4CompressionCodec();
        } else {
            destinationCodec = new OggCompressionCodec();
        }


        VideoFile buffer = BitrateReader.read(file, sourceCodec);
        VideoFile intermediateResult = BitrateReader.convert(buffer, destinationCodec);
        File result = new AudioMixer().fix(intermediateResult);
        System.out.println("VideoConversionFacade: conversion completed.");
        return result;
    }
}
