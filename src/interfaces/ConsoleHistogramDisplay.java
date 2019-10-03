package interfaces;

import modules.Histogram;

/**
 * @author Alexander Alvarez Marques
 * @version 03-oct-2019
 */
public class ConsoleHistogramDisplay implements HistogramDisplay {

    @Override
    public void display(Histogram h) {
        h.getValues().forEach((k) -> { 
            System.out.println(k + " : " + h.getCount(k));
        });
    }
    
}
