import java.io.*;
public class TreeBuilder {
    public static void main(String[] args) {
        String inFileName = args[0];
        String outFileName = args[1];
        Scanner scanner = new Scanner(inFileName);
        Parser parser = new Parser(scanner);

        try{
            parser.tree = new Tree(outFileName);
            parser.Parse();
            System.out.println(parser.errors + " errors detected");
        } catch (FileNotFoundException e){
            System.out.println("-- cannot create file " + outFileName);
        }
    }
}
