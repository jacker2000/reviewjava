package networkIO.Mic.NIO;

import java.io.IOException;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

/**
 * @author: 高凡
 * @date: 2020/5/12 16:44
 * @description:
 */

public class MMAPDemo {
    public static void main(String[] args) {

        try (FileChannel inchannel = FileChannel.open(Paths.get(""), StandardOpenOption.READ);
             FileChannel outChannel = FileChannel.open(Paths.get(""), StandardOpenOption.READ,StandardOpenOption.WRITE,StandardOpenOption.CREATE);) {

            MappedByteBuffer inMappedBuffer = inchannel.map(FileChannel.MapMode.READ_ONLY, 0, inchannel.size());
            MappedByteBuffer outMapBuffer = outChannel.map(FileChannel.MapMode.READ_WRITE, 0, inchannel.size());
            byte[] bytes = new byte[inMappedBuffer.limit()];
            inMappedBuffer.get(bytes);
            outMapBuffer.put(bytes);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
