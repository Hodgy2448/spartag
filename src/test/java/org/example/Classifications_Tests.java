package org.example;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
public class Classifications_Tests {
    @Test
    @DisplayName("under12Test")
    public void under12Test(){
        Assertions.assertEquals("U, PG & 12 films are available.",FilmClassifications.availableClassifications(5));
    }


    @Test
    @DisplayName("is12Test")
    public void is12Test(){
        Assertions.assertEquals("U, PG & 12 films are available.",FilmClassifications.availableClassifications(12));
    }


    @Test
    @DisplayName("over12Test")
    public void over12Test(){
        Assertions.assertEquals("U, PG, 12 & 15 films are available.",FilmClassifications.availableClassifications(13));
    }
    @Test
    @DisplayName("is18Test")
    public void is18Test(){
        Assertions.assertEquals("All films are available.",FilmClassifications.availableClassifications(18));
    }
}
