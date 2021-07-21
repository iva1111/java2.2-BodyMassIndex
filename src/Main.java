public class Main {
      public static void main(String[] args) {
            BmiService service = new BmiService();
            double bodyMass = 60.0;
            double bodyGrowth = 1.60;

            double bodyMassIndex = service.calculate(60.0, 1.60);
            System.out.println(bodyMassIndex);

      }
}

