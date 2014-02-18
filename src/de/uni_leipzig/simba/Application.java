package de.uni_leipzig.simba;

import java.io.File;

import de.uni_leipzig.simba.compress.Compressor;
import de.uni_leipzig.simba.compress.CompressorFactory;

public class Application{

    public static void main(String[] args){
	// parse command line
	if (args.length > 0){
	    if (args[0].equals("-c")){
		File path = new File(args[1]);
		if (path.exists()){
		    CompressorFactory cf = new CompressorFactory();
		    Compressor compressor = cf.getCompressor();
		    compressor.compress(path);
		}
	    }
	    else if (args[0].equals("-d")){
		//Decompress
	    }
	    else{
		System.out.println("Invalid program call");
	    }
	}
	else{
	    System.out.println("Usage: java <programname> <inputfile>");
	}
    }
}