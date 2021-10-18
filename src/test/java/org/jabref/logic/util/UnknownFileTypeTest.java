package org.jabref.logic.util;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

public class UnknownFileTypeTest {
    ArrayList<String> listaDeString;

    @BeforeEach
    public void init(){
        listaDeString = new ArrayList<String>();
        listaDeString.add("alguma.componto");
        listaDeString.add("maisuma.coisacomponto");

    }

    @Test
    public void equalsTest(){
        boolean resultado;
        UnknownFileType unknownFileType = new UnknownFileType();
        resultado = unknownFileType.equals(unknownFileType);
        assertEquals(resultado, true);
    }

    @Test
    public void notEqualTest(){
        boolean resultado;
        UnknownFileType unknownFileType = new UnknownFileType();
        resultado = unknownFileType.equals("string");
        assertNotEquals(resultado, true);
    }

    @Test
    public void twoObjectEqualsTest(){
        boolean resultado;
        UnknownFileType unknownFileType1 = new UnknownFileType();
        UnknownFileType unknownFileType2 = new UnknownFileType();
        resultado = unknownFileType1.equals(unknownFileType2);
        assertEquals(resultado, true);
    }
}
