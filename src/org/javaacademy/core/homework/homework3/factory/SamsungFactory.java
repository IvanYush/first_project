package org.javaacademy.core.homework.homework3.factory;

import org.javaacademy.core.homework.homework3.factory.telephone.Camera;
import org.javaacademy.core.homework.homework3.factory.telephone.Case;
import org.javaacademy.core.homework.homework3.factory.telephone.Processor;
import org.javaacademy.core.homework.homework3.factory.telephone.Samsung;

public class SamsungFactory {
    static Processor processorFrequency = new Processor(1_500);
    static Camera cameraQuality = new Camera(16);
    static Case paramCase = new Case(60, 200, 15);

    public static void makeSamsung() {
        Samsung samsung = new Samsung(processorFrequency, cameraQuality, paramCase);
        samsung.makePhoto();
    }
}