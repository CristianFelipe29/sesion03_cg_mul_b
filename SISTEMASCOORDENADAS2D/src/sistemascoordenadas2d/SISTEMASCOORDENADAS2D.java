
package sistemascoordenadas2d;
/*Bjajo el esquema de coordenadad cartesianas referir un punto
 con sus respectivas propiedades y valores
Dichos valores deben asignarse como una entrada por teclado de parte del usuario 
*/

public class SISTEMASCOORDENADAS2D {

    
    public static void main(String[] args) {
       Cartesiana2D punto = new Cartesiana2D();
       Polar punto2 = new Polar();
       //agregar las instruciones necesarias para que se presente en pantalla la solicitud de los datos y posteriormente el usuarrio los ingrese desde el teclado 
       punto.setX (4);
    }
    
}

class Cartesiana2D {
    private int x,y;
    public void setX(int x) {
        this.x = x;
    }
    public void setY(int y) {
        this.y = y;
    }
}
class Polar {
    private int radio;
    private float angulo;

    public int getRadio() {
        return radio;
    }

    public void setRadio(int radio) {
        this.radio = radio;
    }

    public float getAngulo() {
        return angulo;
    }

    public void setAngulo(float angulo) {
        this.angulo = angulo;
    }
    
}