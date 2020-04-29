// importamos la libreria proncipal
import processing.core.PApplet;

/**
 * Esta será nuestra clase principal
 * Hererda de PApplet, que es la clase padre que tiene todos los métodos
 * y atributos para usar Processing
 * Desde este fichero si le damos al triangulito verde a la izquierda
 * podemos ejecutar esta clase sin ser 'main'
 */
public class Formas extends PApplet {
    // definimos atributos para todoa la clase
    // es la ventana de salida de la aplicacion
    // en Processing las aplicaciones se llaman sketchs
    int viewport_w = 640; // ancho en pixels
    int viewport_h = 360; // alto en pixels

    // truco para poder ejecutar nuestro código
    // en el entorno gráfico ya creado
    public static void main(String args[]) {
        PApplet.main("Formas");
    }

    // método que tiene las configuraciones iniciales
    @Override
    public void settings() {
        size(viewport_w, viewport_h, P2D);
        smooth(8);
    }

    // en este metodo tambien podemos meter configuraciones iniciales de nuestro sketch
    @Override
    public void setup() {
    }

    // método principal. Aqui estará el grueso de nuestro código
    // sería equivalente a un 'main'
    // la DIFERENCIA principal es que se ejecuta en bucle
    // es decir, se repite el código infinitamente
    @Override
    public void draw() {
        // pintamos la ventana según rgb
        // hay muchas paginas que nos dan los colores en rgb
        // esta es una de ellas https://htmlcolorcodes.com/es/
        // prueba a cambiar estos colores
        background(251, 129, 8 );

        stroke(255, 255, 255);
        fill(208,114,114);
        rect(180,150,150,150);
        rect(245,100,20,50);
        ellipse(255,75,100,100);
        rect(120,200,60,20);
        rect(330,200,60,20);
        ellipse(400,210,40,40);
        ellipse(110,210,40,40);
        rect(245,75,15,15);
        fill(14, 0, 156);
        rect(180,280,150,20);
        rect(225,300,20,60);
        rect(270,300,20,60);
        rect(180,40,150,10);
        rect(200,0,110,40);
        fill(4,4,4);
        ellipse(260,270,10,10);
        fill(176,7,7);
        rect(240,100,26,5);
        ellipse(220,200,10,10);
        ellipse(290,200,10,10);
        fill(255, 255, 255);
        ellipse(235,65,15,15);
        ellipse(270,65,15,15);
        fill(11,11,11);
        ellipse(235,65,5,5);
        ellipse(270,65,5,5);

        //esto es para que te lea el mouse por donde pasas
        stroke(201,41,255);
        fill(225,247,41);
        ellipse(mouseY, mouseX, 100, 100);
        stroke(245,44,86);
        fill(145,251,66);
        rect(mouseX, mouseY, 50, 50);
    }
}