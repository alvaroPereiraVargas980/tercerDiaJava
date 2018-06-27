package com.example.BigSum;
import com.example.simpleArraySum.hackerRank;
import org.junit.Test;

import java.io.*;
import java.util.*;

import static junit.framework.TestCase.assertEquals;



public class hackerRantArraySumaTest {
    @Test

    public void simpleArraySum() {
        hackerRantArraySuma hackerRantArraySuma = new hackerRantArraySuma();
        int[] num = {1, 2, 3};
        int suma = 6;
        int total=hackerRantArraySuma.simpleArraySum(num);;
        assertEquals(suma,total);

    }
}
