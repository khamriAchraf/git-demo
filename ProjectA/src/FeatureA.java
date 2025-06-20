public class FeatureA {
    public FeatureA() {
        System.out.println("FeatureA initialized.");
    }

    public void execute() {
        System.out.println("Executing new Feature A...");
    }

    public static void main(String[] args) {
        FeatureA feature = new FeatureA();
        feature.execute();
    }
}