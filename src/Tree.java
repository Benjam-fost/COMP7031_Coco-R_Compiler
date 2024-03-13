import java.io.*;
public class Tree {
    PrintStream s;
    int itemNo = 0;
    public Tree(String fileName) throws FileNotFoundException {
        s = new PrintStream(fileName);
    }

}
