package zp3jv;

import java.io.FileNotFoundException;
import java.io.IOException;

/*
 * @author Jakub Kadlčík
 * @version 1.0
 */
public class Main {

	public static void main(String[] args) {

		try {
			if((args.length > 0) && ((args[0].equals("-h")) || (args[0].equals("--help")))) {
				printHelp();
				return;
			}

			// Nastaví výstupní parametry podle vstupních požadavků
			IObyArguments(args);

			// Nebyly předány dva soubory
			if(args.length < 2)
				throw new MissingArgumentException("Missing argument: What files do you want compare?");

			File f1 = new File(args[0]);
			File f2 = new File(args[1]);
			IO.write(Diff.compare(f1, f2));

		} catch (FileNotFoundException e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (UnknownArgumentException e) {
			System.out.println(e.getMessage());
		} catch (MissingArgumentException e) {
			System.out.println(e.getMessage());
		}
	}

	/**
	  * Nastaví výstupní parametry podle argumentů předaných při spuštění
	  * @param args - Proměnná funkce main - String[] args
	  * @throws MissingArgumentException - Chybějící hodnota pro parametr, který ji vyžaduje
	  * @throws UnknownArgumentException - Neexistující parametr
	  */
	public static void IObyArguments(String[] args)
			throws MissingArgumentException, UnknownArgumentException {

		// Na indexech 0 a 1 jsou vždy soubory, které se mají porovnat
		for(int i=2; i<args.length; i++) {

			// Po parametru --output následuje hodnota, nikoliv další parametr
			if((i > 2) && (args[i-1].equals("-o")) || (args[i-1].equals("--output"))) {
				continue;
			}

			if((args[i].equals("-nc")) || (args[i].equals("--no-color"))) {
				IO.setColored(false);
			}
			else if((args[i].equals("-l")) || (args[i].equals("--number-lines"))) {
				IO.setNumberLines(true);
			}
			else if((args[i].equals("-o")) || (args[i].equals("--output"))) {
				if(i >= args.length-1) {
					throw new MissingArgumentException("Missing argument for: --output");
				}
				IO.setOutput(args[i+1]);
			}
			else {
				throw new UnknownArgumentException("Unknown argument: " + args[i]);
			}
		}
	}

	/**
	  * Vypíše nápovědu pro použití tohoto programu
	  */
	public static void printHelp() {

		String help = new StringBuilder()
			.append("## Info\n")
			.append("Humble implementation of UNIX tool diff\n\n")

			.append("## Author\n")
			.append("Jakub Kadlčík [jakub.kadlcik01@upol.cz]\n\n")

			.append("## Usage\n")
			.append("`-nc`, `--no-color`\n")
			.append("    Do not color the output\n")
			.append("    (Colors are supported only for UNIX systems.\n")
			.append("    That means this parameter do nothing on Windows.)\n\n")
			.append("`-l`, `--number-lines`\n")
			.append("    Print line numbers\n\n")
			.append("`-o`, `--output` soubor\n")
			.append("    Write output to text file\n\n")
			.append("`-h`, `--help`\n")
			.append("    Print this help text\n")
			.toString();
		;
		System.out.print(help);
	}
}
