/**
 * Created by Tank on 3/23/2017.
 */
public class baseballSet {

    private String components;

    public baseballSet(String components) {
        this.components = components;
    }

    public void setComponents(String components) {
        this.components = components;
    }

    public String getComponents() {
        return components;
    }

    @Override
    public String toString() {
        return "Kitchen set{" +
                "Appliance='" + components + "}";
    }
}
