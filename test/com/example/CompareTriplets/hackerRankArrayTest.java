package com.example.CompareTriplets;
import com.example.simpleArraySum.hackerRank;
import org.junit.Test;

import java.io.*;
import java.util.*;

import static junit.framework.TestCase.assertEquals;



import static org.junit.Assert.*;

public class hackerRankArrayTest {
    @Test

    public void simpleArraySum() {
        hackerRankArray hackerRankArray = new hackerRankArray();
        int[] num1 = {5, 6, 7};
        int [] num2={3, 6, 10};
        int [] suma = {1,1};
        int [] total=hackerRankArray.solve(num1,num2);;
        assertEquals(suma,total);

    }
}
