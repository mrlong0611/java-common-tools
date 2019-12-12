package com.zeroten.common.util;

import org.testng.Assert;
import org.testng.annotations.Test;

public class CheckUtilsTest {



   @Test
   public void javaUtilTest() {

      Assert.assertEquals(CheckUtils.isAnyEmpty(new String[] {"a", "b", "c"}),true);
      Assert.assertEquals(CheckUtils.isEmpty(new Object[]{}),true);
      Assert.assertEquals(CheckUtils.equals(new String("abc"),"abc"),true);
      Assert.assertEquals(CheckUtils.equals(128,128),true);
   }



}
