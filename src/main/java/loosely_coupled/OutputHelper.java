package loosely_coupled;

/**
 * Created by mengjian on 15/7/22.
 */
public class OutputHelper {
    IOutputGenerator outputGenerator;

    public void generatorOutput() {
        this.outputGenerator.generatorOutput();
    }

    public void setOutputGenerator(IOutputGenerator outputGenerator) {
        this.outputGenerator = outputGenerator;
    }
}
