import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Video {
    private String title;
    private boolean checkedOut;
    private int rating;

    public Video(String title) {
        this.title = title;
        this.checkedOut = false;
        this.rating = 0;
    }

    public String getTitle() {
        return title;
    }

    public boolean isCheckedOut() {
        return checkedOut;
    }

    public int getRating() {
        return rating;
    }

    public void setCheckedOut(boolean checkedOut) {
        this.checkedOut = checkedOut;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }
}

class VideoStore {
    private List<Video> videos;

    public VideoStore() {
        this.videos = new ArrayList<>();
    }

    public void addVideo(Video video) {
        this.videos.add(video);
    }

    public void checkOutVideo(String title) {
        for (Video video : videos) {
            if (video.getTitle().equals(title) && !video.isCheckedOut()) {
                video.setCheckedOut(true);
                System.out.println("Video checked out successfully.");
                return;
            }
        }
        System.out.println("Video not available.");
    }

    public void returnVideo(String title) {
        for (Video video : videos) {
            if (video.getTitle().equals(title) && video.isCheckedOut()) {
                video.setCheckedOut(false);
                System.out.println("Video returned successfully.");
                return;
            }
        }
        System.out.println("Video not checked out.");
    }

    public void addRating(String title, int rating) {
        for (Video video : videos) {
            if (video.getTitle().equals(title)) {
                video.setRating(rating);
                System.out.println("Rating added successfully.");
                return;
            }
        }
        System.out.println("Video not found.");
    }

    public void listInventory() {
        System.out.println("List of available videos:");
        for (Video video : videos) {
            System.out.println(video.getTitle() + " - " + (video.isCheckedOut() ? "Checked Out" : "Available"));
        }
    }
}

public class Practice {
    public static void main(String[] args) {
        VideoStore videoStore = new VideoStore();
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n1. Add Videos");
            System.out.println("2. Check Out Videos");
            System.out.println("3. Return Videos");
            System.out.println("4. Receive Rating");
            System.out.println("5. List Inventory");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter video title: ");
                    String title = scanner.next();
                    Video video = new Video(title);
                    videoStore.addVideo(video);
                    break;
                case 2:
                    System.out.print("Enter video title to check out: ");
                    String titleToCheckOut = scanner.next();
                    videoStore.checkOutVideo(titleToCheckOut);
                    break;
                case 3:
                    System.out.print("Enter video title to return: ");
                    String titleToReturn = scanner.next();
                    videoStore.returnVideo(titleToReturn);
                    break;
                case 4:
                    System.out.print("Enter video title to add rating: ");
                    String titleToAddRating = scanner.next();
                    System.out.print("Enter rating for the video (1-5): ");
                    int rating = scanner.nextInt();
                    videoStore.addRating(titleToAddRating, rating);
                    break;
                case 5:
                    videoStore.listInventory();
                    break;
                case 6:
                    System.out.println("Exiting program. Goodbye!");
                    break;
                default:
                    System.out.println("Invalid choice. Please enter a number between 1 and 6.");
            }
        } while (choice != 6);
        
    }
}
