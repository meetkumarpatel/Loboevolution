// Generated by esidl 0.2.1.

package org.lobobrowser.w3c.html;

import org.mozilla.javascript.Function;

public interface AudioTrackList {
	// AudioTrackList
	public int getLength();

	public AudioTrack getElement(int index);

	public AudioTrack getTrackById(String id);

	public Function getOnchange();

	public void setOnchange(Function onchange);
}