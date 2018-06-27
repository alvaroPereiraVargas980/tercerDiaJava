package com.example.diagonalDifference;
import com.example.simpleArraySum.hackerRank;
import org.junit.Test;

import java.io.*;
import java.util.*;

import static junit.framework.TestCase.assertEquals;



public class hackerRankMatrizTest {
    @Test

    public void diagonalDifference() {
        hackerRankMatriz hackerRankMatriz = new hackerRankMatriz();
        int[][] num = {{1, 2, 3},{3,4,5},{20,8,10}};
        int result = 12;
        int total=hackerRankMatriz.diagonalDifference(num);;
        assertEquals(result,total);

    }
}
