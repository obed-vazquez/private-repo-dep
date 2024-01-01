package com.white_sdev.templates.privatedependency;

import com.white_sdev.templates.nexus.WhiteNexusRepo;

/**
 * Main class of the application.
 */
public class WhitePrivateDependency {
    /**
     * Main method of the application.
     * This is the method that will launch the main process and run the provided application.
     * This is a special method of the language used to launch the main thread;
     *  <a href="https://www.oracle.com/java/technologies/jpl1-building-applications.html#class"> more information</a>.
     *
     * @param args {@link String} Arguments provided by the caller of the application (Often omitted)
     */
    public static void main(String[] args) {
    	String logID="::main(args[]): ";
        System.out.println(logID + "Start");
		int a = 2;
		int b = 4;

		System.out.println(
				new WhitePrivateDependency().
						localAdd(a, b));
		System.out.println(logID + "Finish");
		System.exit(0);
    }

	public int localAdd(int a, int b){
		String logID="::localAdd(a, b): ";
		System.out.println(logID+"Start - a:" + a + ", b:" + b);
		WhiteNexusRepo calculations = new WhiteNexusRepo();
		int c = calculations.add(a,b);
		System.out.println(logID + "Finish - c:" + c);
		return c;
	}
}
