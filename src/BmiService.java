public class BmiService {

    public double calculate(double bodyMass,  double bodyGrowth) {
        double bodyMassIndex = (bodyMass / (bodyGrowth * bodyGrowth));
        return bodyMassIndex;
    }
}

