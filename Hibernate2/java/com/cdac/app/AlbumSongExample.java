package com.cdac.app;

import java.time.LocalDate;
import java.util.List;

import com.cdac.dao.AlbumSongDao;
import com.cdac.dao.GenericDao;
import com.cdac.entity.Album;
import com.cdac.entity.Song;

public class AlbumSongExample {

	public static void main(String[] args) {
		//GenericDao dao = new GenericDao();
		AlbumSongDao dao = new AlbumSongDao();
		
		//adding an album
		/*Album album = new Album();
		album.setName("Hits of 2020");
		album.setDateOfRelease(LocalDate.of(2020, 12, 30));
		album.setCopyright("Amazon Music");
		dao.save(album);*/
		
		//adding song to an album
		/*Album album = (Album) dao.fetchById(Album.class, 1);
		Song song = new Song();
		song.setTitle("abc");
		song.setArtist("Ed Sheeran");
		song.setDuration(3.45);
		song.setAlbum(album);
		dao.save(song);*/
		
		List<Song> songs = dao.fetchSongsSungBy("Ed Sheeran");
		for(Song song : songs)
			System.out.println(song.getTitle() + " " + song.getDuration()); 
		
		//dao.delete(Song.class, 8);
	}
}
