public class discordUser{
  private boolean nitro=false;

private String name="";

private String avatarUrl="url";

private String status = "offline";

private int numFriends = 0;

private String ID = "000000000000000000";

private String description = "empty";

 

public discordUser(boolean nitro, String name,String avatarUrl,String status,int numFriends,String ID,String description){
  this.nitro = nitro;
  this.name = name;

  this.avatarUrl = avatarUrl;

  this.status= status;

  this.numFriends = numFriends;

  this.ID = ID;

  this.description= description;
}

public String toString(){
  String nitroOutput;
  if (nitro == true) {
   nitroOutput = "has nitro";
  }
else {
  nitroOutput = " does not have nitro ";
}
  
  return ("The user "+ name + nitroOutput + " and his avatar uses the url " + avatarUrl+ ", and their status is " + status + ", with an amazing " + numFriends +" friends, "+ "\nDescription:\n " + description);

}
  
}