class Main {
    /*
    The Rater class represents a rating system for a company. The company is rated on a scale of 1 - 5.
  
  The toString representation changes based on how well rated the company is. Suppose we have a company called “Tina’s Tires”.
  
  If its rating is less than two, toString would return “Not Recommended Company Tina’s Tires”
  If its rating is over 3.5, toString would return “Gold Star Company Tina’s Tires”
  Otherwise, toString would return “Well Rated Company Tina’s Tires”
  Remember, once a return statement is executed, the rest of the method is skipped. Therefore, if you return a String in an if statement, the remaining if statements will not be tested.
  
  The other method you need to fill in is setRating. The rating should only be changed if the new rating is 5 or less.
  */
  
    public static void main(String[] args) {
       Rater jrs = new Rater("Jr Cookery", 2);
          
          
          // Test Case: In the middle
          System.out.println("Current Rating: " + jrs.getRating());
          System.out.println(jrs);
          
          
          // Test Case: High rating
          jrs.setRating(4.5);
          System.out.println("\nCurrent Rating: " + jrs.getRating());
          System.out.println(jrs);
          
          // Test Case: Setting rating too high
          jrs.setRating(100);
          System.out.println("\nCurrent Rating: " + jrs.getRating());
          System.out.println(jrs);
          
          
          // Test Case: Low rating
          jrs.setRating(1);
          System.out.println("\nCurrent Rating: " + jrs.getRating());
          System.out.println(jrs);
    }
  }