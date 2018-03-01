package practice;
import java.util.Scanner;

public class songs {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        andy andyObject = new andy();
        pam pamObject = new pam();
        creed creedObject = new creed();

        System.out.println("Let's create a playlist!");

        String[] nameArray = new String[10];
        String[] artistArray = new String[10];
        int[] yearArray = new int[10];

        for(int i = 1; i<5; i++){
            System.out.println("Song # " + i);

            System.out.println("\nEnter the name of the song: ");
            String name = input.nextLine();
            

            nameArray[i] = name;

            System.out.println(name);

            System.out.println("\nEnter the artist's name: ");
            String artist = input.nextLine();

            artistArray[i] = artist;        

            pamObject.artistName(artist);

            System.out.println("\nWhat year was this song released? ");
            int year = input.nextInt();

            yearArray[i] = year;

            creedObject.releaseDate(year);
            input.nextLine();
        }

        System.out.println("\nGreat playlist! Here is a recap: ");
        for(int j = 1; j<5; j++){
            System.out.println("Song # " + j + " " + nameArray[j] + " Artist: " + artistArray[j] + " Release Date: " + yearArray[j]);

        }

        System.out.println("Would you like to remove a song? True/False");
        boolean remove = input.nextBoolean();
        if (remove == true){
            System.out.println("Which song?");
            String songRemove = input.nextLine();
            input.nextLine();

            for(int k=0; k < nameArray.length; k++){
                if (songRemove == nameArray[k]){
                    nameArray[k] = null;

                }
            }

        }
        input.nextLine();

        System.out.println("Great playlist! Here is a recap: ");
        for(int j = 1; j<3; j++){
            System.out.println("Song # " + j + " " + nameArray[j] + " Artist: " + artistArray[j] + " Release Date: " + yearArray[j]);

        }


    }
}

