/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import laboratorio.factorial;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author gerson
 */
public class pruebas {
        private factorial f;
    @Test
        (expected = IllegalArgumentException.class)
    public void pruebaNegativo() {
       
        f.FactorialN(-2);
       // fail("Debería haber saltado una excepción - no se puede calcular el factorial de un número negativo");
    }
    //
    
        @Test
    public void pruebaNormal() {
        assertEquals(120, f.FactorialN(5));
    }

}
