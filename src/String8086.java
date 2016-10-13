
public class String8086
{
	
	private char[] storedString;
	
	public String8086(String theString)
	{
		
		this.storedString = new char[theString.length() + 1];
		
		for(int i = 0; i <= theString.length(); i++)
		{
			if(i == theString.length()) // Last index in the array. Store the dollar sign.
			{
				this.storedString[i] = '$';
			}
			else // Not the last index in the array. Store a character.
			{
				this.storedString[i] = theString.charAt(i);
			}
		}
	}
	
	public void printChars()
	{
		int i = 0;
		while(this.storedString[i] != '$')
		{
			System.out.println(this.storedString[i]);
			i++;
		}
		System.out.println("End of string");
	}
	
}
