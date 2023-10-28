
public class Player {
	private int player_id;
	private String pname;
	private String pskill;
	
	public Player()
	{
		super();
	}
	
	public Player(int player_id, String pname, String pskill)
	{
		super();
		this.player_id=player_id;
		this.pname=pname;
		this.pskill=pskill;
		
		
	}



	public int getPlayer_id() {
		return player_id;
	}

	public void setPlayer_id(int player_id) {
		this.player_id = player_id;
	}

	public String getPname() {
		return pname;
	}

	public void setPname(String pname) {
		this.pname = pname;
	}

	public String getPskill() {
		return pskill;
	}

	public void setPskill(String pskill) {
		this.pskill = pskill;
	}
	@Override
	public String toString() {
		return "Player [player_id=" + player_id + ", pname=" + pname + ", pskill=" + pskill + "]";
	}
	

}
