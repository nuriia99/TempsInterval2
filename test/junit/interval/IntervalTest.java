package junit.interval;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class IntervalTest {
    private Interval interval;

    @Before
    public void TestIntervalHoraIniciNegativa(){
        Interval interval = new Interval(-1,13);
        assertTrue(-1 < 0);
    }

    @Before
    public void TestIntervalHoraIniciMesGran(){
        Interval interval = new Interval(13,10);
        assertTrue(13 > 10);
    }

    @Before
    public void TestIntervalHoresIguals(){
        Interval interval = new Interval(11,11);
        assertTrue(11 == 11);
    }

    @Before
    public void TestIntervalHoraIniciMayor23(){
        Interval interval = new Interval(25,3);
        assertTrue(25 > 23);
    }

    @Before
    public void TestIntervalHoraFinalMayor23(){
        Interval interval = new Interval(6,28);
        assertTrue(28 > 23);
    }

    @Test
    public void TestTemps(){

    }

    @Test
    public void TestPeriodeDia(){

    }

    @Test
    public void TestHoresMatiInterval(){

    }

    @Test
    public void TestInterval(int h1, int h2){

    }
}