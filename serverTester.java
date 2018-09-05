import java.io.IOException;
import java.net.UnknownHostException;

public interface serverTester {
	void Socket() throws UnknownHostException, IOException;
	void write(String string);
	void read()throws IOException;
}
