public class Talker
{
    private String text;
    
    // Constructor
    public Talker(String startingText)
    {
        this.text = startingText;
    }
    
    // Returns the text in all uppercase letters
    // Find a method in the JavaDocs that
    // will allow you to do this with just
    // one method call
    public String yell()
    {
        return toUpperCase(this.text);
    }
    
    // Returns the text in all lowercase letters
    // Find a method in the JavaDocs that
    // will allow you to do this with just
    // one method call
    public String whisper()
    {
        return toLowerCase(this.text);
    }
    
    // Reset the instance variable to the new text
    public void setText(String newText)
    {
        this.text = newText;
    }
    
    // Returns a String representatin of this object
    // The returned String should look like
    // 
    // I say, "text"
    // 
    // The quotes should appear in the String
    // text should be the value of the instance variable
    public String toString()
    {
        String output = ("I say," + text);
        return output;
    }
}
