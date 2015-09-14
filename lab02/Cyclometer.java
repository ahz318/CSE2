//Ayman Zeine
//Lab02
// 9/4/2015
public class Cyclometer{
    //initialize main method
    public static void main(String[] args){
        
        int secsTrip1=480; //no. of seconds for Trip 1
        int secsTrip2=3220; //no. of seconds for Trip 2
        int countsTrip1=1561; //no. of wheel rotations for Trip 1
        int countsTrip2=9037; //no. of wheel rotations for Trip 2
        
        double wheelDiameter=27.0, //makes the diameter of the wheel into a decimal number
        feetPerMile=5280, // length of a mile in feet
        PI=3.14159, // the no. 'pi'
        inchesPerFoot=12, // no. of inches in a foot
        secondsPerMinute=60; // no. of seconds in a minute
        double distanceTrip1, distanceTrip2, totalDistance; //makes the distance length be represented in a decimal number
                                                            
        System.out.println("Trip 1 took " + (secsTrip1/secondsPerMinute)+
            " minutes and had " + countsTrip1 + " counts.");
        System.out.println("Trip 2 took " + (secsTrip2/secondsPerMinute) +
            " minutes and had " + countsTrip2 + " counts.");
             //run the calculations; store the values. Document your
             //calculation here. What are you calculating?
                //For the first print, I am calculating the no. of minutes and counts trip 1 took to be completed.
                //For the second print, I am calculating the number of minutes and counts trip 2 took to be completed.
        distanceTrip1=countsTrip1*wheelDiameter*PI;
        //Above gives distance in inches
        //(for each count, a rotation of a wheel travels
         //the diameter in inches times PI)
        distanceTrip1/=inchesPerFoot*feetPerMile; //Gives distance in miles
        distanceTrip2=countsTrip2*wheelDiameter*PI/inchesPerFoot/feetPerMile;
        totalDistance=distanceTrip1+distanceTrip2;
        
        //Print out the output data.
        System.out.println("Trip 1 was "+distanceTrip1+" miles");
        System.out.println("Trip 2 was "+distanceTrip2+" miles");
        System.out.println("The total distance was "+totalDistance+" miles");
    }   //end of main method
}   //end of class