package BroCode;

public class StaticKeyWord {
	
	public static void main(String[] args) {
		// static = modifier. A single copy of a variable/method is created and shared.
		// 			the class "owns" the static member
		
		
		Friend friend1 = new Friend("Sponge bob");
		Friend friend2 = new Friend("Patrick");
		Friend friend3 = new Friend("Squidward");
		Friend friend4 = new Friend("Sandy");
		
		
		Friend.displayFriends();
		
		
		
	}
	
	public static class Friend {
		String name;
		static int numberOfFriends;
		
		Friend(String name){
			this.name = name;
			numberOfFriends++;
		}
		
		static void displayFriends() {
			System.out.println("You have " + numberOfFriends + " Friends");
		}
	}

}
