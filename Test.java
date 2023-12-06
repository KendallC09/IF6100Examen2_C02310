package cr.go.ucr.test;

import static org.junit.jupiter.api.Assertions.*;

import cr.go.ucr.OperacionAritmetica;
import cr.go.ucr.operaciones.Division;
import cr.go.ucr.operaciones.Multiplicacion;
import cr.go.ucr.operaciones.Resta;
import cr.go.ucr.operaciones.Sumar;

class Test {

    @org.junit.jupiter.api.Test
    void testSuma() {
        OperacionAritmetica suma = new OperacionAritmetica(new Sumar());
        assertEquals(14, suma.procesar(7, 7));
    }

    @org.junit.jupiter.api.Test
    void testResta() {
        OperacionAritmetica resta = new OperacionAritmetica(new Resta());
        assertEquals(2, resta.procesar(4, 2));

        assertEquals(-2, resta.procesar(1, 5));
    }

    @org.junit.jupiter.api.Test
    void testMultiplicacion() {
        OperacionAritmetica multiplicacion = new OperacionAritmetica(new Multiplicacion());
        assertEquals(9, multiplicacion.procesar(3, 3));
    }

    @org.junit.jupiter.api.Test
    void testDivision() {
        OperacionAritmetica division = new OperacionAritmetica(new Division());
        assertEquals(10, division.procesar(20, 2));

        assertEquals(-3, division.procesar(2, 0));
    }

    @org.junit.jupiter.api.Test
    void testNumerosNegativos() {
    	
        OperacionAritmetica operacion = new OperacionAritmetica(new Sumar());
        assertEquals(-1, operacion.procesar(-1, 20));
        assertEquals(-1, operacion.procesar(10, -1));
        assertEquals(-1, operacion.procesar(-1, -2));
    }

}
