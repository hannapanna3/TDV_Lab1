import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;

import java.util.ArrayList;

import java.util.List;

public class toArrayTests {
    @Test
    public void toArray() {
        Set set = new Set();

       List<Integer> a = new ArrayList<>(Arrays.asList(1,2,3,4,5));
        set.toArray();

        int[] resultArray = set.toArray();

        int[] expectedArray = {1,2,3,4,5};
        assertArrayEquals(expectedArray, resultArray);
    }
    }

