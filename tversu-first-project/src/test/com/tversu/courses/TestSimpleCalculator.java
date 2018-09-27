package tversu.courses;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class TestSimpleCalculator
{
  private SimpleCalculator calculator;
  
  @Test
  public void testAdd()
  {
  }
  
  @Test
  public void testMultiply()
  {
  }
  
  @Test
  public void testDifference()
  {
  }
  
  @Test
  public void testDivide()
  {
  }
  
  @Before
  public void setUp() throws Exception
  {
    calculator = initCalculator();
  }
  
  private SimpleCalculator initCalculator()
  {
    return new SimpleCalculator();
  }
  
  @After
  public void tearDown() throws Exception
  {
    calculator = null;
  }
  
  public SimpleCalculator getCalculator()
  {
    return calculator;
  }
}
