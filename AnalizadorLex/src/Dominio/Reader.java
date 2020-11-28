
package Dominio;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.stream.Stream;

/**
 *
 * @author Jose Marcos Morales Gomez
 */
public class Reader {
    
    public static void read() {
		try (Stream<String> stream = Files.lines(Paths.get("programa.mio"))) {
			stream.forEach(a -> Main.list.add(a));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
