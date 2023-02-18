import funcionarios.Designer;
import funcionarios.EditorVideo;
import funcionarios.Gerente;

public class TestReferencia {
	public static void main(String[] args) {
		Gerente gerente1 = new Gerente();
        gerente1.setNombre("Marcos");
        gerente1.setSalario(5000.0);

        EditorVideo editorVideo = new EditorVideo();
        editorVideo.setNombre("Gonzalo");
        editorVideo.setSalario(2500.0);

        Designer designer = new Designer();
        designer.setNombre("Marisa");
        designer.setSalario(2000.0);

        ControlBonificacion controle = new ControlBonificacion();
        controle.registrar(gerente1);
        controle.registrar(editorVideo);
        controle.registrar(designer);

        System.out.println(controle.getSuma());

	}
}
