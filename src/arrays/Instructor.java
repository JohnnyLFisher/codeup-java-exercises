package arrays;

public class Instructor {

	private String firstName;
	private String lastName;
	private int brainWaveFrequency;
	private static int numInstructors = 0; // making this static, so that when other instructors are created, they'll all be able to access this value to increment it

	public Instructor(String first, String last) {
		this.firstName = first;
		this.lastName = last;
		this.brainWaveFrequency = 0; // just a default!
		numInstructors++; // we have another instructor now, add to the count

		System.out.printf("%s was just created!\n", firstName);
		System.out.printf("Instructor count: %d\n\n", numInstructors);
	}

	// Getter and Setter for First Name
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String first){
		this.firstName = first;
	}

	// Getter and Setter for Last Name
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String last) {
		this.lastName = last;
	}

	// Getter and Setter for Brain Wave Frequency
	public int getBrainWaveFrequency() {
		return brainWaveFrequency;
	}
	public void setBrainWaveFrequency(int freq) {
		this.brainWaveFrequency = freq;
	}

	// Method to display Instructor Info
	public String displayStats() {
		return String.format("%s %s, Brainwave Freqency: %d", firstName, lastName, brainWaveFrequency);
	}

	// Now let's go into ArrayTime and create an array of Instructors!
}