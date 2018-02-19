       import java.io.BufferedInputStream;
        import java.io.BufferedOutputStream;
        import java.io.File;
        import java.io.FileInputStream;
        import java.io.FileOutputStream;
        import java.io.IOException;

public class Question1 {

    public static void main(String... args) throws IOException {
        Question1 q = new Question1();
        q.copyFileBufferedStream();
    }

        public void copyFileBufferedStream() throws IOException {
            BufferedInputStream bufferedInputStream = null;
            BufferedOutputStream bufferedOutputStream = null;

            try {
                bufferedInputStream = new BufferedInputStream(new FileInputStream(new File("/home/himanshi/ttn/input.txt")));
                bufferedOutputStream = new BufferedOutputStream(new FileOutputStream(new File("/home/himanshi/ttn/output.txt")));

                int numBytes;
                byte[] buffer = new byte[1000];
                while ((numBytes = bufferedInputStream.read(buffer)) != -1) {
                    bufferedOutputStream.write(buffer, 0, numBytes);
                }

                bufferedInputStream.close();
                bufferedOutputStream.close();
            } finally {
                if (bufferedInputStream != null) {
                    bufferedInputStream.close();
                }
                if (bufferedOutputStream != null) {
                    bufferedOutputStream.close();
                }
            }
        }
    }


