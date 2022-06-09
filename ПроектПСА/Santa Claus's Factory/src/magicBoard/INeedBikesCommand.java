package magicBoard;

public class INeedBikesCommand implements Command {
    private MagicBoard magicBoard;
	
	public INeedBikesCommand(MagicBoard magicBoard) {
		this.magicBoard = magicBoard;
	}

	@Override
	public void execute() {
		this.magicBoard.iNeedBikes();

	}

}
