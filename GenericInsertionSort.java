/*
 * cameron campbell
 * advanced java
 * occc spring 2021
 * generic insertion sort program
 */

import java.util.Arrays;

public class GenericInsertionSort <T extends Comparable<? super T>>
{
	/*
	 * main method executes each test. first an array is created for the
	 * data type, which is then filled before an explicit instance of
	 * GenericInsertionSort is created for the data type. this instance
	 * then calls sort() and prints the sorted array
	 */
	public static void main(String[] args) 
	{
		// integer test
		Integer[] iArray = {0, 10, 120, 59, 33, 94, 35, 76, 2164, 8431,
				1, 2, 14, 150, 359, 141, 23, 99, 87, 455};
		GenericInsertionSort<Integer> iSort = new GenericInsertionSort<>();
		iSort.sort(iArray);
		System.out.println(Arrays.toString(iArray));
		
		// string test
		String[] sArray = {"Doom", "Quake", "Halo", "Mass Effect", "Elder Scrolls, The", "Fallout", "Witcher, The", "For Honor", "Escape From Tarkov", "Barotrauma",
				"Hitman", "Splinter Cell", "Thief", "Dark Souls", "Nioh", "Garry's Mod", "Cataclysm: Dark Days Ahead", "Caves of Qud", "Timesplitters", "Red Dead Redemption"};
		GenericInsertionSort<String> sSort = new GenericInsertionSort<>();
		sSort.sort(sArray);
		System.out.println(Arrays.toString(sArray));
		
		// occcperson test, sorted first by .equals() and then by student id length
		OCCCPerson[] oArray = createOCCCArray();
		GenericInsertionSort<OCCCPerson> oSort = new GenericInsertionSort<>();
		oSort.sort(oArray);
		System.out.println(Arrays.toString(oArray));
	}
	
	
	/*
	 * the sort method takes the array, iterates through it with an index, and
	 * at each point in the index compares the value behind the index and the
	 * value at the index. if the item behind the index is considered greater
	 * than the item at the index, the values are swapped before continuing 
	 * the iteration until the array is fully sorted
	 */
	private void sort(T[] genericArray) 
	{
		for (int i = 1; i < genericArray.length; i++) 
		{
			int index = i;
			
			while (index > 0 && genericArray[index - 1].compareTo(genericArray[index]) > 0) 
			{
				T value = genericArray[index];
				genericArray[index] = genericArray[index - 1];
				genericArray[index - 1] = value;
				index--;
			}
		}
	}
	
	
	/*
	 * i made this extra method because of the bonkers size it would take to make
	 * twenty occcperson objects. i didn't want to clog up the main method
	 */
	private static OCCCPerson[] createOCCCArray() 
	{
		OCCCPerson o0 = new OCCCPerson(new RegisteredPerson("Joe", "Swanson", "a1"), "4818133861442");
		OCCCPerson o1 = new OCCCPerson(new RegisteredPerson("Sam", "Fisher", "a2"), "vasign7");
		OCCCPerson o2 = new OCCCPerson(new RegisteredPerson("Commander", "Shephard", "a3"), "d3bt68");
		OCCCPerson o3 = new OCCCPerson(new RegisteredPerson("Agent", "47", "a4"), "ab");
		OCCCPerson o4 = new OCCCPerson(new RegisteredPerson("Master", "Chief", "a5"), "sntyh4nt18rs+");
		OCCCPerson o5 = new OCCCPerson(new RegisteredPerson("Doom", "Slayer", "a6"), "hjgnfbd");
		OCCCPerson o6 = new OCCCPerson(new RegisteredPerson("Grey", "Warden", "a7"), "gfhds");
		OCCCPerson o7 = new OCCCPerson(new RegisteredPerson("Master", "Chief", "a5"), "sntyh4nt18rs+");
		OCCCPerson o8 = new OCCCPerson(new RegisteredPerson("William", "Adams", "a9"), "navgerjuil");
		OCCCPerson o9 = new OCCCPerson(new RegisteredPerson("Geralt", "of Rivia", "a10"), "htj");
		OCCCPerson o10 = new OCCCPerson(new RegisteredPerson("Gordon", "Freeman", "a11"), "0");
		OCCCPerson o11 = new OCCCPerson(new RegisteredPerson("Noble", "Six", "a12"), "ndblvcytifda");
		OCCCPerson o12 = new OCCCPerson(new RegisteredPerson("Marcus", "Fenix", "a13"), "bgbnauiowe");
		OCCCPerson o13 = new OCCCPerson(new RegisteredPerson("Dom", "Santiago", "a14"), "014g");
		OCCCPerson o14 = new OCCCPerson(new RegisteredPerson("Brad", "Armstrong", "a15"), "ghruenw0sagdbf");
		OCCCPerson o15 = new OCCCPerson(new RegisteredPerson("Phoenix", "Wright", "a16"), "grhieqgnrewiptgueri0p");
		OCCCPerson o16 = new OCCCPerson(new RegisteredPerson("John", "Marston", "a17"), "fggnwretoujhp");
		OCCCPerson o17 = new OCCCPerson(new RegisteredPerson("Arthur", "Morgan", "a18"), "14qw56");
		OCCCPerson o18 = new OCCCPerson(new RegisteredPerson("Dutch", "van der Linde", "a19"), "gbnreuwqaiy");
		OCCCPerson o19 = new OCCCPerson(new RegisteredPerson("Carl", "Johnson", "a20"), "htg468grefwamuykht");
		OCCCPerson[] oArray = {o9, o6, o3, o0, o10, o8, o5, o1, o2, o4,
				o7, o19, o12, o17, o13, o15, o11, o14, o18, o16};
		return oArray;
	}
}
