package ProxyImageTests;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import proxy_image.*;

import static org.junit.jupiter.api.Assertions.*;

class ProxyImageTest {
    ProxyImage proxyImage;
    @BeforeEach
    void setUp() {
        proxyImage = new ProxyImage("hello");
    }

    @Test
    void getFilename() {
        assertEquals(proxyImage.getFilename(), "hello");
    }
}
