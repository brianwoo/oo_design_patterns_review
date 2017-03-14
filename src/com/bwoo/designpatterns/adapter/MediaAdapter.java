/**
 * 
 */
package com.bwoo.designpatterns.adapter;

/**
 * @author bwoo
 *
 */
public class MediaAdapter implements MediaPlayer
{

	private AdvancedMediaPlayer advanceMusicPlayer;
	
	public MediaAdapter(String audioType)
	{
		if (audioType.equalsIgnoreCase("vlc"))
		{
			advanceMusicPlayer = new VlcPlayer();
		}
		else if (audioType.equalsIgnoreCase("mp4"))
		{
			advanceMusicPlayer = new Mp4Player();
		}
	}
	
	
	
	/* (non-Javadoc)
	 * @see com.bwoo.designpatterns.Adapter.MediaPlayer#play(java.lang.String, java.lang.String)
	 */
	@Override
	public void play(String audioType, String fileName)
	{
		if (audioType.equalsIgnoreCase("vlc"))
		{
			advanceMusicPlayer.playVlc(fileName);
		}
		else if (audioType.equalsIgnoreCase("mp4"))
		{
			advanceMusicPlayer.playMp4(fileName);
		}
	}

}
