package org.javaacademy.core.homework.homework3.factory.telephone;

public class Samsung extends Telephone {

    public Samsung(Processor processorFrequency, Camera cameraQuality, Case paramCase) {
        super(processorFrequency, cameraQuality, paramCase);
    }

    @Override
    public void makePhoto() {
        super.makePhoto();
    }
}
