public class FeatureA {
    public FeatureA() {
        System.out.println("FeatureAA initialized.");
    }

    public void execute() {
        System.out.println("Executing improved Feature AA...");
    }

    public static void main(String[] args) {
        FeatureA feature = new FeatureA();
        feature.execute();
    }
}