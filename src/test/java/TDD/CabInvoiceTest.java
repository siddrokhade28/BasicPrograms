package TDD;

import org.junit.Assert;
import org.junit.Test;

public class CabInvoiceTest {
    CabInvoice cabInvoice = new CabInvoice();

    //test method To Check if the calculated fare is correct
    @Test
    public void GivenDistanceTimeWhenInvoiceGeneratedShouldReturnTotalFare(){
        double TotalFare= cabInvoice.fareCaluclation(0.1,3);
        Assert.assertEquals(5,TotalFare,0);
    }

    //test method to check if the multiple fares are calculated
    @Test
    public void givenMultipleRidesWhenCalculatedShouldReturnAggregate(){
        double rides[][]={
                {5,5},
                {8,9},
                {7.6,5}
        };
        double Aggregate= cabInvoice.aggregateCaluclation(rides);
        Assert.assertEquals(225,Aggregate,0);
    }

//    @Test
//    public void GivenArrayWhnCalculatedShouldRetrunToatalRidesFareAvgFare(){
//        double rides[][]= {
//                {5,5},
//                {8,9},
//                {7.6,5}
//        };
//        int TotalRides= cabInvoice.totalRides(rides);
//        double TotalFare = cabInvoice.aggregateCaluclation(rides);
//        double AvgFare = cabInvoice.AvgFare(TotalFare,TotalRides);
//        Assert.assertEquals(3,TotalRides);
//        Assert.assertEquals(225,TotalFare,0);
//        Assert.assertEquals(75,AvgFare,0);
//
//    }

}
