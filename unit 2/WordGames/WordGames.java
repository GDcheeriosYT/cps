public class WordGames {

    //instance of word
    private String word;

    public WordGames(String theWord){
        
        this.word = theWord;
        
    }
    
    public String Scramble(){

        int wordLength = word.length();

        String wordFirstHalf = word.substring(0, (int) (wordLength / 2));

        String wordSecondHalf = word.substring((int) (wordLength / 2));

        String newScrambleWord = wordSecondHalf + wordFirstHalf;

        return newScrambleWord;

    }

    public String BannanaSplit(String letterOfInsertion, String insertText){

        int getLetterOfInsertionPoint = word.indexOf(letterOfInsertion);

        String newBannanaSplitWord = (word.substring(0, getLetterOfInsertionPoint) + insertText + word.substring(getLetterOfInsertionPoint, word.length()));

        return newBannanaSplitWord;

    }

    public String toString(){

        String output = ("scrambled word is " + Scramble() + ", the bannana splitted word is " + BannanaSplit("o", "oba"));

        return output;

    }

}
