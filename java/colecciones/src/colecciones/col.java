package colecciones;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class col {
	public static void main(String[] args) {
		String curso1 = "Geometría";
		String curso2 = "Física";
		String curso3 = "Química";
		String curso4 = "Historia";
		
		ArrayList<String> cursos = new ArrayList<>();
		
		cursos.add(curso1);
		cursos.add(curso2);
		cursos.add(curso3);
		cursos.add(curso4);
		
		System.out.println("1"+cursos);
		
		cursos.sort(Collections.reverseOrder());
		System.out.println("2"+cursos);
		
		List<String> cursosList = cursos.stream()
				.sorted(Comparator.reverseOrder())
				.collect(Collectors.toList());
		
		System.out.println("3"+cursosList);
	}
}
