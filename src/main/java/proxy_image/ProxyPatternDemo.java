package proxy_image;

public class ProxyPatternDemo {
    public static void main(String[] args) {
        ProxyImage proxy = new ProxyImage("hello.png");
        proxy.display();
    }
}
