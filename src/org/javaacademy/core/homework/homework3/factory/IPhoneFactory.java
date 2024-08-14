package org.javaacademy.core.homework.homework3.factory;

import org.javaacademy.core.homework.homework3.factory.telephone.Camera;
import org.javaacademy.core.homework.homework3.factory.telephone.Case;
import org.javaacademy.core.homework.homework3.factory.telephone.Iphone;
import org.javaacademy.core.homework.homework3.factory.telephone.Processor;

public class IPhoneFactory {
    static Processor processor1Frequency = new Processor(1_000);
    static Processor processor2Frequency = new Processor(1_000);
    static Camera cameraQuality = new Camera(8);
    static Case paramCase = new Case(60, 200, 10);

    public static void makeIphone() {
        Iphone iPhone = new Iphone(processor1Frequency, processor2Frequency, cameraQuality, paramCase);
        iPhone.printProcessorsInfo();
        iPhone.makePhoto();
    }
}
