package InnerClassChallenge;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

import AutoboxingAndUnboxingChallengeSecond.Branch;

public class Main {
	public static void main(String[] args) {
		Album album = new Album("Stormbringer", "Deep Purple");
		album.addSong("Storebringer", 4.6);
		album.addSong("", 4.6);
		album.addSong("Storebringer", 4.6);
		album.addSong("Storebringer", 4.6);
		album.addSong("Storebringer", 4.6);
		album.addSong("Storebringer", 4.6);
		album.addSong("Storebringer", 4.6);
		
		
	}
	private static void play(LinkedList<Song> playList){
		Scanner scanner = new Scanner(System.in);
		boolean quit = false;
		boolean forward = true;
		ListIterator<Song> listIterator = playList.listIterator();
		if(playList.size() == 0){
			System.out.println("No songs in playlist");
			return;
		}else {
			System.out.println("Now playing " + listIterator.next().toString());
			printMenu();
		}
		while (!quit) {
			int action = scanner.nextInt();
			scanner.nextLine();
			switch (action) {
			case 0:
				System.out.println("Playlist complete.");
				quit = true;
				break;
			case 1:
				if(!forward){
					if(listIterator.hasNext()){
						listIterator.next();
					}
					forward = true;
				}
				if(listIterator.hasNext()){
					System.out.println("Now playing " + listIterator.next().toString());
				}else {
					System.out.println("We have reached the end of the playlist.");
					forward = false;
				}
				break;
			case 2:
				if(forward){
					if(listIterator.hasPrevious()){
						listIterator.previous();
					}
					forward = false;
				}
				if (listIterator.hasPrevious()) {
					System.out.println("Now playing " + listIterator.previous().toString());
				}else {
					System.out.println("We are at the start of the playlist");
					forward = true;
				}
				break;
			case 3:
				if(forward){
					if(listIterator.hasPrevious()){
						System.out.println("Now replaying " + listIterator.previous().toString());
						forward = false;
					}else {
						System.out.println("We are at the start of the list");
					}
				}else {
					if(listIterator.hasNext()){
						System.out.println("Now replaying " + listIterator.next().toString());
						forward = true;
					}else {
						System.out.println("We have reached the end of the list");
					}
				}
				break;
			case 4:
				printList(playList);
				break;
			case 5:
				printMenu(); 
				break;
			case 6:
				if(playList.size() > 0){
					listIterator.remove();
					if(listIterator.hasNext()){
						System.out.println("Now playing " + listIterator.next());
					}else if (listIterator.hasPrevious()) {
						System.out.println("Now playing " + listIterator.previous());
					}
				}
				break;
			default:
				
				break;
			}
		}
	}
	private static void printMenu(){
		System.out.println("Available actions:\npress");
		System.out.println("0 - to quit");
		System.out.println("1 - to play next song");
		System.out.println("2 - to play previous song");
		System.out.println("3 - to replay the current song");
		System.out.println("4 - list songs in the playlist");
		System.out.println("5 - print available actions.");
		System.out.println("6 - delete current song from palylist");
	}
	private static void printList(LinkedList<Song>playList){
		Iterator<Song> iterator = playList.iterator();
		System.out.println("================");
		while (iterator.hasNext()) {
			System.out.println(iterator.next().toString());
		}
		System.out.println("================");
	}
}
