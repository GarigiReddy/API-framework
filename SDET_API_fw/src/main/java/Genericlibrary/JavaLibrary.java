package Genericlibrary;

import java.util.Random;
/**
 * 
 * @author hp
 *
 */
public class JavaLibrary {
/**
 * 
 * @return
 */
public int getRandomNum() {
	Random r=new Random();
	int random = r.nextInt(1000); 
	return random;
}
}
