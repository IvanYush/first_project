package org.javaacademy.core.homework.homework3.factory.telephone;

public class Iphone extends Telephone {
    private Processor processor2Frequency;

    public Iphone(Processor processorFrequency, Processor processor2Frequency,
                  Camera cameraQuality, Case paramCase) {
        super(processorFrequency, cameraQuality, paramCase);
        this.processor2Frequency = processor2Frequency;
    }

    @Override
    public void makePhoto() {
        super.makePhoto();
    }

    public void printProcessorsInfo() {
        System.out.println("Тактовая частота процессора 1: " + processorFrequency.getProcessorFrequency() + "\n" +
                "Тактовая частота процессора 2: " + processor2Frequency.getProcessorFrequency());
    }
}