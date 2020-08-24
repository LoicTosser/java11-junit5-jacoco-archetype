#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${package};

import ${package}.interfaces.FileLawnmower;

public class LawnmowerApplication
{
    public static void main( String[] args )
    {
        if (args.length != 1) {
            throw new IllegalArgumentException("Only one argument (input file path) is permitted");
        }

        FileLawnmower fileLawnmower = new FileLawnmower();
        fileLawnmower.mowLawn(args[0]);
    }
}
