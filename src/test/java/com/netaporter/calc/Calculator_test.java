package com.netaporter.calc;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by v.copeman on 04/08/2016.
 */
public class Calculator_test {

    @Test
public void testAdd()
    {

        Calculator a = new Calculator();
        int result = a.Add(10,8);
        Assert.assertEquals(18,result);
    }

}
