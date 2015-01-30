//
//James Mannherz
//lab02
// 1/30/15
//cse 002
//Cyclometer Program
// The purpose of the program is to record two kinds of data, the time elapsed in seconds and the number of rotations of the front wheel
// 
//Given time and rotation count for two trips print 
// number of minutes for each trip
// number of counts for each trip
// the distance of each trip in miles
// the distance for teh two trips combined

// define the class 
 public class Cyclometer{

    // main method required for every Java program
    public static void main(String [] args) {
 
         // our input data
 
        int secsTrip1=480; //time in seconds for trip 1
        int secsTrip2=3220; //time in seconds for trip 2
        int countsTrip1=1561; //count of wheel rotations for trip 1
        int countsTrip2=9037; //count of wheel rotations for trip 2
        
            // our intermediate variables and output data
           double wheelDiameter=27.0,  // define wheel diameter in inches
        	PI=3.14159, //  define PI 
  	        feetPerMile=5280,  // define conversion of feet per mile
  	        inchesPerFoot=12,   // define conversion of inches to feet
  	        secondsPerMinute=60;  //define converstion of seconds to minutes
	        double distanceTrip1, distanceTrip2,totalDistance;  //
                
                //Print numbers stroed in variables that have stored number of seconds and the counts
                 System.out.println("Trip 1 took "+
       	         (secsTrip1/secondsPerMinute)+" minutes and had "+
       	         countsTrip1+" counts.");  //Print statement for trip 1
	             System.out.println("Trip 2 took "+
       	         (secsTrip2/secondsPerMinute)+" minutes and had "+
       	         countsTrip2+" counts.");  //Print statement for trip 2
       	         
       	            //run the calculations; store the values
                    distanceTrip1=countsTrip1*wheelDiameter*PI;
    	            // Above gives distance in inches 
    	            //for each count, a rotation of the wheel travels
    	            //the diameter in inches times PI
	                distanceTrip1/=inchesPerFoot*feetPerMile;
	                // Gives distance in miles
                	distanceTrip2=countsTrip2*wheelDiameter*PI/inchesPerFoot/feetPerMile;
                	// Above converts wheel rotation counts into inches then to feet then to miles
                	totalDistance=distanceTrip1+distanceTrip2;
                	//add to get total distance
                	
                	//Print out the output data.
                     System.out.println("Trip 1 was "+distanceTrip1+" miles");
                   	 System.out.println("Trip 2 was "+distanceTrip2+" miles");
	                 System.out.println("The total distance was "+totalDistance+" miles");
	                 

    }
}