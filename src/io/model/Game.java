package io.model;

import java.util.ArrayList;

public class Game
{
	
	private ArrayList<String> gameRules;
	private int funRanking;
	private String gameTitle;
	
	public Game()
	{
		gameRules = new ArrayList<String>();
		funRanking = 0;
		gameTitle = "";
	}
	
	public Game(ArrayList<String> gameRules, int funRanking, String gameTitle)
	{
		this.gameRules = gameRules;
		this.funRanking = funRanking;
		this.gameTitle = gameTitle;
	}

	public ArrayList<String> getGameRules()
	{
		return gameRules;
	}

	public int getFunRanking()
	{
		return funRanking;
	}

	public String getGameTitle()
	{
		return gameTitle;
	}

	public void setGameRules(ArrayList<String> gameRules)
	{
		this.gameRules = gameRules;
	}

	public void setFunRanking(int funRanking)
	{
		this.funRanking = funRanking;
	}

	public void setGameTitle(String gameTitle)
	{
		this.gameTitle = gameTitle;
	}

}
