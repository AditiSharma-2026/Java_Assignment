// Interface
interface Filterable {
    void applyFilter(String filterType);
    void resetFilter();
}


// Class 1: ImageProcessor
class ImageProcessor implements Filterable {
    private String currentFilter;

    @Override
    public void applyFilter(String filterType) {
        currentFilter = filterType;
        System.out.println("Applying " + filterType + " filter to image");
    }

    @Override
    public void resetFilter() {
        currentFilter = null;
        System.out.println("Image filters reset");
    }
}


// Class 2: DataAnalyzer
class DataAnalyzer implements Filterable {
    private String currentFilter;

    @Override
    public void applyFilter(String filterType) {
        currentFilter = filterType;
        System.out.println("Applying " + filterType + " filter to dataset");
    }

    @Override
    public void resetFilter() {
        currentFilter = null;
        System.out.println("Data filters reset");
    }
}


// Main class
public class Main {
    public static void main(String[] args) {
        ImageProcessor img = new ImageProcessor();
        DataAnalyzer data = new DataAnalyzer();

        img.applyFilter("Blur");
        img.resetFilter();

        data.applyFilter("Outlier Removal");
        data.resetFilter();
    }
}
