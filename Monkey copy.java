
public class Monkey extends RescueAnimal { 

		// instance variables 

		private String tailLength;  
		private String monkeyHeight;  
		private String bodyLength;  
		private String monkeySpecies;  

		// constructors 

		/*public Monkey() { 
			tailLength = ""; 
			return; 

		} 
		public Monkey() { 
			monkeyHeight = ""; 
			return monkeyHeight; 

		} 
		public Monkey() { 
			bodyLength = ""; 
			return bodyLength; 

		} 
		public Monkey() { 
			monkeySpecies = ""; 
			return monkeySpecies; 

		} 
*/
		// detailed constructor that takes all values for the attributes and sets them 

		 

		 public Monkey(String name, String tailLength, String height, String bodyLength, String Species, String gender, String age, 

				    String weight, String acquisitionDate, String acquisitionCountry, 

					String trainingStatus, boolean reserved, String inServiceCountry) { 

				        setName(name); 
				        setTailLength(tailLength); 
				        setHeight(height); 
				        setBodyLength(bodyLength); 
				        setSpecies(species); 
				        setGender(gender); 
				        setAge(age); 
				        setWeight(weight); 
				        setAcquisitionDate(acquisitionDate); 
				        setAcquisitionLocation(acquisitionCountry); 
				        setTrainingStatus(trainingStatus); 
				        setReserved(reserved); 
				        setInServiceCountry(inServiceCountry); 

				    } 

		 //accessors and mutators 


		public String getTailLength() { 
			return tailLength; 

		} 

		public void setTailLength(String tailLength) { 
			this.tailLength = tailLength; 

		} 
		
		public String getMonkeyHeight() { 
			return monkeyHeight; 

		} 

		public void setMonkeyHeight(String monkeyHeight) { 
			this.monkeyHeight = monkeyHeight; 

		} 

		public String getBodyLength() { 
			return bodyLength; 

		} 

		public void setBodyLength(String bodyLength) { 
			this.bodyLength = bodyLength; 

		} 

		public String getMonkeySpecies() { 
			return monkeySpecies; 

		} 

		public void setMonkeySpecies(String monkeySpecies) { 
			this.monkeySpecies = monkeySpecies; 

		} 

		 

}
