package com.example.simpleArraySum;
import org.junit.Test;

import java.io.*;
import java.util.*;

import static junit.framework.TestCase.assertEquals;


public class hackerRankTest {
    @Test

    public void simpleArraySum() {
        hackerRank hackerRank = new hackerRank();
        int[] num = {1, 2, 3};
        int suma = 6;
        int total=hackerRank.simpleArraySum(num);;
        assertEquals(suma,total);

    }
}
