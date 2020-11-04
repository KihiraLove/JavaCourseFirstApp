package com.pb8jv3.java1.spotifyimitation.datamanager.data;

/**
 *
 * @author Kertesz Domonkos PB8JV3
 */
public class Song {
    private String name;
    private String artist;
    private String style;
    private Integer lenght;
    private String albumName;

    public Song() {
    }

    public Song(String name, String artist, String style, Integer lenght, String albumName) {
	this.name = name;
	this.artist = artist;
	this.style = style;
	this.lenght = lenght;
	this.albumName = albumName;
    }

    public String getName() {
	return name;
    }

    public void setName(String name) {
	this.name = name;
    }

    public String getArtist() {
	return artist;
    }

    public void setArtist(String artist) {
	this.artist = artist;
    }

    public String getStyle() {
	return style;
    }

    public void setStyle(String style) {
	this.style = style;
    }

    public Integer getLenght() {
	return lenght;
    }

    public void setLenght(Integer lenght) {
	this.lenght = lenght;
    }

    public String getAlbumName() {
	return albumName;
    }
    
    public void setAlbumName(String albumName) {
	this.albumName = albumName;
    }
    
    public String printable(){
	return this.getName() + ";" + this.getArtist() + ";" + this.getStyle() + ";" + this.getLenght() + ";" + this.getAlbumName();
    }
}
