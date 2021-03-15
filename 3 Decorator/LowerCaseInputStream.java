import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

public class LowerCaseInputStream extends FilterInputStream {
    public LowerCaseInputStream(InputStream in){
        super(in);
    }

    @Override
    public int read() throws IOException {
        int data = in.read();
        return data | 32;
    }

    @Override
    public int read(byte[] b, int off, int len) throws IOException {
        int nbBytes = in.read(b, off, len);
        for(int i = off; i < off+nbBytes; i++){
            b[i] = (byte) (b[i] | 32);
        }
        return nbBytes;
    }
}
