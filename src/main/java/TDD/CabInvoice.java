package TDD;

public class CabInvoice {
//    CabInvoice cabInvoice = new CabInvoice();
    public double fareCaluclation(double distance, double time) {
        double totalFare= 10*distance+time;
        if(totalFare<5){
            totalFare=5;
        }
        return totalFare;
    }

    public double aggregateCaluclation(double[][] rides) {
        double aggregateFare= 0;

        for(double[] ride :rides){
            aggregateFare+=fareCaluclation(ride[0],ride[1]);
        }
        return aggregateFare;
    }


//    public int totalRides(double[][] rides) {
//        int count =0;
//        for(double [] ride: rides){
//            count++;
//        }
//        return count;
//    }
//
//    public double AvgFare(double totalFare, int totalRides) {
//        Double avgFare= totalFare/totalRides;
//        return avgFare;
//    }
}
