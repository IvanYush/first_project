package org.javaacademy.core.homework.homework3.factory.telephone;

/**
 * Абстрактный класс телефона
 */
public abstract class Telephone {
    protected Processor processorFrequency;
    private Camera cameraQuality;
    private Case paramCase;

    public Telephone(Processor processorFrequency, Camera cameraQuality, Case paramCase) {
        this.processorFrequency = processorFrequency;
        this.cameraQuality = cameraQuality;
        this.paramCase = paramCase;
    }

    public void makePhoto() {
        Camera.makePhoto();
    }
}
