package org.javaacademy.core.homework.homework3.factory.telephone;

/**
 * Класс процессора
 */
public class Processor {
    private int processorFrequency;

    public Processor(int processorFrequency) {
        this.processorFrequency = processorFrequency;
    }

    public int getProcessorFrequency() {
        return processorFrequency;
    }
}