package proxy_image;

public class RealImage implements Image{
    private String file;

    public RealImage(String file) {
        this.file = file;
        loadFromDisk();
    }

    @Override
    public void display() {
        System.out.println("Hello! I am a real image");
    }

    public void loadFromDisk() {
        System.out.println("Loading from disk...");
    }
}
