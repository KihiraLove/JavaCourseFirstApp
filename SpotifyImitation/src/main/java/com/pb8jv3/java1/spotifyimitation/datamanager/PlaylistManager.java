package com.pb8jv3.java1.spotifyimitation.datamanager;

import com.pb8jv3.java1.spotifyimitation.datamanager.data.Playlist;
import com.pb8jv3.java1.spotifyimitation.datamanager.data.Song;
import java.util.List;
import java.util.Map;


/**
 *
 * @author Kertesz Domonkos PB8JV3
 */
public class PlaylistManager {
    Map<String, Playlist> playlists;

    public PlaylistManager(Map<String, Playlist> playlists) {
	this.playlists = playlists;
    }

    public Map<String, Playlist> getPlaylists() {
	return playlists;
    }
    
    public void addPlaylist(String name, List<Song> songs){
	playlists.put(name, new Playlist(name, songs));
    }
    
    public Playlist getPlaylist(String name){
	return playlists.get(name);
    }
    
    public void removePlaylist(String name){
	playlists.remove(name);
    }
}
