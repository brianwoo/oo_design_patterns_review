/**
 * 
 */
package com.bwoo.designpatterns.Adapter;

/**
 * @author bwoo
 *
 */
public class VlcPlayer implements AdvancedMediaPlayer
{
	/* (non-Javadoc)
	 * @see com.bwoo.designpatterns.Adapter.AdvancedMediaPlayer#playVlc(java.lang.String)
	 */
	@Override
	public void playVlc(String fileName)
	{
		System.out.println("Playing Vlc file. Name = " + fileName);
	}

	/* (non-Javadoc)
	 * @see com.bwoo.designpatterns.Adapter.AdvancedMediaPlayer#playMp4(java.lang.String)
	 */
	@Override
	public void playMp4(String fileName)
	{
		// do Nothing
	}
}
