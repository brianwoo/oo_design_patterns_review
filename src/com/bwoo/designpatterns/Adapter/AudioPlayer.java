/**
 * 
 */
package com.bwoo.designpatterns.Adapter;

/**
 * @author bwoo
 *
 */
public class AudioPlayer implements MediaPlayer
{

	private MediaAdapter mediaAdapter;
	
	
	/* (non-Javadoc)
	 * @see com.bwoo.designpatterns.Adapter.MediaPlayer#play(java.lang.String, java.lang.String)
	 */
	@Override
	public void play(String audioType, String fileName)
	{
		if (audioType.equalsIgnoreCase("mp3"))
		{
			System.out.println("Playing mp3 file. Name: " + fileName);
		}
		else if (audioType.equalsIgnoreCase("mp4") || 
				audioType.equalsIgnoreCase("vlc"))
		{
			mediaAdapter = new MediaAdapter(audioType);
			mediaAdapter.play(audioType, fileName);
		}
		else
		{
			System.out.println("Mediatype not supported = " + audioType);
		}

	}

}
