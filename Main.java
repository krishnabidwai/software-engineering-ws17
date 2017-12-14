import java.util.*;
import java.util.Scanner;

class Main {
  public static void main(String[] args) throws Exception
  {
	  String conversion;
	  Double value;
	  LinkedList<Command> commands = new LinkedList<Command>();
	  
	  System.out.println("Enter the pairs of a converter and a value: ");
	  
	  // get inputs
	  Scanner scan = new Scanner(System.in);
	  while(scan.hasNext()) {
		  conversion = scan.next();
		  value = scan.nextDouble();
		  commands.add(new Command(conversion, value));
	  }
	  scan.close();
	  
	  // execute all commands
	  for(Command command : commands)
		  command.execute();
  }
}
