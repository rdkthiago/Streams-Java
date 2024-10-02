import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MetodosGeometricos {
	
	public static double areaTotalFiguras(List<Figura> figuras) {

		double total = figuras.stream().collect(Collectors.summingDouble(Figura::area));
		return total;
	}

	public static void maioresQueCinco(List<Figura> figuras) {

		Stream<Figura> fi = figuras.stream().filter(f -> f.area() > 5000);
		fi.forEach(f -> System.out.println(" -"+f.toString()));

	}

	public static String menorPerimetroAcima(List<Figura> figuras) {

		Figura fig = figuras.stream().filter(s -> s.perimetro() > 200).min(Comparator.comparing(Figura::perimetro))
				.get();

		return fig.toString();

	}

	public static String maiorAreaCirculo(List<Figura> figuras) {

		Figura fi = figuras.stream().filter(c -> c.descricao == "Circulo").filter(f -> f.area() < 1500).max(Comparator.comparing(Figura :: area)).get();
		return fi.toString();
		
	}
}
