/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistemascoordenadas2d;

/**
 *
 * @author ASUS
 */
public class Polar {
    private float radio, angulo;// En radianes

    public Polar(float radio, float angulo) {

        this.radio = radio;
        this.angulo = angulo;
    }

    public Polar() {

    }

    public float getRadio() {
        return radio;
    }

    public void setRadio(float radio) {
        this.radio = radio;
    }

    public float getAngulo() {
        return angulo;
    }

    public void setAngulo(float angulo) {
        this.angulo = angulo;
    }
}
