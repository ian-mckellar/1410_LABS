package labSerialization;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.PrintWriter;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ListVsSetDemo implements Serializable{
    /**
	 * 
	 */
	private static final long serialVersionUID = 1322038405592713464L;
	private final List<ColoredSquare> list;
    private final Set<ColoredSquare> set;
    
    public ListVsSetDemo(ColoredSquare... elements) {
        list = new ArrayList<>(Arrays.asList(elements));
        set = new HashSet<>(Arrays.asList(elements));
    }

    public String getListElements() {
        StringBuilder sb = new StringBuilder();
        for (ColoredSquare el : list) {
            sb.append(el).append("\n");
        }
        return sb.toString();
    }

    public String getSetElements() {
        StringBuilder sb = new StringBuilder();
        for (ColoredSquare el : set) {
            sb.append(el).append("\n");
        }
        return sb.toString();
    }

    public void addElement(ColoredSquare el) {
        list.add(el);
        set.add(el);
    }
}
