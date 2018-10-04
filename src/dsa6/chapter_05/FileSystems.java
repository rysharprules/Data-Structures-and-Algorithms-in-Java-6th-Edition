package dsa6.chapter_05;

import java.io.File;

public class FileSystems {

    /**
     * Calculates the total disk usage (in bytes) of the portion of the file system rooted
     * at the given path, while printing a summary akin to the standard 'du' Unix tool.
     */
    public static long diskUsage(File root) {
        long total = root.length(); // start with direct disk usage
        if (root.isDirectory()) { // and if this is a directory,
            for (String childname : root.list()) { // then for each child
                File child = new File(root, childname); // compose full path to child
                total += diskUsage(child); // add child’s usage to total
            }
        }
        System.out.println(total + "\t" + root); // descriptive output
        return total; // return the grand total
    }
}
