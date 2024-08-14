package org.javaacademy.core.homework.homework3.factory.telephone;

/**
 * Класс камеры
 */
public class Camera {
    private int cameraQuality;
    private final static String MAKE_PHOTO = "сделано фото";

    public Camera(int cameraQuality) {
        this.cameraQuality = cameraQuality;
    }

    protected static void makePhoto() {
        System.out.println(MAKE_PHOTO);
    }
}
