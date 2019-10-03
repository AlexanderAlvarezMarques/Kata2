package interfaces;

import modules.Histogram;

/**
 * @author Alexander Alvarez Marques
 * @version 03-oct-2019
 */
public interface HistogramDisplay {
    
    /**
     * Display histogram values in console
     * 
     * @param h Histogram
     */
    public void display(Histogram h);
}
