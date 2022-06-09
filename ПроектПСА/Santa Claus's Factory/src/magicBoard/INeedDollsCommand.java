package magicBoard;

public class INeedDollsCommand implements Command {
    private MagicBoard magicBoard;
	
	public INeedDollsCommand(MagicBoard magicBoard) {
		this.magicBoard = magicBoard;
	}

	@Override
	public void execute() {
		this.magicBoard.iNeedDolls();

	}

}
