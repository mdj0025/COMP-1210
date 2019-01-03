import org.junit.Assert;
 //import static org.junit.Assert.*;
 import org.junit.Before;
 import org.junit.Test;
 /** This class tests the UseTaxComparator class.
  *
  */
 
 public class UseTaxComparatorTest {
 
 
    /** Fixture initialization (common initialization
     *  for all tests). **/
    @Before public void setUp() {
    }
 
    /** This method tests the compare method. 
     */
    
    @Test public void compareTest() {
       Car v1 = new Car("Michael Johnson", "2014 Ford Mustang", 20000, false);
       Car v2 = new Car("James Walker", "2013 Nissan Altima", 18000, false);
       UseTaxComparator utc = new UseTaxComparator();
       Assert.assertEquals(1, utc.compare(v1, v2));
       
       Car v3 = new Car("Test Car", "2015 Toyata Prius", 30000, true);
       Car v4 = new Car("Test Car Expensive", "2018 Nissan Gtr", 100000, false);
       Assert.assertEquals(-1, utc.compare(v3, v4));
       
       Car v5 = new Car("Same Car", "2013 Ford F150", 50000, false);
       Car v6 = new Car("Same Car", "2013 Ford F150", 50000, false);
       Assert.assertEquals(0, utc.compare(v5, v6));
    }
 }