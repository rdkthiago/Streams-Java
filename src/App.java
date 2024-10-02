import java.util.ArrayList;
import java.util.List;
public class App {
    public static void main(String[] args) throws Exception {

        Circulo cir = new Circulo(100);
        Circulo ci = new Circulo(6);

        Quadrado quad = new Quadrado(8);
        Quadrado core = new Quadrado(1600);

        Retangulo reta = new Retangulo(6, 8);
        Retangulo reto = new Retangulo(10, 14);

        TrianguloRetangulo retri = new TrianguloRetangulo(30, 20);
        TrianguloRetangulo tri = new TrianguloRetangulo(16, 14);

        List<Figura> figuras = new ArrayList<Figura>();
        figuras.add(cir);
        figuras.add(ci);
        figuras.add(quad);
        figuras.add(core);
        figuras.add(reta);
        figuras.add(reto);
        figuras.add(retri);
        figuras.add(tri);

        System.out.println("Area Somada de Todas Figuras: \n "+MetodosGeometricos.areaTotalFiguras(figuras));
        System.out.println("Figuras com dimensões maiores que 5000:");
        MetodosGeometricos.maioresQueCinco(figuras);
        System.out.println("Circulo com menor perímetro acima de 200: \n -"+MetodosGeometricos.menorPerimetroAcima(figuras));
        System.out.println("Maior raio com área menor que 1500: \n -"+MetodosGeometricos.maiorAreaCirculo(figuras));

    }
}
