/**
 * 
 */
package com.bwoo.designpatterns.Adapter;

/**
 * @author bwoo
 *
 */
public class Mp4Player implements AdvancedMediaPlayer
{

	/* (non-Javadoc)
	 * @see com.bwoo.designpatterns.Adapter.AdvancedMediaPlayer#playVlc(java.lang.String)
	 */
	@Override
	public void playVlc(String fileName)
	{
		// do nothing
	}

	/* (non-Javadoc)
	 * @see com.bwoo.designpatterns.Adapter.AdvancedMediaPlayer#playMp4(java.lang.String)
	 */
	@Override
	public void playMp4(String fileName)
	{
		System.out.println("Playing mp4 file. Name = " + fileName);
	}

}
