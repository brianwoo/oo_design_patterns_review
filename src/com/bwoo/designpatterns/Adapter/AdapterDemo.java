package com.bwoo.designpatterns.Adapter;

public class AdapterDemo
{

	public static void main(String[] args)
	{
		AudioPlayer player = new AudioPlayer();
		
		player.play("mp3", "xxx.mp3");
		player.play("mp4", "yyy.mp4");
		player.play("vlc", "zzz.vlc");
		player.play("suck", "suck.suck");

	}

}
