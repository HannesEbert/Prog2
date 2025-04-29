package Lektion17.Wertebereich;

import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.IOException;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertThrows;

public class WerteMethode {

    @Test
    public void testWriteWithValidParameters() throws IOException {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        byte[] data = {1, 2, 3, 4, 5};
        out.write(data, 1, 3);  // sollte funktionieren
        assertArrayEquals(new byte[]{2, 3, 4}, out.toByteArray());
    }

    @Test
    public void testWriteWithNullArray() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        assertThrows(NullPointerException.class, () -> {
            out.write(null, 0, 1);
        });
    }

    @Test
    public void testWriteWithNegativeOffset() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        byte[] data = {1, 2, 3};
        assertThrows(IndexOutOfBoundsException.class, () -> {
            out.write(data, -1, 2);
        });
    }

    @Test
    public void testWriteWithNegativeLength() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        byte[] data = {1, 2, 3};
        assertThrows(IndexOutOfBoundsException.class, () -> {
            out.write(data, 1, -2);
        });
    }

    @Test
    public void testWriteWithOffsetPlusLengthExceedsArray() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        byte[] data = {1, 2, 3};
        assertThrows(IndexOutOfBoundsException.class, () -> {
            out.write(data, 1, 5);
        });
    }
}
