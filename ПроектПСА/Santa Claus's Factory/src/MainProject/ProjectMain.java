package MainProject;

import Santa.Santa;
import elf.Elf;
import elf.Message;
import elf.Observer;
import magicBoard.Command;
import magicBoard.INeedBikesCommand;
import magicBoard.INeedDollsCommand;
import magicBoard.MagicBoard;
import magicBoard.VoiceController;
import santasFactory.BikeWorksop;
import santasFactory.DollWorksop;
import santasFactory.Present;
import santasFactory.SantaWorkshop;

public class ProjectMain {

	public static void main(String[] args) {
		//Singleton(Santa) main
		Santa order1 = Santa.getInstance();
		order1.giveOrder1("I need Bikes");
		
		Santa order2 = Santa.getInstance();
		order2.giveOrder2("I need Dolls");
		
		//Command(Magic board)
		MagicBoard magicBoard = new MagicBoard();
		Command iNeedBikes = new INeedBikesCommand(magicBoard);
		Command iNeedDolls = new INeedDollsCommand(magicBoard);
		
		VoiceController order = new VoiceController();
		order.setCommand(iNeedBikes);
		order.voiceActivated();
		order.setCommand(iNeedDolls);
		order.voiceActivated();
		
		//Observer(Elf)
		Message message = new Message();
		Observer obs1 = new Elf("Elf 01");
		Observer obs2 = new Elf("Elf 02");
		Observer obs3 = new Elf("Elf 03");
				
		message.iwantbikes(obs1);
		message.setMessage("I need Bikes");
		message.iwantdolls(obs2);
		message.setMessage("I need Dolls");	
		message.iwantdolls(obs3);
		message.setMessage("I need Dolls");	
	    
	    
		//Factory method(Santa's Factory)
		SantaWorkshop bikeWorkshop = new BikeWorksop();
		Present bike = bikeWorkshop.producePresent("BIKE");
				
		SantaWorkshop dollWorkshop = new DollWorksop();
		Present doll = dollWorkshop.producePresent("DOLL");
				
		

	}

}
