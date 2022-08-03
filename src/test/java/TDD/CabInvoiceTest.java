package TDD;

import org.junit.Assert;
import org.junit.Test;

public class CabInvoiceTest {
    CabInvoice cabInvoice = new CabInvoice();
    @Test
    public void GivenDistanceTimeWhenInvoiceGeneratedShouldReturnTotalFare(){
        int TotalFare= cabInvoice.fareCaluclation(7,8);
        Assert.assertEquals(78,TotalFare);
    }

}
