import java.util.Optional;

public class Main
{
    public static void main(String[] args)
    {
        Optional<String> optionalString = Optional.of("Bartek");
        System.out.println(optionalString.orElse("nothing"));

        double x = 0.25;
        System.out.println(Optional.ofNullable(1 / x).orElse(Double.POSITIVE_INFINITY));
        Optional<Double> result = Optional.ofNullable(1 / x).flatMap(Main::squareRoot);
        System.out.println(result.orElse(0.0));
    }
    public static Optional<Double> squareRoot(Double x)
    {
        return x < 0 ? Optional.empty() : Optional.of(Math.sqrt(x));
    }
}