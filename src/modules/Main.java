package modules;

import interfaces.ConsoleHistogramDisplay;

/**
 * @author Alexander Alvarez Marques
 * @version 03-oct-2019
 */
public class Main {

    public static void main(String[] args) {
        Histogram histogram = new Histogram(5,4,8,7,2,6,1,4,8,5,15,9,1,4,0,6,5,1);
        ConsoleHistogramDisplay consoleHistogramDisplay = new ConsoleHistogramDisplay();
        consoleHistogramDisplay.display(histogram);
    }
}
