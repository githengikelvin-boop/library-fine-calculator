public class TravelAgency{
    public static double CalculatedTotalCost(double costofaccomodation, double mealcost, double activitiescost){
        return costofaccomodation + mealcost + activitiescost;
    }
        public static void main(String[] args){
            double accomodationcost=800.57;
            double mealcost=400.23;
            double activitiescost=249.95;
            double totalcost= CalculatedTotalCost(accomodationcost,mealcost,activitiescost);
            System.out.println("The total cost of the trip is: " + totalcost);

    }
}