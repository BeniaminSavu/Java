package com.iquest.week5;

import org.hamcrest.Matcher;
import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

import java.util.Date;

import junit.framework.TestCase;
import junit.framework.TestSuite;


public class CustomDateTest {
	
	@Test
    public void testDay() {
        //WHEN
        CustomDate actualDate = new CustomDate(new Date(0));

        //THEN
        assertThat(actualDate.getDay(), is("THURSDAY"));
    }
	
	@Test
    public void testMonth() {
        //WHEN
        CustomDate actualDate = new CustomDate(new Date(0));

        //THEN
        assertThat(actualDate.getMonth(), is("JANUARY"));
    }
	
	@Test
    public void testYear() {
        //WHEN
        CustomDate actualDate = new CustomDate(new Date(0));

        //THEN
        assertThat(actualDate.getYear(), is(1970));
    }
	
	@Test
    public void testDate() {
        //WHEN
        CustomDate actualDate = new CustomDate(new Date((long)1000*60*60*24*365));

        //THEN
        assertThat(actualDate.toString(), is("FRIDAY JANUARY 1971"));
    }
	
	@Test(expected = NullPointerException.class)
    public void testNullDate() {
        CustomDate actualDate = new CustomDate(null);
    }

}






















